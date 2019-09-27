<%-- 
    Document   : forgotpassword
    Created on : May 12, 2017, 10:06:38 PM
    Author     : It hurts when IP
--%>

<%@page import="java.util.*"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <%@include file="headerfiles.jsp" %>
    </head>
    <body>
    
    <%@include file="mainmenu.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Forgot Password</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Forgot Password</h3>
			<p class="est animated wow zoomIn" data-wow-delay=".3s">Hey! Don't worry! We shall help you.</p>
			<div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
				<form name="form" method="post">
                                        <input type="text" placeholder="Email Address" name="email" required="">
                                        <input type="submit" id="submit" name="submit" value="Send Reactivation Email">
				
    <%
            if(request.getParameter("submit")!=null)    
            {
                Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session2 = Session.getInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("callistoartmakers@gmail.com","aayushi17");
				}
			});
	try 
        {
	Message message = new MimeMessage(session2);
        message.addHeader("Content-type", "text/html; charset=UTF-8");
	message.setFrom(new InternetAddress("callistoartmakers@gmail.com"));
	message.setRecipients(Message.RecipientType.TO,	InternetAddress.parse(request.getParameter("email")));
	message.setSubject("Password Reset Link");
        
        String text = request.getParameter("email");
        
        long timestamp=new java.util.Date().getTime();
        
        message.setText("You have requested for Password Reset Link. Kindly click the link below to reset your password.\n\n"
                        + "http://localhost:8080/CallistoArt/resetpassword.jsp?sckhfkdjsn=" + text + "&timestamp=" + timestamp
                + "\n\nThis link will expire once it is used.");
        Transport.send(message);
        
        try
            {
                            
                myconnection=DriverManager.getConnection(url, username, password);
                try
                {
                    String query="update usertable set timestamp=? where email=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setLong(1, timestamp);
                    mystatement.setString(2, request.getParameter("email"));
                               
                                if(mystatement.executeUpdate()>0)
                                {
                                    out.print("<br>");
                                    out.print("<div class='alert alert-info' role='alert'><strong>Hey! </strong>"
                                    + "Password Link has been sent to your Registered Email Address. "
                                    + "Click on the given in your Email to get back with us! See you soon!</div>");
                                }
                                
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Query " + e.getMessage());
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
                 catch(Exception e)         
                 {
                     out.print("Mail does not work " + e.getMessage());
                 }
                         }
                               
    %>
                         
                         <span id="answer"></span>
                                </form>
			</div>
                </div>
        </div>
    </body>
</html>
