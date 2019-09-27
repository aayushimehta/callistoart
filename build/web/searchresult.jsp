<%-- 
    Document   : searchresult
    Created on : May 13, 2017, 11:11:38 PM
    Author     : It hurts when IP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
        <%@include file="headerfiles.jsp" %>
        
    </head>
    <body>
        <style>
        
            div.cat
            {
                height : 200px;
                width : 170px;
                margin-left: 6.5em;
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
             div.subcat
            {
                height : 200px;
                width : 160px;
                margin-left: 7em;
            }
            .cname
            {
                margin-left:7.5em;
            }
            .btn-default {
                color: #333;
                background-color: #fff;
                border-color: #D8703F;
                padding: 7px 15px;
                margin-left: 2.5em;
            }
            div.cart
            {
                height : 30px;
                width : 90px;
                margin-left: 5em;
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
        <div class="list">
            <div class="container">
        <%@page import="java.sql.*" %> 
        <% 
    
    if(request.getParameter("searchbt")!=null)
    { 
            
                            Connection myconnection;
                            String path="jdbc:mysql://localhost/";
                            String place="callistoart";
                            String search =request.getParameter("search");
                    
                                    try
                                   {
                                       Class.forName("com.mysql.jdbc.Driver");
                                       myconnection=DriverManager.getConnection(path+place,"root","");
                                       
                                       try
                                       {
                                          String qu,qu1,qu2; 
                                          PreparedStatement mystatement,mystatement1, mystatement2 ;          
                                          
                                               qu="select * from categorytable where catname like ?";
                                               mystatement=myconnection.prepareStatement(qu);
                                               mystatement.setString(1,"%"+search+"%");
                                               
                                               qu1="select * from subcategorytable where subcatname like ?";
                                               mystatement1=myconnection.prepareStatement(qu1);
                                               mystatement1.setString(1,"%"+search+"%");
                                               
                                               qu2="select * from producttable where pname like ?";
                                               mystatement2=myconnection.prepareStatement(qu2);
                                               mystatement2.setString(1,"%"+search+"%");
                                               
                                               ResultSet myresult=mystatement.executeQuery();
                                               if(myresult.next())
                                               {
                                                  int a=1;
                                                  out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                                            + "<br><div class='alert alert-warning'><h4>CATEGORIES</h4></div><table class='table'><tr>");
                        
                                                do
                                                {
                                                   out.print("<td><div class='subcat'><center><a href='showsubcategories.jsp?catid=" + myresult.getString("catid") +"'>"
                                                            + "<img src='images/"+ myresult.getString("catimage")+"' alt=' ' class='img-responsive'></a></center></div><br>"
                                                            + "<h4 class='cname'><a href='showsubcategories.jsp?catid="+ myresult.getString("catid") + "'>" + myresult.getString("catname")
                                                            + "</a></h4><br>");
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
                                               
                                               
                                               ResultSet myresult1=mystatement1.executeQuery();
                                               if(myresult1.next())
                                               {
                                                  int a=1;
                                                  out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                                             + "<br><div class='alert alert-warning'><h4>SUB-CATEGORIES</h4></div><table class='table'><tr>");
                                                do
                                                {
                                                   out.print("<td><div class='subcat'><center><a href='showproducts.jsp?subcatid=" + myresult1.getString("subcatid") +"'>"
                                                            + "<img src='images/"+ myresult1.getString("subcatimage")+"' alt=' ' class='img-responsive'></a></center></div><br>"
                                                            + "<h4 class='cname'><a href='showproducts.jsp?subcatid="+ myresult1.getString("subcatid") + "'>" + myresult1.getString("subcatname")
                                                            + "</a></h4><br>");
                                                    a++;

                                                    if(a==4)
                                                    {
                                                        out.print("</tr><tr>");
                                                        a=1;
                                                    }
                                                }
                                                while(myresult1.next());
                                                out.print("</table>");
                                                }
                                                
                                               
                                               ResultSet myresult2= mystatement2.executeQuery();
                                               if(myresult2.next())
                                               {
                                                  int c=1;
                                                  out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                                             + "<br><div class='alert alert-warning'><h4>PRODUCTS</h4></div><table class='table'><tr>");
                                                do
                                                {
                                                   out.print("<td><div class='cat'><center><a href='productdetail.jsp?pid=" + myresult2.getString("pid") +"'>"
                                                            + "<img src='images/"+ myresult2.getString("pimage")+"' alt=' ' class='img-responsive'></a></center></div>"
                                                            + "<center><h4><a href='productdetail.jsp?pid="+ myresult2.getString("pid") + "'>" + myresult2.getString("pname") 
                                                            + "</a></h4></center><br><div class='simpleCart_shelfItem products-right-grid1-add-cart'><p><span class='item_price'>Rs."
                                                            + myresult2.getString("price") + "</span><br><br><div class='cart'><button type='submit' class='btn btn-default' name=submit>"
                                                            + "<font color='#D8703F' size='3px'><b>ADD TO CART</b></font></button></p>"+"</div></div></td>");
                                                    c++;

                                                    if(c==4)
                                                    {
                                                        out.print("</tr><tr>");
                                                        c=1;
                                                    }
                                                }
                                                while(myresult2.next());
                                                out.print("</table>");
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
            </div>
        </div>
            
      <%@include file="footer.jsp"%>
    </body>
</html>
