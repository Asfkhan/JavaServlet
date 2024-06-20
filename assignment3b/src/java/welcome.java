import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author USER
 */
public class welcome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>LOGIN PAGE</title></head>");
        String uname = request.getParameter("t1");
        String pwd = request.getParameter("t2");
        if (uname.equals("asF")&&pwd.equals("111")) 
        {
            RequestDispatcher rd = request.getRequestDispatcher("abc");
            rd.forward(request, response);
        }
        else
        {
            out.println("<body bgcolor=red>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
            out.println("<h1><hr>!!!!LOGin fAILEd retRY!!!!</hr></h1>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
