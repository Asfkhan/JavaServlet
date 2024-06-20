import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class assignment1c extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            PrintWriter out = response.getWriter();
            int p = Integer.parseInt(request.getParameter("t1"));
            int r = Integer.parseInt(request.getParameter("t2"));
            int n = Integer.parseInt(request.getParameter("t3"));
            int si=0;
            si = p*r*n/100;
            out.println("Simple interest is:" + si);
        
        }catch(Exception e){}
    }

    
}
