<%@page import="java.io.File"%>
<%@page import="java.util.*"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%
         
        String catid="", subcatid="", pid="",pname="", price="", qty="",pimage="",pimage2="",pimage3="",path="",pdescription="",shippingmax="",shippingmin="",limitedqty="",size="";
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
                else if(itemName1.equals("subcategory")) //control's name - textbox name
               {
                    subcatid=value;
                }
                else if(itemName1.equals("pname")) //control's name - textbox name
               {
                    pname=value;
                }
                else if(itemName1.equals("price")) //control's name - textbox name
               {
                    price=value;
                }
                else if(itemName1.equals("qty")) //control's name - textbox name
               {
                    qty=value;
                }
                 else if(itemName1.equals("pdescription")) //control's name - textbox name
               {
                    pdescription=value;
                }
                  else if(itemName1.equals("pid")) //control's name - textbox name
               {
                    pid=value;
                }
                else if(itemName1.equals("shippingmin")) //control's name - textbox name
                {
                    shippingmin=value;
                }
                else if(itemName1.equals("shippingmax")) //control's name - textbox name
                {
                    shippingmax=value;
                }
                else if(itemName1.equals("limitedqty")) //control's name - textbox name
                {
                    limitedqty=value;
                }
            }
            else
            {
                    String type=myitem.getContentType();
                    long imagesize=myitem.getSize()/1024; //kbytes
                    String name=myitem.getFieldName(); //multiple images
                    
                    if(name.equals("pimage"))
                     {
                            if(imagesize==0)
                            {
                                pimage=session.getAttribute("pimage").toString();
                            }
                            else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                    || type.equals("image/png") || type.equals("image/x-png")
                                    || type.equals("image/gif")) && imagesize<400)
                                {

                                    String oldimage=session.getAttribute("pimage").toString();
                                    String path2=config.getServletContext().getRealPath("/") + "images\\" + oldimage;
                                    File obj=new File(path2);
                                    obj.delete();

                                    pimage=new java.util.Date().getTime()+myitem.getName();
                                    path=config.getServletContext().getRealPath("/") + "images\\" + pimage;
                                    File savefile=new File(path);
                                    myitem.write(savefile);    

                                }
                            else
                                {
                                    successful=false;
                                    out.println("Sorry only pictures of less than 400kb are allowed to upload");
                                }
                     }
                    
                    if(name.equals("pimage2"))
                    {
                        if(imagesize==0)
                            {
                                pimage2=session.getAttribute("pimage2").toString();
                            }
                            else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                    || type.equals("image/png") || type.equals("image/x-png")
                                    || type.equals("image/gif")) && imagesize<400)
                                {

                                    String oldimage=session.getAttribute("pimage2").toString();
                                    String path2=config.getServletContext().getRealPath("/") + "images\\" + oldimage;
                                    File obj=new File(path2);
                                    obj.delete();

                                    pimage2=new java.util.Date().getTime()+myitem.getName();
                                    path=config.getServletContext().getRealPath("/") + "images\\" + pimage2;
                                    File savefile=new File(path);
                                    myitem.write(savefile);    

                                }
                            else
                                {
                                    successful=false;
                                    out.println("Sorry only pictures of less than 400kb are allowed to upload");
                                }
                     }
                    if(name.equals("pimage3"))
                    {
                        if(imagesize==0)
                            {
                                pimage3=session.getAttribute("pimage3").toString();
                            }
                            else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                    || type.equals("image/png") || type.equals("image/x-png")
                                    || type.equals("image/gif")) && imagesize<400)
                                {

                                    String oldimage=session.getAttribute("pimage3").toString();
                                    String path2=config.getServletContext().getRealPath("/") + "images\\" + oldimage;
                                    File obj=new File(path2);
                                    obj.delete();

                                    pimage3=new java.util.Date().getTime() + myitem.getName();
                                    path=config.getServletContext().getRealPath("/") + "images\\" + pimage3;
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
                                String query="update producttable set catid=?,subcatid=?,pname=?,"
                                        + " price=?, qty=?, pimage=?,pimage2=?,pimage3=?, pdescription=?,shippingmin=?,shippingmax=?,limitedqty=? where pid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1, catid);
                                mystatement.setString(2, subcatid);
                                mystatement.setString(3, pname);
                                mystatement.setString(4, price);
                                mystatement.setString(5, qty);                                
                                mystatement.setString(6, pimage); 
                                mystatement.setString(7, pimage2); 
                                mystatement.setString(8, pimage3); 
                                mystatement.setString(9, pdescription);
                                mystatement.setString(10, shippingmin);
                                mystatement.setString(11, shippingmax);
                                mystatement.setString(12, limitedqty); 
                                mystatement.setString(13, pid); 
                                
                                if(mystatement.executeUpdate()>0)
                                {
                                    out.print("<br>");
                                    out.print("<div class='alert alert-success' role='alert'><center><strong>"
                                            +" You have successfully Updated this Product!</strong></center></div>");
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