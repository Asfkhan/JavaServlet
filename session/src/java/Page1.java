import java.io.*;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.*;
/**
 *
 * @author USER
 */
public class Page1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Page1</title></head>");
        out.println("<body>");
        String uname = request.getParameter("t1");
        out.println("<h1>Welcome "+uname+"</h1>");
        Cookie ck1 = new Cookie("username", uname);
        Cookie ck2 = new Cookie("visit","1");
        response.addCookie(ck1);
        response.addCookie(ck2);
        out.println("<h1><a href=Page2>Click to Visit Page 2</a></h1>");
        out.println("</body>");
        out.println("</html>");}}
