import MYbean.AABean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.ejb.EJB;
public class RBServlet extends HttpServlet {
    @EJB AABean obj;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String roomtype = request.getParameter("rt");
        String cust = request.getParameter("cn");
        String mob = request.getParameter("cm");
        String msg = obj.roomBook(roomtype, cust, mob);
        out.println(msg);
    }
}
