import java.io.*;
import java.sql.DriverManager;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class QuizServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<form action=ShowResult>");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false", "root", "mittal123");
Statement stmt = con.createStatement();
ResultSet res = stmt.executeQuery("select * from quiz");
out.println("<table border=1>");
int qno=0;
while (res.next()){
    qno++;out.println("<tr><td>"+res.getString(1)+"</td>");out.println("<td>"+res.getString(2)+"</td>");
    out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(3)+"></td><td>"+res.getString(3)+"</td></tr>");
    out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(4)+"></td><td>"+res.getString(4)+"</td></tr>");
    out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(5)+"></td><td>"+res.getString(5)+"</td></tr>");
    out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(6)+"></td><td>"+res.getString(6)+"</td></tr>");}
    } catch (Exception e) {out.print(e);}out.println("</table>");out.println("<input type=reset>");
    out.println("<input type=submit value=SUBMIT>");out.println("</form>");
    }
}
