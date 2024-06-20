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
public class welcomeservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
         out.println("<title>Welcome page</title></head>");
         String uname = request.getParameter("t1");
        String psswrd = request.getParameter("t2");
        if (uname.equals("ASEEF")&&psswrd.equals("123")) 
        {
            out.println("<body bgcolor=orange>");
            out.println("<h1><center>!!!welcome aseef!!!</h1>");
            
        }
              
        out.println("</body>");
        out.println("</html>");
        
    }


}
