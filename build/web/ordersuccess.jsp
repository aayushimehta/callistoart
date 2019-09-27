<%-- 
    Document   : ordersuccess
    Created on : May 15, 2017, 5:41:10 PM
    Author     : It hurts when IP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Successful</title>
        <%@include file="headerfiles.jsp" %>
    </head>
    <body>
        <%
            RequestDispatcher mydis;
            if(session.getAttribute("email")!=null)    
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
				<li class="active">Order Details</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
        <div class="register">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".5s">Order Details</h3>
			
			<div class="login-form-grids">
                            
				<form id="viewform" class="animated wow slideInUp" data-wow-delay=".5s">
        
                                <center><h4>Congrats! Your order has been successful</h4>
                                <br><br>Your Order Number is: <b><%=session.getAttribute("orderid")%></b>
                                <br>Your delivery will be done before: <b><%=session.getAttribute("deliverydate")%></b>
                                <br>Your Total Bill is: <b><%=session.getAttribute("gd").toString()%></b>
                                <br>Your Order will be delivered to: <b><%=session.getAttribute("name")%> </b>
                                <br>Address: <b><%=session.getAttribute("address")%> </b>
                                <br><br><a href="revieworder.jsp?orderid=<%=session.getAttribute("orderid")%>"> Review Your Order</a></center>
            
                                </form>
                        </div>
                </div>
        </div>
                                <%@include file="footer.jsp" %>
        </body>
</html>
