import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author ASF
 */
public class showresult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try{
        
        String opt1 = request.getParameter("opt1");
        String opt2 = request.getParameter("opt2");
        String opt3 = request.getParameter("opt3");
        String opt4 = request.getParameter("opt4");
        String opt5 = request.getParameter("opt5");
        int count=0;
        if(opt1.equals("+"))
                {
                    count++;
                    out.println("<h1>correct</h1>");
                }
        else
        {
            out.println("<h1>Incorrect</h1>");
        }
        if(opt2.equals("+"))
                {
                    count++;
                    out.println("<h1>correct</h1>");
                }
        else
        {
            out.println("<h1>Incorrect</h1>");
        }
        if(opt3.equals("+"))
                {
                    count++;
                    out.println("<h1>correct</h1>");
                }
        else
        {
            out.println("<h1>Incorrect</h1>");
        }
        if(opt4.equals("+"))
                {
                    count++;
                    out.println("<h1>correct</h1>");
                }
        else
        {
            out.println("<h1>Incorrect</h1>");
        }
        if(opt5.equals("+"))
                {
                    count++;
                    out.println("<h1>correct</h1>");
                }
        else
        {
            out.println("<h1>Incorrect</h1>");
        }
            out.println("<h1>Your score is "+count+"</h1>");
     }catch(Exception e){out.println(e);}
    }
    }