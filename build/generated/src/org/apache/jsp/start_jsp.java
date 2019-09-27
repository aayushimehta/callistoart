package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headerfiles.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index</title>\n");
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
      out.write("<script src=\"js/jquery-1.12.js\"></script>\n");
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
      out.write(" \n");
      out.write("         <style>\n");
      out.write("        \n");
      out.write("            div.cat\n");
      out.write("            {\n");
      out.write("                height : 200px;\n");
      out.write("                width : 180px;\n");
      out.write("                margin-left: 3.5em;\n");
      out.write("            }\n");
      out.write("            .products-right-grid1-add-cart p a,.new-products-grid-right-add-cart p a {\n");
      out.write("                font-size: 14px;\n");
      out.write("                color: #D8703F;\n");
      out.write("                margin: 1em 7em; \n");
      out.write("                text-decoration: none;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                padding: .5em 1.8em;\n");
      out.write("                border: 1px solid;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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

        
      out.write(" \n");
      out.write("        <!-- banner -->\n");
      out.write("\t<div class=\"banner\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"banner-info animated wow zoomIn\" data-wow-delay=\".5s\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("\t\t\t\t<h4>Up to <span>50% <i>Off</i></span></h4>\n");
      out.write("                                <br>\n");
      out.write("                                <div class=\"wmuSlider example1\">\n");
      out.write("\t\t\t\t\t<div class=\"wmuSliderWrapper\">\n");
      out.write("\t\t\t\t\t\t<article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t\t\t\t\t<div class=\"banner-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner-info1\">\n");
      out.write("                                                                    <p align=\"center\">Notebooks + Footwear</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t\t\t\t\t<div class=\"banner-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner-info1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Laptop Sleeves + Stamps</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t<article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t\t\t\t\t<div class=\"banner-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner-info1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Greetings Cards + Bags </p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<script src=\"js/jquery.wmuSlider.js\"></script> \n");
      out.write("\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t$('.example1').wmuSlider();         \n");
      out.write("\t\t\t\t\t</script> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <!-- //banner -->\n");
      out.write("       \n");
      out.write("<!-- collections -->\n");
      out.write("\t<div class=\"new-collections\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"animated wow zoomIn\" data-wow-delay=\".5s\">SNEEK PEAK</h3>\n");
      out.write("\t\t\t<p class=\"est animated wow zoomIn\" data-wow-delay=\".5s\">Check out exciting new range of Products customized according to popular choices.</p>\n");
      out.write("            ");

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
                        
                     
                            
      out.write("       \n");
      out.write("                        \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("<!-- //collections -->\n");
      out.write(" <!-- banner-bottom -->\n");
      out.write("\t<div class=\"banner-bottom\">\n");
      out.write("\t\t<div class=\"container\"> \n");
      out.write("\t\t\t<div class=\"banner-bottom-grids\">\n");
      out.write("\t\t\t\t<div class=\"banner-bottom-grid-left animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"grid\">\n");
      out.write("\t\t\t\t\t\t<figure class=\"effect-julia\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/4.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t<figcaption>\n");
      out.write("                                                            <h3><font color=\"white\">Callisto <span>Art</span><i> online shopping</i></font></h3>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Cupidatat non proident, sunt</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Officia deserunt mollit anim</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Laboris nisi ut aliquip consequat</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</figcaption>\t\t\t\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"banner-bottom-grid-left1 animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grid-left-grid left1-grid grid-left-grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-bottom-grid-left-grid1\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/1.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-bottom-grid-left1-pos\">\n");
      out.write("                                                    <p><b>   FREE SHIPPING on First Order!<i><span> SERIOUSLY! </span></i></b></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grid-left-grid left1-grid grid-left-grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-bottom-grid-left-grid1\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/2.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-bottom-grid-left1-position\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"banner-bottom-grid-left1-pos1\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Latest Fine Collection</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"banner-bottom-grid-right animated wow slideInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grid-left-grid grid-left-grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-bottom-grid-left-grid1\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/3.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"grid-left-grid1-pos\">\n");
      out.write("                                                    <p>Simple yet classy<span> designs to add to </span> <span>Your Collection</span></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner-bottom -->        \n");
      out.write("        ");
      out.write("<!-- footer -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h3>About Us</h3>\n");
      out.write("\t\t\t\t\t<p>Dancing robots and Enthusiastic cutlets - Welcome to the whimsical world of Aayushi Mehta <span>\n");
      out.write("\t\t\t\t\t\tJust happy stuff for happy people.</span></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid animated wow slideInLeft\" data-wow-delay=\".6s\">\n");
      out.write("                                    <a href=\"contactus.jsp\"><h3>Contact Info</h3></a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>Jalandhar-Based Company</li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"#\">callistoartmakers@gmail.com</a></li>\n");
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
      out.write(" \n");
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
