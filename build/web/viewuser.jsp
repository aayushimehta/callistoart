<%-- 
    Document   : viewuser
    Created on : May 14, 2017, 4:37:33 PM
    Author     : It hurts when IP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%%>
<!DOCTYPE html>
<html>
<head>
<title>View Profile</title>
<%@include file="headerfiles.jsp"%>
<style>
    .login-form-grids button {
    outline: none;
    border: none;
    padding: 10px 0;
    font-size: 1em;
    color: #fff;
    display: block;
    width: 100%;
    background: #FFC229;
    margin: 1.5em 0 0;
    }   
    a {
    color:white;
    text-decoration: none;
    }
</style>
</head>
<body>
<!-- header -->
<%@include file="userheader.jsp" %>
<%
    
    String name="",gender="",dob="",email="";
                                        
    if(session.getAttribute("email")!=null)
    {
                            
                            String u=session.getAttribute("email").toString();

                            Connection connection;
                            String path2="jdbc:mysql://localhost/";
                            String place2="callistoart";

                            try
                            {
                                Class.forName("com.mysql.jdbc.Driver");
                                connection=DriverManager.getConnection(path2+place2,"root","");
                        try
                        {
                            String q="select * from usertable where email=?";
                            PreparedStatement mystatement=connection.prepareStatement(q);
                            mystatement.setString(1, u);
                            ResultSet r=mystatement.executeQuery();
                            if(r.next())
                            {
                                name=r.getString("uname");
                                gender=r.getString("gender");
                                dob=r.getString("dob");
                                email=r.getString("email");
                            }


                        }
                        catch(Exception e)
                        {
                            out.println("Error in query " + e.getMessage());
                        }

                    }
                    catch(Exception e)
                    {
                        out.println("Error in connection " + e.getMessage());
                    }
    }
%>
 <!-- //header -->
<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">View Profile</li>
			</ol>
		</div>
	</div>
<!-- //breadcrumbs -->
<!-- register -->
	<div class="register">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".5s">View Here</h3>
			
			<div class="login-form-grids">
				<h5 class="animated wow slideInUp" data-wow-delay=".5s">profile information</h5>
				<form id="viewform" class="animated wow slideInUp" data-wow-delay=".5s">
                                    <label>NAME</label>
                                        <p><%=name%></p>
                                    <br/><label>DATE OF BIRTH</label>
                                        <p><%=dob%></p>
                                    <br/><label>GENDER</label>
                                        <p><%=gender%></p>
                                    <br><label>REGISTERED E-MAIL</label>
                                        <p><%=email%></p>    
				
                                        <a href="edituser.jsp" color="white"><button type='button'>Edit Profile</button></a>
                                        </form>
				
			</div>
			<div class="register-home animated wow slideInUp" data-wow-delay=".5s">
				<a href="start.jsp">Home</a>
			</div>
		</div>
	</div>
<!-- //register -->
<!-- footer -->
<%@include file="footer.jsp" %>
<!-- //footer -->
   
</body>
</html>

