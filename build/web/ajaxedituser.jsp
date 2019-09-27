<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    String uname="",email="",dob="",gender="";
    uname=request.getParameter("uname");
    email=(String)session.getAttribute("email");
    dob=request.getParameter("dob");
    gender=request.getParameter("gender");
    
                    Connection myconnection;
                    String path="jdbc:mysql://localhost/";
                    String place="callistoart";

                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(path+place,"root","");
                        try
                        {
                            String q="update usertable set uname=?,gender=?,dob=? where email=?";
                            PreparedStatement mystatement=myconnection.prepareStatement(q);
                            mystatement.setString(1, uname);
                            mystatement.setString(2, gender);
                            mystatement.setString(3, dob);
                            mystatement.setString(4, email);
                                                
                            if(mystatement.executeUpdate()>0)
                            {
                                out.print("<br>");
                                out.print("<div class='alert alert-success' role='alert'><center><strong>"
                                    +" You have successfully Updated Your Profile!</strong></center></div>");
                            }
                            else
                            {
                                out.print("NOT UPDATED");
                            }

                        }
                        catch(Exception e)
                        {
                            out.print("Error in query " + e.getMessage());
                        }


                    }
                    catch(Exception e)
                    {
                        out.print("Error in connection " + e.getMessage());
                    }

    
              
    
%>
    