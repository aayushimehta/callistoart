<%-- 
    Document   : signout
    Created on : Mar 27, 2017, 11:33:44 PM
    Author     : It hurts when IP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Out</title>
    </head>
    <body>
        <%
            if(session.getAttribute("uname")!=null)
            {
                session.removeAttribute("shopping");
            }
            
            session.invalidate();
            
            Cookie mycookie=new Cookie("uname","0");
            mycookie.setMaxAge(0);
            response.addCookie(mycookie);
            Cookie mycookie2=new Cookie("name","0");
            mycookie2.setMaxAge(0);
            response.addCookie(mycookie2);
            response.sendRedirect("start.jsp");
            
        %>
        
        
        
        
    </body>
</html>
