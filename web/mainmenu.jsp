
       <%@page import="java.sql.*"%>
<!-- header -->
	<div class="header">
		<div class="container">
			<div class="header-grid">
				<div class="header-grid-left animated wow slideInLeft" data-wow-delay=".5s">
					<ul>
						<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">callistoartmakers@gmail.com</a></li>
						<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>+91 9879 467 953</li>
						<li><i class="glyphicon glyphicon-log-in" aria-hidden="true"></i><a href="loginform.jsp">Login</a></li>
						<li><i class="glyphicon glyphicon-book" aria-hidden="true"></i><a href="registeruser.jsp">Register</a></li>
                                        </ul>
				</div>
				
				<div class="clearfix"> </div>
			</div>
			<div class="logo-nav">
				<div class="logo-nav-left animated wow zoomIn" data-wow-delay=".5s">
					<h1><a href="start.jsp">  CallistoArt <span> Shop With Us</span></a></h1>
                                </div>
				<div class="logo-nav-left1">
					<nav class="navbar navbar-default">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header nav_2">
						<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div> 
					<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
						<ul class="nav navbar-nav">
							<li class="active"><a href="start.jsp" class="act">Home</a></li>	
							<!-- Mega Menu -->
        <%
                    Connection myconnection=null;
                    String url=getServletContext().getInitParameter("url");
                    String username=getServletContext().getInitParameter("username");
                    String password=getServletContext().getInitParameter("password");
                    try
                        { 
                     
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                        String query= "select * from categorytable";  
                        PreparedStatement mystatement=myconnection.prepareStatement(query);  
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            do
                            {
                                out.print("<li class='dropdown'><a href='showsubcategories.jsp?catid=" + myresult.getString("catid") 
                                    + "'class='dropdown-toggle' data-toggle='dropdown'>" + myresult.getString("catname") 
                                    + "<b class='caret'></b></a>");
                                
                                String query2="select * from subcategorytable s, categorytable c where s.catid=c.catid and s.catid=?";
                                PreparedStatement pstmt2=myconnection.prepareStatement(query2);
                                pstmt2.setString(1,myresult.getString("catid"));
                                ResultSet myresult2=pstmt2.executeQuery();
                                if(myresult2.next())
                                {
                                    do
                                    {
                                        out.print("<ul class='dropdown-menu multi-column columns-1'><div class='row'><div class='col-sm-1'>"
                                        + "<ul class='multi-column-dropdown'><li><a href='showproducts.jsp?subcatid="+ myresult2.getString("subcatid") + "'>"
                                        + myresult2.getString("subcatname") + "</a></li></ul></div>"
                                        + "<div class='clearfix'></div></div></ul></li>");
                                    }
                                    while(myresult2.next());
                                    
                                }
                                
                            
                            }
                            while(myresult.next());
                        
                        }
                        }
                        catch(Exception e)
                        {
                            out.print("Error in Query"+ e.getMessage());
                        }
                        
        %>
                            				
										
					 </ul>			
                                        </div>               
                                       		
					</nav>
				</div>
				<div class="logo-nav-right">
					<div class="search-box">
						<div id="sb-search" class="sb-search">
                                                    <form action="searchresult.jsp" method="post">
								<input class="sb-search-input" placeholder="Enter your search term..." type="text" id="search" name="search">
								<input class="sb-search-submit" type="submit" name="searchbt" value="search">
								<span class="sb-icon-search"> </span>
                                                    </form>
						</div>
					</div>
						<!-- search-scripts -->
						<script src="js/classie.js"></script>
						<script src="js/uisearch.js"></script>
							<script>
								new UISearch( document.getElementById( 'sb-search' ) );
							</script>
						<!-- //search-scripts -->
				</div>
				<div class="header-right">
					<div class="cart box_1">
						<a href="showcart.jsp">
                                        <%
                try
                        {                  
                            int count=0;
                            Class.forName("com.mysql.jdbc.Driver");
                            
                            myconnection=DriverManager.getConnection(url, username, password);                           
                            try
                            {
                                
                                
                                if(session.getAttribute("email")!=null)
                                {
                                        String qu="select count(*) from usercarttable where email=?";
                                        PreparedStatement st=myconnection.prepareStatement(qu);
                                        st.setString(1, session.getAttribute("email").toString());
                                        ResultSet res1=st.executeQuery();
                                        if(res1.next())
                                        {
                                        count = res1.getInt(1);
                                        out.print("<h3></span><span class='badge badge-info'>" + count + "</span></div>"
                                                                    + "<img src='images/bag.png' alt=''/></h3>");
                                        }
                                    }
                                
                                else 
                                {
                                    
                                        String qu1="select count(*) from carttable where sessionid=?";
                                        PreparedStatement st1=myconnection.prepareStatement(qu1);
                                        st1.setString(1, session.getId());
                                        ResultSet myres4=st1.executeQuery();
                                        if(myres4.next())
                                        {
                                        count = myres4.getInt(1);
                                        out.print("<h3></span><span class='badge badge-info'>" + count + "</span></div>"
                                                                    + "<img src='images/bag.png' alt=''/></h3>");
                                        }
                                   
                                }
                                
                                }
                            
                            catch(Exception e)
                            {
                                out.println("Error in Query" + e.getMessage());
                            }
                           
                            }
                            
                            catch(Exception e)
                            {
                                out.print("Error in Connection " + e.getMessage());
                            } 
					%>	</a>
						<div class="clearfix"> </div>
					</div>	
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
                                                <br>
<!-- //header -->


         