<%-- 
    Document   : contactus
    Created on : May 16, 2017, 10:22:18 PM
    Author     : It hurts when IP
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.util.Properties"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <%@include file="headerfiles.jsp" %>
    </head>
    <body>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Search Result</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        <!-- mail -->
	<div class="mail animated wow zoomIn" data-wow-delay=".5s">
		<div class="container">
			<h3>Mail Us</h3>
			<p class="est">Hey! We love to hear from you... all your queries and complaints. We will reply you back</p>
			<div class="mail-grids">
				<div class="col-md-8 mail-grid-left animated wow slideInLeft" data-wow-delay=".5s">
					<form>
						<input type="text" name="name" placeholder="Name" required="">
						<input type="email" name="email" placeholder="Email" required="">
						<input type="text" name="subject" placeholder="Subject" required="">
						<textarea name="message" placeholder="Message" required=""></textarea>
						<input type="submit" name="submit" value="Submit Now" >
					</form>
				</div>
				<div class="col-md-4 mail-grid-right animated wow slideInRight" data-wow-delay=".5s">
					<div class="mail-grid-right1">
						<img src="images/3.png" alt=" " class="img-responsive" />
						<h4>Aayushi Mehta<span>Manager</span></h4>
						<ul class="phone-mail">
							<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>Phone: +1234 567 893</li>
							<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i>Email: <a href="#">callistoartmakers@gmail.com</a></li>
						</ul>
						
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<iframe class="animated wow slideInLeft" data-wow-delay=".5s" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3407.8155468996883!2d75.58011331475454!3d31.33646678143086!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x391a5a668e17e61f%3A0x896049da2cb6ce9a!2sOld+Railway+Rd%2C+Old+Court%2C+Jalandhar%2C+Punjab!5e0!3m2!1sen!2sin!4v1495043511981" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe> 
		</div>
	</div>
<!-- //mail -->
 <%
                         if(request.getParameter("submit")!=null)    
                         {
                             String name="",email="",subject="",msg="";
                             name=request.getParameter("name");
                             email=request.getParameter("email");
                             subject=request.getParameter("subject");
                             msg=request.getParameter("message");
                             
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
		try {
			Message message = new MimeMessage(session2);
                        message.addHeader("Content-type", "text/html; charset=UTF-8");
                        message.setFrom(new InternetAddress("callistoartmakers@gmail.com"));
                        message.setRecipients(Message.RecipientType.TO,	InternetAddress.parse("callistoartmakers@gmail.com"));
                        message.setSubject("Contact Us Form Submition from "+email);        
                        message.setText("Message From :\t "+name+" (" + email +")\n"
                                        + "Subject --" + subject + "\n\n\t" + msg);
                        Transport.send(message);
                        out.print("<script>alert('Submitted Successfully\n Thanks For Contacting Us !!');</script>");
                }
                 catch(Exception e)         
                 {
                     out.println("Mail does not work" + e.getMessage());
                 }
                         }
                        
%>
<%@include file="footer.jsp"%>
    </body>
</html>
