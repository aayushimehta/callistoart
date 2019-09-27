<%@page import="java.sql.*"%>
<html>
    <head>
        <title>List of Sub-categories</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <%@include file="headerfiles.jsp" %>
        <link rel="stylesheet" href="css/jquery-confirm.min.css" type="text/css"/>
        <script src="js/jquery-confirm.min.js" type="text/javascript"></script>
        
        <script type="text/javascript">
                    $(document).ready(function(){
                        
                        $(".delete").click(function(e){
                        e.preventDefault();
                        var subcatid=$(this).attr("subcatid");
                        var sr1=$(this).parent();//td
                        var sr=$(this).parent().parent();//tr
                    
                        $.confirm({
                            theme:'dark',
                            type:'orange',
                            title: 'Confirm Delete!',
                            content: 'Do you really want to delete this sub-category?',
                            
                            buttons: {
                                confirm: function () {
                                    $.alert('Confirmed!'),
                                    
                                    $.ajax({ 
                                    url:"ajaxdeletecat.jsp",
                                    data:{"subcatid":subcatid},
                                    type:"post",
                                    beforeSend:function()
                                    {
                                         sr1.append("<img src='images/preloader.gif'>")
                                    },
                                    success:function(result)
                                    {
                                       if($.trim(result)==="Success")
                                              {
                                                      sr.css({'backgroundColor':'#ff960a'});
                                                      sr.fadeOut(600,function()
                                                      {
                                                              sr.remove();
                                                      });
                                              }
                                              else
                                              {
                                                      alert("Some Problem occured");
                                              }

                                    },
                                    error:function()
                                    {
                                         $("#answer").html("page not found");
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
    </head>
    
    <body>
       <%@include file="adminheader.jsp" %>
        <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">List of Sub-categories</li>
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
                                String query="select * from subcategorytable";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                 
                                ResultSet myres=mystatement.executeQuery();
                                int count=1;
                                if(myres.next())
                                {
                                    out.print("<table class='table table-striped'>"
                                            + "<tr><th><center>Serial No.</center></th><th>Sub-Category</th><th>Image</th><th>Update</th><th>Delete</th></tr>");
                                    
                                    do
                                    {
                                        out.print("<tr><td><center>"+ count + "</center></td><td>" + myres.getString("subcatname") 
                                                + "</td><td><img src='images/" + myres.getString("subcatimage") + "' width='100px' height='100px'></td>"
                                                + "<td><a href='updatesubcategory.jsp?subcatid=" + myres.getString("subcatid") + "'>Update</a></td>"
                                                + "<td><a href='#' class='delete' subcatid=" + myres.getString("subcatid") +
                                                " subcatimage='images/" + myres.getString("subcatimage") +"'>Delete</a></td></tr>");
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
                                out.print("Error in Query" + e.getMessage());
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
                
   
        
           