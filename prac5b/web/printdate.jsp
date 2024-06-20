<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
                <center><h1>GOOD MORNING MAM!</h1></center>
                <h1><%out.println("Today is :"+java.util.Calendar.getInstance().getTime());%></h1>
                <%=request.getParameter("name")%>

    </body>
</html>
