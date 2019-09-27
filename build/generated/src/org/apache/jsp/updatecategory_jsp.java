package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class updatecategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/headerfiles.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Category</title>\n");
      out.write("        \n");
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
      out.write("        <script src=\"js/tinymce.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-1.12.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #myheading{\n");
      out.write("                font-size:1.04em;\n");
      out.write("                color:#212121;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                margin:0 0 0.5em;\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("            #form1label.error\n");
      out.write("            {\n");
      out.write("                margin-left:10px;\n");
      out.write("                display:block;\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        <script type='text/javascript'>\n");
      out.write("                  \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                    \n");
      out.write("                $(\"#form1\").submit(function(e){\n");
      out.write("                   e.preventDefault();\n");
      out.write("                   var formData = new FormData($(this)[0]);\n");
      out.write("                    $.ajax({ \n");
      out.write("                    url:\"ajaxupdatecat.jsp\",\n");
      out.write("                    data: formData,\n");
      out.write("                    contentType: false,\n");
      out.write("\t\t    cache: false,\n");
      out.write("\t\t    processData: false,\n");
      out.write("                    type:\"post\",\n");
      out.write("                    beforeSend:function()\n");
      out.write("                    {\n");
      out.write("                         $(\"#answer2\").html(\"<img src='images/preloader.gif' style='width:1px; height:1px'>\")\n");
      out.write("                    },\n");
      out.write("                    success:function(result)\n");
      out.write("                    {\n");
      out.write("                            $(\"#answer2\").html(result);\n");
      out.write("                    },\n");
      out.write("                    error:function()\n");
      out.write("                    {\n");
      out.write("                         $(\"#answer2\").html(\"page not found\");\n");
      out.write("                    }\n");
      out.write("                    });\n");
      out.write("               \n");
      out.write("                });\n");
      out.write("              \n");
      out.write("            });\n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("            ");

                String catname="",catimage="";
                String catid=request.getParameter("catid");
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
                            String query="select * from categorytable where catid=?";
                            PreparedStatement mystatement=myconnection.prepareStatement(query);
                            mystatement.setString(1,catid);
                            ResultSet myres=mystatement.executeQuery();
                            
                            if(myres.next())
                            {
                                catname=myres.getString("catname"); 
                               
                                catimage=myres.getString("catimage");
                                
                                session.setAttribute("catimage", catimage);
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
                            out.println("Error in Connection " + e.getMessage());
                        } 
                        
            
      out.write("\n");
      out.write("        <div class=\"breadcrumbs\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<li><a href=\"paneladmin.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Update Category</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <!-- //breadcrumbs -->\n");
      out.write("        <span id=\"answer2\"></span>\n");
      out.write("        <!-- login -->\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"animated wow zoomIn\" data-wow-delay=\".3s\">Update Category</h3>\n");
      out.write("                        <div class=\"login-form-grids animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("                            <form name=\"form1\" method=\"post\" id=\"form1\" enctype=\"multipart/form-data\">\n");
      out.write("                               \n");
      out.write("                            <input type=\"hidden\" id=\"catid\" name=\"catid\" value='");
      out.print(catid);
      out.write("'>\n");
      out.write("                            <h5 id=\"myheading\">Category Name</h5><input type=\"text\" name=\"catname\" id=\"catname\" class=\"form-control\" value='");
      out.print(catname);
      out.write("'>\n");
      out.write("                       \n");
      out.write("                            <img src=\"images/");
out.print(catimage);
      out.write("\" width=\"100\" height=\"100\">\n");
      out.write("                            Category Image<input type=\"file\" name=\"catimage\">\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"submit\" name=\"updatecategory\"  value=\"Update Category\" onclick=\"tinyMCE.triggerSave(true,true);\"/>\n");
      out.write("                                    <div class=\"register-home animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("                                        <input type=\"reset\" name=\"reset\" value=\"Reset\">\n");
      out.write("                                    </div>\n");
      out.write("                            </form>        \n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        </div>                            \n");
      out.write("        \n");
      out.write("                 \n");
      out.write("            \n");
      out.write("    </body>\n");
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
