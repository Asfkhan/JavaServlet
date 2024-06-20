import javax.servlet.RequestDispatcher;
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
public class loginservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Servlet login page</title></head>");
        String uname = request.getParameter("t1");
        String psswrd = request.getParameter("t2");
        if(uname.equals("ASEEF")&&psswrd.equals("123"))
        {
            RequestDispatcher rd = request.getRequestDispatcher("welcomeservlet");
            rd.forward(request, response);
        }
        else
        {
            out.println("<body bgcolor=red>");
            out.println("<h1>Login Fail!!!!</h1>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
        out.println("</body>");
        out.println("</html>");
    }
}
