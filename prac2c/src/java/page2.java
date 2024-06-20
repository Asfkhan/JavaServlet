import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
public class page2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Page2</title></head>");
        HttpSession hs = request.getSession(false);
        out.println("<h1>Welcome on Page no 2</h1>");
        int visit = Integer.parseInt((String)hs.getAttribute("visit"))+1;
        out.println("<h1>You have visited "+visit+" Times</h1>");
        hs.setAttribute("visit",""+ visit);
        out.println("<h1>Your session Id is "+hs.getId()+"</h1>");
        out.println("<h1>You Loged in at "+new java.util.Date(hs.getCreationTime())+"</h1>");
        out.println("<h1><a href=page01>Click on page01</a></h1>");
        out.println("<h1><a href=page3>Click on page3</a></h1>");
        out.println("<h1><a href=page4>Click on page4</a></h1>");
        out.println("<h1><a href=logout>Click to terminate session</a></h1>");
        out.println("</body>");out.println("</html>");}}

