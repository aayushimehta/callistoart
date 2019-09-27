package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/headerfiles.jsp");
    _jspx_dependants.add("/adminheader.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New Product</title>\n");
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
      out.write("        \n");
      out.write("        <script src=\"js/tinymce.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-1.12.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script type='text/javascript'>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("            $(\"#form1\").validate({\n");
      out.write("                    rules: {\n");
      out.write("                        pname:\"required\",\n");
      out.write("                        price: {\n");
      out.write("                            required:true,\n");
      out.write("                            digits:true\n");
      out.write("                        },\n");
      out.write("                        description:\"required\",\n");
      out.write("                        \n");
      out.write("                        quantity: {\n");
      out.write("                            required:true,\n");
      out.write("                            digits:true\n");
      out.write("                        },\n");
      out.write("                        \n");
      out.write("                        messages: {\n");
      out.write("                            pname:\"Please enter the Product Name!\",\n");
      out.write("                            price:\"This field is required!\"\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                   \n");
      out.write("        });\n");
      out.write("       \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("       \n");
      out.write("        <script type='text/javascript'>\n");
      out.write("            \n");
      out.write("            tinymce.init({\n");
      out.write("                    selector: 'textarea',\n");
      out.write("                    height: 500,\n");
      out.write("                    theme: 'modern',\n");
      out.write("                    plugins: [\n");
      out.write("                      'advlist autolink lists link image charmap print preview hr anchor pagebreak',\n");
      out.write("                      'searchreplace wordcount visualblocks visualchars code fullscreen',\n");
      out.write("                      'insertdatetime media nonbreaking save table contextmenu directionality',\n");
      out.write("                      'emoticons template paste textcolor colorpicker textpattern imagetools codesample toc'\n");
      out.write("                    ],\n");
      out.write("                    toolbar1: 'undo redo | insert | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image',\n");
      out.write("                    toolbar2: 'print preview media | forecolor backcolor emoticons | codesample',\n");
      out.write("                    image_advtab: true,\n");
      out.write("                    templates: [\n");
      out.write("                      { title: 'Test template 1', content: 'Test 1' },\n");
      out.write("                      { title: 'Test template 2', content: 'Test 2' }\n");
      out.write("                    ],\n");
      out.write("                    content_css: [\n");
      out.write("                      'https://fonts.googleapis.com/css?family=Lato:300,300i,400,400i',\n");
      out.write("                      'css/codepen.min.css'\n");
      out.write("                    ]\n");
      out.write("                });\n");
      out.write("        \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                \n");
      out.write("                $.validator.setDefaults({\n");
      out.write("                    submitHandler: function(){\n");
      out.write("                    var formData = new FormData($(\"#form1\")[0]);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                $(\"#form1\").submit(function(e){\n");
      out.write("                   e.preventDefault();\n");
      out.write("                   var formData = new FormData($(this)[0]);\n");
      out.write("                    $.ajax({ \n");
      out.write("                    url:\"ajaxaddproduct.jsp\",\n");
      out.write("                    data: formData,\n");
      out.write("                    contentType: false,\n");
      out.write("\t\t    cache: false,\n");
      out.write("\t\t    processData: false,\n");
      out.write("                    type:\"post\",\n");
      out.write("                    beforeSend:function()\n");
      out.write("                    {\n");
      out.write("                         $(\"#answer2\").html(\"<img src='images/preloader.gif' style='width:2px'>\");\n");
      out.write("                    },\n");
      out.write("                    success:function(result)\n");
      out.write("                    {\n");
      out.write("                            $(\"#answer2\").html(result);\n");
      out.write("                    },\n");
      out.write("                    error:function()\n");
      out.write("                    {\n");
      out.write("                         $(\"#answer2\").html(\"Add page not found\");\n");
      out.write("                    }\n");
      out.write("                    })\n");
      out.write("                   \n");
      out.write("                });\n");
      out.write("               $(\"#category\").change(function(){\n");
      out.write("                    var id=$(this).val();\n");
      out.write("                    if(id===\"Select Category\")\n");
      out.write("                    {\n");
      out.write("                        $(\"#answer\").html(\"<font color='red'>Choose a Valid Category</font><br>\");\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $.ajax({ \n");
      out.write("                        url:\"ajaxsubcat.jsp\",\n");
      out.write("                        data:{\"catid\":id},\n");
      out.write("                        type:\"post\",\n");
      out.write("                        beforeSend:function()\n");
      out.write("                        {\n");
      out.write("                             $(\"#answer\").html(\"<img src='images/preloader.gif'>\")\n");
      out.write("                        },\n");
      out.write("                        success:function(result)\n");
      out.write("                        {\n");
      out.write("                            $(\"#answer\").html(\"\")\n");
      out.write("                            $(\"#selectbox\").html(result)\n");
      out.write("                        },\n");
      out.write("                        error:function()\n");
      out.write("                        {\n");
      out.write("                             $(\"#answer\").html(\"Subcat page not found\")\n");
      out.write("                        }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("               \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("    \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
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
      out.write("                                                   <!-- Mega Menu -->\n");
      out.write("                                                    <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">your collection <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>CATEGORY</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"addcategory.jsp\">Add New Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">View Category List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>SUB-CATEGORY</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Add New Sub-Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Sub-Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Sub-Category</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">View Sub-Category List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>PRODUCTS</h6>\n");
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
      out.write("                                                        <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">view list<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>CUSTOMER</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Customer</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Customer</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listofusers.jsp\">View Customer List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>SELLER </h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Modify Seller</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Delete Seller</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.html\">View Seller List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6>PRODUCTS</h6>\n");
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
      out.write("\n");
      out.write("        <!-- breadcrumbs -->\n");
      out.write("\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb breadcrumb1 animated wow slideInLeft\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t<li><a href=\"paneladmin.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Add New Product</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <!-- //breadcrumbs -->\n");
      out.write("        \n");
      out.write("        <!-- login -->\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 class=\"animated wow zoomIn\" data-wow-delay=\".3s\">Add New Product</h3>\n");
      out.write("\t\t\t<p class=\"est animated wow zoomIn\" data-wow-delay=\".3s\">Yayyy! New Products</p>\n");
      out.write("\t\t\t<div class=\"login-form-grids animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("                            <form name=\"form1\" method=\"post\" id=\"form1\" enctype=\"multipart/form-data\">\n");
      out.write("                                <h5 id=\"myheading\">Choose Category</h5> <select id=\"category\" name=\"category\" class=\"frm-field required sect\" required>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    ");

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
                                                String query="select * from categorytable";
                                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                                out.print("<option value=''>Select Category</option>");
                                                ResultSet myres=mystatement.executeQuery();
                                                
                                                if(myres.next())
                                                {
                                                    do
                                                    {
                                                    out.print("<option value=" + myres.getString("catid") + ">"+ myres.getString("catname") +"</option>");
                                                    }
                                                    while(myres.next());

                                                }

                                                else
                                                {
                                                    out.print("<option value=''>Add Category(s) First</option>");
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
      out.write("                                        \n");
      out.write("                                    </select>\n");
      out.write("                                    <span id=\"answer\"></span>\n");
      out.write("                                    <br>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div id=\"selectbox\">\n");
      out.write("                                        <h5 id=\"myheading\">Choose Sub-category</h5><select id=\"subcategory\" name=\"subcategory\" class=\"frm-field required sect\" required=\"\"/>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<option value=''>Choose Sub-category</option>\n");
      out.write("                                       \t\t\t\t\t\n");
      out.write("                                    </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <br>\n");
      out.write("                                    \n");
      out.write("                                    <h5 id=\"myheading\">product name</h5><input type=\"text\" placeholder=\"Product Name\" name=\"pname\" required=\"\"/>\n");
      out.write("                                    <h5 id=\"myheading\">size</h5><input type=\"text\" placeholder=\"Size\" name=\"size\">\n");
      out.write("                                    <h5 id=\"myheading\">quantity</h5><input type=\"text\" placeholder=\"Quantity\" name=\"quantity\" required=\"\"/>\n");
      out.write("                                    <h5 id=\"myheading\">Price</h5><input type=\"text\" placeholder=\"Price\" name=\"price\" required=\"\"/>\n");
      out.write("                                    \n");
      out.write("                                    <h5 id=\"myheading\">choose product Image 1</h5><input type=\"file\" name=\"pimage\" id=\"pimage\"><br>\n");
      out.write("                                    <h5 id=\"myheading\">choose product Image 2</h5><input type=\"file\" name=\"pimage2\" id=\"pimage2\"><br>\n");
      out.write("                                    <h5 id=\"myheading\">choose product Image 3</h5><input type=\"file\" name=\"pimage3\" id=\"pimage3\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <h5 id=\"myheading\">Product Description</h5><textarea name=\"description\" id=\"description\"></textarea>\n");
      out.write("                                    <br>\n");
      out.write("                                    <br>\n");
      out.write("                                    <h5 id=\"myheading\">Shipping (Minimum Number of Days)</h5><input type=\"text\" placeholder=\"Minimum No. of Days\" name=\"shippingmin\" required=\"\"/>\n");
      out.write("                                    <h5 id=\"myheading\">Shipping (Maximum Number of Days)</h5><input type=\"text\" placeholder=\"Maximum No. of Days\" name=\"shippingmax\" required=\"\"/>\n");
      out.write("                                    <h5 id=\"myheading\">Limited quantity for 1 customer</h5><input type=\"text\" placeholder=\"Maximum Quantity\" name=\"limitedqty\">\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"submit\" name=\"addproduct\" value=\"Add Product\" onclick=\"tinyMCE.triggerSave(true,true);\"/>\n");
      out.write("                                    <div class=\"register-home animated wow slideInUp\" data-wow-delay=\".3s\">\n");
      out.write("                                        <input type=\"reset\" name=\"reset\" value=\"Reset\">\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                            </form>\n");
      out.write("                                <div id=\"answer2\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
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
      out.write("     \n");
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
