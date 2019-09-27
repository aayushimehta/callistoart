 <%
         if(session.getAttribute("email")==null)
         {
             session.setAttribute("shopping", true);
             response.sendRedirect("loginform.jsp");
         }
         else
         {
             response.sendRedirect("checkout.jsp");
         }
             
             
         %>