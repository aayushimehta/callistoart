<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
            if(request.getParameter("id")!=null)
            {
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
                                String query="select * from orderdetails where orderid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1,request.getParameter("orderid"));
                                ResultSet myresult=mystatement.executeQuery();
                           
                                if(myresult.next())
                                {
                                    out.println("<table class='table table-striped'>"
                                            +"<tr><td colspan=4><h3>Showing Order Details for Order ID" + myresult.getString("orderid") + "</h3></td><td><input id='printpagebutton' type='button' value='Print' onclick='printpage()'/></td></tr>"
                                            + "<tr><th></th><th>Product Name</th><th>Qty</th><th>Total Cost</th></tr>");
                                    do
                                    {
                                        out.println("<tr><td><img src=images/"+myresult.getString("pimage") +" width='75px'></td>"
                                             
                                                + "<td>"+myresult.getString("pname") +"</td>"
                                                + "<td>"+myresult.getString("qty") +"</td>"
                                                 + "<td>Rs. "+myresult.getString("totalcost") +"/-</td>"    
                                                + "</tr>");
                                    }
                                    while(myresult.next());
                                    out.println("</table>");
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
            }
        %>
        <script>
            function printpage()
            {
               
        
        var printButton = document.getElementById("printpagebutton");
       
        printButton.style.visibility = 'hidden';
   
        window.print()
        
        printButton.style.visibility = 'visible';
            }
            </script>