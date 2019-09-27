
<%@page import="java.io.File"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<html>
    <head>
        <title>Add New Category</title>
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
                                <li><a href="paneladmin.jsp">Category</a></li>
                                <li class="active">Add New Category</li>
			</ol>
		</div>
	</div>
         
        <div class="register">
		<div class="container">
			<h3 class="animated wow zoomIn" data-wow-delay=".3s">Add Category</h3>
                                                        
			<div class="login-form-grids">
                            
                            <form class="animated wow slideInUp" id="form1" name="form1" data-wow-delay=".3s" method="post" enctype="multipart/form-data">
					<h5 id="myheading">Category Name</h5><input type="text" placeholder="Category Name" name="catname" required="">
                                        <h5 id="myheading">Category Image</h5><input type="file" name="catimage">
                                        <input type="submit" name="addcategory" value="Add Category">
                                        <div class="register-home animated wow slideInUp" data-wow-delay=".3s">
                                            <input type="reset" name="reset" value="Reset">
                                        </div>
        
        <%@page import="java.sql.*" %>    
            <%    
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