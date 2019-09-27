
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%

    if(request.getParameter("email")!=null)
    {
        Connection myconnection=null;
        String path="jdbc:mysql://localhost:3306/callistoart";
                        
                        try
                            {
                                Class.forName("com.mysql.jdbc.Driver");
                                myconnection=DriverManager.getConnection(path,"root","");
                                try
                                {
                                   String q="Select * from usertable where email=?";
                                   PreparedStatement mystatement=myconnection.prepareStatement(q);
                                   mystatement.setString(1, request.getParameter("email"));
                                   
                                   ResultSet myresult=mystatement.executeQuery();
                                   
                                   if(myresult.next())
                                   {
                                       out.print("<font color='red'> User Already Exists</font>");
                                   }
                                }
                                catch(Exception e)
                                  {
                                      out.print("Error in Query " + e.getMessage());
                                  }
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Connection " + e.getMessage());
                            }
                            
    
%>