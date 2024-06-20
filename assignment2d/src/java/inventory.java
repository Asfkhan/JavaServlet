import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class inventory extends HttpServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        try  {
         String course = request.getParameter("t1");
         int SEM = Integer.parseInt(request.getParameter("t2"));
         String subject = request.getParameter("t3");
         int prize = Integer.parseInt(request.getParameter("t4"));
         int QTY = Integer.parseInt(request.getParameter("t5"));
           
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
            PreparedStatement psmt = con.prepareStatement("insert into asfbookshop values(?,?,?,?,?)");
            psmt.setString(1,course);
            psmt.setInt(2,SEM);
            psmt.setString(3,subject);
            psmt.setInt(4,prize);
            psmt.setInt(5,QTY);
            int row = psmt.executeUpdate();
            out.println("ADDED IN DATABASE");
        }catch(Exception e){out.println(e);}
    }
    }

  