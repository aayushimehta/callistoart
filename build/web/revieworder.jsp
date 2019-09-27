<%-- 
    Document   : trackorder
    Created on : May 17, 2017, 6:14:15 AM
    Author     : It hurts when IP
--%>

<%@page import="java.sql.*"%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Review Order</title>
        <%@include file="headerfiles.jsp" %>
    </head>
    <body>
        <%@include file="userheader.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                                <li class="active"><a href="showorders.jsp">Show My Orders</a></li>
                                <li class="active">Order Detail</li>
                                
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <%
                   
                    
                    try
                        { 
                        
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                            try
                            {   
                                
                                if(session.getAttribute("email")!=null)
                                {
                                        String query="select * from orderdetails o1,ordertable o2 where o1.orderid=o2.orderid and o1.orderid=?";

                                        PreparedStatement mystatement=myconnection.prepareStatement(query);            
                                        mystatement.setString(1,request.getParameter("orderid"));
                                        
                                        ResultSet myresult=mystatement.executeQuery();
                                        int count=1;

                                        if(myresult.next())
                                        {
                                            out.print("<div class='checkout'><div class='container'>"
                                            + "<h3 class='animated wow slideInLeft' data-wow-delay='.5s'>Your shopping cart contains: <span></span></h3>"
                                            + "<div class='checkout-right animated wow slideInUp' data-wow-delay='.5s'>"
                                            + "<table class='timetable_sub'><thead><tr><th>Serial No.</th><th>Product Image</th><th>Product Name</th><th>Quantity</th>"
                                            + "<th>Total Cost</th><th>Status</th></tr></thead>");

                                            do
                                        {


                                            out.print("<tr class='rem1'><td>"+ count + "</td><td class='invert-image'>"
                                                + "<a href='productdetail.jsp?pid="+ myresult.getString("pname") +"'><img src='images/"+ myresult.getString("pimage") + "' alt=' ' class='img-responsive' /></a></td>"
                                                + "<td>" + myresult.getString("pname") + "</td>"
                                                + "<td><div class='quantity'><span>"+ myresult.getString("qty") + "</span></div></td>"
                                                + "<td>Rs. " +  myresult.getString("totalcost") + "</td><td>"
                                                + myresult.getString("status") + "</td>");

                                            count++;
                                        }                                    
                                        while(myresult.next());
                                        out.print("</table>");

                                    }
                                    else
                                {
                                    out.print("<center><div class='alert alert-danger' role='alert'><strong>Oh snap!</strong>"
                                                                +" No Orders Found</div></center>");
                                }
                               
                                    }
                                }
                            
                            catch(Exception e)
                            {
                                out.print("Error in Query1 " + e.getMessage());
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
    </body>
</html>
