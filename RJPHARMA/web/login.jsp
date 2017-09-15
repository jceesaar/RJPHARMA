<%-- 
    Document   : home.jsp
    Created on : 14/09/2017, 20:04:12
    Author     : jcees
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="pg" tagdir="/WEB-INF/tags/" %>
<%@include file="WEB-INF/jspf/conect.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <pg:tagCssTitle message="RJ PHARMA 1.0" />
    </head>
    <body>

        <pg:body subtitulo="Efetue o login" titulo="Sistema RJ PHARMA" />

        <br />
        <br />
        <br />
        <div align="center">
            <%                if (request.getParameter("msg") != null) {
                    out.println("<span style='color:red'>");
                    out.println(request.getParameter("msg"));
                    out.println("</span>");
                }
            %>
            <form name="loginfrm" action="login_validate.jsp" method="POST">
                <table>
                    <tr>
                        <td>Login</td>
                        <td><input type="text" name="login" value="" /> </td>
                    </tr>
                    <tr>
                        <td>Senha</td>
                        <td><input type="password" name="senha" value="" /></td>
                    </tr>
                </table>
                <br />
                <input type="submit" value="Login" />
            </form>
            <br />
            <br />
            <br />

        </div>
        <jsp:include page="WEB-INF/jspf/rodape.jspf" />
    </body>
</html>
