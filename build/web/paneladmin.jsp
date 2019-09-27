<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="headerfiles.jsp" %>
        <style>
            img
            {
                vertical-align: middle;
                margin-left: 1em;
            }
        </style>
    </head>           
   
    <body> 
       
        <%@include file="adminheader.jsp" %>
        <div class="bs-docs-example animated wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="500ms">
            <table class="table">
                <tr>
                    <td><center><a href="addcategory.jsp"><img src ="images/add category.png" width="200" height="200"></a></center></td>
                    <td><center><a href="addsubcategory.jsp"><img src ="images/add subcategory.png" width="200" height="200"></a></center></td>
                    <td><center><a href="addproduct.jsp"><img src ="images/add product.png" width="200" height="200"></a></center></td>
                </tr>

                <tr>
                    <td><center><a href="addcategory.jsp"><font size="4">Add Category</font></a></center></td>
                    <td><center><a href="addsubcategory.jsp"><font size="4">Add Sub-category</font></a></center></td>
                    <td><center><a href="addproduct.jsp"><font size="4">Add Product</font></a></center></td>
                </tr>
                <br>
                <br>
                <tr>
                    <td><center><a href="listofcategories.jsp"><img src ="images/category.png" width="200" height="200"></a></center></td>
                    <td><center><a href="listofsubcategories.jsp"><img src ="images/subcat.png" width="180" height="180"></a></center></td>
                    <td><center><a href="listofproducts.jsp"><img src ="images/listof prod.png" width="170" height="180"></a></center></td>
                </tr>

                <tr>
                    <td><center><a href="listofcategories.jsp"><font size="4">List of Category(s)</font></a></center></td>
                    <td><center><a href="listofsubcategories.jsp"><font size="4">List of Sub-category(s)</font></a></center></td>
                    <td><center><a href="listofproducts.jsp"><font size="4">List of Products</font></a></center></td>
                </tr>
            </table>
        </div>
        
    </body>
</html>
       