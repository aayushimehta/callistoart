package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.*;
import org.apache.commons.fileupload.FileUploadException;
import java.sql.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public final class ajaxupdate2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

         
        String catid="", subcatid="", pid="",pname="", price="", qty="",pimage="",path="",pdescription="",shippingmax="",shippingmin="",limitedqty="",size="";
        boolean successful=true;
           
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);

        if(isMultipart)
        {

        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> items = null;
       try
       {
       items = upload.parseRequest(request);
       }
       catch (FileUploadException e)
       {
           e.printStackTrace();
       }

       for(FileItem myitem:items)
       {
            if (myitem.isFormField())
            {
                String itemName1 = myitem.getFieldName();
                String value=myitem.getString();

                if(itemName1.equals("category")) //control's name - textbox name
               {
                    catid=value;
                }
                else if(itemName1.equals("subcategory")) //control's name - textbox name
               {
                    subcatid=value;
                }
                else if(itemName1.equals("pname")) //control's name - textbox name
               {
                    pname=value;
                }
                else if(itemName1.equals("price")) //control's name - textbox name
               {
                    price=value;
                }
                else if(itemName1.equals("qty")) //control's name - textbox name
               {
                    qty=value;
                }
                 else if(itemName1.equals("pdescription")) //control's name - textbox name
               {
                    pdescription=value;
                }
                  else if(itemName1.equals("pid")) //control's name - textbox name
               {
                    pid=value;
                }
                else if(itemName1.equals("shippingmin")) //control's name - textbox name
                {
                    shippingmin=value;
                }
                else if(itemName1.equals("shippingmin")) //control's name - textbox name
                {
                    shippingmax=value;
                }
                else if(itemName1.equals("size")) //control's name - textbox name
                {
                    size=value;
                }
                else if(itemName1.equals("limitedqty")) //control's name - textbox name
                {
                    limitedqty=value;
                }
            }
            else
            {
                    String type=myitem.getContentType();
                    long imagesize=myitem.getSize()/1024; //kbytes
                    String name=myitem.getFieldName();

                    if(imagesize==0)
                    {
                        pimage=session.getAttribute("pimage").toString();
                    }
                    else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                            || type.equals("image/png") || type.equals("image/x-png")
                            || type.equals("image/gif")) && imagesize<400)
                        {

                            String oldimage=session.getAttribute("pimage").toString();
                            String path2=config.getServletContext().getRealPath("/") + "images\\" + oldimage;
                            File obj=new File(path2);
                            obj.delete();

                            pimage=new java.util.Date().getTime()+myitem.getName();
                            path=config.getServletContext().getRealPath("/") + "images\\" + pimage;
                            File savefile=new File(path);
                            myitem.write(savefile);    
                   
                        }
                    else
                        {
                            successful=false;
                            out.println("Sorry only pictures of less than 400kb are allowed to upload");
                        }
            }
        }
   
                if(successful==true)
                {
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
                                String query="update producttable set catid=?,subcatid=?,pname=?,"
                                        + " price=?, qty=?, pimage=?, pdescription=?,shippingmin=?,shippingmax=?,limitedqty=? where pid=?";
                                PreparedStatement mystatement=myconnection.prepareStatement(query);
                                mystatement.setString(1, catid);
                                mystatement.setString(2, subcatid);
                                mystatement.setString(3, pname);
                                mystatement.setString(4, price);
                                mystatement.setString(5, qty);                                
                                mystatement.setString(6, pimage); 
                                mystatement.setString(7, pdescription);
                                mystatement.setString(8, shippingmin);
                                mystatement.setString(9, shippingmax);
                                mystatement.setString(10, size); 
                                mystatement.setString(11, pid); 
                                
                                if(mystatement.executeUpdate()>0)
                                {
                                    out.println("Product Updated Successfully");
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
                    } 
                            
        }

        
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
