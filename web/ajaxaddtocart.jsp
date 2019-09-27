 <%@page import="java.sql.*"%>
<%
                         try
                            {
                                Connection connection;
                                Class.forName("com.mysql.jdbc.Driver");
                               String url=getServletContext().getInitParameter("url");
                                String username=getServletContext().getInitParameter("username");
                                String password=getServletContext().getInitParameter("password");
                                connection=DriverManager.getConnection(url, username, password);
                                
                                try
                                {
                                int totalcost=Integer.parseInt(request.getParameter("qty")) 
                                            * Integer.parseInt(session.getAttribute("price").toString());
                                if(session.getAttribute("email")!=null)
                                {
                                     String query="insert into usercarttable(pid,pname,price,qty,totalcost,pimage,email)"
                                        + " values(?,?,?,?,?,?,?)";
                                    
                                    PreparedStatement mystatement=connection.prepareStatement(query);
                                    mystatement.setString(1, session.getAttribute("pid").toString());
                                    mystatement.setString(2, session.getAttribute("pname").toString());
                                    mystatement.setString(3, session.getAttribute("price").toString());
                                    mystatement.setString(4, request.getParameter("qty"));
                                    mystatement.setString(5, String.valueOf(totalcost));
                                    mystatement.setString(6, session.getAttribute("pimage").toString());
                                    mystatement.setString(7, session.getAttribute("email").toString());

                                    if(mystatement.executeUpdate()>0)
                                    {
                                        out.print("success");
                                    }
                                    	                         
                                }
                                else
                                {
                                
                                    String query="insert into carttable(pid,pname,price,qty,totalcost,pimage,sessionid)"
                                            + " values(?,?,?,?,?,?,?)";
                                    
                                    PreparedStatement mystatement=connection.prepareStatement(query);
                                    mystatement.setString(1, session.getAttribute("pid").toString());
                                    mystatement.setString(2, session.getAttribute("pname").toString());
                                    mystatement.setString(3, session.getAttribute("price").toString());
                                    mystatement.setString(4, request.getParameter("qty"));
                                    mystatement.setString(5, String.valueOf(totalcost));
                                    mystatement.setString(6, session.getAttribute("pimage").toString());
                                    mystatement.setString(7, session.getId());

                                    if(mystatement.executeUpdate()>0)
                                    {
                                        out.print("success");
                                        
                                    }
                                    
                                    
                                }
                                           
                                           session.setAttribute("totalcost",totalcost);
                                
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Query" + e.getMessage());
                            }
                            finally
                            {
                                connection.close();
                            }
                            
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Connection " + e.getMessage());
                            }
                            
                            
                            
                        
                %>