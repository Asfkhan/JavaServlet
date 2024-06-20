<%-- 
    Document   : Intrincic_object_Using_JSP
    Created on : 8 Oct, 2022, 2:21:56 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
       <center><h1>USE OF INTRINSIC OBJECT IN JSP</h1></center>
       <center><h1>Request Object </h1>
       Query String <%=request.getQueryString() %><br>
    Context Path <%=request.getContextPath() %><br>
    Remote Host <%=request.getRemoteHost() %><br>
    
    <center> <h1>Response Object </h1>
    Character Encoding Type <%=response.getCharacterEncoding() %><br>
    Content Type <%=response.getContentType() %><br>
    Locale <%=response.getLocale() %><br>
    
    <center> <h1>Session Object </h1>
    ID <%=session.getId() %><br>
    Creation Time <%=new java.util.Date(session.getCreationTime()) %><br>
    Last Access Time<%=new java.util.Date(session.getLastAccessedTime()) %><br>
    </body>
</html>
