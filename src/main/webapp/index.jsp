<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/cadastraAutor" var="linkCadastraAutorServlet"/>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Casa do Código</title>
</head>
<body>
<h1>Casa do Código</h1>
<h2>Cadastrar Autor</h2>
<br/>

<form action="${linkCadastraAutorServlet}" method="post">
    <label for="fnome">Nome:</label><br>
    <input type="text" id="fnome" name="nome"><br>
    <label for="femail">Email:</label><br>
    <input type="email" id="femail" name="email"><br>

    <input type="submit" value="Salvar" />
</form>
</body>
</html>