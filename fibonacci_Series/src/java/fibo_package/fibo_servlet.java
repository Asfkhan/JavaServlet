package fibo_package;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */

public class fibo_servlet extends HttpServlet {
     int n1,n2,n3;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            PrintWriter out = response.getWriter();
             n1 = Integer.parseInt(request.getParameter("t1"));
             n2 = Integer.parseInt(request.getParameter("t2"));
           int count=10;
          out.println(n1 +" "+n2);
           out.println(Fibo(count-2));
           
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    private int Fibo(int count) {
         if(count>0)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " +n3);
            Fibo(count-1);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
