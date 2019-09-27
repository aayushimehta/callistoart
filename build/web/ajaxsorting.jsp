<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
        Connection connection=null;
        String url=getServletContext().getInitParameter("url");
        String username=getServletContext().getInitParameter("username");
        String password=getServletContext().getInitParameter("password");
        connection=DriverManager.getConnection(url,username,password);
        
    if(request.getParameter("sorting")!=null)
    {
        String s=request.getParameter("sorting");
        String t=session.getAttribute("subcatid").toString();
        String q="";
        if(s.equals("default"))
        {
            q="Select * from producttable where subcatid=?";
        }
        else if(s.equals("high"))
        {
            q="Select * from producttable where subcatid=? order by price desc";
        }
        else if(s.equals("low"))
        {
            q="Select * from producttable where subcatid=? order by price";
        }
         try{ 
                     
                        Class.forName("com.mysql.jdbc.Driver");
                                                
                        PreparedStatement mystatement=connection.prepareStatement(q);  
                        mystatement.setString(1,t);
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                           {
                            out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                + "<table class='table'><tr>");
                            int a=1;
                        
                        do
                        {
                           out.print("<td><div class='cat'><center><a href='productdetail.jsp?pid=" + myresult.getString("pid") +"'>"
                                   + "<img src='images/"+ myresult.getString("pimage")+"' alt=' ' class='img-responsive'></a></center></div>"
                                   + "<div class='head'><h4><a href='productdetail.jsp?pid="+ myresult.getString("pid") + "'>" + myresult.getString("pname") 
                                   + "</a></h4></div><br><div class='simpleCart_shelfItem products-right-grid1-add-cart'><p><span class='item_price'>Rs."
                                   + myresult.getString("price") + "</span><br><br><div class='cart'><button type='submit' class='btn btn-default' name=submit>"
                                   + "<font color='#D8703F' size='3px'><b>ADD TO CART</b></font></button></p>"+"</div></div></td>");
                            a++;
                        
                            if(a==4)
                            {
                                out.print("</tr><tr>");
                                a=1;
                            }
                        }
                        while(myresult.next());
                        out.print("</table>");
                                   
                        }
                        }
                        catch(Exception e)
                        {
                            out.print("Error in Query"+ e.getMessage());
                        }
                        
    }
   if(request.getParameter("qty")!=null)
    {
        String qty1=request.getParameter("qty");
        String q="";
        String pid=request.getParameter("pid");
        
        {
            q="update usercarttable set qty=? where pid=? and email=?";
            try{
                        Class.forName("com.mysql.jdbc.Driver");
                                                
                        PreparedStatement mystatement=connection.prepareStatement(q);  
                        mystatement.setString(1,qty1);
                        mystatement.setString(2,pid);
                        mystatement.setString(3,(String)session.getAttribute("email"));
                                               
                        if(mystatement.executeUpdate()>0)
                        {
                            String q3="select price,qty from usercarttable where email=? and pid=?";
                            PreparedStatement mystatement1=connection.prepareStatement(q3);  
                            mystatement1.setString(1,(String)session.getAttribute("email"));
                            mystatement1.setString(2,pid);
                            
                            ResultSet myres=mystatement1.executeQuery();
                            
                            if(myres.next())
                            {
                                int totalcost=myres.getInt("price")* myres.getInt("qty");
                                String que="update usercarttable set totalcost=? where email=? and pid=?" ;
                                PreparedStatement mystatement2=connection.prepareStatement(que);  
                                mystatement2.setString(1,String.valueOf(totalcost));
                                mystatement2.setString(2,(String)session.getAttribute("email"));
                                mystatement2.setString(3,pid);
                                
                                if(mystatement2.executeUpdate()>0)
                                {
                                    out.print("success");
                                }
                            }
                                                 
                        }
                        
            }
            catch(Exception e)
            {
                out.print("Error in Query"+ e.getMessage());
            }
        }
        
    }
%>