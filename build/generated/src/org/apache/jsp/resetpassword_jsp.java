package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class resetpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headerfiles.jsp");
    _jspx_dependants.add("/userheader.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       ");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"header-grid\">\r\n");
      out.write("\t\t\t\t<div class=\"header-grid-left animated wow slideInLeft\" data-wow-delay=\".5s\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                    ");

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
                                                    
      out.write("\r\n");
      out.write("                                                    <script type=\"text/javascript\">\r\n");
      out.write("                                                        window.history.forward(1);\r\n");
      out.write("                                                    </script>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li><i class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></i><a href=\"signout.jsp\">Sign Out</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-grid-right animated wow slideInRight\" data-wow-delay=\".5s\">\r\n");
      out.write("                                    <ul><b><font color='#999' size='3'><a href=\"#\">My Account</a></font></b>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"logo-nav\">\r\n");
      out.write("\t\t\t\t<div class=\"logo-nav-left animated wow zoomIn\" data-wow-delay=\".5s\">\r\n");
      out.write("\t\t\t\t\t<h1><a href=\"userwelcome.jsp\">  CallistoArt <span>Shop With Us</span></a></h1>\r\n");
      out.write("                                </div>\r\n");
      out.write("\t\t\t<div class=\"logo-nav-left1\">\r\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header nav_2\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"userwelcome.jsp\" class=\"act\">Home</a></li>\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Mega Menu -->\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Clothing</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"changepassword.jsp\">Change Password</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                                        \r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Clothing</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Clothing</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Wallets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Watches</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"logo-nav-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"search-box\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\r\n");
      out.write("\t\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" id=\"search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- search-scripts -->\r\n");
      out.write("\t\t\t\t\t\t<script src=\"js/classie.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<!-- //search-scripts -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.html\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3> <div class=\"total\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/bag.png\" alt=\"\" />\r\n");
      out.write("                                                        </h3> \r\n");
      out.write("                                                    \r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<!-- //header -->\r\n");
      out.write("        <!-- banner -->\r\n");
      out.write("\t\r\n");
      out.write("       ");
      out.write("\n");
      out.write("        <!-- breadcrumbs -->\n");
      out.write("\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<li><a href=\"userwelcome.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Reset Password</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <!-- //breadcrumbs -->\n");
      out.write("         \n");
      out.write("               ");

            
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
                                String query2="select timestamp from usertable where email=?";
                                PreparedStatement mystatement2=myconnection.prepareStatement(query2);
                                mystatement2.setString(1, request.getParameter("sckhfkdjsn")) ;
                                
                                ResultSet myresult=mystatement2.executeQuery();
                                if(myresult.next())
                                {
                                    if(!myresult.getString("timestamp").equals(request.getParameter("timestamp")))
                                    {
                                  
                                    response.sendRedirect("loginform.jsp?credentials=wrong");
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
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- login -->\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"animated wow zoomIn\" data-wow-delay=\".3s\">New Password</h3>\n");
      out.write("\t\t\t<p class=\"est animated wow zoomIn\" data-wow-delay=\".3s\">Reset your Password. Thank God! You found your way back! </p>\n");
      out.write("\t\t\t<div class=\"login-form-grids animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<form name=\"form\" method=\"post\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Enter your New Password\" name=\"password1\" required=\"\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Re-Enter your New Password\" name=\"password2\" required=\"\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"resetpassword\" value=\"Reset Password\">\n");
      out.write("    ");

                if(request.getParameter("resetpassword")!=null)
                   {
                          
                            String npassword1=request.getParameter("npassword1");
                            String npassword2=request.getParameter("npassword2");
                            
                    if(npassword1.equals(npassword2))  
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
                                String query2="select timestamp from usertable where email=?";
                                PreparedStatement mystatement2=myconnection.prepareStatement(query2);
                                mystatement2.setString(1, request.getParameter("sckhfkdjsn")) ;
                                
                                ResultSet myresult=mystatement2.executeQuery();
                                if(myresult.next())
                                {
                                    if(myresult.getString("timestamp").equals(request.getParameter("timestamp")))
                                    {
                                         String query="update usertable set password=MD5(?) "
                                        + "where email=?";
                                
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1, request.getParameter("npassword1") 
                                        + getServletContext().getInitParameter("usersalt"));
                                 String email=request.getParameter("sckhfkdjsn");
                                 
                                
                                mystatement.setString(2, email);
                                                             
                                if(mystatement.executeUpdate()>0)
                                {
                                     String query3="update usertable set timestamp=0 "
                                        + "where email=?";
                                
                                PreparedStatement mystatement3=myconnection.prepareStatement(query3);
                                mystatement3.setString(1, request.getParameter("sckhfkdjsn"));
                                if(mystatement3.executeUpdate()>0)        
                                    out.println("Password Changed Successfully");
                                }
                                else
                                {
                                    out.print("Password Could not be changed!");
                                }
                                    }
                                }
                                else
                                {
                                    response.sendRedirect("loginform.jsp");
                                }
                               
                                
                            }
                            catch(Exception e)
                            {
                                out.println("Error in Query " + e.getMessage());
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
                            else
                            {
                                out.print("Passwords Do Not Match!");
                            }
                    }
    
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"register-home animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<a href=\"start.jsp\">Home</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
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
