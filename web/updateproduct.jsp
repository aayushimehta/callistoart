<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product</title>
        
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
                    url:"ajaxupdate2.jsp",
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
                String catid="",subcatid="",pid="", name="",price="",qty="",pdescription="",pimage="",pimage2="",pimage3="",shippingmin="", shippingmax="",limitedqty="", size="";
                
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
                            String query="select * from producttable where pid=?";
                            PreparedStatement mystatement=myconnection.prepareStatement(query);
                            mystatement.setString(1,request.getParameter("pid"));
                            ResultSet myres=mystatement.executeQuery();
                            
                            if(myres.next())
                            {
                                name=myres.getString("pname"); 
                                price=myres.getString("price"); 
                                qty=myres.getString("qty");
                                pdescription=myres.getString("pdescription");
                                catid=myres.getString("catid");
                                subcatid=myres.getString("subcatid");
                                shippingmin=myres.getString("shippingmin");
                                shippingmax=myres.getString("shippingmax");
                                limitedqty=myres.getString("limitedqty");
                                size=myres.getString("size");
                                
                                pid=request.getParameter("pid");
                                
                                pimage=myres.getString("pimage");
                                pimage2=myres.getString("pimage2");
                                pimage3=myres.getString("pimage3");
                                session.setAttribute("pimage", pimage);
                                session.setAttribute("pimage2", pimage2);
                                session.setAttribute("pimage3", pimage3);
                                
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
				<li class="active">Update Product</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <!-- login -->
	<div class="login">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Update Product</h3>
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
                                    <div id="selectbox">
                                        <h5 id="myheading">Choose Sub-category</h5><select id="subcategory" name="subcategory" class="frm-field required sect" required=""/>
                                        
					<option value=''>Choose Sub-category</option>
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
                                String query="select * from subcategorytable where catid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1, catid);
                                ResultSet myres=mystatement.executeQuery();
                                out.print("<option>Select</option>");
                                if(myres.next())
                                {
                                    do
                                    {
                                        if(myres.getString("subcatid").equals(subcatid))
                                        {
                                            out.print("<option selected value=" + myres.getString("subcatid") + ">" 
                                            + myres.getString("subcatname") +"</option>");
                                        }
                                        else
                                        {
                                            out.print("<option value=" + myres.getString("subcatid") + ">" 
                                            + myres.getString("subcatname") +"</option>");
                                        }
                                    }
                                    while(myres.next());
                                   
                                }
                                
                                else
                                {
                                    out.print("<option>First add categories</option>");
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
                                    </div>
                <br>
                <input type="hidden" name="pid" value='<%=pid%>'>
                <h5 id="myheading">Product Name</h5><input type="text" name="pname" class="form-control" value='<%=name%>'>
                <h5 id="myheading">Price</h5><input type="text" name="price" class="form-control" value='<%=price%>'>
                <h5 id="myheading">Quantity</h5><input type="text" name="qty" class="form-control" value='<%=qty%>'>
                <h5 id="myheading">Shipping (Maximum No. of Days)</h5><input type="text" name="shippingmax" class="form-control" value='<%=shippingmax%>'>
                <h5 id="myheading">Shipping (Minimum No. of Days)</h5><input type="text" name="shippingmin" class="form-control" value='<%=shippingmin%>'>
                <h5 id="myheading">Limited Quantity</h5><input type="text" name="limitedqty" class="form-control" value='<%=limitedqty%>'>
                <h5 id="myheading">Description</h5>
                        <textarea name="pdescription" id="pdescription" class="form-control" rows="10">
                            <%=pdescription%>
                        </textarea>
                        <br>        
                    <%out.print("<img src='images/" + pimage + "' width='100px' height='100px'>"); %>
                    Product Image<input type="file" name="pimage"><br>
                    
                     <%out.print("<img src='images/" + pimage2 + "' width='100px' height='100px'>"); %>
                     Product Image 2<input type="file" name="pimage2"><br>
                    
                     <%out.print("<img src='images/" + pimage3 + "' width='100px' height='100px'>"); %>
                     Product Image 3<input type="file" name="pimage3"><br>
                    
                                    
                                    <input type="submit" name="updateproduct" value="Update Product" onclick="tinyMCE.triggerSave(true,true);"/>
                                    <div class="register-home animated wow slideInUp" data-wow-delay=".3s">
                                        <input type="reset" name="reset" value="Reset">
                                    </div>
                                    <span id="answer2"></span>
                            </form>        
                        </div>
                </div>
        </div>                            
                                    
    </body>
</html>