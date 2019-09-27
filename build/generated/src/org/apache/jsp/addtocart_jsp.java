package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addtocart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"single\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"men-position animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<a href=\"single.html\"><img src=\"images/29.jpg\" alt=\" \" class=\"img-responsive\" /></a>\n");
      out.write("\t\t\t\t\t<div class=\"men-position-pos\">\n");
      out.write("\t\t\t\t\t\t<h4>Summer collection</h4>\n");
      out.write("\t\t\t\t\t\t<h5><span>55%</span> Flat Discount</h5>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-8 single-right\">\n");
      out.write("\t\t\t\t<div class=\"col-md-5 single-right-left animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t\t<li data-thumb=\"images/si.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"thumb-image\"> <img src=\"images/si.jpg\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li data-thumb=\"images/si1.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t <div class=\"thumb-image\"> <img src=\"images/si1.jpg\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li data-thumb=\"images/si2.jpg\">\n");
      out.write("\t\t\t\t\t\t\t   <div class=\"thumb-image\"> <img src=\"images/si2.jpg\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- flixslider -->\n");
      out.write("\t\t\t\t\t\t<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t\t\t\t\t\t<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t// Can also be used with $(document).ready()\n");
      out.write("\t\t\t\t\t\t$(window).load(function() {\n");
      out.write("\t\t\t\t\t\t  $('.flexslider').flexslider({\n");
      out.write("\t\t\t\t\t\t\tanimation: \"slide\",\n");
      out.write("\t\t\t\t\t\t\tcontrolNav: \"thumbnails\"\n");
      out.write("\t\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- flixslider -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-7 single-right-left simpleCart_shelfItem animated wow slideInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h3>Men's Solid Casual Shirt</h3>\n");
      out.write("\t\t\t\t\t<h4><span class=\"item_price\">$550</span> - $900</h4>\n");
      out.write("\t\t\t\t\t<div class=\"rating1\">\n");
      out.write("\t\t\t\t\t\t<span class=\"starRating\">\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating5\" type=\"radio\" name=\"rating\" value=\"5\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating5\">5</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating4\" type=\"radio\" name=\"rating\" value=\"4\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating4\">4</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating3\" type=\"radio\" name=\"rating\" value=\"3\" checked>\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating3\">3</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating2\" type=\"radio\" name=\"rating\" value=\"2\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating2\">2</label>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating1\" type=\"radio\" name=\"rating\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating1\">1</label>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"description\">\n");
      out.write("\t\t\t\t\t\t<h5><i>Description</i></h5>\n");
      out.write("\t\t\t\t\t\t<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore \n");
      out.write("\t\t\t\t\t\t\teu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"color-quality\">\n");
      out.write("\t\t\t\t\t\t<div class=\"color-quality-left\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Color : </h5>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><span></span>Red</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"brown\"><span></span>Yellow</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"purple\"><span></span>Purple</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"gray\"><span></span>Violet</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"color-quality-right\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Quality :</h5>\n");
      out.write("\t\t\t\t\t\t\t<select id=\"country1\" onchange=\"change_country(this.value)\" class=\"frm-field required sect\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"null\">5 Qty</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"null\">6 Qty</option> \n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"null\">7 Qty</option>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"null\">10 Qty</option>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"occasional\">\n");
      out.write("\t\t\t\t\t\t<h5>Occasion :</h5>\n");
      out.write("\t\t\t\t\t\t<div class=\"colr ert\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"radio\"><input type=\"radio\" name=\"radio\" checked=\"\"><i></i>Casual Wear</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"colr\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"radio\"><input type=\"radio\" name=\"radio\"><i></i>Party Wear</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"colr\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"radio\"><input type=\"radio\" name=\"radio\"><i></i>Formal Wear</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"occasion-cart\">\n");
      out.write("\t\t\t\t\t\t<a class=\"item_add\" href=\"#\">add to cart </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\t\t\n");
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
