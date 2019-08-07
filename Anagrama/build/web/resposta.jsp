<%-- 
    Document   : resposta
    Created on : 26/05/2019, 16:25:23
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
        <jsp:useBean class="pacote.Anagrama" id="verificaAnagrama"></jsp:useBean>
        <%
            String palavra1 = request.getParameter("palavra1");
            String palavra2 = request.getParameter("palavra2");
        %>
        <%=verificaAnagrama.anagrama(palavra1, palavra2)%>
    </body>
</html>
