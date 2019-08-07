<%-- 
    Document   : resposta
    Created on : 26/05/2019, 16:54:40
    Author     : rife-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String palindrome = request.getAttribute("palindrome").toString();
        %>    
        <%=palindrome%>
    </body>
</html>
