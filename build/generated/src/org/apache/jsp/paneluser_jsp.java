package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class paneluser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("\n");
      out.write("        <style>\n");
      out.write("            img\n");
      out.write("            {\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-left: 1em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>           \n");
      out.write("   \n");
      out.write("    <body> \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div class=\"bs-docs-example animated wow fadeInUp\" data-wow-duration=\"1000ms\" data-wow-delay=\"500ms\">\n");
      out.write("            <div class=\"single\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-3 products-left\">\n");
      out.write("\t\t<div class=\"categories animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h3>Categories</h3>\n");
      out.write("                                        <ul class=\"cate\">\n");
      out.write("            ");

                    
            try
                    { 
                        Connection connection=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        String url=getServletContext().getInitParameter("url");
                        String username=getServletContext().getInitParameter("username");
                        String password=getServletContext().getInitParameter("password");
                        
                        connection=DriverManager.getConnection(url,username,password);
                        
                        String query= "select * from categorytable c, subcategorytable sc where c.catid=sc.catid";  
                        PreparedStatement mystatement=connection.prepareStatement(query);  
                                               
                        ResultSet myresult=mystatement.executeQuery();
                        if(myresult.next())
                        {
                            do
                            {
                                out.print("<li><a href='showsubcategories.jsp?catid=" + myresult.getString("catid") 
                                        + "'><b>" + myresult.getString("catname") + "</b></a></li>"
                                        + "<ul><li><a href='showproducts.jsp?subcatid="+ myresult.getString("subcatid") + "'>"
                                        + myresult.getString("subcatname") + "</a></li></ul>");
                            }
                            while(myresult.next());
                            
                                   
                        }
                        }
                        catch(Exception e)
                        {
                            out.print("Error in Query"+ e.getMessage());
                        }
        
      out.write("\n");
      out.write("\t\t</ul>\t\n");
      out.write("\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("        <div class=\"col-md-9 single-right\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><center><a href=\"addcategory.jsp\"><img src =\"images/add category.png\" width=\"200\" height=\"200\"></a></center></td>\n");
      out.write("                    <td><center><a href=\"addsubcategory.jsp\"><img src =\"images/add subcategory.png\" width=\"200\" height=\"200\"></a></center></td>\n");
      out.write("                    <td><center><a href=\"addproduct.jsp\"><img src =\"images/add product.png\" width=\"200\" height=\"200\"></a></center></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><center><a href=\"addcategory.jsp\"><font size=\"4\">View Profile</font></a></center></td>\n");
      out.write("                    <td><center><a href=\"addsubcategory.jsp\"><font size=\"4\">Edit Profile</font></a></center></td>\n");
      out.write("                    <td><center><a href=\"addproduct.jsp\"><font size=\"4\">View Orders</font></a></center></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td><center><a href=\"listofcategories.jsp\"><img src =\"images/category.png\" width=\"200\" height=\"200\"></a></center></td>\n");
      out.write("                    <td><center><a href=\"listofsubcategories.jsp\"><img src =\"images/subcat.png\" width=\"180\" height=\"180\"></a></center></td>\n");
      out.write("                    <td><center><a href=\"listofproducts.jsp\"><img src =\"images/listof prod.png\" width=\"170\" height=\"180\"></a></center></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><center><a href=\"listofcategories.jsp\"><font size=\"4\">List of Category(s)</font></a></center></td>\n");
      out.write("                    <td><center><a href=\"listofsubcategories.jsp\"><font size=\"4\">List of Sub-category(s)</font></a></center></td>\n");
      out.write("                    <td><center><a href=\"listofproducts.jsp\"><font size=\"4\">List of Products</font></a></center></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       ");
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
