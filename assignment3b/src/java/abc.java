import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class abc extends HttpServlet {
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>WELCOME PAGE</title></head>");
        String uname = request.getParameter("t1");
        String pwd = request.getParameter("t2");
        if (uname.equals("asF")&&pwd.equals("111")) 
        {
            out.println("<body bgcolor=skyblue>");
            out.println("<h1><center>!!!!HELLO!!!!</center></h1>");
            
        }
        out.println("</body>");
        out.println("</html>");
    }
}
