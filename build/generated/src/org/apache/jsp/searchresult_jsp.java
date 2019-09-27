package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class searchresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Result</title>\n");
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
      out.write("        <style>\n");
      out.write("        \n");
      out.write("            div.cat\n");
      out.write("            {\n");
      out.write("                height : 200px;\n");
      out.write("                width : 170px;\n");
      out.write("                margin-left: 6.5em;\n");
      out.write("            }\n");
      out.write("            .products-right-grid1-add-cart p a,.new-products-grid-right-add-cart p a {\n");
      out.write("                font-size: 14px;\n");
      out.write("                color: #D8703F;\n");
      out.write("                margin: 1em 7em;\n");
      out.write("                text-decoration: none;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                padding: .5em 1.8em;\n");
      out.write("                border: 1px solid;\n");
      out.write("            }\n");
      out.write("             div.subcat\n");
      out.write("            {\n");
      out.write("                height : 200px;\n");
      out.write("                width : 180px;\n");
      out.write("                margin-left: 7em;\n");
      out.write("            }\n");
      out.write("            .cname\n");
      out.write("            {\n");
      out.write("                margin-left:7.5em;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("       ");

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

        
      out.write("\n");
      out.write("        <!-- breadcrumbs -->\n");
      out.write("\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<li><a href=\"userwelcome.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Search Result</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <!-- //breadcrumbs -->\n");
      out.write("        <div class=\"list\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("         \n");
      out.write("        ");
 
    
    if(request.getParameter("searchbt")!=null)
    { 
            
                            Connection myconnection;
                            String path="jdbc:mysql://localhost/";
                            String place="callistoart";
                            String search =request.getParameter("search");
                    
                                    try
                                   {
                                       Class.forName("com.mysql.jdbc.Driver");
                                       myconnection=DriverManager.getConnection(path+place,"root","");
                                       
                                       try
                                       {
                                          String qu,qu1,qu2; 
                                          PreparedStatement mystatement,mystatement1, mystatement2 ;          
                                          
                                               qu="select * from categorytable where catname like ?";
                                               mystatement=myconnection.prepareStatement(qu);
                                               mystatement.setString(1,"%"+search+"%");
                                               
                                               qu1="select * from subcategorytable where subcatname like ?";
                                               mystatement1=myconnection.prepareStatement(qu1);
                                               mystatement1.setString(1,"%"+search+"%");
                                               
                                               qu2="select * from producttable where pname like ?";
                                               mystatement2=myconnection.prepareStatement(qu2);
                                               mystatement2.setString(1,"%"+search+"%");
                                               
                                               ResultSet myresult=mystatement.executeQuery();
                                               if(myresult.next())
                                               {
                                                  int a=1;
                                                  out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                                            + "<br><div class='alert alert-warning'><h4>CATEGORIES</h4></div><table class='table'><tr>");
                        
                                                do
                                                {
                                                   out.print("<td><div class='subcat'><center><a href='showsubcategories.jsp?catid=" + myresult.getString("catid") +"'>"
                                                            + "<img src='images/"+ myresult.getString("catimage")+"' alt=' ' class='img-responsive'></a></center></div><br>"
                                                            + "<h4 class='cname'><a href='showsubcategories.jsp?catid="+ myresult.getString("catid") + "'>" + myresult.getString("catname")
                                                            + "</a></h4><br>");
                                                    a++;

                                                    if(a==4)
                                                    {
                                                        out.print("</tr><tr>");
                                                        a=1;
                                                    }
                                                }
                                                while(myresult.next());
                                                out.print("</table>");
                                                }
                                               
                                               
                                               ResultSet myresult1=mystatement1.executeQuery();
                                               if(myresult1.next())
                                               {
                                                  int a=1;
                                                  out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                                             + "<br><table class='table'><tr>");
                                                do
                                                {
                                                   out.print("<td><div class='subcat'><center><a href='showproducts.jsp?subcatid=" + myresult1.getString("subcatid") +"'>"
                                                            + "<img src='images/"+ myresult1.getString("subcatimage")+"' alt=' ' class='img-responsive'></a></center></div><br>"
                                                            + "<h4 class='cname'><a href='showproducts.jsp?subcatid="+ myresult1.getString("subcatid") + "'>" + myresult1.getString("subcatname")
                                                            + "</a></h4><br>");
                                                    a++;

                                                    if(a==4)
                                                    {
                                                        out.print("</tr><tr>");
                                                        a=1;
                                                    }
                                                }
                                                while(myresult1.next());
                                                out.print("</table>");
                                                }
                                                
                                               
                                               ResultSet myresult2= mystatement2.executeQuery();
                                               if(myresult2.next())
                                               {
                                                  int c=1;
                                                  out.print("<div class='bs-docs-example animated wow fadeInUp' data-wow-duration='1000ms' data-wow-delay='500ms'>"
                                                             + "<br><div class='alert alert-warning'><h4>PRODUCTS</h4></div><table class='table'><tr>");
                                                do
                                                {
                                                   out.print("<td><div class='cat'><center><a href='productdetail.jsp?pid=" + myresult2.getString("pid") +"'>"
                                                            + "<img src='images/"+ myresult2.getString("pimage")+"' alt=' ' class='img-responsive'></a></center></div>"
                                                            + "<center><h4><a href='productdetail.jsp?pid="+ myresult2.getString("pid") + "'>" + myresult2.getString("pname") 
                                                            + "</a></h4></center><br><div class='simpleCart_shelfItem products-right-grid1-add-cart'><p><span class='item_price'>Rs."
                                                            + myresult2.getString("price") + "</span><a class='item_add' href='#'>add to cart</a></p>"+"</div></td>");
                                                    c++;

                                                    if(c==4)
                                                    {
                                                        out.print("</tr><tr>");
                                                        c=1;
                                                    }
                                                }
                                                while(myresult2.next());
                                                out.print("</table>");
                                                }
                                               
                                               
                                            }
                                       catch(Exception e)
                                          {
                                              out.print("Error in query " + e.getMessage());
                                          }
                                   }
                                    catch(Exception e)
                                    {
                                        out.print("Error in connection " + e.getMessage());
                                    }    
    
        }
               
                                               
        
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
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
