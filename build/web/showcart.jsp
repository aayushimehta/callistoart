<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Shopping Cart</title>
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
        
        <script type="text/javascript">
            $(document).ready(function(){
                $("#qty").change(function(){
                    var id=$("#qty").val();
                    var pid=$("#qty").attr("pid");
                    $.ajax({ 
                        url:"ajaxsorting.jsp",
                        data:{"qty":id,"pid":pid},
                        type:"post",
                        beforeSend:function()
                        {
                        },
                        success:function(result)
                        {
                            
                            if($.trim(result)==="success")
                            {
                                calculatebill();
                                var id=$("#qty").val();
                                $.ajax({
                                    url:"cartgrid.jsp",
                                    data:{"qty":id,"pid":pid},
                                    type:"post",
                                    beforeSend:function()
                                    {
                                    },
                                    success:function(result)
                                    {  
                                        $("#cartdiv").html(result)
                                    },
                                    error:function()
                                    {
                                         $("#cate").html("page not found");
                                    }
                                    });
                                    
                                }
                            
                           
                        },
                        error:function()
                        {
                             $("#cate").html("page not found");
                        }
                        });
              
            });
        });
    
            </script>
        
    </head>
    
    <body>
            
        <%
                int shipping=40;   
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
                                PreparedStatement mystatement; 
                                if(session.getAttribute("email")!=null)
                                {
                                    String query="select * from usercarttable where email=?";
                                
                                    mystatement=myconnection.prepareStatement(query);            
                                    mystatement.setString(1,session.getAttribute("email").toString());
                                                                      
                                }
                                else
                                {   
                                    String query="select * from carttable where sessionid=?";
                                
                                    mystatement=myconnection.prepareStatement(query);            
                                    mystatement.setString(1,session.getId());
                                    
                                }
                                
                                ResultSet myresult=mystatement.executeQuery();
                               
                                int count=1;
                                
                                if(myresult.next())
                                { 
                                    
                                    out.print("<div class='checkout'><div class='container'>"
                                    + "<h3 class='animated wow slideInLeft' data-wow-delay='.5s'>Your shopping cart contains: <span></span></h3>"
                                    + "<div class='checkout-right animated wow slideInUp' data-wow-delay='.5s'>"
                                    + "<table class='timetable_sub'><thead><tr><th>Serial No.</th><th>Product</th><th>Product Name</th><th>Price</th>"
                                    + "<th>Quantity</th><th>Total Cost</th><th>Remove</th></tr></thead>");
                                    do
                                    {
                                        int tc=Integer.parseInt(myresult.getString("totalcost"));
                                      
                                        out.print("<tr class='rem1'><td>"+ count + "</td><td class='invert-image'>"
                                            + "<a href='productdetail.jsp?pid=" + myresult.getString("pid") +"'><img src='images/"+ myresult.getString("pimage") + "' alt=' ' class='img-responsive' /></a></td>"
                                            + "<td><a href='productdetail.jsp?pid=" + myresult.getString("pid") +"'>" + myresult.getString("pname") + "</td><td>Rs." + myresult.getInt("price") + "</td>"
                                            + "<td><select name='qty' id='qty' pid="+myresult.getString("pid")+">");
                                        out.print(myresult.getString("qty"));
                                        for(int i=1;i<6;i++)
                                        {
                                            if(i==Integer.parseInt(myresult.getString("qty")))
                                                    {
                                                        out.print("<option selected>" +i+ "</option>");
                                                    }
                                            else
                                            {
                                                out.print("<option>" + i+ "</option>");
                                            }
                                        }
                                        out.print("</select></td>"
                                            + "<td><div id='cartdiv'>Rs. " + tc + "</div></td>"
                                            + "<td><div class='rem'><div class='close1' id='"+myresult.getString("pid")+"'> </div></div></td>");;
                                            
                                        count++;
                                    }                                    
                                    while(myresult.next());
                                    out.print("</table>");
                                    
                                    
                                    
                                    out.print("<div class='checkout-left'><div class='checkout-left-basket animated wow slideInLeft' data-wow-delay='.5s'>"
					+ "<a href='checkoutlink.jsp'><h4>Continue to Checkout</h4></a>"
					+ "<ul><li>Total Cost <span class='total2'></span></li>"
					+ "<li>Total Shipping Charges<span>Rs. " + shipping +"</span></li><li>Final Bill<span id='final'></span></li>"
                                            + "</ul></div>"
                                        + "<div class='checkout-right-basket animated wow slideInRight' data-wow-delay='.5s'>"
                                        + "<a href='start.jsp'><span class='glyphicon glyphicon-menu-left' aria-hidden='true'></span>Continue Shopping</a>"
                                        + "</div><div class='clearfix'> </div></div>");      
                                    
                                   //out.print("Grand Total="+session.getAttribute("gd"));
                                    
                                }
                                else
                                {
                                    out.print("<center><div class='alert alert-danger' role='alert'><strong>Oh snap!</strong>"
                                                                +" Your Shopping Cart is empty</div></center>");
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

     
			
		
<script type="text/javascript">
         function calculatebill()
         {
              $.ajax(
			{
			  url: 'ajaxcalculatebill.jsp',
			  type: 'post',
			  
			
			  success: function(result) 
				  {
                                     
                                     $(".total2").html("Rs. "+result);
                                     $("#final").html("Rs. "+(parseInt(result)+40));
                                     
				  },
			  error: function() 
				  {
					alert("Error in Ajax");
				  }
			});
         }
         $(document).ready(function() 
        {
            calculatebill();
            $(".close1").click(function(e){
         
            e.preventDefault();
            var pid=$(this).attr("id");
            var pr1=$(this).parent().parent();
            var pr=$(this).parent().parent().parent();
       
       
	 if(confirm("Are you sure you want to delete?"))
	 {
             alert(pid);
		 $.ajax(
			{
			  url: 'ajaxdeletecart.jsp',
			  type: 'post',
			  data: {"pid":pid},
                          
                          beforeSend: function() 
			 {
				 pr1.append("<img src='images/preloader.gif'>");
				
			},
			  success: function(result) 
				  {
                                     
					if($.trim(result)=="done")
					{
						pr.css({'backgroundColor':'#fb6c6c'});
						pr.fadeOut(600,function()
						{
							pr.remove();
                                                        calculatebill();
						});
                                                
					}
					else
					{
						alert(result);
					}
				  },
			  error: function() 
				  {
					  alert("Error in Ajax");
				  }
			});
	 }
   });
});
</script>
    </body>
</html>