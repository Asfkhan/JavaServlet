import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class storedata extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();     
         try{
            int srno = Integer.parseInt(request.getParameter("srno"));
            String NAME = request.getParameter("NAME");
            String ADDRESS = request.getParameter("ADDRESS");
            String QUALIFICATION = request.getParameter("QUALIFICATION");
            String GENDER = request.getParameter("GENDER");
            int AGE = Integer.parseInt(request.getParameter("AGE"));
            int pass1 = Integer.parseInt(request.getParameter("p1"));

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
            PreparedStatement psmt = con.prepareStatement("insert into password values(?,?,?,?,?,?,?)");
            
            psmt.setInt(1,srno);
            psmt.setString(2,NAME);
            psmt.setInt(3,pass1);
            psmt.setInt(4,AGE);
            psmt.setString(5,ADDRESS);
            psmt.setString(6,QUALIFICATION);
            psmt.setString(7,GENDER);
            int row = psmt.executeUpdate();
            out.println("UPDATED successfull");
            }catch(Exception e){}
            }
    }
            



