<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Login</title>
</head>
<body>

<h1> Formulario </h1>

<div class="error" style="color:red;">${error} </div>

<div>       
  
<form action="" method="POST" >

<input type="text" placeholder="email" name="email" id="email" required>
<p ><input type="password" placeholder="password" name="password" id="password" required></p>
 </div>
<div><p><button> Enter</button></p></div>

</form>



</body>
</html>