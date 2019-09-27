package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headerfiles.jsp");
    _jspx_dependants.add("/adminpanel.jsp");
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
      out.write("        <title>Welcome </title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("    </head>           \n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-grid\">\n");
      out.write("\t\t\t\t<div class=\"header-grid-left animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">callistoart@gmail.com</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+91 9879 467 953</li>\n");
      out.write("                                        ");

                                            if(session.getAttribute("uname")!=null)
                                            {
                                                out.print("<li><i class='glyphicon glyphicon-log-in' aria-hidden='true'></i><a href='#'>");
                                                out.print("Hello + session.getAttribute('admin')");
                                                out.print("</a></li>");
                                            }
                                            else
                                            {
                                                response.sendRedirect("loginform.jsp");
                                            }
                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></i><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
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
      out.write("\t\t\t\t\t<h1><a href=\"start.jsp\">  CallistoArt <span>Shop With Us</span></a></h1>\n");
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
      out.write("                                                        <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" id=\"myTabDrop1\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-controls=\"myTabDrop1-contents\">Accessories<span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"myTabDrop1\" id=\"myTabDrop1-contents\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"bags\" data-toggle=\"tab\" aria-controls=\"dropdown1\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown2\" tabindex=\"-1\" role=\"tab\" name=\"footwear\" data-toggle=\"tab\" aria-controls=\"dropdown2\">Footwear</a></li>\n");
      out.write("                                                                <li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"laptop\" data-toggle=\"tab\" aria-controls=\"dropdown3\">Laptop Sleeves</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown2\" tabindex=\"-1\" role=\"tab\" name=\"phonecover\" data-toggle=\"tab\" aria-controls=\"dropdown4\">Phone Covers</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    \n");
      out.write("                                                    <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" id=\"myTabDrop1\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-controls=\"myTabDrop1-contents\">Gifts<span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"myTabDrop1\" id=\"myTabDrop1-contents\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"badges\" data-toggle=\"tab\" aria-controls=\"dropdown1\">Badges</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown2\" tabindex=\"-1\" role=\"tab\" name=\"frames\" data-toggle=\"tab\" aria-controls=\"dropdown2\">Frames</a></li>\n");
      out.write("                                                                <li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"cards\" data-toggle=\"tab\" aria-controls=\"dropdown3\">Greeting Cards</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown2\" tabindex=\"-1\" role=\"tab\" name=\"frames\" data-toggle=\"tab\" aria-controls=\"dropdown4\">Mugs</a></li>\n");
      out.write("                                                                <li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"postcards\" data-toggle=\"tab\" aria-controls=\"dropdown5\">Postcards</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                    </li>\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                    <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" id=\"myTabDrop1\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-controls=\"myTabDrop1-contents\">Home & Decor<span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"myTabDrop1\" id=\"myTabDrop1-contents\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"cushion\" data-toggle=\"tab\" aria-controls=\"dropdown1\">Cushion Covers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown2\" tabindex=\"-1\" role=\"tab\" name=\"wallart\" data-toggle=\"tab\" aria-controls=\"dropdown2\">Wall Art</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\" class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" id=\"myTabDrop1\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-controls=\"myTabDrop1-contents\">Stationary<span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"myTabDrop1\" id=\"myTabDrop1-contents\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown1\" tabindex=\"-1\" role=\"tab\" name=\"jotbooks\" data-toggle=\"tab\" aria-controls=\"dropdown1\">Jotbooks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#dropdown2\" tabindex=\"-1\" role=\"tab\" name=\"notebooks\" data-toggle=\"tab\" aria-controls=\"dropdown2\">Notebooks</a></li>\n");
      out.write("                                                                <li><a href=\"#dropdown3\" tabindex=\"-1\" role=\"tab\" name=\"stamps\" data-toggle=\"tab\" aria-controls=\"dropdown2\">Stamps</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
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
      out.write("\t\t\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t\t\t\t<h3> <div class=\"total\"> \n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/bag.png\" alt=\"\" />\n");
      out.write("                                                        </h3> \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!-- //header -->\n");
      out.write("            }\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       ");
      out.write("\n");
      out.write("        ");

            out.print("<center>Registration Successful</center>");
        
      out.write("\n");
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
