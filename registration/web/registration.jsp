<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <title>Registration Page</title>
    </head>
    <body>
        <h1><center>Welcome</h1>
        <%
            String uname = request.getParameter("t1");
            String pwd = request.getParameter("t2");
            String cpwd = request.getParameter("t3");
            String email = request.getParameter("t4");
            String ctry = request.getParameter("t5");
            if (uname.equals("Sample")&&pwd.equals("1010")) 
                  {
                    try {
                            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
                            PreparedStatement pd = con.prepareStatement("insert into prac4c_register values(?,?,?,?)");
                            pd.setString(1, uname);
                            pd.setString(2, pwd);
                            pd.setString(3, email);
                            pd.setString(4, ctry);
                            int row = pd.executeUpdate();
                            if (row==1) {
                                    out.println("<h1>Insert completed</h1>");
                                }
                            else
                            {
                                out.println("nhi hua bro kya glti kiya dekhle!");
                                %><jsp:include page="index.html"></jsp:include><%
                            }
                        } catch (Exception e) {out.print(e);}

                        }
            else
                {
                    out.println("<h1><center>WRONG PASSWORD</h1>");
                %><jsp:include page="register.html"></jsp:include><%
                }
        %>
    </body>
</html>
