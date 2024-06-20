import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ShowResult extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
Statement stmt = con.createStatement();ResultSet res = stmt.executeQuery("select ans from quiz");
int count=0,ans=0;
while (res.next()){
    if (res.getString(1).equals(request.getParameter(""+(++ans))))
    {count++;out.println("<center><h1>CORRECT</h1>");}
    else
                {
                out.print("<center><h1>INCORRECT</h1>");
                }
                
            }
            out.println("<h1>YOUR SCORE IS "+count+"</h1>");
        } catch (Exception e) {out.print(e);}
    }
}
