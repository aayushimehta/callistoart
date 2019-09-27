<%@page import="java.sql.*"%>
<html>
    <head>
        <title>List of Categories</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <%@include file="headerfiles.jsp" %>
        <link rel="stylesheet" href="css/jquery-confirm.min.css" type="text/css"/>
        <script src="js/jquery-confirm.min.js" type="text/javascript"></script>
        
        <script type="text/javascript">
                    $(document).ready(function(){
                        
                        $(".delete").click(function(e){
                        e.preventDefault();
                        var catid=$(this).attr("catid");
                        var cr1=$(this).parent();//td
                        var cr=$(this).parent().parent();//tr
                    
                        $.confirm({
                            theme:'dark',
                            type:'orange',
                            title: 'Confirm Delete!',
                            content: 'Do you really want to delete this category?',
                            
                            buttons: {
                                confirm: function () {
                                    $.alert('Confirmed!'),
                                    
                                    $.ajax({ 
                                    url:"ajaxdeletecat.jsp",
                                    data:{"catid":catid},
                                    type:"post",
                                    beforeSend:function()
                                    {
                                         cr1.append("<img src='images/preloader.gif'>")
                                    },
                                    success:function(result)
                                    {
                                       if($.trim(result)==="Success")
                                              {
                                                      cr.css({'backgroundColor':'#ff960a'});
                                                      cr.fadeOut(600,function()
                                                      {
                                                              cr.remove()
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
                                    })
                                },
                                
                                    cancel: function () {
                                          
 					$.alert('Canceled!');
                                        }
                                } 
            });
        });
    });
                    
        </script>
    </head>
    
    <body>
       <%@include file="adminheader.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">List of Categories</li>
			</ol>
		</div>
	</div>
        <!-- //breadcrumbs -->
        
                
                <div id="answer"></div>
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
                                String query="select * from categorytable";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                 
                                ResultSet myres=mystatement.executeQuery();
                                int count=1;
                                if(myres.next())
                                {
                                    out.print("<table class='table table-striped'>"
                                            + "<tr><th><center>Serial No.</center></th><th>Name</th><th>Image</th><th>Update</th><th>Delete</th></tr>");
                                    
                                    do
                                    {
                                        out.print("<tr><td><center>"+ count + "</center></td><td>" + myres.getString("catname") 
                                                + "</td><td><img src='images/" + myres.getString("catimage") + "' width='100px' height='100px'></td>"
                                                + "<td><a href='updatecategory.jsp?catid=" + myres.getString("catid") + "'>Update</a></td>"
                                                + "<td><a href='#' class='delete' catid=" + myres.getString("catid") +
                                                " catimage='images/" + myres.getString("catimage") +"'>Delete</a></td></tr>");
                                        count++;
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
                                out.print("Error in Query " + e.getMessage());
                            }
                            finally
                            {
                                myconnection.close();
                            }
                        }
                            
                catch(Exception e)
                {
                    out.print("Error in Connection " + e.getMessage());
                } 
            %>   
             
         <%@include file="footer.jsp" %>
    </body>
</html>
                
   
        
           