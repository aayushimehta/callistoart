<%-- 
    Document   : resetpassword
    Created on : May 13, 2017, 12:00:38 AM
    Author     : It hurts when IP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
        <%@include file="headerfiles.jsp" %>
        
    </head>
    <body>
        
       <%@include file="mainmenu.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="userwelcome.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Reset Password</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        <%@page import="java.sql.*" %> 
               <%
            
                            try
                            {
                                String query2="select timestamp from usertable where email=?";
                                PreparedStatement mystatement2=myconnection.prepareStatement(query2);
                                mystatement2.setString(1, request.getParameter("sckhfkdjsn")) ;
                                
                                ResultSet myresult=mystatement2.executeQuery();
                                if(myresult.next())
                                {
                                    if(!myresult.getString("timestamp").equals(request.getParameter("timestamp")))
                                    {
                                  
                                        response.sendRedirect("loginform.jsp?credentials=wrong");
                                    }
                                    
                                }
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query" + e.getMessage());
                            }
                            
        %>
        
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Reset Password</h3>
			<p class="est animated wow zoomIn" data-wow-delay=".3s">Reset your Forgotten Password. Thank God! You found your way back! </p>
			<div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
				<form name="form" method="post">
                                        <input type="password" placeholder="Enter your New Password" name="npassword1" required="">
                                        <input type="password" placeholder="Re-Enter your New Password" name="npassword2" required="">
					
					<input type="submit" name="resetpassword" value="Reset Password">
    <%
                if(request.getParameter("resetpassword")!=null)
                   {
                          
                            String npassword1=request.getParameter("npassword1");
                            String npassword2=request.getParameter("npassword2");
                            
                    if(npassword1.equals(npassword2))  
                    {
                        try
                            {
                            
                            myconnection=DriverManager.getConnection(url, username, password);
                            try
                            {
                                String query5="select timestamp from usertable where email=?";
                                PreparedStatement mystatement5=myconnection.prepareStatement(query5);
                                mystatement5.setString(1, request.getParameter("sckhfkdjsn")) ;
                                
                                ResultSet myresult5=mystatement5.executeQuery();
                                if(myresult5.next())
                                {
                                    if(myresult5.getString("timestamp").equals(request.getParameter("timestamp")))
                                    {
                                         String query="update usertable set password=MD5(?) "
                                        + "where email=?";
                                
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1, request.getParameter("npassword1") 
                                        + getServletContext().getInitParameter("usersalt"));
                                String email=request.getParameter("sckhfkdjsn");
                                 
                                mystatement.setString(2, email);
                                                             
                                if(mystatement.executeUpdate()>0)
                                {
                                     String query3="update usertable set timestamp=0 "
                                        + "where email=?";
                                
                                PreparedStatement mystatement3=myconnection.prepareStatement(query3);
                                mystatement3.setString(1, request.getParameter("sckhfkdjsn"));
                                if(mystatement3.executeUpdate()>0)        
                                    out.print("Password Changed Successfully");
                                }
                                else
                                {
                                    out.print("Password Could not be changed!");
                                }
                                    }
                                }
                                else
                                {
                                    response.sendRedirect("loginform.jsp");
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
                              
                              }
                            else
                            {
                                out.print("Passwords Do Not Match!");
                            }
                    }
    %>
				</form>
			</div>
			<div class="register-home animated wow slideInUp" data-wow-delay=".3s">
				<a href="start.jsp">Home</a>
			</div>
		</div>
	</div>
        
    </body>
</html>
