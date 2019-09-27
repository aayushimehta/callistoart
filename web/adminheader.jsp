<%@page import="java.sql.*"%>
<!--header-->
        <div class="container">
			<div class="header-grid">
				<div class="header-grid-left animated wow slideInLeft" data-wow-delay=".5s">
					<ul>
                                            
                                            <li>
                                                    <%
                                                        if(session.getAttribute("admin")!=null)
                                                        {
                                                            out.print("<i class='glyphicon glyphicon-log-in' aria-hidden='true'></i><a href='#'>");
                                                            out.print("Hello "+ session.getAttribute("admin"));
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
					<ul class="social-icons">
						<li><a href="#" class="facebook"></a></li>
						<li><a href="#" class="twitter"></a></li>
						<li><a href="#" class="g"></a></li>
						<li><a href="#" class="instagram"></a></li>
					</ul>
                                </div>
				<div class="clearfix"> </div>
			</div>
			<div class="logo-nav">
				<div class="logo-nav-left animated wow zoomIn" data-wow-delay=".5s">
					<h1><a href="paneladmin.jsp">  CallistoArt <span>Shop With Us</span></a></h1>
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
                                                   <!-- Mega Menu -->
                                                    <li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">your collection <b class="caret"></b></a>
								<ul class="dropdown-menu multi-column columns-3">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>CATEGORY</h6>
												<li><a href="addcategory.jsp">Add New Category</a></li>
												<li><a href="listofcategories.jsp">View Category List</a></li>
											</ul>
										</div>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>SUB-CATEGORY</h6>
												<li><a href="addsubcategory.jsp">Add New Sub-Category</a></li>
												<li><a href="listofsubcategories.jsp">View Sub-Category List</a></li>
											</ul>
										</div>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>PRODUCTS</h6>
												<li><a href="addproduct.jsp">Add New Product</a></li>
												<li><a href="listofproducts.jsp">View Product List</a></li>
											</ul>
										</div>
										<div class="clearfix"></div>
									</div>
								</ul>
							</li>
                                                        <li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">view list<b class="caret"></b></a>
								<ul class="dropdown-menu multi-column columns-3">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>CUSTOMER</h6>
												<li><a href="listofusers.jsp">View Customer List</a></li>
											</ul>
										</div>
										
                                                                            <div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>ORDERS</h6>
												<li><a href="listoforders.jsp">View Order List</a></li>
											</ul>
										</div>
										
										<div class="clearfix"></div>
									</div>
								</ul>
							</li>
						</ul>
					</div>
					</nav>
				</div>
				<div class="logo-nav-right">
					<div class="search-box">
						<div id="sb-search" class="sb-search">
							<form action="adminsearchresult.jsp" method="post">
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
                            
                                                </a>
						<div class="clearfix"> </div>
				
			</div>
		</div>
	<!-- //header -->
   