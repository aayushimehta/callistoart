<%-- 
    Document   : showorders
    Created on : May 16, 2017, 7:40:11 AM
    Author     : It hurts when IP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Orders</title>
        <%@include file="headerfiles.jsp" %>
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
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">List Of Orders</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        <br>
        <!--page heading-->
        <div class="list">
            <div class="container">
		<div class='alert alert-warning'><h4>MY ORDERS</h4></div>
                
        <%
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection connection;                            
                            String url=getServletContext().getInitParameter("url");
                            String username=getServletContext().getInitParameter("username");
                            String password=getServletContext().getInitParameter("password");
                            connection=DriverManager.getConnection(url, username, password);    

                            try
                            {
                                String query="select * from orderdetails o1, ordertable o2 where o1.orderid=o2.orderid and o1.email=? order by o1.orderid desc";
                                PreparedStatement mystatement=connection.prepareStatement(query);    
                                mystatement.setString(1, (String)session.getAttribute("email"));
                                ResultSet myresult=mystatement.executeQuery();
                           
                                if(myresult.next())
                                {
                                    out.println("<table class='table table-striped'>"
                                            + "<tr><th>Order ID</th><th>Amount</th><th>Order date</th><th>Delivery Date</th><th>Order Details</th></tr>");
                                    do
                                    {
                                        out.println("<tr><td>"+myresult.getString("orderid") 
                                                + "<td>"+myresult.getString("totalcost") +"</td>"
                                                + "<td>"+myresult.getString("orderdate") +"</td>"    
                                                + "<td>"+myresult.getString("deliverydate") +"</td>"                                                
                                                + "<td><a href='revieworder.jsp?orderid="+myresult.getString("orderid") +"'>Show Details</a></td>"
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
                                connection.close();
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
