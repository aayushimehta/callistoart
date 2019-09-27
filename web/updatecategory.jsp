
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Category</title>
        
        <%@include file="headerfiles.jsp" %>
        <script src="js/tinymce.min.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.js" type="text/javascript"></script>
        
        <style type="text/css">
            #myheading{
                font-size:1.04em;
                color:#212121;
                text-transform:uppercase;
                margin:0 0 0.5em;
            }
        
            #form1label.error
            {
                margin-left:10px;
                display:block;
                color:red;
            }
            </style>
        <script type='text/javascript'>
                  
            $(document).ready(function(){
                    
                $("#form1").submit(function(e){
                   e.preventDefault();
                   var formData = new FormData($(this)[0]);
                    $.ajax({ 
                    url:"ajaxupdatecat.jsp",
                    data: formData,
                    contentType: false,
		    cache: false,
		    processData: false,
                    type:"post",
                    beforeSend:function()
                    {
                         $("#answer2").html("<img src='images/preloader.gif' style='width:1px; height:1px'>")
                    },
                    success:function(result)
                    {
                            $("#answer2").html(result);
                    },
                    error:function()
                    {
                         $("#answer2").html("page not found");
                    }
                    });
               
                });
              
            });
    
        </script>
    </head>
    <body>
        
         
            <%
                String catname="",catimage="";
                String catid=request.getParameter("catid");
                    try
                        {                 
                            Connection myconnection;
                            Class.forName("com.mysql.jdbc.Driver");                            
                            String url=getServletContext().getInitParameter("url");
                            String username=getServletContext().getInitParameter("username");
                            String password=getServletContext().getInitParameter("password");

                            myconnection=DriverManager.getConnection(url, username, password); 
                            
                        try
                        {
                            String query="select * from categorytable where catid=?";
                            PreparedStatement mystatement=myconnection.prepareStatement(query);
                            mystatement.setString(1,catid);
                            ResultSet myres=mystatement.executeQuery();
                            
                            if(myres.next())
                            {
                                catname=myres.getString("catname"); 
                               
                                catimage=myres.getString("catimage");
                                
                                session.setAttribute("catimage", catimage);
                            }
                            
                            else
                            {  
                                out.print("No Records Exists");
                            }
                            
                        }
                            catch(Exception e)
                            {
                                out.print("Error in Query" + e.getMessage());
                            }
                            finally
                            {
                                myconnection.close();
                            }
                        }
                            
                        catch(Exception e)
                        {
                            out.println("Error in Connection " + e.getMessage());
                        } 
                        
            %>
        <div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Update Category</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        <span id="answer2"></span>
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Update Category</h3>
                        <div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
                            <form name="form1" method="post" id="form1" enctype="multipart/form-data">
                               
                            <input type="hidden" id="catid" name="catid" value='<%=catid%>'>
                            <h5 id="myheading">Category Name</h5><input type="text" name="catname" id="catname" class="form-control" value='<%=catname%>'>
                       
                            <img src="images/<%out.print(catimage);%>" width="100" height="100">
                            Category Image<input type="file" name="catimage">
                                    
                                    <input type="submit" name="updatecategory"  value="Update Category" onclick="tinyMCE.triggerSave(true,true);"/>
                                    <div class="register-home animated wow slideInUp" data-wow-delay=".3s">
                                        <input type="reset" name="reset" value="Reset">
                                    </div>
                            </form>        
                        </div>
                </div>
        </div>                            
        
                 
            
    </body>
</html>