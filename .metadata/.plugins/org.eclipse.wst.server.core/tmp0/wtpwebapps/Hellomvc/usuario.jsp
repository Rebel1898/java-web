<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
    <!-- Usuario elUsuario =(Usuario)request.getAttribute("elUsuario") -->
   <!--  $(requestScope.elUsuario) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Abandonad toda esperanza, aquellos que entrais aqui</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h1>Incrustadatos de usuario </h1>

<ul>
<li>Id:${elUsuario.id} </li>
<li>Nombre:${elUsuario.name} </li> 
<li>Email:${elUsuario.email} </li>
<li>Room:<a href="./Room?hid=${elUsuario.room.hid}">${elUsuario.room.hid}</a> </li>

  <a href="./HabitacionServlet?hid=${elusuario.habitacion.hid}">${elusuario.habitacion.hid}</a></li>
	</ul>
 



<!--  $.(Requestscope.elUsuario.name) //Y a cambio puedes quitar toda la paja previa.hay que añadir
getters and setters en el modelo.solo dejas la de page language-->


</ul>
</body>

</html>