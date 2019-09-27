package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class faltu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/headerfiles.jsp");
    _jspx_dependants.add("/mainmenu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Detail</title>\n");
      out.write("           ");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Best Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- timer -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.countdown.css\" />\n");
      out.write("<!-- //timer -->\n");
      out.write("<!-- animation-effect -->\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<script>\n");
      out.write(" new WOW().init();\n");
      out.write("</script>\n");
      out.write("<!-- //animation-effect -->");
      out.write("\n");
      out.write("           <style type=\"text/css\">\n");
      out.write("               ul li, ol li {\n");
      out.write("                   margin-left: 20px;\n");
      out.write("               }\n");
      out.write("               \n");
      out.write("               \n");
      out.write("           </style>\n");
      out.write("                  \n");
      out.write("          \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("       <!-- header -->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-grid\">\n");
      out.write("\t\t\t\t<div class=\"header-grid-left animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">callistoartmakers@gmail.com</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+91 9879 467 953</li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-log-in\" aria-hidden=\"true\"></i><a href=\"loginform.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></i><a href=\"registeruser.jsp\">Register</a></li>\n");
      out.write("                                                <li><i class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></i><a href=\"registerseller.jsp\">Become a Seller</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"logo-nav\">\n");
      out.write("\t\t\t\t<div class=\"logo-nav-left animated wow zoomIn\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"start.jsp\">  CallistoArt <span> Shop With Us</span></a></h1>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"logo-nav-left1\">\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"start.jsp\" class=\"act\">Home</a></li>\t\n");
      out.write("\t\t\t\t\t\t\t<!-- Mega Menu -->\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Stationary<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Notebooks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Jotbooks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"\">Change Password</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"logo-nav-right\">\n");
      out.write("\t\t\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" id=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- search-scripts -->\n");
      out.write("\t\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t<a href=\"showcart.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<h3> <div class=\"total\"> \n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/bag.png\" alt=\"\" />\n");
      out.write("                                                        </h3> \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //header -->\n");
      out.write("\n");
      out.write("        <div class=\"breadcrumbs\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<li><a href=\"index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Welcome</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("       <div class=\"login\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    \t\n");
      out.write("        <h1>Product Detail</h1>\n");
      out.write("      ");

          String pname="",price="",qty="",image="",features="";
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
                                String query="select * from producttable where productid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1,request.getParameter("id"));
                                ResultSet myres=mystatement.executeQuery();
                               
                                if(myres.next())
                                {
                                       pname=myres.getString("productname"); 
                                       price=myres.getString("price"); 
                                       qty=myres.getString("qty");
                                       features=myres.getString("features");
                                       image=myres.getString("image");
                                       session.setAttribute("pid",request.getParameter("id"));
                                       session.setAttribute("productname",pname);
                                       session.setAttribute("price", price);
                                       session.setAttribute("image",image);
                                       
                               
                                }
                                
                                else
                                {
                                    
                                    out.print("No Records Exists");
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
                     
                     
                 
      out.write("\n");
      out.write("        \n");
      out.write("                 <form name=\"form1\" method=\"post\">      \n");
      out.write("                <table width=\"81%\" height=\"314\" border=\"0\" align=\"center\" cellpadding=\"15\" cellspacing=\"5\">\n");
      out.write("                  <tr>\n");
      out.write("                      <td rowspan=\"6\" align=\"center\">");
 out.print("<img src='userimages/" + image + "' width=250px height=300px");
      out.write("</td>\n");
      out.write("                      <td><h3>");
      out.print(pname);
      out.write("</h3></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Rs.");
      out.print(price);
      out.write("/-</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>");

                        int qty2=Integer.parseInt(qty);
                        if(qty2>0)
                        {
                            out.print("Qty : <select name='qty'>");
                            for(int x=1;x<=qty2;x++)
                            {
                                out.print("<option>" + x + "</option>");
                            }
                            
                            out.print("</select>");
                        }
                        else
                        {
                            out.print("<font color='red'><b>Out of Stock</b></font>");
                            out.print("<script type='text/javascript'>"
                                    + "$(document).ready(function(){$('#buybtn').hide();});"
                                    + "</script>");
                        }
                          
                    
                    
                        
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>");
      out.print(features);
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td><div id=\"buybtn\"><input type=\"submit\" name=\"submit\" value=\"Add to Cart\"></div></td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("                 </form>                  \n");
      out.write("\t\t</div>\n");
      out.write("        </div>\n");
      out.write("                ");

                    if(request.getParameter("submit")!=null)
                        {
                           
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
                                if(session.getAttribute("email")!=null)
                                {
                                     String query="insert into usercarttable(pid,name,price,qty,totalcost,image,emailid)"
                                        + " values(?,?,?,?,?,?,?)";
                                    int totalcost=Integer.parseInt(request.getParameter("qty")) 
                                            * Integer.parseInt(session.getAttribute("price").toString());


                                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                                    mystatement.setString(1, session.getAttribute("pid").toString());
                                    mystatement.setString(2, session.getAttribute("productname").toString());
                                    mystatement.setString(3, session.getAttribute("price").toString());
                                    mystatement.setString(4, request.getParameter("qty"));
                                    mystatement.setString(5, String.valueOf(totalcost));
                                    mystatement.setString(6, session.getAttribute("image").toString());
                                    mystatement.setString(7, session.getAttribute("email").toString());

                                    if(mystatement.executeUpdate()>0)
                                    {
                                        response.sendRedirect("showcart.jsp");
                                    }
                                }
                                else
                                {
                                
                                    String query="insert into carttable(pid,name,price,qty,totalcost,image,sessionid)"
                                            + " values(?,?,?,?,?,?,?)";
                                    int totalcost=Integer.parseInt(request.getParameter("qty")) 
                                            * Integer.parseInt(session.getAttribute("price").toString());


                                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                                    mystatement.setString(1, session.getAttribute("pid").toString());
                                    mystatement.setString(2, session.getAttribute("productname").toString());
                                    mystatement.setString(3, session.getAttribute("price").toString());
                                    mystatement.setString(4, request.getParameter("qty"));
                                    mystatement.setString(5, String.valueOf(totalcost));
                                    mystatement.setString(6, session.getAttribute("image").toString());
                                    mystatement.setString(7, session.getId());

                                    if(mystatement.executeUpdate()>0)
                                    {
                                        response.sendRedirect("showcart.jsp");
                                    }
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

                
      out.write("    \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("         ");
      out.write("<!-- footer -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h3>About Us</h3>\n");
      out.write("\t\t\t\t\t<p>Duis aute irure dolor in reprehenderit in voluptate velit esse.<span>Excepteur sint occaecat cupidatat \n");
      out.write("\t\t\t\t\t\tnon proident, sunt in culpa qui officia deserunt mollit.</span></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid animated wow slideInLeft\" data-wow-delay=\".6s\">\n");
      out.write("\t\t\t\t\t<h3>Contact Info</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>1234k Avenue, 4th block, <span>New York City.</span></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">info@example.com</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+1234 567 567</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer-logo animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<h2><a href=\"start.jsp\">CallistoArt<span>Shop With Us</span></a></h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"copy-right animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<p>&copy 2016 CallistoArt. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
