<%-- 
    Document   : showsubcategories
    Created on : May 14, 2017, 1:42:00 AM
    Author     : It hurts when IP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <title>Products</title> 
        <%@include file="headerfiles.jsp" %>
        <style>
        
            div.cat
            {
                height : 200px;
                width : 150px;
                margin-left: 7em;
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
        
        <div class="list">
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
                <div class="col-md-9 single-right">
  
                <%
                    Connection myconnection=null;
                    String url=getServletContext().getInitParameter("url");
                    String username=getServletContext().getInitParameter("username");
                    String password=getServletContext().getInitParameter("password");
                     try
                        { 
                     
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                        String query= "select * from subcategorytable where catid=?";  
                        PreparedStatement mystatement=myconnection.prepareStatement(query);  
                        mystatement.setString(1, request.getParameter("catid"));
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                + "<table class='table'><tr>");
                            int a=1;
                        
                        do
                        {
                           out.print("<td><div class='cat'><center><a href='showproducts.jsp?subcatid=" + myresult.getString("subcatid") +"'>"
                                   + "<img src='images/"+ myresult.getString("subcatimage")+"' alt=' ' class='img-responsive'></a></center></div>"
                                   + "<center><h4><a href='showproducts.jsp?subcatid="+ myresult.getString("subcatid") + "'>" + myresult.getString("subcatname") 
                                   + "</a></h4></center><br>");
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
       </div></div>
        </div>
       
       <%@include file="footer.jsp" %>
    </body>
</html>

