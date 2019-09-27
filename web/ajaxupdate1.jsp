<%@page import="java.sql.*" %>
<%
    Thread.sleep(1000);
   if(request.getParameter("catid")!=null)
   {
       String catid=request.getParameter("catid");
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
                  String query="select * from subcategorytable where catid=?";
                  PreparedStatement mystatement=myconnection.prepareStatement(query);
                  mystatement.setString(1, catid);
                  ResultSet myres=mystatement.executeQuery();
                  out.print("CHOOSE SUB-CATEGORY<select name='subcategory' id='subcategory' class='form-control'>");
                  if(myres.next())
                  {
                      out.print("<option>Choose Sub Category now</option>");
                      do
                      {
                      out.print("<option value=" + myres.getString("subcatid") + ">" 
                              + myres.getString("subcatname") +"</option>");
                      }
                      while(myres.next());
                  }
                  else
                  {

                      out.print("<option>No Sub Category available</option>");
                  }
                    out.print("</select>");

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
else if(request.getParameter("pid")!=null)
   {
       String pid=request.getParameter("pid");
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
                  String query="delete from producttable where pid=?";
                  PreparedStatement mystatement=myconnection.prepareStatement(query);
                  mystatement.setString(1, pid);
                  if(mystatement.executeUpdate()>0)
                  {
                      out.print("Success");
                  }
                  else
                  {
                      out.print("Failure");
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