<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Genera tu nueva habitacion</h1>

<div class="error">${mensajeerror}</div>
<form action="" method="POST" >


<input type="text" placeholder="Set your street" value="${newroom.calle}" name="street" id="street"  > <br><br>

<div class="error">${mensajeerror2}</div>

<input type="text" placeholder="Surface (in square meters)" value="${newroom.metros}" name="Surface" id="Surface"  > 


<br><br>
<button> Enter</button> 
</form>


</body>
</html>