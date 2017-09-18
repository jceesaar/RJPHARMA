<%-- 
    Document   : validate.jsp
    Created on : 14/09/2017, 20:13:21
    Author     : jcees
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="WEB-INF/jspf/conect.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%      
                String login = request.getParameter("login");
                String sqllogin = "select * from logins where login='"+ request.getParameter("login") +"' and senha='" + request.getParameter("senha") +"'";
                
                ResultSet res = stm.executeQuery(sqllogin);
                if (res.next()) {
                    if (login.equals("admin")){
                    session.setAttribute("lgn", login);
                    session.setAttribute("login", "2");
                    response.sendRedirect("index.jsp");
                    } else {
                    session.setAttribute("lgn", login);
                    session.setAttribute("login", "1");
                    response.sendRedirect("index.jsp");    
                    }
                } else {
                    out.println("Login e Senha incorreta");
                    response.sendRedirect("login.jsp?msg=Senha Incorreta!");
                }
        %>
        
            
    </body>
</html>
