import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author USER
 */
public class loginpage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println( "<title>LOGIN PAGE</title></head>");
        String uname = request.getParameter("t1");
        String pswd= request.getParameter("t2");
        if (uname.equals("Asf")&&pswd.equals("123"))
        {
            RequestDispatcher rd = request.getRequestDispatcher("welcome");
            rd.forward(request,response);
        }
        else
        {
            out.println("<body>");out.println("<h1>LOGIN FAILLL!!!!!!!!!</h1>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
            out.println("</body>");out.println("</html>");}}
