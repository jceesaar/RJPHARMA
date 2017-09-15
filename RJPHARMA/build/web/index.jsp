<%-- 
    Document   : index
    Created on : 02/08/2017, 21:11:44
    Author     : 10361
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="pg" tagdir="/WEB-INF/tags/" %>
<!DOCTYPE html>
<%@include file="WEB-INF/jspf/conect.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <pg:tagCssTitle message="RJ PHARMA 1.0" />
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
        
        <pg:body subtitulo="Controle de estoque para medicamentos" titulo="Sistema RJ PHARMA" />
        <%            
            if (request.getParameter("ms")!= null) {
                String sqldel = "delete from medicamento where ms=" + request.getParameter("ms");
                int resdel = stm.executeUpdate(sqldel);
                if (resdel > 0) {
                    out.println("&nbsp;");
                    out.println("<i>Medicamento removido com sucesso.</i>");
                } else {
//                    out.println("Ocorreu algum erro, entre em contato com o administrador do sistema.");
                }
            }
        %>

        <jsp:useBean class="beans.FtData" id="data" />
        <!-- O mes atual é <%=data.mesExt(8)%> -->
        <%
            if (request.getParameter("nome") == null) {
        %>
        <br />
        <br />
        <div align="center">
            <h2>CADASTRE UM MEDICAMENTO</h2>
            <br />
            <form action="index.jsp" method="post" name="frmUser">
                <table border="1" width="450px" height="150px">
                    <tr>
                        <td style="text-align: center;">MS:</td>
                        <td style="text-align: center;"><input name="ms" type="text" /></td>
                    </tr>
                    <tr>
                        <td style="text-align: center;">Nome:</td>
                        <td style="text-align: center;"><input name="nome" type="text" /></td>
                    </tr>
                    <tr>
                        <td style="text-align: center;">Preço R$:</td>
                        <td style="text-align: center;"><input name="valor" type="number" /></td>
                    </tr>
                    <tr>
                        <td style="text-align: center;">Descrição</td>
                        <td style="text-align: center;"><input name="descr" type="text" /></td>
                    </tr>
                </table>
                <br />
                <input type="submit" value="Cadastrar" />

            </form>
        </div>
        <%
            } else {
                String ms = request.getParameter("ms");
                String nome = request.getParameter("nome");
                String valor = request.getParameter("valor");
                String descr = request.getParameter("descr");

                String sql = "insert into medicamento(ms, nome, valor, descr) values ('"
                        + ms + "','" + nome + "','" + valor + "','" + descr + "')";
                int res = stm.executeUpdate(sql);
                if (res > 0) {
                    out.println("&nbsp;");
                    out.println("<i>Registro incluido com sucesso.</i>");
                    out.println("<br />");
                    out.println("<br />");
                    out.println("<center><a href='index.jsp'><input type='button' value='Voltar' /></a></center>");

                } else {
                    out.println("Se ferrou");
                }
            }
        %>
        <div align="center">
            <br />
            <h3>Dados cadastrados</h3>
            <br />
            <table border="1" width="650px" height="40px">
                <%
                    ResultSet res = stm.executeQuery("select * from medicamento");
                    out.println("<tr align='center'><td>MS</td><td>MEDICAMENTO</td><td>VALOR</td><td>DESCRIÇÃO</td><td>AÇÃO</td></tr>");
                    if (res.next()) {
                        do {

                            out.println("<tr><td>" + res.getString(1));
                            out.println("</td><td>" + res.getString(2));
                            out.println("</td><td>" + res.getString(3));
                            out.println("</td><td>" + res.getString(4));
                            out.println("</td><td><a href='index.jsp?ms=" + res.getString(1) + "'>REMOVER</a> / <a href='edit.jsp?ms=" + res.getString(1) + "'>EDITAR</a></td></tr>");                
                                                        
                        } while (res.next());
                    } else {
                        out.println("<i>Sem medicamentos cadastrados</i>");
                        out.println("<br />");
                        out.println("<br />");
                    }


                %>
            </table>
        </div>
        <br />
        <br />
        <br />
        <jsp:include page="WEB-INF/jspf/rodape.jspf" />
    </body>
</html>
