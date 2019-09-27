package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>My Shopping Cart</title>\r\n");
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
      out.write("\r\n");
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

        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                           \r\n");
      out.write("                \r\n");
      out.write("                $(\"#qty\").change(function(){\r\n");
      out.write("               \r\n");
      out.write("                    \r\n");
      out.write("                    alert(id);\r\n");
      out.write("                    var id=$(\"#qty\").val();\r\n");
      out.write("                    var pr=$(this).parent().parent();\r\n");
      out.write("                    \r\n");
      out.write("                    $.ajax({ \r\n");
      out.write("                        url:\"ajaxsorting.jsp\",\r\n");
      out.write("                        data:{\"qty\":id},\r\n");
      out.write("                        type:\"post\",\r\n");
      out.write("                        beforeSend:function()\r\n");
      out.write("                        {\r\n");
      out.write("                        },\r\n");
      out.write("                        success:function(result)\r\n");
      out.write("                        {\r\n");
      out.write("                            if($.trim(result)===\"success\")\r\n");
      out.write("                            {\r\n");
      out.write("                                alert(\"You changed the quantity.\");\r\n");
      out.write("                            }\r\n");
      out.write("                        },\r\n");
      out.write("                        error:function()\r\n");
      out.write("                        {\r\n");
      out.write("                             $(\"#cate\").html(\"page not found\");\r\n");
      out.write("                        }\r\n");
      out.write("                        });\r\n");
      out.write("              \r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    \r\n");
      out.write("            </script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        ");

                int shipping=40;   
                     try
                        { 
                        Connection myconnection=null;
                        String url=getServletContext().getInitParameter("url");
                        String username=getServletContext().getInitParameter("username");
                        String password=getServletContext().getInitParameter("password");
                        Class.forName("com.mysql.jdbc.Driver");
                        myconnection=DriverManager.getConnection(url,username,password);
                            try
                            {   
                                PreparedStatement mystatement; 
                                if(session.getAttribute("email")!=null)
                                {
                                    String query="select * from usercarttable where email=?";
                                
                                    mystatement=myconnection.prepareStatement(query);            
                                    mystatement.setString(1,session.getAttribute("email").toString());
                                                                      
                                }
                                else
                                {   
                                    String query="select * from carttable where sessionid=?";
                                
                                    mystatement=myconnection.prepareStatement(query);            
                                    mystatement.setString(1,session.getId());
                                    
                                }
                                
                                ResultSet myresult=mystatement.executeQuery();
                               
                                int count=1;
                                
                                if(myresult.next())
                                { 
                                    
                                    out.print("<div class='checkout'><div class='container'>"
                                    + "<h3 class='animated wow slideInLeft' data-wow-delay='.5s'>Your shopping cart contains: <span></span></h3>"
                                    + "<div class='checkout-right animated wow slideInUp' data-wow-delay='.5s'>"
                                    + "<table class='timetable_sub'><thead><tr><th>Serial No.</th><th>Product</th><th>Product Name</th><th>Price</th>"
                                    + "<th>Quantity</th><th>Total Cost</th><th>Remove</th></tr></thead>");
                                    
                                    int grandtotal=0;
                                    
                                    do
                                    {
                                        int tc=Integer.parseInt(myresult.getString("totalcost"));
                                      
                                        out.print("<tr class='rem1'><td>"+ count + "</td><td class='invert-image'>"
                                            + "<a href='productdetail.jsp?pid=" + myresult.getString("pid") +"'><img src='images/"+ myresult.getString("pimage") + "' alt=' ' class='img-responsive' /></a></td>"
                                            + "<td><a href='productdetail.jsp?pid=" + myresult.getString("pid") +"'>" + myresult.getString("pname") + "</td><td>Rs." + myresult.getInt("price") + "</td>"
                                            + "<td><select name='qty' id='qty'>");
                                        out.print(myresult.getString("qty"));
                                        for(int i=1;i<Integer.parseInt(session.getAttribute("limitedqty").toString());i++)
                                        {
                                            if(i==Integer.parseInt(myresult.getString("qty")))
                                                    {
                                                        out.print("<option selected>" + i+ "</option>");
                                                    }
                                            else
                                            {
                                                out.print("<option>" + i+ "</option>");
                                            }
                                        }
                                        out.print("</select></td>"
                                            + "<td>Rs. " + tc + "</td>"
                                            + "<td><div class='rem'><div class='close1' id='"+myresult.getString("pid")+"'> </div></div></td>");;
                                            
                                        count++;
                                    }                                    
                                    while(myresult.next());
                                    out.print("</table>");
                                    
                                    session.setAttribute("gd", grandtotal);
                                    
                                    out.print("<div class='checkout-left'><div class='checkout-left-basket animated wow slideInLeft' data-wow-delay='.5s'>"
					+ "<a href='checkoutlink.jsp'><h4>Continue to Checkout</h4></a>"
					+ "<ul><li>Total Cost <span class='total2'>"+ grandtotal +"</span></li>"
					+ "<li>Total Shipping Charges<span>Rs. " + shipping +"</span></li><li>Final Bill<span id='final'></span></li></ul></div>"
                                        + "<div class='checkout-right-basket animated wow slideInRight' data-wow-delay='.5s'>"
                                        + "<a href='start.jsp'><span class='glyphicon glyphicon-menu-left' aria-hidden='true'></span>Continue Shopping</a>"
                                        + "</div><div class='clearfix'> </div></div>");                                    
                                    
                                }
                                else
                                {
                                    out.print("<center><div class='alert alert-danger' role='alert'><strong>Oh snap!</strong>"
                                                                +" Your Shopping Cart is empty</div></center>");
                                }
                               
                            }
                            catch(Exception e)
                            {
                                out.print("Error in Query1 " + e.getMessage());
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
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("         function calculatebill()\r\n");
      out.write("         {\r\n");
      out.write("              $.ajax(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t  url: 'ajaxcalculatebill.jsp',\r\n");
      out.write("\t\t\t  type: 'post',\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t  success: function(result) \r\n");
      out.write("\t\t\t\t  {\r\n");
      out.write("                                     $(\".total2\").html(\"Rs. \"+result);\r\n");
      out.write("                                     $(\"#final\").html(\"Rs. \"+(parseInt(result)+40));\r\n");
      out.write("\t\t\t\t  },\r\n");
      out.write("\t\t\t  error: function() \r\n");
      out.write("\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\talert(\"Error in Ajax\");\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("         }\r\n");
      out.write("         $(document).ready(function() \r\n");
      out.write("        {\r\n");
      out.write("            calculatebill();\r\n");
      out.write("            $(\".close1\").click(function(e){\r\n");
      out.write("         \r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            var pid=$(this).attr(\"id\");\r\n");
      out.write("            var pr1=$(this).parent().parent();\r\n");
      out.write("            var pr=$(this).parent().parent().parent();\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("\t if(confirm(\"Are you sure you want to delete?\"))\r\n");
      out.write("\t {\r\n");
      out.write("             alert(pid);\r\n");
      out.write("\t\t $.ajax(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t  url: 'ajaxdeletecart.jsp',\r\n");
      out.write("\t\t\t  type: 'post',\r\n");
      out.write("\t\t\t  data: {\"pid\":pid},\r\n");
      out.write("                          \r\n");
      out.write("                          beforeSend: function() \r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t pr1.append(\"<img src='images/preloader.gif'>\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t  success: function(result) \r\n");
      out.write("\t\t\t\t  {\r\n");
      out.write("                                     \r\n");
      out.write("\t\t\t\t\tif($.trim(result)==\"done\")\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tpr.css({'backgroundColor':'#fb6c6c'});\r\n");
      out.write("\t\t\t\t\t\tpr.fadeOut(600,function()\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tpr.remove();\r\n");
      out.write("                                                        calculatebill();\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("                                                \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\talert(result);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t  },\r\n");
      out.write("\t\t\t  error: function() \r\n");
      out.write("\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t  alert(\"Error in Ajax\");\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t }\r\n");
      out.write("   });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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
