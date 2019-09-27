<%@page import="java.sql.*"%>
<%
    if(request.getParameter("subcatid")!=null)
                    {
                        String subcatid=request.getParameter("subcatid");
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
                                   String query="delete from subcategorytable where subcatid=?";
                                   PreparedStatement mystatement=myconnection.prepareStatement(query);
                                   mystatement.setString(1, subcatid);
                                   if(mystatement.executeUpdate()>0)
                                   {
                                       out.print("Success");
                                   }
                                   else
                                   {
                                       out.print("Failure");
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
                 
   }                                           
    
    else if(request.getParameter("catid")!=null)
                    {
                        String catid=request.getParameter("catid");
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
                                   String query="delete from categorytable where catid=?";
                                   PreparedStatement mystatement=myconnection.prepareStatement(query);
                                   mystatement.setString(1, catid);
                                   if(mystatement.executeUpdate()>0)
                                   {
                                       out.print("Success");
                                   }
                                   else
                                   {
                                       out.print("Failure");
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
                 
   }                            
            %>