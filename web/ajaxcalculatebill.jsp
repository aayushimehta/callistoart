<%@page import="java.sql.*" %>
<%
    int shipping=40;
    
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
                                PreparedStatement mystatement;
                                if(session.getAttribute("email")!=null)
                                {
                                    String query="select sum(totalcost) from usercarttable where email=?";
                                    mystatement=myconnection.prepareStatement(query);
                                    mystatement.setString(1,session.getAttribute("email").toString());
                                }
                                else
                                {
                                    String query="select sum(totalcost) from carttable where sessionid=?";
                                    mystatement=myconnection.prepareStatement(query);
                                    mystatement.setString(1,session.getId());
                                }
                                ResultSet myres=mystatement.executeQuery();
                               
                                if(myres.next())
                                {
                                    session.setAttribute("totalcost", myres.getInt(1));
                                    session.setAttribute("gd", (myres.getInt(1)+40));
                                    out.print(myres.getInt(1));
                                }
                                
                                else
                                {
                                    
                                    out.print("No Records Exists");
                                }
                               
                                
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query" + e.getMessage());
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