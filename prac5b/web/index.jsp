<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Cookie ck = new Cookie("name","ASEEF");
            response.addCookie(ck);
            %>
            <a href="Process.jsp"></a>
            <jsp:include page="printdate.jsp"/>
            <jsp:forward page="printdate.jsp">
            <jsp:param name="name" value="Allahuakbar"/>
            </jsp:forward>
    </body>
</html>
