<%@page import="java.sql.*"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>


                <%
         
                                    String catid="", subcategory="",pname="", pimage="",pimage2="",pimage3="", path="",size="",price="", quantity="", shippingmin="", shippingmax="", limitedqty="", description="";
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
                                                subcategory=value;
                                            }
                                            else if(itemName1.equals("pname")) //control's name - textbox name
                                            {
                                                pname=value;
                                            }
                                            else if(itemName1.equals("quantity")) //control's name - textbox name
                                            {
                                                quantity=value;
                                            }
                                            else if(itemName1.equals("price")) //control's name - textbox name
                                            {
                                                price=value;
                                            }
                                            else if(itemName1.equals("size")) //control's name - textbox name
                                            {
                                                size=value;
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
                                            else if(itemName1.equals("description")) //control's name - textbox name
                                            {
                                                description=value;
                                            }
                                        }
                                        else
                                        {
                                            String type=myitem.getContentType();
                                            long imagesize=myitem.getSize()/1024; //kbytes
                                            String name=myitem.getFieldName();
                                            
                                            if(name.equals("pimage"))
                                            {
                                                if(imagesize==0)
                                                {
                                                    pimage="defaultproduct.jpg";
                                                }
                                                else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                                        || type.equals("image/png") || type.equals("image/x-png")
                                                        || type.equals("image/gif")) && imagesize<400)
                                                {   
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
                                                    pimage2="";
                                                }
                                                else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                                        || type.equals("image/png") || type.equals("image/x-png")
                                                        || type.equals("image/gif")) && imagesize<400)
                                                {   
                                                    pimage2=new java.util.Date().getTime()+myitem.getName();
                                                    path=config.getServletContext().getRealPath("/") + "images\\" + pimage2;
                                                    File savefile=new File(path);
                                                    myitem.write(savefile);    
                                                }
                                            
                                            else
                                                {
                                                    successful=false;
                                                    out.print("Sorry only pictures of less than 400kb are allowed to upload");
                                                }
                                            }
                                            if(name.equals("pimage3"))
                                            {
                                                if(imagesize==0)
                                                {
                                                    pimage3="";
                                                }
                                                else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                                        || type.equals("image/png") || type.equals("image/x-png")
                                                        || type.equals("image/gif")) && imagesize<400)
                                                {   
                                                    pimage3=new java.util.Date().getTime()+myitem.getName();
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
                                                    String query="insert into producttable(catid,subcatid,pname,pimage,pimage2,pimage3,size,qty,price,pdescription,shippingmin,shippingmax,limitedqty) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                                                    mystatement.setString(1, catid);
                                                    mystatement.setString(2, subcategory);
                                                    mystatement.setString(3, pname);  
                                                    mystatement.setString(4, pimage);
                                                    mystatement.setString(5, pimage2);
                                                    mystatement.setString(6, pimage3);
                                                    mystatement.setString(7, size);
                                                    mystatement.setString(8, quantity);
                                                    mystatement.setString(9, price);  
                                                    mystatement.setString(10, description);
                                                    mystatement.setString(11, shippingmin);  
                                                    mystatement.setString(12, shippingmax);
                                                    mystatement.setString(13, limitedqty);
                                                    
                                                    if(mystatement.executeUpdate()>0)
                                                    {
                                                        out.print("<br>");
                                                        out.print("<div class='alert alert-success' role='alert'><center><strong>"
                                                                +" You have successfully added a New Product!</strong></center></div>");
                                                    }
                                                    else
                                                    {
                                                        out.print("<br>");
                                                        out.print("<div class='alert alert-danger' role='alert'><strong>Oh snap!</strong>"
                                                                +" Product Could Not Be Added</div>");
                                                    }

                                                }
                                                catch(Exception e)
                                                {
                                                    out.print("Error in Query" + e.getMessage());
                                                }
                                                finally
                                                {
                                                    myconnection.close();
                                                }

                                                }
                                                catch(Exception e)
                                                {
                                                    out.print("Error in Connection " + e.getMessage());
                                                }
                                                }
                                            }
                                    
                %>