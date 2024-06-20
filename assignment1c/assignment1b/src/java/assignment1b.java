
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.annotation.*;

public class assignment1b extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            String pm = "";

            for (int i = 1; i < 50; i++) {
                int counter = 0;
                for (int j = i; j >= 1; j--) {
                    if (i % j == 0) {
                        counter = counter + 1;
                    }

                }
                if (counter == 2) {
                    pm = pm + i + " ";
                }
            }
            out.println("Prime number from 1 to 50 are " + pm);

        } catch (Exception e) {
        }
    }

}
