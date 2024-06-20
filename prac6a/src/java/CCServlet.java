import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import mybeans.CCBean;
import javax.ejb.EJB;

public class CCServlet extends HttpServlet {
@EJB CCBean obj;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    int amt = Integer.parseInt(request.getParameter("amt"));
    if(request.getParameter("type").equals("r2d"))
        {
            out.println("<h1>"+amt+ " Rupees = "+obj.r2Dollar(amt)+" Dollars</h1>");
        }
    if(request.getParameter("type").equals("d2r"))
        {
            out.println("<h1>"+amt+ " Dollors = "+obj.d2Rupees(amt)+" Rupees</h1>");
        }
    }}
    
    
