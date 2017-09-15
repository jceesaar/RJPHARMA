<%-- 
    Document   : logout.jsp
    Created on : 14/09/2017, 20:29:45
    Author     : jcees
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saindo...</title>
    </head>
    <body>
         <%
                session.setAttribute("lgn", null);
                session.setAttribute("login", null);
                response.sendRedirect("login.jsp");
         %>
    </body>
</html>
