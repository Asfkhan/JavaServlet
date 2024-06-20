import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class assignment1d extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            PrintWriter out = response.getWriter();
            double a = Integer.parseInt(request.getParameter("t1"));
            double b = Integer.parseInt(request.getParameter("t2"));
            double c = Integer.parseInt(request.getParameter("t3"));
            double d,r1,r2 = 0;
            d = (b*b)-(4*a*c);
            if(d==0)
                {
                    out.println("Roots are real and equal");
                    r1=r2= -b/(2*a);
                    out.println("R1= "+r1);
                    out.println("R2= "+r2);
                }
            else if(d>0)
                {   
                    out.println("Roots are real and Distinct");
                    r1 = (-b + Math.sqrt(d))/(2*a);
                    r2 = (-b - Math.sqrt(d))/(2*a);
                    out.println("R1= "+r1);
                    out.println("R2= "+r2);
                }
            else
            {
                out.println("Roots are distinct and imagenery");
                double x = -b / (2*a);
                double y = Math.sqrt(-d) / (2*a);
                out.println("R1= " + x + " +i " +y);
                out.println("R2= " + x + " -i " +y);
                
            }
        }catch(Exception e){}
    }

    
}
