import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet(urlPatterns={"/downloadfolder"})
public class downloadfolder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("APPLICATION/OCTET-STREAM");
        String filename = request.getParameter("filename");
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream("/" + filename);
        response.setHeader("Content-Disposition","attachment;filename=\""+filename+"\"");
        int i;
        while((i=is.read())!=-1)
        {
            out.write(i);
        }
        is.close();
        out.close();
    }
}
