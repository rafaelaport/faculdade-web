<%-- 
    Document   : controle
    Created on : 08/05/2019, 20:52:48
    Author     : 2016101286
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
            int a, b;
            
            a = Integer.parseInt(request.getParameter("n1"));
            b = Integer.parseInt(request.getParameter("n2"));
            
        %>
        
        <jsp:useBean class="operacoes.soma" id="s"></jsp:useBean>
        <%=s.calcular(a, b)%>
            
    </body>
</html>
