package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class listofsubcategories_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>List of Sub-categories</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-confirm.min.css\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jquery-confirm.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("                    $(document).ready(function(){\r\n");
      out.write("                        \r\n");
      out.write("                        $(\".delete\").click(function(e){\r\n");
      out.write("                        e.preventDefault();\r\n");
      out.write("                        var subcatid=$(this).attr(\"subcatid\");\r\n");
      out.write("                        var sr1=$(this).parent();//td\r\n");
      out.write("                        var sr=$(this).parent().parent();//tr\r\n");
      out.write("                    \r\n");
      out.write("                        $.confirm({\r\n");
      out.write("                            theme:'dark',\r\n");
      out.write("                            type:'orange',\r\n");
      out.write("                            title: 'Confirm Delete!',\r\n");
      out.write("                            content: 'Do you really want to delete this sub-category?',\r\n");
      out.write("                            \r\n");
      out.write("                            buttons: {\r\n");
      out.write("                                confirm: function () {\r\n");
      out.write("                                    $.alert('Confirmed!'),\r\n");
      out.write("                                    \r\n");
      out.write("                                    $.ajax({ \r\n");
      out.write("                                    url:\"ajaxdeletecat.jsp\",\r\n");
      out.write("                                    data:{\"subcatid\":subcatid},\r\n");
      out.write("                                    type:\"post\",\r\n");
      out.write("                                    beforeSend:function()\r\n");
      out.write("                                    {\r\n");
      out.write("                                         sr1.append(\"<img src='images/preloader.gif'>\")\r\n");
      out.write("                                    },\r\n");
      out.write("                                    success:function(result)\r\n");
      out.write("                                    {\r\n");
      out.write("                                       if($.trim(result)===\"Success\")\r\n");
      out.write("                                              {\r\n");
      out.write("                                                      sr.css({'backgroundColor':'#ff960a'});\r\n");
      out.write("                                                      sr.fadeOut(600,function()\r\n");
      out.write("                                                      {\r\n");
      out.write("                                                              sr.remove();\r\n");
      out.write("                                                      });\r\n");
      out.write("                                              }\r\n");
      out.write("                                              else\r\n");
      out.write("                                              {\r\n");
      out.write("                                                      alert(\"Some Problem occured\");\r\n");
      out.write("                                              }\r\n");
      out.write("\r\n");
      out.write("                                    },\r\n");
      out.write("                                    error:function()\r\n");
      out.write("                                    {\r\n");
      out.write("                                         $(\"#answer\").html(\"page not found\");\r\n");
      out.write("                                    }\r\n");
      out.write("                                    });\r\n");
      out.write("                                },\r\n");
      out.write("                                \r\n");
      out.write("                                    cancel: function () {\r\n");
      out.write("                                          \r\n");
      out.write(" \t\t\t\t\t$.alert('Canceled!');\r\n");
      out.write("                                        }\r\n");
      out.write("                                } \r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("                    \r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("        <!-- breadcrumbs -->\r\n");
      out.write("\t<div class=\"breadcrumbs\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\r\n");
      out.write("\t\t\t\t<li><a href=\"paneladmin.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\">List of Sub-categories</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("        <!-- //breadcrumbs -->\r\n");
      out.write("        \r\n");
      out.write("                \r\n");
      out.write("                <div id=\"answer\"></div>\r\n");
      out.write("            ");

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
                                String query="select * from subcategorytable";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                 
                                ResultSet myres=mystatement.executeQuery();
                                int count=1;
                                if(myres.next())
                                {
                                    out.print("<table class='table table-striped'>"
                                            + "<tr><th><center>Serial No.</center></th><th>Sub-Category</th><th>Image</th><th>Update</th><th>Delete</th></tr>");
                                    
                                    do
                                    {
                                        out.print("<tr><td><center>"+ count + "</center></td><td>" + myres.getString("subcatname") 
                                                + "</td><td><img src='images/" + myres.getString("subcatimage") + "' width='100px' height='100px'></td>"
                                                + "<td><a href='updatesubcategory.jsp?subcatid=" + myres.getString("subcatid") + "'>Update</a></td>"
                                                + "<td><a href='#' class='delete' subcatid=" + myres.getString("subcatid") +
                                                " subcatimage='images/" + myres.getString("subcatimage") +"'>Delete</a></td></tr>");
                                        count++;
                                    }
                                              while(myres.next());
                                    
                                              out.print("</table>") ;
                                }
                                
                                else
                                {
                                    out.print("No Records Exists");
                                }
                                
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Query" + e.getMessage());
                            }
                            finally
                            {
                                myconnection.close();
                            }
                        }
                            
                catch(Exception e)
                {
                    out.print("Error in Connection " + e.getMessage());
                } 
            
      out.write("   \r\n");
      out.write("             \r\n");
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
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("                \r\n");
      out.write("   \r\n");
      out.write("        \r\n");
      out.write("           ");
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
