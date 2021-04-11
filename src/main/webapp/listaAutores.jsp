<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP - Lista Autores</title>
</head>
<body>
Lista de autores cadastrados: <br />

<ul>
    <c:forEach items="${autores}" var="autor">
        <li>
            ${autor.nome } - ${autor.email }
        </li>
    </c:forEach>
    <br />
    <a href="index.jsp">Cadastrar novo autor</a>
</ul>
</body>
</html>
