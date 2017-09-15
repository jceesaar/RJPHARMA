<%-- 
    Document   : topo
    Created on : 11/08/2017, 15:59:18
    Author     : Rocha
--%>

<%@tag description="tag body" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="titulo"%>
<%@attribute name="subtitulo"%>
<%@attribute name="banner"%>

<%-- any content can be specified here e.g.: --%>
<header>
        <h1>${titulo}</h1>
        <h2>${subtitulo}</h2>
        
        <p>
        Versão 1.0<br />
        Última Atualização: 15/09/2017<br />
        Detalhe da Atualização:<BR />
        DB Login System + Privilegy System.<br />
        <br />
        Próximo Patch:<br />
        - <i>Static WebService</i> <b>(90%)</b><br />
        - <i>DB WebService</i> <b>(0%)</b><br />
        - <i>Sistema de consumo do WebService</i> <b>(0%)</b><br />        
        </p>
</header>