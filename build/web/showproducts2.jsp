<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <%
        session.setAttribute("subcatid",request.getParameter("subcatid"));
        %>
    <head>
        <title>Products</title> 
        <%@include file="headerfiles.jsp" %>
        <link rel="stylesheet" href="css/jquery-confirm.min.css" type="text/css"/>
        <script src="js/jquery-confirm.min.js" type="text/javascript"></script>
        <style>
        
            div.cat
            {
                height : 230px;
                width : 190px;
                margin-left: 5em;
            }
            div.cart
            {
                height : 30px;
                width : 90px;
                margin-left: 5em;
            }
             div.head
            {
               margin-left: 5em;
               height: 30px;
               width: 220px;
            }
            .products-right-grid1-add-cart p a,.new-products-grid-right-add-cart p a {
                font-size: 14px;
                color: #D8703F;
                margin: 1em 7em;
                text-decoration: none;
                text-transform: uppercase;
                padding: .5em 1.8em;
                border: 1px solid;
            }
            .table {
                width: 100%;
                max-width: 100%;
                margin-bottom: 20px;
                margin-top: 20px;
                margin-left: -3em;
            }
            .btn-default {
                color: #333;
                background-color: #fff;
                border-color: #D8703F;
                padding: 7px 15px;
                margin-left: 2.5em;
            }
            .header-right {
                float: right;
                margin-top: 5px;
                width: 2.5%;
            }

        </style>
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
        
        <script type='text/javascript'>
                  
            $(document).ready(function(){
                                    
                $("#sorting").change(function(){
                    var id=$("#sorting").val();
                    
                    
                        $.ajax({ 
                        url:"ajaxsorting.jsp",
                        data:{"sorting":id},
                        type:"post",
                        beforeSend:function()
                        {
                             $("#cate").html("<img src='images/preloader.gif'>");
                        },
                        success:function(result)
                        {
                            
                            $("#cate").html(result);
                        },
                        error:function()
                        {
                             $("#cate").html("page not found");
                        }
                        });
              
            });
        });
    
    
        </script>
    </head>
    
    <body>
       
        <div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Products</li>
			</ol>
		</div>
	</div>
        
        <div class="single">
		<div class="container">
		<div class="col-md-3 products-left">
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
        <div class="list">
            
		 <div class="col-md-9 single-right">
                     <div class="products-right-grid">
					<div class="products-right-grids animated wow slideInRight" data-wow-delay=".5s">
						<div class="sorting">
							<select id="sorting" name="sorting" class="frm-field required sect">
								<option value="default">Default sorting</option>
								<option value="high">Sort by Price (High to Low)</option>
                                                                <option value="low">Sort by Price (Low to High)</option>
							</select>
						</div>
						
						<div class="clearfix"> </div>
					</div>
					
				</div>
                     <div  id="cate">
                <%
                    Connection myconnection=null;
                    String url=getServletContext().getInitParameter("url");
                    String username=getServletContext().getInitParameter("username");
                    String password=getServletContext().getInitParameter("password");
                     try
                        { 
                     
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                        String query= "select * from producttable where subcatid=?";  
                        PreparedStatement mystatement=myconnection.prepareStatement(query);  
                        mystatement.setString(1, request.getParameter("subcatid"));
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                + "<table class='table'><tr>");
                            int a=1;
                        
                        do
                        {
                           out.print("<td><div class='cat'><center><a href='productdetail.jsp?pid=" + myresult.getString("pid") +"'>"
                                   + "<img src='images/"+ myresult.getString("pimage")+"' alt=' ' class='img-responsive'></a></center></div>"
                                   + "<div class='head'><h4><a href='productdetail.jsp?pid="+ myresult.getString("pid") + "'>" + myresult.getString("pname") 
                                   + "</a></h4></div><br><div class='simpleCart_shelfItem products-right-grid1-add-cart'><p><span class='item_price'>Rs."
                                   + myresult.getString("price") + "</span><br><br><div class='cart'><button type='submit' class='btn btn-default' name=submit>"
                                   + "<font color='#D8703F' size='3px'><b>ADD TO CART</b></font></button></p>"+"</div></div></td>");
                            a++;
                        
                            if(a==4)
                            {
                                out.print("</tr><tr>");
                                a=1;
                            }
                        }
                        while(myresult.next());
                        out.print("</table>");
                        }
                        else
                        {
                            out.print("No Data Found!");
                        }
                    }
                    catch(Exception e)
                    {
                         out.print("Error in Query"+ e.getMessage());
                    }
                        
                     
                            %>              
                     </div>
                     
                 </div>
                 </div>
                </div></div>
<!-- footer -->
<%@include file="footer.jsp"%>
<!-- //footer -->
    </body>
</html>

