<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Product</title>
        <%@include file="headerfiles.jsp" %>
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
        
        <script src="js/tinymce.min.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js" type="text/javascript"></script>
        
        <script type='text/javascript'>
            $(document).ready(function(){
            $("#form1").validate({
                    rules: {
                        pname:"required",
                        price: {
                            required:true,
                            digits:true
                        },
                        description:"required",
                        
                        quantity: {
                            required:true,
                            digits:true
                        },
                        
                        messages: {
                            pname:"Please enter the Product Name!",
                            price:"This field is required!"
                        }
                    }
                   
        });
       
            });
            
        </script>
       
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
        
            $(document).ready(function(){
                
                $.validator.setDefaults({
                    submitHandler: function(){
                    var formData = new FormData($("#form1")[0]);
                    }
                });
            
                
                $("#form1").submit(function(e){
                   e.preventDefault();
                   var formData = new FormData($(this)[0]);
                    $.ajax({ 
                    url:"ajaxaddproduct.jsp",
                    data: formData,
                    contentType: false,
		    cache: false,
		    processData: false,
                    type:"post",
                    beforeSend:function()
                    {
                         $("#answer2").html("<img src='images/preloader.gif' style='width:2px'>");
                    },
                    success:function(result)
                    {
                            $("#answer2").html(result);
                    },
                    error:function()
                    {
                         $("#answer2").html("Add page not found");
                    }
                    })
                   
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
                        url:"ajaxsubcat.jsp",
                        data:{"catid":id},
                        type:"post",
                        beforeSend:function()
                        {
                             $("#answer").html("<img src='images/preloader.gif'>")
                        },
                        success:function(result)
                        {
                            $("#answer").html("")
                            $("#selectbox").html(result)
                        },
                        error:function()
                        {
                             $("#answer").html("Subcat page not found")
                        }
                        });
                    }
               
                });
                
            });
    
            
        </script>
    </head>
    <body>
        
        <%@include file="adminheader.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Add New Product</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Add New Product</h3>
			<p class="est animated wow zoomIn" data-wow-delay=".3s">Yayyy! New Products</p>
			<div class="login-form-grids animated wow slideInUp" data-wow-delay=".3s">
                            <form name="form1" method="post" id="form1" enctype="multipart/form-data">
                                <h5 id="myheading">Choose Category</h5> <select id="category" name="category" class="frm-field required sect" required>
                                    
                                    <%@page import="java.sql.*"%>
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
                                                out.print("<option value=''>Select Category</option>");
                                                ResultSet myres=mystatement.executeQuery();
                                                
                                                if(myres.next())
                                                {
                                                    do
                                                    {
                                                    out.print("<option value=" + myres.getString("catid") + ">"+ myres.getString("catname") +"</option>");
                                                    }
                                                    while(myres.next());

                                                }

                                                else
                                                {
                                                    out.print("<option value=''>Add Category(s) First</option>");
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
                                    <div id="selectbox">
                                        <h5 id="myheading">Choose Sub-category</h5><select id="subcategory" name="subcategory" class="frm-field required sect" required=""/>
                                        
					<option value=''>Choose Sub-category</option>
                                       					
                                    </select>
                                    </div>
                                    
                                    <br>
                                    
                                    <h5 id="myheading">product name</h5><input type="text" placeholder="Product Name" name="pname" required=""/>
                                    <h5 id="myheading">size</h5><input type="text" placeholder="Size" name="size">
                                    <h5 id="myheading">quantity</h5><input type="text" placeholder="Quantity" name="quantity" required=""/>
                                    <h5 id="myheading">Price</h5><input type="text" placeholder="Price" name="price" required=""/>
                                    
                                    <h5 id="myheading">choose product Image 1</h5><input type="file" name="pimage" id="pimage"><br>
                                    <h5 id="myheading">choose product Image 2</h5><input type="file" name="pimage2" id="pimage2"><br>
                                    <h5 id="myheading">choose product Image 3</h5><input type="file" name="pimage3" id="pimage3">
                                    <br>
                                    <h5 id="myheading">Product Description</h5><textarea name="description" id="description"></textarea>
                                    <br>
                                    <br>
                                    <h5 id="myheading">Shipping (Minimum Number of Days)</h5><input type="text" placeholder="Minimum No. of Days" name="shippingmin" required=""/>
                                    <h5 id="myheading">Shipping (Maximum Number of Days)</h5><input type="text" placeholder="Maximum No. of Days" name="shippingmax" required=""/>
                                    <h5 id="myheading">Limited quantity for 1 customer</h5><input type="text" placeholder="Maximum Quantity" name="limitedqty">
                                    
                                    <input type="submit" name="addproduct" value="Add Product" onclick="tinyMCE.triggerSave(true,true);"/>
                                    <div class="register-home animated wow slideInUp" data-wow-delay=".3s">
                                        <input type="reset" name="reset" value="Reset">
                                    </div>
                                    
                            </form>
                                <div id="answer2"></div>
			</div>
		</div>
	</div>

        <%@include file="footer.jsp"%>     
    </body>
</html>
