package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--header-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-grid\">\n");
      out.write("\t\t\t\t<div class=\"header-grid-left animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">callistoart@gmail.com</a></li>\n");
      out.write("                                            <li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+91 9879 467 953</li>\n");
      out.write("                                            <li>\n");
      out.write("                                                    ");

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
                                                    
      out.write("\n");
      out.write("                                                    <script type=\"text/javascript\">\n");
      out.write("                                                        window.history.forward(1);\n");
      out.write("                                                    </script>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li><i class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></i><a href=\"signout.jsp\">Sign Out</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-grid-right animated wow slideInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<ul class=\"social-icons\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"g\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\"></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"logo-nav\">\n");
      out.write("\t\t\t\t<div class=\"logo-nav-left animated wow zoomIn\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"paneladmin.jsp\">  CallistoArt <span>Shop With Us</span></a></h1>\n");
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
      out.write("                                                    <li class=\"active\"><a href=\"paneladmin.jsp\" class=\"act\">Home</a></li>\t\n");
      out.write("                                                    <!-- Mega Menu -->\n");
      out.write("                                                    <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>Category</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Add New Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">View Category List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>Sub-category</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Add New Sub-Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Sub-Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Sub-Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">View Sub-Category List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>Kid's Wear</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Add New Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">View Product List</a></li>\n");
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
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!-- //header -->\n");
      out.write("   ");
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
