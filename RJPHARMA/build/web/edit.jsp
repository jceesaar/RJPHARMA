
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="pg" tagdir="/WEB-INF/tags/" %>
<!DOCTYPE html>
<%@include file="WEB-INF/jspf/conect.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <pg:tagCssTitle message="RJ PHARMA EDIÇÃO" />
    </head>
    <body>
        
        <!--VALIDANDO LOGIN;-->
        <%if(session.getAttribute("login")=="1"){%>
        <table>
            <tr><td>&nbsp;<i>Logado como (ADMINISTRADOR):</i> <b><%=session.getAttribute("lgn")%></b> </td><td> <a href="logout.jsp"><input type="button" value="Sair" /></a></td> <td> <a href="logins"><input type="button" value="ADMINS" /></a></td></tr>
        </table>
        <%} else if(session.getAttribute("login")=="2") {%>
        <table>
            <tr><td>&nbsp;<i>Logado como (USUARIO)</i> <b><%=session.getAttribute("lgn")%></b> </td><td> <a href="logout.jsp"><input type="button" value="Sair" /></a></td></tr>
        </table>
        <%} else {
            response.sendRedirect("login.jsp?msg=Efetue o login!");
        }%>
        <!--VALIDANDO LOGIN;-->
        
        <pg:body banner="VERSÃO 1.0" subtitulo="Formulário para edição de medimento" titulo="MANUTENÇÃO" />
        <%
            String nome = "";
            String valor = "";
            String descr = "";
            int ms = Integer.parseInt(request.getParameter("ms"));
            
            if(request.getParameter("nome")!=null){
            nome = request.getParameter("nome");
            valor = request.getParameter("valor");
            descr = request.getParameter("descr");
            String sql = "Update medicamento set nome='"+ nome +"',valor='" + valor +"',descr='" + descr +"' where ms="+ ms;
           
            int resultado = stm.executeUpdate(sql);
            if(resultado > 0){
                out.println("&nbsp;");
                out.println("<i>Medicamento alterado com sucesso.</i>");
            } else {
                out.println("Ocorreu um erro.");
            }
        } else {
        ResultSet res = stm.executeQuery("select * from medicamento where ms="+ms);
        if(res.next()){
            
                nome = res.getString(2);
                valor = res.getString(3);
                descr = res.getString(4);
                            
        } else {
            out.println("Sem medicamento...");
        }    
                }

        %>
        <br />
        <br />
        <div align="center">
        <form action="edit.jsp" method="get" name="frmUser">
            <table border="1" width="450px" height="150px">
                <tr style="text-align: center;">
                    <td wi>MS:</td>
                    <td><%=ms%><input name="ms" type="hidden" value="<%=ms%>"/></td>
                </tr>
                <tr style="text-align: center;">
                    <td>Nome:</td>
                    <td><input name="nome" type="text" value="<%=nome%>"/></td>
                </tr>
                <tr style="text-align: center;">
                    <td>Valor:</td>
                    <td><input name="valor" type="number" value="<%=valor%>"/></td>
                </tr>
                <tr style="text-align: center;">
                    <td>Descrição:</td>
                    <td><input type="text" name="descr" value="<%=descr%>" /></td> 
                </tr>
            </table>
                <br /> 
                <input type="submit" value="Atualizar" />  <a href='index.jsp'><input type="button" value="Voltar" /></a>
            
        </form>
        </div>
                <br />
                  <br />
                    <br />
                    <jsp:include page="WEB-INF/jspf/rodape.jspf" />
    </body>
</html>
