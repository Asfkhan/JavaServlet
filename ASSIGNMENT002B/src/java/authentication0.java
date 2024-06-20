import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASF
 */
public class authentication0 extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try{
            int srno = Integer.parseInt(request.getParameter("srno"));
            String NAME = request.getParameter("NAME");
            int pass1 = Integer.parseInt(request.getParameter("p1"));
            int pass2 = Integer.parseInt(request.getParameter("p2"));
            
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
         PreparedStatement stmt = con.prepareStatement("select NAME from password where NAME=?");
         stmt.setString(1,NAME);
         ResultSet rs = stmt.executeQuery();
         if(rs.next()){
         if(NAME.equals(rs.getString(1)))
         {
             out.println("<h1>********LOGIN SUCCESSFULL**********</h1>");
         }
         }
         else
         {
             out.println("<h1>******USER NAME DOES NOT EXIST******</h1>");
         }
        }catch(Exception e){out.println(e);}
    }
}

