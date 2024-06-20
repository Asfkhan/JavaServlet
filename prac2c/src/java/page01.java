import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
public class page01 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Page1</title></head>");
        HttpSession hs = request.getSession(true);
        if(hs.isNew())
        {
        out.println("<body>");
        String name = request.getParameter("t1");
        hs.setAttribute("username",name);
        hs.setAttribute("visit","1");
        out.println("<h1>Welcome for the first time "+name+"</h1>");
        hs.setAttribute("username","" +name);
        }
        else{out.println("<h1>Welcome again</h1>");
            int count = Integer.parseInt((String)hs.getAttribute("visit"))+1;
            hs.setAttribute("visit",""+ count);
            out.println("<h1>You have visited "+count+" Times</h1>");
        }
        out.println("<h1>Your session Id is "+hs.getId()+"</h1>");
        out.println("<h1>You Loged in at "+new java.util.Date(hs.getCreationTime())+"</h1>");
        out.println("<h1><a href=page2>Click on page2</a></h1>");
        out.println("<h1><a href=page3>Click on page3</a></h1>");
        out.println("<h1><a href=page4>Click on page4</a></h1>");
        out.println("<h1><a href=logout>Click to terminate session</a></h1>");
        out.println("</body>");out.println("</html>");}}
    

