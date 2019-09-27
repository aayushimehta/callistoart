
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<html>
    <head>
        <title>Change Password</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp" %>
        
    </head>
    <body>
        
       <%@include file="userheader.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Change Password</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">New Password</h3>
			<p class="est animated wow zoomIn" data-wow-delay=".3s">Change password frequently to remain secured! </p>
			<div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
				<form name="form" method="post">
                                        <input type="password" placeholder="Enter your Old Password" name="oldpass" required="">
                                        <input type="password" placeholder="Enter your New Password" name="password1" required="">
                                        <input type="password" placeholder="Re-Enter your New Password" name="password2" required="">
					
					<input type="submit" name="changepassword" value="Change Password">
				</form>
			</div>
			<div class="register-home animated wow slideInUp" data-wow-delay=".3s">
				<a href="userwelcome.jsp">Home</a>
			</div>
		</div>
	</div>
        
        <%@page import="java.sql.*" %>    
        <%    
            if(request.getParameter("changepassword")!=null)
                {
                    String oldpassword,newpassword1,newpassword2;
                    oldpassword=request.getParameter("oldpass");
                    newpassword1=request.getParameter("password1");
                    newpassword2=request.getParameter("password2");
                    
                 
                    
                    if(newpassword1.equals(newpassword2))
                    {
                        
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            myconnection=DriverManager.getConnection(url, username, password);

                            try
                            {
                                if(session.getAttribute("uname")!=null) 
                                {
                                    String query2="update usertable set password=MD5(?) where email=? and password=MD5(?)";
                                    PreparedStatement mystatement2=myconnection.prepareStatement(query2);
                                    mystatement2.setString(1, newpassword1 + getServletContext().getInitParameter("usersalt"));
                                    mystatement2.setString(2, session.getAttribute("email").toString());
                                    mystatement2.setString(3, oldpassword + getServletContext().getInitParameter("usersalt"));
                                    
                                    if(mystatement2.executeUpdate()>0)
                                    {
                                                out.println("Password Changed Successfully!");
                                    }
                                    else
                                    {
                                        request.getRequestDispatcher("changepassword.jsp").include(request,response);
                                        out.print("<script type='text/javascript'>alert('Wrong Password')</script>");
                                    }
                                }
                                else
                                    {
                                        request.getRequestDispatcher("loginform.jsp").forward(request,response);
                                    }
                            }
                            catch(Exception e)
                            {
                                out.print("Error in QUERY "+e);
                            }
                   
                    }
                    
                
        
                    catch(Exception e)
                    {
                           out.print("Error in FORM " + e);
                    }
                }
                }
        %>
              
        <%@include file="footer.jsp"%>     
    </body>
</html>
