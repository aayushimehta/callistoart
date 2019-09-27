
<%@page import="java.sql.*"%>
<%
                int shipping=40;   
                     try
                        { 
                        Connection myconnection=null;
                        String url=getServletContext().getInitParameter("url");
                        String username=getServletContext().getInitParameter("username");
                        String password=getServletContext().getInitParameter("password");
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                            try
                            {   
                                PreparedStatement mystatement; 
                                if(session.getAttribute("email")!=null)
                                {
                                    String query="select * from usercarttable where pid=?";
                                
                                    mystatement=myconnection.prepareStatement(query);            
                                    mystatement.setString(1,request.getParameter("pid"));
                                                                      
                                }
                                else
                                {   
                                    String query="select * from carttable where pid=?";
                                
                                    mystatement=myconnection.prepareStatement(query);            
                                    mystatement.setString(1,request.getParameter("pid"));
                                    
                                }
                                ResultSet myres=mystatement.executeQuery();
                                myres.next();
                                out.print(Integer.parseInt(request.getParameter("qty"))*myres.getInt("price"));
                               
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Query1 " + e.getMessage());
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
        %>
