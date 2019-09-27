<%-- 
    Document   : adminsearchresult
    Created on : May 14, 2017, 2:34:49 PM
    Author     : It hurts when IP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
        <%@include file="headerfiles.jsp" %>
        <style>
        .alert {
            padding: 15px;
            margin-bottom: 8px;
            border: 1px solid transparent;
            border-radius: 4px;
        }
        .table {
            width: 100%;
            max-width: 100%;
            margin-bottom: 20px;
            margin-top: 5px;
        }
        </style>
    </head>
    
    <body>
        <%@include file="adminheader.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="userwelcome.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
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
                                          String qu,qu1,qu2,qu3; 
                                          PreparedStatement mystatement,mystatement1, mystatement2,mystatement3 ;
                                          
                                               qu="select * from categorytable where catname like ?";
                                               mystatement=myconnection.prepareStatement(qu);
                                               mystatement.setString(1,"%"+search+"%");
                                               
                                               qu1="select * from subcategorytable, categorytable "
                                                            + "where categorytable.catid=subcategorytable.catid and subcatname like ?";
                                               mystatement1=myconnection.prepareStatement(qu1);
                                               mystatement1.setString(1,"%"+search+"%");
                                               
                                               qu2="select * from producttable, categorytable, subcategorytable "
                                                            + "where categorytable.catid=producttable.catid "
                                                            + "and subcategorytable.subcatid=producttable.subcatid and pname like ?";
                                               mystatement2=myconnection.prepareStatement(qu2);
                                               mystatement2.setString(1,"%"+search+"%");
                                               
                                               qu3= "select * from usertable where uname like ?";
                                               mystatement3=myconnection.prepareStatement(qu3);
                                               mystatement3.setString(1,"%"+search+"%");
                                               
                                               
                                               ResultSet myresult=mystatement.executeQuery();
                                                
                                                if(myresult.next())
                                                {
                                                    out.print("<br><br><div class='alert alert-warning'><h4>CATEGORY</h4></div><table class='table table-striped'>"
                                                            + "<tr><th>Category Name</th><th>Image</th></tr>");

                                                    do
                                                    {
                                                        out.print("<tr><td>" + myresult.getString("catname") 
                                                                + "</td><td><img src='images/" + myresult.getString("catimage") + "' width='100px' height='100px'></td>");
                                                        
                                                    }
                                                    while(myresult.next());
                                                    out.print("</table><br><br>");
                                                }

                                                else
                                                {
                                                    out.print("<div class='alert alert-warning'><h4>CATEGORY</h4></div>No Records Exists<br><br>");
                                                }
                                                
                                                
                                                
                                                ResultSet myresult1=mystatement1.executeQuery();
                                                
                                                if(myresult1.next())
                                                {
                                                    out.print("<div class='alert alert-warning'><h4>SUB-CATEGORY</h4></div><table class='table table-striped'>"
                                                            + "<tr><th>Sub-category Name</th><th>Image</th></tr>");

                                                    do
                                                    {
                                                        out.print("<tr><td>" + myresult1.getString("subcatname") 
                                                                + "</td><td><img src='images/" + myresult1.getString("subcatimage") + "' width='100px' height='100px'></td>");
                                                        
                                                    }
                                                    while(myresult1.next());
                                                    out.print("</table><br><br>");
                                                }

                                                else
                                                {
                                                    out.print("<div class='alert alert-warning'><h4>SUB-CATEGORY</h4></div>No Records Exists<br><br>");
                                                }
                                                
                                                
                                                
                                                
                                                ResultSet myresult2=mystatement2.executeQuery();
                                                
                                                if(myresult2.next())
                                                {
                                                    out.print("<div class='alert alert-warning'><h4>PRODUCTS</h4></div><table class='table table-striped'>"
                                                                + "<tr><th>Category Name</th><th>Sub-category Name</th><th>Product Name</th><th>Price</th>"
                                                                + "<th><center>Quantity</center></th><th>Image</th>");

                                                    do
                                                    {
                                                        out.print("<tr><td>" + myresult2.getString("catname") 
                                                                + "</td><td>" + myresult2.getString("subcatname")+"</td><td>" + myresult2.getString("pname") 
                                                                + "</td><td>Rs." + myresult2.getString("price") 
                                                                + "</td><td><center>" + myresult2.getString("qty")
                                                                + "</center></td><td><img src='images/" + myresult2.getString("pimage") + "' width='100px' height='100px'></td>");
                                                        
                                                    }
                                                    while(myresult2.next());
                                                    out.print("</table><br><br>");
                                                }
                                                else
                                                {
                                                    out.print("<div class='alert alert-warning'><h4>PRODUCTS</h4></div>No Records Exists<br><br>");
                                                }
                                                
                                                
                                                
                                                
                                               ResultSet myresult3=mystatement3.executeQuery();
                                               if(myresult3.next())
                                               {
                                                   out.print("<div class='alert alert-warning'><h4>USERS</h4></div><table class='table table table-striped'><thead><tr><th>Name</th>"
                                                           + "<th>E-mail</th><th>Date Of Birth</th><th>Gender</th></tr></thead>");
                                              
                                              do
                                                {
                                                  out.print("<tbody><tr><td>"+myresult3.getString("uname")+"</td><td>"+myresult3.getString("email")
                                                          +"</td><td>"+myresult3.getString("dob")+ "</td><td>"+myresult3.getString("gender")+"</td></tr>");
                                                }
                                              while(myresult.next());
                                              
                                              out.print("</table><br><br>");
                                            }     
                                            else
                                               {
                                              out.print("<div class='alert alert-warning'><h4>USERS</h4></div><p>No Record Found</p><br><br>");
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
        
        
    </body>
</html>
