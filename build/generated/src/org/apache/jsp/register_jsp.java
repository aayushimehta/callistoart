package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Register Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
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
      out.write("\r\n");
      out.write("        <div class=\"clearfix\"> </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"logo-nav\">\r\n");
      out.write("\t\t<div class=\"logo-nav-center animated wow zoomIn\" data-wow-delay=\".5s\">\r\n");
      out.write("                    <center><h1><a href=\"start.jsp\">CallistoArt</a></h1></center>\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("           \r\n");
      out.write("        <div class=\"breadcrumbs\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\r\n");
      out.write("\t\t\t\t<li><a href=\"start.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\">Register Page</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("         \r\n");
      out.write("        <div class=\"register\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h3 class=\"animated wow zoomIn\" data-wow-delay=\".3s\">Register Here</h3>\r\n");
      out.write("                        <p class=\"est animated wow zoomIn\" data-wow-delay=\".3s\">There's so much here for you - and there's always more coming!\r\n");
      out.write("                        <span>PS - Have I told you how happy I am that you're here?!</span></p>\r\n");
      out.write("                                \r\n");
      out.write("\t\t\t<div class=\"login-form-grids\">\r\n");
      out.write("\t\t\t\t<h5 class=\"animated wow slideInUp\" data-wow-delay=\".3s\">Profile information</h5>\r\n");
      out.write("\t\t\t\t<form class=\"animated wow slideInUp\" data-wow-delay=\".3s\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"First Name\" name=\"firstname\" required=\" \">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Last Name\" name=\"lastname\" required=\" \">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Date of Birth\" name=\"dob\" required=\"\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Country\" name=\"country\" required=\" \">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"input-group\"> \r\n");
      out.write("                                            Gender\r\n");
      out.write("                                                <span class=\"input-group-addon\">\r\n");
      out.write("                                                    <label><input type=\"radio\" name=\"gender\" value=\"Male\"> Male</label>\r\n");
      out.write("                                                    <label><input type=\"radio\" name=\"gender\" value=\"Female\"> Female</label>\r\n");
      out.write("                                                </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"register-check-box animated wow slideInUp\" data-wow-delay=\".3s\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                               \r\n");
      out.write("\t\t\t\t<h6 class=\"animated wow slideInUp\" data-wow-delay=\".3s\">Login information</h6>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" placeholder=\"Email Address\" name=\"email\" required=\" \" >\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" placeholder=\"Password\" name=\"password\" required=\" \" >\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" placeholder=\"Confirm Password\" name=\"cpassword\" required=\" \" >\r\n");
      out.write("\t\t\t\t\t<div class=\"register-check-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check\">\r\n");
      out.write("                                                    <label class=\"checkbox\"><input type=\"checkbox\" value=\"agree\" name=\"checkbox\"><i> </i>I accept the terms and conditions</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"register\" value=\"Register\">\r\n");
      out.write("                                </form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"register-home animated wow slideInUp\" data-wow-delay=\".3s\">\r\n");
      out.write("\t\t\t\t<a href=\"start.jsp\">Home</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("            ");
    
                    if(request.getParameter("register")!=null)
                    {
                        Connection myconnection=null;
                        
                        String uname,email,password,dob,country,gender;
                        uname=request.getParameter("firstname")+" "+request.getParameter("lastname");
                        email=request.getParameter("email");
                        password=request.getParameter("password"+"usersalt");
                        dob=request.getParameter("dob");
                        country=request.getParameter("country");  
                        gender=request.getParameter("gender");
                        
                        String path="jdbc:mysql://localhost:3306/callistoart";
                        
                          
                        
                        try
                            {
                                Class.forName("com.mysql.jdbc.Driver");
                                myconnection=DriverManager.getConnection(path,"root","");
                                try
                                {
                                   String q="insert into usertable values(?,?,MD5(?),?,?,?)";
                                   PreparedStatement mystatement=myconnection.prepareStatement(q);
                                   mystatement.setString(1, uname);
                                   mystatement.setString(2, email);
                                   mystatement.setString(3, password);  
                                   mystatement.setString(4, dob);
                                   mystatement.setString(5, country);
                                   mystatement.setString(6, gender);

                                   mystatement.executeUpdate();
                                   request.getRequestDispatcher("welcome.jsp").forward(request,response);
                                  
                                }
                                 catch(Exception e)
                                  {
                                      out.print("Error in Query " + e.getMessage());
                                  }
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Connection " + e.getMessage());
                            }
                            finally
                            {
                                myconnection.close();
                            }
                        }
                          
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("        ");
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
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
