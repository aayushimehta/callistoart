<%@page import="java.sql.*"%>
<html>
    <head>
        <title>List of Products</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp"%>
        <link rel="stylesheet" href="css/jquery-confirm.min.css" type="text/css"/>
        <script src="js/jquery-confirm.min.js" type="text/javascript"></script>
        
        <script type="text/javascript">
                    $(document).ready(function(){
                        
                        $(".delete").click(function(e){
                        e.preventDefault();
                        var pid=$(this).attr("pid");
                        var pimage=$(this).attr("pimage");
                        var pr1=$(this).parent();//td
                        var pr=$(this).parent().parent();//tr
                    
                        $.confirm({
                            theme:'dark',
                            type:'orange',
                            title: 'Confirm Delete!',
                            content: 'Do you really want to delete this product?',
                            buttons: {
                                confirm: function () {
                                    $.alert('Confirmed!'),
                                    
                                    $.ajax({ 
                                    url:"ajaxupdate1.jsp",
                                    data:{"pid":pid, "pimage":pimage},
                                    type:"post",
                                    beforeSend:function()
                                    {
                                         pr1.append("<img src='images/preloader.gif'>")
                                    },
                                    success:function(result)
                                    {
                                       if($.trim(result)=="Success")
                                              {
                                                      pr.css({'backgroundColor':'#ff960a'});
                                                      pr.fadeOut(600,function()
                                                      {
                                                              pr.remove()
                                                      })
                                              }
                                              else
                                              {
                                                      alert("Some Problem occured");
                                              }

                                    },
                                    error:function()
                                    {
                                         $("#answer").html("page not found")
                                    }
                                    });
                                },
                                          
                                       
                                    cancel: function () {
                                          
 					$.alert('Canceled!');
                                         }

                                } 
                               
});
        });
                    });
    
    
                   

        </script>
        <%@include file="headerfiles.jsp" %>
        <%@include file="adminheader.jsp" %>
    </head>
    
    <body>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">List Of Products</li>
			</ol>
		</div>
	</div>
        <br>
        <!-- //breadcrumbs -->
        <!--page heading-->
        <div class="list">
            <div class="container">
		<div class='alert alert-warning'><h4>LIST OF PRODUCTS</h4></div>
               
            <%
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
                                String query="select * from producttable, categorytable, subcategorytable "
                                        + "where categorytable.catid=producttable.catid "
                                        + "and subcategorytable.subcatid=producttable.subcatid";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                 
                                ResultSet myres=mystatement.executeQuery();
                               
                                if(myres.next())
                                {
                                    out.print("<table class='table table-striped'>"
                                            + "<tr><th>Category Name</th><th>Sub-category Name</th><th>Product Name</th><th>Price</th>"
                                            + "<th><center>Quantity</center></th>"
                                            + "<th>Description</th><th>Image</th><th>Update</th><th>Delete</th></tr>");
                                    
                                    do
                                    {
                                        out.print("<tr><td>" + myres.getString("catname") 
                                                + "</td><td>" + myres.getString("subcatname")+"</td><td>" + myres.getString("pname") 
                                                + "</td><td>Rs." + myres.getString("price") 
                                                + "</td><td><center>" + myres.getString("qty")
                                                + "</center></td><td>" + myres.getString("pdescription") + "</td>"
                                                + "<td><img src='images/" + myres.getString("pimage") + "' width='100px' height='100px'></td>"
                                                + "<td><a href='updateproduct.jsp?pid=" + myres.getString("pid") + "'>Update</a></td>"
                                                + "<td><a href='#' class='delete' pid=" + myres.getString("pid") + 
                                                "pimage='" + myres.getString("pimage") +"'>Delete</a></td></tr>");
                                    }
                                    while(myres.next());
                                    out.print("</table>") ;
                                }
                                
                                else
                                {
                                    
                                    out.print("No Records Exists");
                                }
                                
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Query" + e.getMessage());
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
             </div>
        </div>
         <%@include file="footer.jsp" %>
    </body>
</html>
                
   
        
           