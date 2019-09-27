<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Sub-category</title>
        
        <%@include file="headerfiles.jsp" %>
        <%@include file="adminheader.jsp" %>
        <script src="js/tinymce.min.js" type="text/javascript"></script>
        <script src="js/jquery.tinymce.min.js" type="text/javascript"></script>
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
            
            tinymce.init({
                    selector: 'textarea',
                    height: 500,
                    theme: 'modern',
                    plugins: [
                      'advlist autolink lists link image charmap print preview hr anchor pagebreak',
                      'searchreplace wordcount visualblocks visualchars code fullscreen',
                      'insertdatetime media nonbreaking save table contextmenu directionality',
                      'emoticons template paste textcolor colorpicker textpattern imagetools codesample toc'
                    ],
                    toolbar1: 'undo redo | insert | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image',
                    toolbar2: 'print preview media | forecolor backcolor emoticons | codesample',
                    image_advtab: true,
                    templates: [
                      { title: 'Test template 1', content: 'Test 1' },
                      { title: 'Test template 2', content: 'Test 2' }
                    ],
                    content_css: [
                      'https://fonts.googleapis.com/css?family=Lato:300,300i,400,400i',
                      'css/codepen.min.css'
                    ]
                });
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
                    
                $("#form1").submit(function(e){
                   e.preventDefault();
                   var formData = new FormData($(this)[0]);
                    $.ajax({ 
                    url:"ajaxupdatesubcat.jsp",
                    data: formData,
                    contentType: false,
		    cache: false,
		    processData: false,
                    type:"post",
                    beforeSend:function()
                    {
                         $("#answer2").html("<img src='images/preloader.gif' style='width:1px; height:1px'>");
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
               $("#category").change(function(){
                    var id=$(this).val();
                    if(id==="Select Category")
                    {
                        $("#answer").html("<font color='red'>Choose a Valid Category</font><br>");
                    }
                    else
                    {
                        $.ajax({ 
                        url:"ajaxupdate1.jsp",
                        data:{"catid":id},
                        type:"post",
                        beforeSend:function()
                        {
                             $("#answer").html("<img src='images/preloader.gif'>");
                        },
                        success:function(result)
                        {
                            $("#answer").html("");
                            $("#selectbox").html(result);
                        },
                        error:function()
                        {
                             $("#answer").html("page not found");
                        }
                        });
                    }
               
                });
                
            });
    
        </script>
    </head>
    <body>
        
         
            <%
                String catid="",subcatid="",subcatname="",subcatimage="";
                
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
                            String query="select * from subcategorytable where subcatid=?";
                            PreparedStatement mystatement=myconnection.prepareStatement(query);
                            mystatement.setString(1,request.getParameter("subcatid"));
                            ResultSet myres=mystatement.executeQuery();
                            
                            if(myres.next())
                            {
                                subcatname=myres.getString("subcatname"); 
                                catid=myres.getString("catid");
                                subcatid=request.getParameter("subcatid");
                               
                                
                                subcatimage=myres.getString("subcatimage");
                                session.setAttribute("subcatimage", subcatimage);
                            }
                            
                            else
                            {  
                                out.print("No Records Exists");
                            }
                            
                        }
                            catch(Exception e)
                            {
                                out.println("Error in Query" + e.getMessage());
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
				<li class="active">Update Sub-category</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Update Sub-category</h3>
                        <div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
                            <form name="form1" method="post" id="form1" enctype="multipart/form-data">
                                <h5 id="myheading">Choose Category</h5> 
                                <select id="category" name="category" class="frm-field required sect" required>
                                
                <%
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
                                String query="select * from categorytable";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                 
                                ResultSet myres=mystatement.executeQuery();
                                out.print("<option>Select Category</option>");
                                if(myres.next())
                                {
                                    do
                                    {
                                        if(myres.getString("catid").equals(catid))
                                        {
                                        out.print("<option selected value=" + myres.getString("catid") + ">" 
                                            + myres.getString("catname") +"</option>");
                                        }
                                        else
                                        {
                                            out.print("<option value=" + myres.getString("catid") + ">" 
                                            + myres.getString("catname") +"</option>");
                                        }
                                    }
                                    while(myres.next());
                                   
                                }
                                
                                else
                                {
                                    out.print("<option>Add First Categories</option>");
                                }
                               
                                
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query" + e.getMessage());
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
                 
                 </select>
                                    <span id="answer"></span>
                                    
                                    <br>                  
                 <br>                   
                <h5 id="myheading">Sub-category Name</h5><input type="text" name="subcatname" class="form-control" value='<%=subcatname%>'>
                                        
					
                
                <input type="hidden" name="subcatid" value='<%=subcatid%>'>
               
                        
                       
                    <%out.print("<img src='images/" + subcatimage + "' width='100px' height='100px'>"); %>
                    Sub-Category Image<input type="file" name="subcatimage">
                                    
                                    <input type="submit" name="updatesubcat" value="Update Sub-category">
                                    <div class="register-home animated wow slideInUp" data-wow-delay=".3s">
                                        <input type="reset" name="reset" value="Reset">
                                    </div>
                                    <span id="answer2"></span>
                            </form>        
                        </div>
                </div>
        </div>                            
                                    
    </body>