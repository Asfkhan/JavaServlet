import java.io.*;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.*;
/**
 *
 * @author USER
 */
public class Page2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  PrintWriter out = response.getWriter();
        out.println("<html><head><title>Page2</title></head>");
        out.println("<body>");
        Cookie[] ck = request.getCookies();
        for(int i=0;i<ck.length;i++)
            if(ck[i].getName().equals("visit"))
            {
            int count = Integer.parseInt(ck[i].getValue())+1;
            out.println("<h1>Visit No:"+count+"</h1>");
            ck[i] = new Cookie("visit", count+"");
            response.addCookie(ck[i]);
            }
        else
            {
            out.println(ck[i].getName()+"="+ck[i].getValue());
            out.println("</body>");
            out.println("</html>");
            }}}