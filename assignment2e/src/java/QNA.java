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
public class QNA extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        try  {
         String SRNO = request.getParameter("srno");
         String Q = request.getParameter("ques");
         String option1 = request.getParameter("opt1");
         String option2 = request.getParameter("opt2");
         String option3 = request.getParameter("opt3");
         String option4 = request.getParameter("opt4");
         String ANS = request.getParameter("ans");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
            PreparedStatement psmt = con.prepareStatement("insert into QNA values(?,?,?,?,?,?,?)");
            psmt.setString(1,SRNO);
            psmt.setString(2,Q);
            psmt.setString(3,option1);
            psmt.setString(4,option2);
            psmt.setString(5,option3);
            psmt.setString(6,option4);
            psmt.setString(7,ANS);
            int row = psmt.executeUpdate();
            out.println("successful");
        }catch(Exception e){out.println(e);}
    }
    }

  
    