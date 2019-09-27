<%@page import="java.sql.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<html>
    <head>
        <title>Checkout Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp" %>
        <style>
            #paymentmode
            {
                width:52em;
                height: 3em;
                background: #f5f5f5;
                font-size: 14px;
            }
        </style>
    </head>
    <body>
        
        
        <%
            RequestDispatcher mydis;
            if(session.getAttribute("email")!=null)    
            {
                mydis=request.getRequestDispatcher("userheader.jsp");
                mydis.include(request,response);
            }
           
        %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="start.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Payment & Delivery Details</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        <!-- mail -->
	<div class="mail animated wow zoomIn" data-wow-delay=".5s">
		<div class="container">
			<h3>Checkout Details</h3>
			
			<div class="mail-grids">
				<div class="col-md-8 mail-grid-left animated wow slideInLeft" data-wow-delay=".5s">
					<form method="post" action="checkout.jsp">
                                            <input type="text" name="name" placeholder=" Your Name" required=""><br><br>
						<input type="text" name="phone" placeholder="Mobile Number" required=""><br><br>
						<input type="text" name="floor" placeholder="Your Floor/House No./Flat" required=""><br><br>
                                                <input type="text" name="street" placeholder="Your Colony/Street/Locality" required=""><br><br>
                                                <input type="text" name="city" placeholder="Your Town or City" required=""><br><br>
                                                <input type="text" name="state" placeholder="Your State" required=""><br><br>
                                                <select id="paymentmode" name="paymentmode" class="frm-field required sect">
                                                    <option>Select a Payment Method</option>
                                                    <option>Transfer to SBI Account</option>
                                                    <option>Cash On Delivery</option>
                                                    <option>Pay via Paytm or Freecharge</option>
                                                </select>
                                                <br><br>
						<input type="submit" value="Place Order" name="placeorder" >
					</form>
				</div>
                            
            <%
                int orderid,grandtotal=0;    
                String pname="",pid="",status="Yet to be Dispatched",orderdate="";
                String name=request.getParameter("name");
                String phone=request.getParameter("phone");
                String paymentmode=request.getParameter("paymentmode");
                String address=request.getParameter("floor")+" "+request.getParameter("street")+" "+request.getParameter("city")+" "+request.getParameter("state");
                
                
                if(request.getParameter("placeorder")!=null)
                        {
                            
                            
                            try
                            {
                            Connection myconnection;
                            Class.forName("com.mysql.jdbc.Driver");
                            String url=getServletContext().getInitParameter("url");
                            String username=getServletContext().getInitParameter("username");
                            String password=getServletContext().getInitParameter("password");
                            myconnection=DriverManager.getConnection(url, username, password);
                            try
                            {
                                String query="insert into ordertable(email,name,address,phone,orderdate,deliverydate,totalcost,paymentmode,status) values(?,?,?,?,?,?,?,?,?)";
                                        PreparedStatement mystatement=myconnection.prepareStatement(query,
                                                                            PreparedStatement.RETURN_GENERATED_KEYS);
                                        java.util.Date obj=new java.util.Date();
                                        SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                                        Calendar c= Calendar.getInstance();
                                        
                                        c.add(Calendar.DATE,10);
                                        String output= myformat.format(c.getTime());
                                        
                                        
                                        mystatement.setString(1, session.getAttribute("email").toString());
                                        mystatement.setString(2, name);
                                        mystatement.setString(3, address);
                                        mystatement.setString(4, phone);
                                        mystatement.setString(5, myformat.format(obj));
                                        mystatement.setString(6, output);
                                        mystatement.setString(7, session.getAttribute("gd").toString());
                                        mystatement.setString(8, paymentmode);
                                        mystatement.setString(9, status);
                                
                                if(mystatement.executeUpdate()>0)
                                {
                                    
                                    ResultSet myresult=mystatement.getGeneratedKeys();
                                    if(myresult.next())
                                    {
                                        session.setAttribute("orderid", myresult.getInt(1));
                                    
                                        String query3="select * from usercarttable where email=?";
                                        PreparedStatement mystatement3=myconnection.prepareStatement(query3);
                                        mystatement3.setString(1, session.getAttribute("email").toString());
                                        
                                                        
                                        ResultSet myres3=mystatement3.executeQuery();
                                        if(myres3.next())
                                        {
                                            
                                            do
                                            {
                                            String query4="insert into orderdetails(orderid,pid,pname,price,qty,totalcost,pimage,email) values(?,?,?,?,?,?,?,?)";
                                            PreparedStatement mystatement4=myconnection.prepareStatement(query4);
                                            mystatement4.setString(1, session.getAttribute("orderid").toString());
                                            mystatement4.setString(2, myres3.getString("pid"));
                                            mystatement4.setString(3, myres3.getString("pname"));
                                            mystatement4.setString(4, myres3.getString("price"));
                                            mystatement4.setString(5, myres3.getString("qty"));
                                            mystatement4.setString(6, myres3.getString("totalcost"));
                                            mystatement4.setString(7, myres3.getString("pimage"));
                                            mystatement4.setString(8, session.getAttribute("email").toString());
                                
                                            
                                            
                                            if(mystatement4.executeUpdate()>0)
                                            {
                                                String query5="update producttable set qty=qty-? where pid=?";
                                                PreparedStatement mystatement5=myconnection.prepareStatement(query5);
                                                mystatement5.setString(1, myres3.getString("qty"));
                                                mystatement5.setString(2, myres3.getString("pid"));
                                                
                                                if(mystatement5.executeUpdate()>0)
                                                {
                                                    String query6="delete from usercarttable where email=?";
                                                    PreparedStatement mystatement6=myconnection.prepareStatement(query6);
                                                    mystatement6.setString(1, session.getAttribute("email").toString());
                                                    if(mystatement6.executeUpdate()>0)
                                                    {
                                                        
                                                        session.setAttribute("deliverydate", output);
                                                        session.setAttribute("name",name);
                                                        session.setAttribute("address",address);
                                                        session.setAttribute("phone",phone);
                                                        session.setAttribute("status",status);
                                                        session.setAttribute("myformat.format(obj)",orderdate);
                                                        response.sendRedirect("ordersuccess.jsp");
                                                    }
                                                }
                                            }
                                            }
                                            
                                            while(myres3.next());
                                           
                                        }
                                    
                                    response.sendRedirect("ordersuccess.jsp");
                                    }
                                }
                                
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query" + e.getMessage());
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
                            
                        }
                            
            %>
				<div class="col-md-4 mail-grid-right animated wow slideInRight" data-wow-delay=".5s">
					<div class="mail-grid-right1">
						<h4>Bill Summary<span>Final Bill: Rs. <%=session.getAttribute("gd")%></span></h4>
						
						
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			
		</div>
	</div>
                                <%@include file="footer.jsp" %>
<!-- //mail -->
    </body></html>