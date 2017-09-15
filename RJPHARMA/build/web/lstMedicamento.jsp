<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--VALIDANDO LOGIN;-->
        <%if(session.getAttribute("login")!=null){%>
        <%=session.getAttribute("lgn")%>
        
        <%} else{
            response.sendRedirect("login.jsp?msg='Efetue o login'");
        }%>
        <!--VALIDANDO LOGIN;-->
        
        <sql:setDataSource var="con" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost:3311/pwii"
                           user="root" password="root" />
        <sql:query var="rs" dataSource="${con}">
            select * from usuario;
        </sql:query>
            
        <table border="1">
            <!-- column headers -->
            <tr>
                <c:forEach var="columnName" items="${rs.columnNames}">
                    <th><c:out value="${columnName}"/></th>
                    </c:forEach>
            </tr>
            <!-- column data -->
            <c:forEach var="row" items="${rs.rowsByIndex}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column}"/></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
