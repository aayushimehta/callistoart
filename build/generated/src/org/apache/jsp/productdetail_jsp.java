package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class productdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Single Product Detail</title>\n");
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
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            .btn-default {\n");
      out.write("                color: #333;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-color: #D8703F;\n");
      out.write("                padding: 12px 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script type='text/javascript'>\n");
      out.write("                  \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                    \n");
      out.write("                $(\"#form1\").submit(function(e){\n");
      out.write("                   e.preventDefault();\n");
      out.write("                   var formData=$(this).serialize();\n");
      out.write("                    $.ajax({ \n");
      out.write("                    url:\"ajaxaddtocart.jsp\",\n");
      out.write("                    data: formData,\n");
      out.write("                    type:\"post\",\n");
      out.write("                    beforeSend:function()\n");
      out.write("                    {\n");
      out.write("                         $(\"#answer2\").html(\"<img src='images/preloader.gif' style='width:1px; height:1px'>\")\n");
      out.write("                    },\n");
      out.write("                    success:function(result)\n");
      out.write("                    {\n");
      out.write("                        if($.trim(result)==\"success\")\n");
      out.write("                        {\n");
      out.write("                            $.dialog({\n");
      out.write("                                title: 'Product Added to Cart',\n");
      out.write("                                content: 'Successful!',\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                        else\n");
      out.write("                        {\n");
      out.write("                            $.dialog({\n");
      out.write("                                title: 'Product NOT Added to Cart',\n");
      out.write("                                content: 'Sorry!',\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                       \n");
      out.write("                    },\n");
      out.write("                    error:function()\n");
      out.write("                    {\n");
      out.write("                         $(\"#answer2\").html(\"page not found\")\n");
      out.write("                    }\n");
      out.write("                    });\n");
      out.write("               \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("              \n");
      out.write("            });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("     ");

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
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

          String pname="",price="",qty="",pimage="",pimage2="",pimage3="",pdescription="",shippingmin="",shippingmax="",limitedqty="";
                    try
                         {                  
                            
                            Class.forName("com.mysql.jdbc.Driver");
                           
                            Connection myconnection;
                            String url=getServletContext().getInitParameter("url");
                            String username=getServletContext().getInitParameter("username");
                            String password=getServletContext().getInitParameter("password");
                            myconnection=DriverManager.getConnection(url, username, password);                           
                            try
                            {
                                String query="select * from producttable where pid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1,request.getParameter("pid"));
                                ResultSet myres=mystatement.executeQuery();
                               
                                if(myres.next())
                                {
                                       pname=myres.getString("pname"); 
                                       price=myres.getString("price"); 
                                       qty=myres.getString("qty");
                                       pdescription=myres.getString("pdescription");
                                       pimage=myres.getString("pimage");
                                       pimage2=myres.getString("pimage2");
                                       pimage3=myres.getString("pimage3");
                                       shippingmin=myres.getString("shippingmin");
                                       shippingmax=myres.getString("shippingmax");
                                       limitedqty=myres.getString("limitedqty");
                                       
                                       session.setAttribute("pid",request.getParameter("pid"));
                                       session.setAttribute("pname",pname);
                                       session.setAttribute("price", price);
                                       session.setAttribute("pimage",pimage);
                                       session.setAttribute("shippingmin",shippingmin);
                                       session.setAttribute("shippingmax",shippingmax);
                               
                                }
                                
                                else
                                {
                                    out.print("No Records Exists");
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
      out.write("       <form name=\"form1\" method=\"post\" id=\"form1\">   \n");
      out.write("                <div class=\"single\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-4 products-left\">\n");
      out.write("\t\t<div class=\"categories animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h3>Categories</h3>\n");
      out.write("                                        <ul class=\"cate\">\n");
      out.write("            ");

                    Connection connection=null;
                    
                    try
                        { 
                     
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
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                            <div class=\"col-md-8 single-right\">\n");
      out.write("\t\t\t\t<div class=\"col-md-5 single-right-left animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t\t<li data-thumb=\"images/");
      out.print(pimage);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"thumb-image\"> <img src=\"images/");
      out.print(pimage);
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        <li data-thumb=\"images/");
      out.print(pimage2);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t <div class=\"thumb-image\"> <img src=\"images/");
      out.print(pimage2);
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li data-thumb=\"images/");
      out.print(pimage3);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t   <div class=\"thumb-image\"> <img src=\"images/");
      out.print(pimage3);
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- flexslider -->\n");
      out.write("\t\t\t\t\t\t<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t\t\t\t\t\t<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t// Can also be used with $(document).ready()\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t  $('.flexslider').flexslider({\n");
      out.write("\t\t\t\t\t\t\tanimation: \"slide\",\n");
      out.write("\t\t\t\t\t\t\tcontrolNav: \"thumbnails\"\n");
      out.write("\t\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- flexslider -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-7 single-right-left simpleCart_shelfItem animated wow slideInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<h3>");
      out.print(pname);
      out.write("</h3>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<h4><span class=\"item_price\">Rs. ");
      out.print(price);
      out.write("</span></h4>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"description\">\n");
      out.write("\t\t\t\t\t\t<h5><i>Description</i></h5>\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(pdescription);
      out.write("</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"color-quality\">\n");
      out.write("                                               \t<div class=\"color-quality-left\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Quantity</h5>\n");
      out.write("\t\t\t\t\t\t\t");

                                                            int qty2=Integer.parseInt(qty);
                                                            int limitedqty2=Integer.parseInt(limitedqty);
                                                        try
                                                        {    
                                                            if(qty2>0)
                                                            {
                                                                out.print("<select name='qty'>");
                                                                
                                                                for(int x=1;x<=limitedqty2;x++)
                                                                {
                                                                    out.print("<option>" + x + "</option>");
                                                                }

                                                                out.print("</select>");
                                                            }
                                                            else
                                                            {
                                                                out.print("<font color='red'><b>Out of Stock</b></font>");
                                                                out.print("<script type='text/javascript'>"
                                                                        + "$(document).ready(function(){$('#occasion-cart').hide();});"
                                                                        + "</script>");
                                                            }
                                                        }
                                                        catch(Exception e)
                                                        {
                                                            out.print(e.getMessage());
                                                        }
                    
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                        </div>    \n");
      out.write("                                                <div class=\"clearfix\"> </div>\n");
      out.write("                                                <div class=\"occasional\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Shipping time</h5>\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(shippingmin);
      out.write(" - ");
      out.print(shippingmax);
      out.write(" Days\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div class=\"occasion-cart\" id=\"occasion-cart\" data-wow-delay=\".5s\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-default\" name=\"submit\">\n");
      out.write("                                                <font color=\"#D8703F\" size=\"3px\"><b>ADD TO CART</b></font></button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\n");
      out.write("       </form>\t\t\t\n");
      out.write("          \n");
      out.write("   ");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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
