 <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
    try
    {                  
        Connection myconnection;
        Class.forName("com.mysql.jdbc.Driver");
        String url=getServletContext().getInitParameter("url");
        String username=getServletContext().getInitParameter("username");
        String password=getServletContext().getInitParameter("password");

        myconnection=DriverManager.getConnection(url, username, password);                           
        String catid=request.getParameter("catid");
                                                
        try
        {
                String query="select * from subcategorytable where catid=?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1,catid);
                ResultSet myres=mystatement.executeQuery();
                out.print(" <h5 id='myheading'>Choose Sub-category</h5><select id='subcategory' name='subcategory' class='frm-field required sect'> required");
                                                    
                if(myres.next())
                {
                        out.print("<option value=''>Choose Sub-Category</option>");
                        do
                        {
                            out.print("<option value=" + myres.getString("subcatid") + ">"
                                                                + myres.getString("subcatname") +"</option>");
                        }
                        while(myres.next());
                }

                        else
                        {
                            out.print("<option>No Sub-Category Available</option>");
                        }
                        out.print("</select");
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


%>