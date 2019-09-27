<%@page import="java.sql.*"%>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp" %>
        <style>
            img
            {
                vertical-align: middle;
                margin-left: 1em;
            }
        </style>
    </head>           
   
    <body> 
        <%@include file="userheader.jsp" %>
        
        <div class="bs-docs-example animated wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="500ms">
            <div class="single">
		<div class="container">
		<div class="col-md-3 products-left">
		<div class="categories animated wow slideInUp" data-wow-delay=".5s">
					<h3>Categories</h3>
                                        <ul class="cate">
            <%
                    
            try
                    { 
                        Connection connection=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        
                        
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
            <table class="table">
                <tr>
                    <td><center><a href="viewuser.jsp"><img src ="images/viewprof.png" width="170" height="170"></a></center></td>
                    <td><center><a href="edituser.jsp"><img src ="images/edituser.png" width="170" height="170"></a></center></td>
                    <td><center><a href="showorders.jsp"><img src ="images/view order.jpg" width="170" height="170"></a></center></td>
                </tr>

                <tr>
                    <td><center><a href="viewuser.jsp"><font size="4">View Profile</font></a></center></td>
                    <td><center><a href="edituser.jsp"><font size="4">Edit Profile</font></a></center></td>
                    <td><center><a href="showorders.jsp"><font size="4">View Orders</font></a></center></td>
                </tr>
                <br>
                <br>
                <tr>
                    <td><center><a href="changepassword.jsp"><img src ="images/password.ico" width="200" height="200"></a></center></td>
                    
                </tr>

                <tr>
                    <td><center><a href="changepassword.jsp"><font size="4">Change Password</font></a></center></td>
                    
                </tr>
            </table>
        </div>
        
    </body>
</html>
       