<%@page import="java.io.File"%>
<%@page import="java.util.*"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%
         
        String catid="", subcatid="",subcatname="", subcatimage="",path="";
        boolean successful=true;
           
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);

        if(isMultipart)
        {

            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = null;
       try
       {
            items = upload.parseRequest(request);
       }
       catch (FileUploadException e)
       {
           e.printStackTrace();
       }

       for(FileItem myitem:items)
       {
            if (myitem.isFormField())
            {
                String itemName1 = myitem.getFieldName();
                String value=myitem.getString();

                if(itemName1.equals("category")) //control's name - textbox name
               {
                    catid=value;
                }
                else if(itemName1.equals("subcatid")) //control's name - textbox name
               {
                    subcatid=value;
                }
                else if(itemName1.equals("subcatname")) //control's name - textbox name
               {
                    subcatname=value;
                }
                
            }
            else
            {
                    String type=myitem.getContentType();
                    long imagesize=myitem.getSize()/1024; //kbytes
                    
                    if(imagesize==0)
                    {
                        subcatimage=session.getAttribute("subcatimage").toString();
                    }
                    else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                            || type.equals("image/png") || type.equals("image/x-png")
                            || type.equals("image/gif")) && imagesize<400)
                        {

                            String oldimage=session.getAttribute("subcatimage").toString();
                            String path2=config.getServletContext().getRealPath("/") + "images\\" + oldimage;
                            File obj=new File(path2);
                            obj.delete();
                           
                            subcatimage=new java.util.Date().getTime()+myitem.getName();
                            path=config.getServletContext().getRealPath("/") + "images\\" + subcatimage;
                            File savefile=new File(path);
                            myitem.write(savefile);    
                   
                        }
                    else
                        {
                            successful=false;
                            out.println("Sorry only pictures of less than 400kb are allowed to upload");
                        }
            }
        }
   
                if(successful==true)
                {
                             try
                            {
                            Connection myconnection;
                            Class.forName("com.mysql.jdbc.Driver");
                            String url=getServletContext().getInitParameter("url");
                            String username=getServletContext().getInitParameter("username");
                            String password=getServletContext().getInitParameter("password");
                            myconnection=DriverManager.getConnection(url, username, password);
                            try
                            {
                                String query="update subcategorytable set catid=?,subcatname=?,subcatimage=? where subcatid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1, catid);
                                mystatement.setString(2, subcatname);
                                mystatement.setString(3, subcatimage );
                                mystatement.setString(4, subcatid);
                                     
                                if(mystatement.executeUpdate()>0)
                                {
                                     out.print("<br>");
                                        out.print("<div class='alert alert-success' role='alert'><center><strong>"
                                                +"You have successfully updated Sub-category!</strong></center></div>");
                                }
                                
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query " + e.getMessage());
                            }
                            finally
                            {
                                myconnection.close();
                            }
                            
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Connection " + e.getMessage());
                            }
                    } 
                            
        }

        %>