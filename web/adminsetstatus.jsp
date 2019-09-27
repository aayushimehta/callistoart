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
        <%@include file="adminheader.jsp"%>
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
                            
				<form id="statusform" class="animated wow slideInUp" data-wow-delay=".5s">
                                    <%
                                        
                                        String orderid="", email="", status="", totalcost="",address="", name="",date="";
                                        try
                                        {
                                            
                                            Connection myconnection=null;
                                            String url=getServletContext().getInitParameter("url");
                                            String username=getServletContext().getInitParameter("username");
                                            String password=getServletContext().getInitParameter("password");
                                            Class.forName("com.mysql.jdbc.Driver");
                                            myconnection=DriverManager.getConnection(url,username,password);
                                            try
                                        
                                            { 
                                                    String query="select * from ordertable where orderid=?";
                                                    PreparedStatement mystatement=myconnection.prepareStatement(query);  
                                                    mystatement.setString(1,request.getParameter("orderid"));
                                                    ResultSet myresult=mystatement.executeQuery();
                                                    
                                                     if(myresult.next())
                                                    {
                                                        orderid=myresult.getString("orderid");
                                                        email=myresult.getString("email");
                                                        name=myresult.getString("name");
                                                        totalcost=myresult.getString("totalcost");
                                                        address=myresult.getString("address");
                                                        date=myresult.getString("deliverydate");
                                                        status=myresult.getString("status");
                                                        
                                                    }

                                        }
                                             catch(Exception e)
                            {
                                out.print("Error in Query1 " + e.getMessage());
                            }
                            
                        }
                        catch(Exception e)
                        {
                            out.println("Error in Connection " + e.getMessage());
                        }
        %>
        
                                <input type="hidden" name="orderid" value='<%=orderid%>'>
                                <br>Order will be delivered to: <b><%=email%> </b>
                                <br><br>Order Number is: <b><%=orderid%></b>
                                <br>Delivery will be done before: <b><%=date%></b>
                                <br>Total Bill is: <b><%=totalcost%></b>
                                
                                <br>Address: <b><%=address%> </b>
                                
                                <br>Set Order Status <select name='status' id='qty'>
                                    <option value='yet' selected>Yet to be Dispatched</option>
                                    <option value='ready'>Ready to be Dispatched</option>
                                    <option value='dispatched'>Dispatched</option>
                                    <option value='transit'>In Transit</option>
                                    <option value='reached'>Reached your destination</option>
                                    <option value='delivered'>Delivered</option>
                                </select>
                                <br><br>
                                <input type="submit" name="update" value="Update">
            
                                <%
                                            if(request.getParameter("update")!=null)  
                                            {
                                                
                                            try
                                            {
                                                Connection myconnection=null;
                                                String url=getServletContext().getInitParameter("url");
                                                String username=getServletContext().getInitParameter("username");
                                                String password=getServletContext().getInitParameter("password");
                                                Class.forName("com.mysql.jdbc.Driver");
                                                myconnection=DriverManager.getConnection(url,username,password);
                                                
                                                try
                                                {
                                                    String que="update ordertable set status=? where orderid=?";
                                                    PreparedStatement mystate=myconnection.prepareStatement(que);  
                                                    mystate.setString(1,request.getParameter("status"));
                                                    mystate.setString(2,request.getParameter("orderid"));
                                                    mystate.executeUpdate();
                                                    
                                                }
                                                
                                                catch(Exception e)
                                            {
                                                out.print("Error in Query1 " + e.getMessage());
                                            }

                                        }
                                        catch(Exception e)
                                        {
                                            out.print("Error in Connection " + e.getMessage());
                                        }
                                            }
                                %>
                                
                                
                                </form>
                        </div>
                </div>
        </div>
                                <%@include file="footer.jsp" %>
        </body>
</html>


