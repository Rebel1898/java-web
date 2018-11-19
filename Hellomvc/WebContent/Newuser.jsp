
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Login</title>
<link rel="stylesheet" href="./CSS/syles.css" />
</head>
<body>

<h1> Formulario del Alto Registro </h1>

  <div class="error" style="color:red;">${mensajeerror} </div>

<div>       
<hr>
  <br>
<form action="" method="POST" id="formy" novalidate>
<div STYLE="border: 10 px solid red;"></DIV>


<input required type="text"  id="user1" placeholder="Set your username" value="${ namerecibido}" name="user" id="username"
>

<div  class="error esconder" id="emailmal">Debes introducir un correo válido </div>
<input type="text" placeholder="Set your email" value="${emailrecibido}" name="email" id="email" >

<p ><input type="password" placeholder="Set yout password" name="password1" id="password" ></p>
<p ><input type="password" placeholder="Repeat yout password" name="password2" id="password" ></p>


<div>
<label>Habitacion a Elegir</label><br>


    <select name="habitacion" id="habitacion"> 
   
   
    <c:forEach var="unaHab" items="${lasHabitaciones}">


 <option value="${unaHab.hid}"> Calle: ${unaHab.calle}</option>
			

		    </c:forEach>

</select>
  <a href="./Newroom"> 


<button id="enviaboton" type="button">Create your room!</button>
</a>
</div>





 <p><input type="reset" value="Reset"> <button> Enter</button> </p>
 </form>

 </div>
<div><p></p></div>


    

</body>
<script src="./JS/jquery-3.3.1.min.js"></script>
<script src="./JS/script.js"></script>


</html>