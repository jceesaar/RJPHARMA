<%-- 
    Document   : tagExemplo
    Created on : 11/08/2017, 15:55:12
    Author     : Rocha
--%>

<%@tag description="Header Pagina" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>
<head>
        <meta charset="UTF-8">
        <title>${message}</title>
        <link rel="stylesheet" href="css/default.css">
</head>