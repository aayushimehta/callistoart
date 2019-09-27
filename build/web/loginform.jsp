<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp" %>
        
    </head>
    <body>
        
        <%@include file="mainmenu.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Login Page</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Login Form</h3>
			<p class="est animated wow zoomIn" data-wow-delay=".3s">I am glad you are back! Happy Shopping!</p>
			<div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
				<form name="form" method="post" action="dologin">
                                        <input type="text" placeholder="Email Address" name="email" required="">
                                        <input type="password" placeholder="Password" name="password" required="">
					
                                        <div class="register-check-box">
                                            <div class="check">
                                                    <label class="checkbox"><input type="checkbox" value="signedin" name="signedin" id="signedin"><i> </i>Stay Signed In</label>
                                            </div>
					</div>
                                        <div class="forgot">
                                            <a href="forgotpassword.jsp"><font color="gray"><b>Forgot Password?</font></b></a>
					</div>
                                        
					<input type="submit" name="login" value="Login">
				</form>
			</div>
			<h4 class="animated wow slideInUp" data-wow-delay=".3s">For New People</h4>
			<p class="animated wow slideInUp" data-wow-delay=".3s"><a href="registeruser.jsp">Register Here</a> or Go to<a href="start.jsp">Home<span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></p>
		</div>
	</div>
<!-- //login -->
       

<%
                
                String name1="", uname="",name="";
                Cookie[] mycookies=request.getCookies();
                if(mycookies!=null && mycookies.length>0)
                {
                    for(Cookie mycookie:mycookies)
                    {
                        if(mycookie.getName().equals("name"))
                        {
                            name1=mycookie.getValue();
                            session.setAttribute("admin", name);
                            response.sendRedirect("paneladmin.jsp");
                        }
                        else if(mycookie.getName().equals("name"))
                        {
                            name1=mycookie.getValue();
                            session.setAttribute("email", uname);
                            response.sendRedirect("start.jsp");
                        }
                    }
                    
                }
                
%>
                
                
        <%@include file="footer.jsp"%>     
    </body>
</html>
