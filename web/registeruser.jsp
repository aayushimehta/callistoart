<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.min.css"/>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.structure.css"/>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.structure.min.css"/>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.theme.min.css"/>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.theme.css"/>
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
                
        <title>Register Page</title>
        <%@include file="headerfiles.jsp"%>
    </head>
    
    <body>
        <%@include file="mainmenu.jsp"%>   
           
        <div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">User Register Page</li>
			</ol>
		</div>
	</div>
         
        <div class="register">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Register Here</h3>
                        <p class="est animated wow zoomIn" data-wow-delay=".3s">There's so much here for you - and there's always more coming!
                        <span>P.S. - Have I told you how happy I am that you're here?!</span></p>
                                
			<div class="login-form-grids">
				<h5 class="animated wow slideInUp" data-wow-delay=".3s">Profile information</h5>
				<form class="animated wow slideInUp" data-wow-delay=".3s" method="post">
					<input type="text" placeholder="First Name" name="firstname" required="">
					<input type="text" placeholder="Last Name" name="lastname" required="">
                                        <input type="text" placeholder="Date of Birth" id="dob" name="dob" required="">
                                                                             
                                        <div class="input-group"> 
                                            Gender
                                                <span class="input-group-addon">
                                                    <label><input type="radio" name="gender" value="Male"> Male</label>
                                                    <label><input type="radio" name="gender" value="Female"> Female</label>
                                                </span>
                                        </div>
                                        
				<div class="register-check-box animated wow slideInUp" data-wow-delay=".3s"></div>
                               
				<h6 class="animated wow slideInUp" data-wow-delay=".3s">Login information</h6>
				
					<div id=registerdiv">
                                            <input type="email" placeholder="Email Address / Username" id="email" name="email" required="">
                                        </div>
					<input type="password" placeholder="Password" name="password" required="">
					<input type="password" placeholder="Confirm Password" name="cpassword" required="">
					<div class="register-check-box">
						<div class="check">
                                                    <label class="checkbox"><input type="checkbox" value="agree" name="checkbox"><i> </i>I accept the terms and conditions</label>
						</div>
					</div>
					<input type="submit" name="register" value="Register">
                                </form>
			</div>
			<div class="register-home animated wow slideInUp" data-wow-delay=".3s">
				<a href="start.jsp">Home</a>
			</div>
		</div>
	</div>
        
        <%@page import="java.sql.*" %>    
            <%    
                    if(request.getParameter("register")!=null)
                    {
                        Connection connection=null;
                        String usersalt=getServletContext().getInitParameter("usersalt");
                        String uname1,email1,password1,dob1,gender1;
                        uname1=request.getParameter("firstname")+" "+request.getParameter("lastname");
                        email1=request.getParameter("email");
                        password1=request.getParameter("password")+usersalt;
                        dob1=request.getParameter("dob");
                        gender1=request.getParameter("gender");
                        /*long timestamp=0;*/
                        
                        try
                            {
                                Class.forName("com.mysql.jdbc.Driver");
                                String path="jdbc:mysql://localhost:3306/callistoart";
                                connection=DriverManager.getConnection(path,"root","");
                                try
                                {
                                   String q="insert into usertable(uname,email,password,dob,gender) values(?,?,MD5(?),?,?)";
                                   PreparedStatement mystatement=connection.prepareStatement(q);
                                   mystatement.setString(1, uname1);
                                   mystatement.setString(2, email1);
                                   mystatement.setString(3, password1);  
                                   mystatement.setString(4, dob1);
                                   mystatement.setString(5, gender1);
                                   /*mystatement.getValue(6, timestamp);*/


                                   mystatement.executeUpdate();
                                   request.getRequestDispatcher("start.jsp").forward(request,response);
                                  
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
                            finally
                            {
                                connection.close();
                            }
                    }
            %>  
        <script type="text/javascript" src="js/jquery-1.12.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min2.js"></script>
        <script type="text/javascript" src="js/jquery-ui.js"></script>
        
        <script type="text/javascript">
            $( function() {
              $( "#dob" ).datepicker({
                changeMonth: true,
                changeYear: true
              });
            });
            
            $("email").blur(function(){
                var a=$(this).val();
                
            $.ajax({
                url:"ajax.jsp",
                data:{"email":a},
                type:"post",
                beforeSend:function()
                {
                    $("#registerdiv").html("<img src='images/preloader.gif'>");
                },
                success:function(result)
                {
                    $("#registerdiv").html(result);
                }
                      
                 });
            });
        </script>

        <%@include file="footer.jsp"%>
    </body>
</html>