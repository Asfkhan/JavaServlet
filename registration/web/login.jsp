<%-- 
    Document   : login
    Created on : 26 Sep, 2022, 9:28:12 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<html><body>
<center><h1>Registration JSP Page</h1>
<%
String uname=request.getParameter("t1");
String pass = request.getParameter("t2");
try{
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
PreparedStatement stmt = con.prepareStatement("select password from prac4c_register where username=?");
stmt.setString(1, uname);
ResultSet rs = stmt.executeQuery();
if(rs.next())
{
if(pass.equals(rs.getString(1)))
    {
        out.println("<h1><hr>LOGIN SUCCESSFULLL</h1>");
    }
}
else
    {
        out.println("<h1>User Name not exist !!!!!</h1>");
        %><jsp:include page="index.html" ></jsp:include><%
    }
}catch(Exception e){out.println(e);}
%>
</body></html>
