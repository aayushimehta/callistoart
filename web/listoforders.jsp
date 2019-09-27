<%-- 
    Document   : listoforders
    Created on : May 15, 2017, 10:40:42 PM
    Author     : It hurts when IP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Orders</title>
        <%@include file="headerfiles.jsp" %>
        <%@include file="adminheader.jsp" %>
    </head>
    
    <body>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">List Of Orders</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        <br>
        <!--page heading-->
        <div class="list">
            <div class="container">
		<div class='alert alert-warning'><h4>LIST OF ORDERS</h4></div>
                
        <%
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
                                String query="select * from ordertable order by orderid desc";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);                             
                                ResultSet myresult=mystatement.executeQuery();
                           
                                if(myresult.next())
                                {
                                    out.println("<table class='table table-striped'>"
                                            + "<tr><th>Order ID</th><th>Username</th><th>Amount</th><th>Address</th><th>Order date</th><th>Delivery Date</th><th>Order Details</th></tr>");
                                    do
                                    {
                                        out.println("<tr><td>"+myresult.getString("orderid") +"</td>"
                                                + "<td>"+myresult.getString("email") +"</td>"
                                                + "<td>"+myresult.getString("totalcost") +"</td>"
                                                + "<td>"+myresult.getString("address") +"</td>"
                                                 + "<td>"+myresult.getString("orderdate") +"</td>"    
                                                + "<td>"+myresult.getString("deliverydate") +"</td>"  
                                                + "<td align=center><a href='adminsetstatus.jsp?orderid="+ myresult.getString("orderid")+"'>Update Order</a></td>"
                                                + "</tr>");
                                    }
                                    while(myresult.next());
                                    out.println("</table>");
                                }
                                else
                                {
                                    out.println("No Orders found!");
                                }
                               
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query " + e.getMessage());
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
            </div>
        </div>
            <%@include file="footer.jsp" %>
    </body>
</html>
