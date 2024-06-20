import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
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
        out.println( "<title>WELCOME PAGE</title></head>");
        String uname = request.getParameter("t1");
        String pswd= request.getParameter("t2");
        if (uname.equals("Asf")&&pswd.equals("123"))
        {
             out.println("<body>");
            out.println("<h1><center>!!!!!!!!!WElCOME ASF!!!!!!!!!</h1>");
           
        }
        out.println("</body>");
        out.println("</html>");
    }

}
