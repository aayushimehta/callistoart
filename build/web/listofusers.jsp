<%@page import="java.sql.*"%>
<html>
    <head>
        <title>List of Customers</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp" %>
    </head>           
   
    <body>
        
        <%@include file="adminheader.jsp" %>
        <div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                                <li><a href="paneladmin.jsp">Category</a></li>
                                <li class="active">Add New Category</li>
			</ol>
		</div>
	</div>
        <br>
        <!--page heading-->
        <div class="list">
            <div class="container">
		<h3 class="animated wow zoomIn" data-wow-delay=".3s">List of Users</h3>
                       
                
                <%
                    Connection myconnection=null;
                    int count=1;
                    String url=getServletContext().getInitParameter("url");
                    String username=getServletContext().getInitParameter("username");
                    String password=getServletContext().getInitParameter("password");
                    
                    try
                    {  
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                        String query= "select * from usertable";  
                        PreparedStatement mystatement=myconnection.prepareStatement(query);  
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            out.print("<div class='bs-docs-example animated wow fadeInUp animated' data-wow-duration='1000ms' data-wow-delay='500ms' style=visibility: visible; animation-duration: 1000ms; animation-delay: 500ms; animation-name: fadeInUp;>");
                            out.print("<table class='table table-striped'>"+"<thead>" +"<th>Serial No.</th>"+"<th>Name</th>"+"<th>Email ID</th>"+"<th>Gender</th>"+"</tr></thead>");
                           
                            do
                            {
                                out.print("<tbody><tr><td>"+count+"</td><td>"+myresult.getString("uname")+"</td><td>"+myresult.getString("email")+"</td><td>"+myresult.getString("gender")+"</td></tr></tbody>");
                                count++;
                            }
                            while(myresult.next());
                            
                            out.print("</table></div>");
                        }   
                        else
                        {
                            out.print("No Data Found!");
                        }
                    }
                    catch(Exception e)
                    {
                         out.print("Error in Query"+ e.getMessage());
                    }
                               
                %>
            </div>
        </div>
    </body>
</html>
            
        