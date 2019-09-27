   
<%@page import="java.sql.*"%>
<div class="container">
			<div class="header-grid">
				<div class="header-grid-left animated wow slideInLeft" data-wow-delay=".5s">
					<ul>
                                            <li>
                                                    <%
                                                        if(session.getAttribute("uname")!=null)
                                                        {
                                                            out.print("<i class='glyphicon glyphicon-log-in' aria-hidden='true'></i><a href='#'>");
                                                            out.print("Hello <font color='orange'>"+ session.getAttribute("uname")+"</font>");
                                                            out.print("</a>");
                                                        }
                                                        else
                                                        {
                                                            response.sendRedirect("loginform.jsp");
                                                        }
                                                    %>
                                                    <script type="text/javascript">
                                                        window.history.forward(1);
                                                    </script>
                                            </li>
                                            <li><i class="glyphicon glyphicon-book" aria-hidden="true"></i><a href="signout.jsp">Sign Out</a></li>
					</ul>
				</div>
				<div class="header-grid-right animated wow slideInRight" data-wow-delay=".5s">
                                    <ul><b><font color='#999' size='3'><a href="paneluser.jsp">My Account</a></font></b>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="logo-nav">
				<div class="logo-nav-left animated wow zoomIn" data-wow-delay=".5s">
					<h1><a href="start.jsp">  CallistoArt <span>Shop With Us</span></a></h1>
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
                        String query= "select * from categorytable c, subcategorytable sc where c.catid=sc.catid";  
                        PreparedStatement mystatement=myconnection.prepareStatement(query);  
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            do
                            {
                                out.print("<li class='dropdown'><a href='showsubcategories.jsp?catid=" + myresult.getString("catid") + "'class='dropdown-toggle' data-toggle='dropdown'>" + myresult.getString("catname") 
                                    + "<b class='caret'></b></a><ul class='dropdown-menu multi-column columns-1'><div class='row'><div class='col-sm-1'>"
                                    + "<ul class='multi-column-dropdown'><li><a href='showproducts.jsp?subcatid="+ myresult.getString("subcatid") + "'>"
                                    + myresult.getString("subcatname") + "</a></li></ul></div>"
                                    + "<div class='clearfix'></div></div></ul></li>");
                            
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
                            Connection connection;                            
                           
                            connection=DriverManager.getConnection(url, username, password);    
                        
                            try
                            {
                                
                                if(session.getAttribute("email")!=null)
                                {
                                        String qu="select count(*) from usercarttable where email=?";
                                        PreparedStatement st=connection.prepareStatement(qu);
                                        st.setString(1, session.getAttribute("email").toString());
                                        ResultSet res1=st.executeQuery();
                                        if(res1.next())
                                        {
                                        count = res1.getInt(1);
                                        out.print("<h3><span class='badge badge-info'>" + count + "</span>"
                                                                    + "<img src='images/bag.png' alt=''/></h3>");
                                        }
                                }
                                
                                else 
                                {
                                    
                                        String qu1="select count(*) from carttable where sessionid=?";
                                        PreparedStatement st1=connection.prepareStatement(qu1);
                                        st1.setString(1, session.getId());
                                        ResultSet myres4=st1.executeQuery();
                                        if(myres4.next())
                                        {
                                        count = myres4.getInt(1);
                                        out.print("<h3><span class='badge badge-info'>" + count + "</span>"
                                                                    + "<span class='cart'><img src='images/bag.png' alt=''/></div></h3>");
                                        }
                                }
                                
                            }
                            
                            catch(Exception e)
                            {
                                out.print("Error in Query" + e.getMessage());
                            }
                           
                        }
                            
                            catch(Exception e)
                            {
                                out.print("Error in Connection " + e.getMessage());
                            } 
	%>	
				</a>
						<div class="clearfix"> </div>
					</div>	
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
                                <br>
	<!-- //header -->
        <!-- banner -->
