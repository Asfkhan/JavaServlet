<%-- 
    Document   : validate
    Created on : 24 Sep, 2022, 4:11:36 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="mypack.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" scope="request" class="mypack.CheckerBean">
            <jsp:setProperty name="obj" property="*"/>
            </jsp:useBean>
            <%if(obj.validate()){%>
            <jsp:forward page="successful.jsp"/>
            <%} else{%>
            <jsp:include page="index.html"/>
                <%}%>
                <%=obj.getError()%>
                
    </body>
</html>

