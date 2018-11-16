<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de usuarios</title>
<link href="./CSS/syles.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<section>         
	<h1>Incrustadatos de todos los usuarios</h1>

	<ul>
	
	
		<c:forEach var="unUsuario" items="${losUsuarios}">


			<li><a href="./usuario?id=${unUsuario.id}">
			${unUsuario.id},${unUsuario.name},${unUsuario.email}
			</a></li>

		    </c:forEach>


	</ul>
	</section>
</body>
</html>