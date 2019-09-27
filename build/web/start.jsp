<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <%@include file="headerfiles.jsp" %> 
         <style>
        
            div.cat
            {
                height : 200px;
                width : 180px;
                margin-left: 3.5em;
            }
            .products-right-grid1-add-cart p a,.new-products-grid-right-add-cart p a {
                font-size: 14px;
                color: #D8703F;
                margin: 1em 7em; 
                text-decoration: none;
                text-transform: uppercase;
                padding: .5em 1.8em;
                border: 1px solid;
            }

        </style>
    </head>
    <body>
        <%
            RequestDispatcher mydis;
            if(session.getAttribute("uname")!=null)    
            {
                mydis=request.getRequestDispatcher("userheader.jsp");
                mydis.include(request,response);
            }
            else
            {
                mydis=request.getRequestDispatcher("mainmenu.jsp");
                mydis.include(request,response);
            }

        %> 
        <!-- banner -->
	<div class="banner">
		<div class="container">
			<div class="banner-info animated wow zoomIn" data-wow-delay=".5s">
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            
				<h4>Up to <span>50% <i>Off</i></span></h4>
                                <br>
                                <div class="wmuSlider example1">
					<div class="wmuSliderWrapper">
						<article style="position: absolute; width: 100%; opacity: 0;"> 
							<div class="banner-wrap">
								<div class="banner-info1">
                                                                    <p align="center">Notebooks + Footwear</p>
								</div>
							</div>
						</article>
						<article style="position: absolute; width: 100%; opacity: 0;"> 
							<div class="banner-wrap">
								<div class="banner-info1">
									<p>Laptop Sleeves + Stamps</p>
								</div>
							</div>
						</article>
						<article style="position: absolute; width: 100%; opacity: 0;"> 
							<div class="banner-wrap">
								<div class="banner-info1">
									<p>Greetings Cards + Bags </p>
								</div>
							</div>
						</article>
					</div>
				</div>
					<script src="js/jquery.wmuSlider.js"></script> 
					<script>
						$('.example1').wmuSlider();         
					</script> 
			</div>
		</div>
	</div>
        <!-- //banner -->
       
<!-- collections -->
	<div class="new-collections">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".5s">SNEEK PEAK</h3>
			<p class="est animated wow zoomIn" data-wow-delay=".5s">Check out exciting new range of Products customized according to popular choices.</p>
            <%
                    Connection myconnection=null;
                    String url=getServletContext().getInitParameter("url");
                    String username=getServletContext().getInitParameter("username");
                    String password=getServletContext().getInitParameter("password");
                     try
                        { 
                     
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                        String query= "select * from subcategorytable";  
                        PreparedStatement mystatement=myconnection.prepareStatement(query);  
                        
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                + "<table class='table'><tr>");
                            int a=1;
                        
                        do
                        {
                           out.print("<td><div class='cat'><center><a href='showproducts.jsp?subcatid=" + myresult.getString("subcatid") +"'>"
                                   + "<img src='images/"+ myresult.getString("subcatimage")+"' alt=' ' class='img-responsive'></a></center></div>"
                                   + "<center><h4><a href='showproducts.jsp?subcatid="+ myresult.getString("subcatid") + "'>" + myresult.getString("subcatname") 
                                   + "</a></h4></center><br>");
                            a++;
                        
                            if(a==5)
                            {
                                out.print("</tr><tr>");
                                a=1;
                            }
                        }
                        while(myresult.next());
                        out.print("</table>");
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
	
<!-- //collections -->
 <!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container"> 
			<div class="banner-bottom-grids">
				<div class="banner-bottom-grid-left animated wow slideInLeft" data-wow-delay=".5s">
					<div class="grid">
						<figure class="effect-julia">
							<img src="images/4.jpg" alt=" " class="img-responsive" />
							<figcaption>
                                                            <h3><font color="white">Callisto <span>Art</span><i> online shopping</i></font></h3>
								<div>
									<p>Cupidatat non proident, sunt</p>
									<p>Officia deserunt mollit anim</p>
									<p>Laboris nisi ut aliquip consequat</p>
								</div>
							</figcaption>			
						</figure>
					</div>
				</div>
				<div class="banner-bottom-grid-left1 animated wow slideInUp" data-wow-delay=".5s">
					<div class="banner-bottom-grid-left-grid left1-grid grid-left-grid1">
						<div class="banner-bottom-grid-left-grid1">
							<img src="images/1.jpg" alt=" " class="img-responsive" />
						</div>
						<div class="banner-bottom-grid-left1-pos">
                                                    <p><b>   FREE SHIPPING on First Order!<i><span> SERIOUSLY! </span></i></b></p>
						</div>
					</div>
					<div class="banner-bottom-grid-left-grid left1-grid grid-left-grid1">
						<div class="banner-bottom-grid-left-grid1">
							<img src="images/2.jpg" alt=" " class="img-responsive" />
						</div>
						<div class="banner-bottom-grid-left1-position">
							<div class="banner-bottom-grid-left1-pos1">
								<p>Latest Fine Collection</p>
							</div>
						</div>
					</div>
				</div>
				<div class="banner-bottom-grid-right animated wow slideInRight" data-wow-delay=".5s">
					<div class="banner-bottom-grid-left-grid grid-left-grid1">
						<div class="banner-bottom-grid-left-grid1">
							<img src="images/3.jpg" alt=" " class="img-responsive" />
						</div>
						<div class="grid-left-grid1-pos">
                                                    <p>Simple yet classy<span> designs to add to </span> <span>Your Collection</span></p>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner-bottom -->        
        <%@include file="footer.jsp" %> 

    </body>
</html>
