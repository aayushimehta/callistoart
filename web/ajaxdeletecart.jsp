
<%@page import="java.sql.*"%>
<%

if(request.getParameter("pid")!=null)
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

            if(session.getAttribute("email")!=null)
            {
                    String qu="delete from usercarttable where pid=? and email=?";
                    PreparedStatement mystate= myconnection.prepareStatement(qu);
                    mystate.setString(1, request.getParameter("pid"));
                    mystate.setString(2, session.getAttribute("email").toString());
                    if(mystate.executeUpdate()>0)
                {
                        out.print("done");
                }
                else
                {
                        out.print("error in deleteajax");
                }
            }

            else
            {
                String qu2="delete from carttable where pid=? and sessionid=?";
                PreparedStatement mystate2= myconnection.prepareStatement(qu2);
                mystate2.setString(1, request.getParameter("pid"));
                mystate2.setString(2, session.getId().toString());

                if(mystate2.executeUpdate()>0)
                {
                        out.print("done");
                }
                else
                {
                        out.print("error here");
                }

            }
            }
    catch(Exception e)
    {
       out.print("Error in Query " + e.getMessage());
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
}

%>
                          