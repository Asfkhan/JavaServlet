import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class logout extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Log out servlet</title></head>");
        out.println("<body>");
        javax.servlet.http.HttpSession hs = request.getSession();
        if(hs!=null)
            hs.invalidate();
        out.println("<h1>You are logout now......</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
