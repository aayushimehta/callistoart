<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<html>
    <head>
        <title>Add New Sub-category</title>
        <%@include file="headerfiles.jsp" %>
        <style type="text/css">
            #myheading{
                font-size:1.1em;
                color:#212121;
                text-transform:uppercase;
                margin:0 0 0.5em;
            }
        </style>
    </head>
    
    <body>
        <%@include file="adminheader.jsp" %>
        
        <div class="clearfix"> </div>
        <br>
        
           
        <div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".3s">
				<li><a href="paneladmin.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                                <li><a href="paneladmin.jsp">Sub-category</a></li>
                                <li class="active">Add New Sub-Category</li>
			</ol>
		</div>
	</div>
         
        <div class="register">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Add Sub-category</h3>
                        
			<div class="login-form-grids">
				
                            <form class="animated wow slideInUp" data-wow-delay=".3s" method="post" enctype="multipart/form-data">
                                    <h5 id="myheading">Category Name</h5> <select id="category" name="category" class="frm-field required sect">
                                     
                                <%
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
                                                String query="select catid,catname from categorytable";
                                                PreparedStatement mystatement=myconnection.prepareStatement(query);

                                                ResultSet myres=mystatement.executeQuery();
                                                out.print("<option>Select Category</option>");
                                                    
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
                                                    out.print("<option>Add Category(s) First</option>");
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
                                %>
                                    </select>
                                    <br>
                                    <br>
                                    <h5 id="myheading">Sub-category Name</h5><input type="text" placeholder="Sub-category Name" name="subcatname" required="">
                                    <h5 id="myheading">Sub-Category Image</h5><input type="file" name="subcatimage">
                                        
                                    <input type="submit" name="addsubcategory" value="Add Sub-Category">
                                    <div class="register-home animated wow slideInUp" data-wow-delay=".3s">
                                            <input type="reset" name="reset" value="Reset">
                                    </div>
        
        <%@page import="java.sql.*" %>    
            <%    
                    String subcatname="",catid="",subcatimage="",path="",subcatid="";
                    boolean successful=true;
                    boolean isMultipart=ServletFileUpload.isMultipartContent(request);
                    
                    if(isMultipart)
                    {
                        FileItemFactory factory= new DiskFileItemFactory();
                        ServletFileUpload upload=new ServletFileUpload(factory);
                        List<FileItem> items=null;
                    
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

                        if(itemName1.equals("category")) //control's name - textbox name
                        {
                            catid=value;
                        }
                        else if(itemName1.equals("subcatname")) //control's name - textbox name
                        {
                            subcatname=value;
                        }
                    }
                         else
                        {
                                String type=myitem.getContentType();
                                long size=myitem.getSize()/1024; //kbytes

                                if(size==0)
                                {
                                    subcatimage="subcatdefault.png";
                                }
                                else if((type.equals("image/pjpeg") || type.equals("image/jpeg")
                                        || type.equals("image/png") || type.equals("image/x-png")
                                        || type.equals("image/gif")))
                                {
                                    subcatimage=new java.util.Date().getTime()+myitem.getName();
                                    path=getServletContext().getRealPath("/") + "images\\" + subcatimage;

                                    File savefile=new File(path);
                                    myitem.write(savefile);    
                                }
                                else
                                {
                                    successful=false;
                                    out.println("Only pictures are allowed");
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
                                 String q = "insert into subcategorytable(catid,subcatname,subcatimage) values(?,?,?)";
                                 PreparedStatement myst = myconn.prepareStatement(q);
                                 myst.setString(1, catid);
                                 myst.setString(2, subcatname);
                                 myst.setString(3, subcatimage);
                                 int myres = myst.executeUpdate();
                                 if(myres>0)
                                {
                                    out.print("<br>");
                                    out.print("<div class='alert alert-success' role='alert'><center><strong> You have successfully added a New Sub-category!</strong></center></div>");
                                }
                                else
                                {
                                    out.print("<br>");
                                    out.print("<div class='alert alert-danger' role='alert'><strong>Oh snap!</strong> Sub Category Not Added Successfully</div>");
                                }
                            }
                            catch(Exception e)
                            {
                                out.print("Error in query " + e.getMessage());
                            }
                            finally
                            {
                                myconn.close();
                            }
                         }   
                         catch(Exception e)
                         {
                             out.print("Error in connection " + e.getMessage());
                         }
                    }
                    }     
                 
            %>  
                    </form>
			</div>
			<div class="register-home animated wow slideInUp" data-wow-delay=".3s">
				<a href="paneladmin.jsp">Home</a>
			</div>
		</div>
	</div>
        
        <%@include file="footer.jsp"%>
    </body>
</html>