
package myservlets;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class login extends HttpServlet
{
    PrintWriter obj;
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html;charset=UTF-8");
        obj=res.getWriter();
        Connection myconnection;
        
        String url=getServletContext().getInitParameter("url");
        String username=getServletContext().getInitParameter("username");
        String password=getServletContext().getInitParameter("password");
        
        HttpSession mysession=req.getSession();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            myconnection=DriverManager.getConnection(url, username, password);
            
            try
            {
                String query= "select * from usertable where email=? and password=MD5(?)";  
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                String usersalt=getServletContext().getInitParameter("usersalt");
                mystatement.setString(1, req.getParameter("email"));
                mystatement.setString(2, req.getParameter("password")+usersalt);
                ResultSet myresult=mystatement.executeQuery();
                
                
                String query2= "select * from admintable where email=? and password=MD5(?)";  
                PreparedStatement mystatement2=myconnection.prepareStatement(query2);
                String adminsalt=getServletContext().getInitParameter("adminsalt");
                mystatement2.setString(1, req.getParameter("email"));
                mystatement2.setString(2, req.getParameter("password")+adminsalt);
                ResultSet myresult2=mystatement2.executeQuery();
                
                if(myresult.next())
                {
                    mysession.setAttribute("uname", myresult.getString("uname"));
                    mysession.setAttribute("email", myresult.getString("email"));
                    if(req.getParameter("signedin")!=null)
                                     {
                                         Cookie mycookie=new Cookie("email",myresult.getString("email"));
                                         mycookie.setMaxAge(60*60*24*7);
                                         res.addCookie(mycookie);
                                         
                                         Cookie mycookie2=new Cookie("uname",myresult.getString("uname"));
                                         mycookie2.setMaxAge(60*60*24*7);
                                         res.addCookie(mycookie2);
                                     }
                                     
                    
                    if(mysession.getAttribute("shopping")!=null)
                    {
                        req.getRequestDispatcher("checkout.jsp").forward(req,res);
                        String query3="select * from carttable where sessionid=?";
                        PreparedStatement statement3=myconnection.prepareStatement(query3);
                        statement3.setString(1, mysession.getId());
                        ResultSet myresult3=statement3.executeQuery();
                        if(myresult3.next())
                        {
                            
                            do
                            {
                                String query4="insert into usercarttable(pid,name,price,qty,totalcost,image,email) values(?,?,?,?,?,?,?,?)";
                                PreparedStatement statement4=myconnection.prepareStatement(query4);
                                statement4.setString(1, myresult3.getString("pid"));
                                statement4.setString(2, myresult3.getString("name"));
                                statement4.setString(3, myresult3.getString("price"));
                                statement4.setString(4, myresult3.getString("qty"));
                                statement4.setString(5, myresult3.getString("totalcost"));
                                statement4.setString(6, myresult3.getString("pimage"));
                                statement4.setString(7, mysession.getAttribute("email").toString());
                                
                                statement4.executeUpdate();
                            }
                        while(myresult3.next());
                        }
                        
                        String query5="delete from carttable where sessionid=?";
                        PreparedStatement statement5=myconnection.prepareStatement(query5);
                        statement5.setString(1, mysession.getId());
                        statement5.executeUpdate();
                    }
                    
                    else
                    {
                        req.getRequestDispatcher("start.jsp").forward(req,res);
                    }
                        obj.print("payment");
                
                }
                else if(myresult2.next())
                {
                        mysession.setAttribute("admin",myresult2.getString("name"));
                        mysession.setAttribute("id", myresult2.getString("email"));
                        if(req.getParameter("signedin")!=null)
                                     {
                                         
                                         Cookie mycookie2=new Cookie("admin",myresult.getString("email"));
                                         mycookie2.setMaxAge(60*60*24*7);
                                         res.addCookie(mycookie2);
                                     }
                                     
                        req.getRequestDispatcher("paneladmin.jsp").forward(req, res);
                }
                
                else
                    {
                        obj.print("<div class='alert alert-danger' role='alert'><center><strong> Wrong Email or Password!</strong></center></div>");
                        req.getRequestDispatcher("loginform.jsp").include(req,res);
                    }     
                    
                }
        
                
            catch(SQLException | ServletException | IOException e)
            {
                obj.print("Error in QUERY "+e);
            }
        
        }
        catch(ClassNotFoundException | SQLException e)
        {
               obj.print("Error in FORM " + e);
        }
    
    }
}

