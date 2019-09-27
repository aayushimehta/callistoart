<%-- 
    Document   : edituser
    Created on : May 14, 2017, 10:54:35 PM
    Author     : It hurts when IP
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%String uname="",gender="",dob="",u="";%>
<!DOCTYPE html>
<html>
<head>
<title>Edit User Details </title>
<%@include file="headerfiles.jsp"%>

<script src="js/jquery-1.12.js" type="text/javascript"></script>
<script src="js/jquery.validate.js" type="text/javascript"></script>

<style>
	#edituserform label.error, #edituserform input.submit {
		margin-left: 0px;
                color: red;
                size: 2px;
	}
	</style>

 <script>
           $.validator.setDefaults({
		submitHandler: function() {
			
                        var formData=$("#edituserform").serialize();
                            $.ajax({
                                    url:'ajaxedituser.jsp',
                                    type:'post',
                                    data:formData,
                                    beforeSend: function () {
                                    $("#message").html("<img src='images/preloader.gif' style='width:2px'>");
                                    },
                                    success:function(x) 
                                    {
                                    $("#message").html("");
                                    $("#message2").fadeIn(1000).html(x).delay(2000).fadeOut(1000);	
                                    },
                                    error: function(e) 
                                    {
                                    $("#message").html("error" + e);
                                    }
                            });
                            alert("submitted!");
		}
	   });
        
           $(document).ready(function(){
               $("#edituserform").validate(
                       {
			rules: {
				name: "required",
				address: "required",
				phone: { 
					required: true,
					digits:true,
                                        minlength:10,
                                        maxlength:10
				},
                                gender:"required",
                                dob:{
                                    required:true
                                }
			},
			messages: {
				name: "Please enter your name",
				address: "Please enter your address",
				phone: {
					required: "Please enter your phone number",
					minlength: "Your phone number must have  10 digits",
                                        maxlength: "Your phone number must have  10 digits"
				},
                                gender:"Select your gender",
                                dob:"Please provide your date of birth"
			}
		});
                         });
    </script>
</head>
	
<body>
    <%
    if(session.getAttribute("email")!=null)
    {             
                            u=session.getAttribute("email").toString();

                            Connection myconnection;
                            String path="jdbc:mysql://localhost/";
                            String place="callistoart";

                            try
                            {
                                Class.forName("com.mysql.jdbc.Driver");
                                myconnection=DriverManager.getConnection(path+place,"root","");
                            try
                            {
                            String q="select * from usertable where email=?";
                            PreparedStatement mystatement=myconnection.prepareStatement(q);
                            mystatement.setString(1, u);
                            
                            ResultSet r=mystatement.executeQuery();
                            if(r.next())
                            {
                                uname=r.getString("uname");
                                gender=r.getString("gender");
                                dob=r.getString("dob"); 
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
    }
%>
<!-- header -->
<%@include file="userheader.jsp" %>
 <!-- //header -->
<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Edit User Page</li>
			</ol>
		</div>
	</div>
<!-- //breadcrumbs -->
<!-- register -->
	<div class="register">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".5s">Edit Here</h3>
			
			<div class="login-form-grids">
				<h5 class="animated wow slideInUp" data-wow-delay=".5s">Profile Information</h5>
				<form id="edituserform" class="animated wow slideInUp" method="post" data-wow-delay=".5s">
                                    <label>Name</label>
					<input type="text" placeholder="Name" name="name" id="name" value='<%=uname%>' required> 
                                                                          
                                    <br/><label>Date of Birth</label>
                                        <input type="text" placeholder="Date Of Birth"  name="dob" id="dob" value='<%=dob%>' required> 
                                    <br/><label>Gender
                                    
                                        <%
                                            if(gender.equals("Female"))
                                            out.print("<label><input type='radio' name='gender' value='Female' required='' checked='TRUE'>Female</label>");
                                            else
                                            out.print("<label><input type='radio' name='gender' value='Female' required=''>Female</label>");
                                            
                                            if(gender.equals("Male"))
                                            out.print("<label><input type='radio' name='gender' value='Male' required='' checked='checked'>Male</label>");
                                            else
                                            out.print("<label><input type='radio' name='gender' value='Male' required=''>Male</label>");
                                        %>
                                        </label>
				<div class="register-check-box">
						<div id="message"></div>
                                                <div id="message2"></div>
					</div>
					<input type="submit" name="Submit" value="Edit Details" >
                                        
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

