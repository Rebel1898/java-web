<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room page</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h1>Incrustadatos de habitaciones </h1>

<ul>
<li>Habitacion: ${ laHabitacion.hid} </li>
<li>Calle: ${laHabitacion.calle} </li> 
<li>Superficie: ${laHabitacion.metros} </li>


<!--  
		
<c:forEach var="unUsuario" items="${losUsuarios}">
<li><a href="./usuario?id=${unUsuario.id}">
<div>${unUsuario.id},${unUsuario.name},${unUsuario.email}</div>
			</a></li>
*/


		</c:forEach>
	-->










<!--  $.(Requestscope.elUsuario.name) //Y a cambio puedes quitar toda la paja previa.hay que añadir
getters and setters en el modelo.solo dejas la de page language-->


</ul>
</body>
</html>