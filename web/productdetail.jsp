<%-- 
    Document   : addtocart
    Created on : May 5, 2017, 10:37:37 PM
    Author     : It hurts when IP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Single Product Detail</title>
        <%@include file="headerfiles.jsp" %>
        <link rel="stylesheet" href="css/jquery-confirm.min.css" type="text/css"/>
        <script src="js/jquery-confirm.min.js" type="text/javascript"></script>
       
        <style>
            .btn-default {
                color: #333;
                background-color: #fff;
                border-color: #D8703F;
                padding: 12px 30px;
            }
            
        </style>
    </head>
    <body>
        <script type='text/javascript'>
                  
            $(document).ready(function(){
                    
                $("#form1").submit(function(e){
                   e.preventDefault();
                   var formData=$(this).serialize();
                    $.ajax({ 
                    url:"ajaxaddtocart.jsp",
                    data: formData,
                    type:"post",
                    beforeSend:function()
                    {
                         $("#answer2").html("<img src='images/preloader.gif' style='width:1px; height:1px'>")
                    },
                    success:function(result)
                    {
                        
                    if($.trim(result)==="success")
                        {
                            $.dialog({
                                title: 'Product Added to Cart',
                                content: 'Successful!',
                            });
                        }
                        else
                        {
                            $.dialog({
                                title: 'Product NOT Added to Cart',
                                content: 'Sorry!',
                            });
                        }
                       
                    },
                    error:function()
                    {
                         $("#answer2").html("page not found")
                    }
                    });
               
                });
                
              
            });
    
    
        </script>
        
        
        
     <%
            RequestDispatcher mydis;
            if(session.getAttribute("uname")!=null)    
            {
                mydis=request.getRequestDispatcher("userheader.jsp");
                mydis.include(request,response);
            }
            else
            {
                mydis=request.getRequestDispatcher("mainmenu.jsp");
                mydis.include(request,response);
            }

        %>
        
        
        <%
          String pname="",price="",qty="",pimage="",pimage2="",pimage3="",pdescription="",shippingmin="",shippingmax="",limitedqty="";
                    try
                         {                  
                            
                            Class.forName("com.mysql.jdbc.Driver");
                           
                            Connection myconnection;
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
                                       pname=myres.getString("pname"); 
                                       price=myres.getString("price"); 
                                       qty=myres.getString("qty");
                                       pdescription=myres.getString("pdescription");
                                       pimage=myres.getString("pimage");
                                       pimage2=myres.getString("pimage2");
                                       pimage3=myres.getString("pimage3");
                                       shippingmin=myres.getString("shippingmin");
                                       shippingmax=myres.getString("shippingmax");
                                       limitedqty=myres.getString("limitedqty");
                                       
                                       session.setAttribute("pid",request.getParameter("pid"));
                                       session.setAttribute("pname",pname);
                                       session.setAttribute("price", price);
                                       session.setAttribute("pimage",pimage);
                                       session.setAttribute("shippingmin",shippingmin);
                                       session.setAttribute("shippingmax",shippingmax);
                               
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
       <form name="form1" method="post" id="form1">   
                <div class="single">
		<div class="container">
		<div class="col-md-4 products-left">
		<div class="categories animated wow slideInUp" data-wow-delay=".5s">
					<h3>Categories</h3>
                                        <ul class="cate">
            <%
                    Connection connection=null;
                    
                    try
                    { 
                     
                        Class.forName("com.mysql.jdbc.Driver");
                        
                        String url=getServletContext().getInitParameter("url");
                        String username=getServletContext().getInitParameter("username");
                        String password=getServletContext().getInitParameter("password");
                        connection=DriverManager.getConnection(url,username,password);
                        String query= "select * from categorytable c, subcategorytable sc where c.catid=sc.catid";  
                        PreparedStatement mystatement=connection.prepareStatement(query);  
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            do
                            {
                                out.print("<li><a href='showsubcategories.jsp?catid=" + myresult.getString("catid") 
                                        + "'><b>" + myresult.getString("catname") + "</b></a></li>"
                                        + "<ul><li><a href='showproducts.jsp?subcatid="+ myresult.getString("subcatid") + "'>"
                                        + myresult.getString("subcatname") + "</a></li></ul>");
                            }
                            while(myresult.next());
                            
                                   
                        }
                    }
                        catch(Exception e)
                        {
                            out.print("Error in Query"+ e.getMessage());
                        }
                            %>
		</ul>	
		</div>
                </div>
                    <br>
                    <br>
                            <div class="col-md-8 single-right">
				<div class="col-md-5 single-right-left animated wow slideInUp" data-wow-delay=".5s">
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="images/<%=pimage%>">
								<div class="thumb-image"> <img src="images/<%=pimage%>" data-imagezoom="true" class="img-responsive"> </div>
							</li>
                                                        <li data-thumb="images/<%=pimage2%>">
								 <div class="thumb-image"> <img src="images/<%=pimage2%>" data-imagezoom="true" class="img-responsive"> </div>
							</li>
							<li data-thumb="images/<%=pimage3%>">
							   <div class="thumb-image"> <img src="images/<%=pimage3%>" data-imagezoom="true" class="img-responsive"> </div>
							</li> 
						</ul>
					</div>
					<!-- flexslider -->
						<script defer src="js/jquery.flexslider.js"></script>
						<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
						<script>
						// Can also be used with $(document).ready()
						$(document).ready(function() {
						  $('.flexslider').flexslider({
							animation: "slide",
							controlNav: "thumbnails"
						  });
						});
						</script>
					<!-- flexslider -->
				</div>
				<div class="col-md-7 single-right-left simpleCart_shelfItem animated wow slideInRight" data-wow-delay=".5s">
					<h3><%=pname%></h3>
                                        
					<h4><span class="item_price">Rs. <%=price%></span></h4>
					
					<div class="description">
						<h5><i>Description</i></h5>
						<p><%=pdescription%></p>
					</div>
					<div class="color-quality">
                                               	<div class="color-quality-left">
							<h5>Quantity</h5>
                                                        <%
                                                            session.setAttribute("limitedqty", limitedqty);
                                                        %>
                                                        
							<%
                                                            int qty2=Integer.parseInt(qty);
                                                            int limitedqty2=Integer.parseInt(limitedqty);
                                                        try
                                                        {    
                                                            if(qty2>0)
                                                            {
                                                                out.print("<select name='qty' id='qty'>");
                                                                
                                                                for(int x=1;x<=limitedqty2;x++)
                                                                {
                                                                    out.print("<option>" + x + "</option>");
                                                                }

                                                                out.print("</select>");
                                                            }
                                                            else
                                                            {
                                                                out.print("<font color='red'><b>Out of Stock</b></font>");
                                                                out.print("<script type='text/javascript'>"
                                                                        + "$(document).ready(function(){$('#occasion-cart').hide();});"
                                                                        + "</script>");
                                                            }
                                                        }
                                                        catch(Exception e)
                                                        {
                                                            out.print(e.getMessage());
                                                        }
                    
                                                        %>
						</div>
                                        </div>    
                                                <div class="clearfix"> </div>
                                                <div class="occasional">
							<h5>Shipping time</h5>
							<%=shippingmin%> - <%=shippingmax%> Days
						</div>
						<div class="clearfix"> </div>
					
                                        
					<div class="occasion-cart" id="occasion-cart" data-wow-delay=".5s">
                                            <button type="submit" class="btn btn-default" name="submit">
                                                <font color="#D8703F" size="3px"><b>ADD TO CART</b></font></button>
					</div>
				</div>
				</div>
                    </div>
		</div>
	
				
       </form>			
          
   <%@include file="footer.jsp" %>
    </body>
    
</html>
