package ejb1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.ejb.EJB;
@WebServlet(name="ejb3",urlPatterns={"/ejb3"})
public class ejb3 extends HttpServlet {
    singleton counterBean;
    @EJB
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
    try{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("No of HITS "+counterBean.gethits());
        
    } catch(Exception e){}
    }
}
