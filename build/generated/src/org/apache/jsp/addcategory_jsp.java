package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import org.apache.commons.fileupload.FileUploadException;
import java.util.List;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.sql.*;

public final class addcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add New Category</title>\n");
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
      out.write("        <style type=\"text/css\">\n");
      out.write("            #myheading{\n");
      out.write("                font-size:1.1em;\n");
      out.write("                color:#212121;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                margin:0 0 0.5em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"logo-nav\">\n");
      out.write("\t\t<div class=\"logo-nav-center animated wow zoomIn\" data-wow-delay=\".3s\">\n");
      out.write("                    <center><h1><a href=\"paneladmin.jsp\">CallistoArt</a></h1></center>\n");
      out.write("                </div>\n");
      out.write("        </div>   \n");
      out.write("           \n");
      out.write("        <div class=\"breadcrumbs\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<li><a href=\"paneladmin.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("                                <li><a href=\"paneladmin.jsp\">Category</a></li>\n");
      out.write("                                <li class=\"active\">Add New Category</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("         \n");
      out.write("        <div class=\"register\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"animated wow zoomIn\" data-wow-delay=\".3s\">Add Category</h3>\n");
      out.write("                                                        \n");
      out.write("\t\t\t<div class=\"login-form-grids\">\n");
      out.write("                            \n");
      out.write("                            <form class=\"animated wow slideInUp\" id=\"form1\" name=\"form1\" data-wow-delay=\".3s\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t<h5 id=\"myheading\">Category Name</h5><input type=\"text\" placeholder=\"Category Name\" name=\"catname\" required=\"\">\n");
      out.write("                                        <h5 id=\"myheading\">Category Image</h5><input type=\"file\" name=\"catimage\">\n");
      out.write("                                        <input type=\"submit\" name=\"addcategory\" value=\"Add Category\">\n");
      out.write("                                        <div class=\"register-home animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("                                            <input type=\"reset\" name=\"reset\" value=\"Reset\">\n");
      out.write("                                        </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            ");
    
                String catname="",catimage="",path="";
                boolean successful=true;
                boolean isMultipart= ServletFileUpload.isMultipartContent(request);
                
                if(isMultipart)
                {
                    FileItemFactory factory= new DiskFileItemFactory();
                    ServletFileUpload upload=new ServletFileUpload(factory);
                    List<FileItem> items = null;
                    
                    try
                    {
                        items=upload.parseRequest(request);
                    }
                    catch(FileUploadException e)
                    {
                         e.printStackTrace();
                    }
                    for(FileItem myitem:items)
                    {
                        if (myitem.isFormField())
                        {
                            String itemName1 = myitem.getFieldName();//catsummary
                            String value=myitem.getString();//
                            if(itemName1.equals("catname")) //control's name - textbox name
                            {
                               catname=value;//Oils
                            }
                        }
                        else
                        {
                                String type=myitem.getContentType();
                                long size=myitem.getSize()/1024; //kbytes

                                if(size==0)
                                {
                                    catimage="defaultproduct.jpg";
                                }
                                else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                        || type.equals("image/png") || type.equals("image/x-png")
                                        || type.equals("image/gif")))
                                    {
                                        catimage=new java.util.Date().getTime()+myitem.getName();
                                        path=getServletContext().getRealPath("/") + "images\\" + catimage;

                                        File savefile=new File(path);
                                        myitem.write(savefile);    
                                    }   
                                else
                                {
                                    successful=false;
                                    out.print("Only pictures are allowed");
                                }    
                        }

                    } 
                    if(successful==true)
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            String url=getServletContext().getInitParameter("url");
                            String username=getServletContext().getInitParameter("username");
                            String password=getServletContext().getInitParameter("password");
                            try
                             {
                                Connection myconn =  DriverManager.getConnection(url, username, password);
                                try
                                {
                                     String q = "insert into categorytable(catname,catimage) values(?,?)";
                                     PreparedStatement mystatement = myconn.prepareStatement(q);
                                     mystatement.setString(1, catname);
                                     mystatement.setString(2, catimage);
                                     int myres = mystatement.executeUpdate();
                                     if(myres>0)
                                     {
                                        out.print("<br>");
                                        out.print("<div class='alert alert-success' role='alert'><center><strong>"
                                                +"You have successfully added a New Category!</strong></center></div>");
                                     }
                                     else
                                     {
                                         out.print("Category not added successfully");
                                     }
                                 }
                                 catch(Exception e)
                                 {
                                     out.print("Error in query" + e.getMessage());
                                 }
                                 finally
                                 {
                                     myconn.close();
                                 }
                             }   
                             catch(Exception e)
                             {
                                 out.print("Error in connection" + e.getMessage());
                             }
                        }
                     }
                    
            
      out.write("  \n");
      out.write("                            </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"register-home animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<a href=\"paneladmin.jsp\">Home</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
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
      out.write("\n");
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
