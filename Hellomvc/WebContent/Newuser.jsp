
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Login</title>
</head>
<body>

<h1> <u>Formulario del Alto Registro</u> </h1>

<div class="error" style="color:red;">${mensajeerror} </div>

<div>       
<hr>
  <br>
<form action="" method="POST" >

<DIV STYLE="border: 10 px solid red;"></DIV>

<input type="text" placeholder="Set your username" value="${ namerecibido}" name="user" id="username" value= >


<div class="error" style="color:red;">${emailrecibido2} </div><p>
<input type="text" placeholder="Set your email" value="${emailrecibido}" name="email" id="email" ></p>

<p ><input type="password" placeholder="Set yout password" name="password1" id="password" ></p>
<p ><input type="password" placeholder="Repeat yout password" name="password2" id="password" ></p>



<div>
<label>Habitacion a Elegir</label><br>


    <select name="habitacion" id="habitacion"> <br> <br>
   
   
    <c:forEach var="unaHab" items="${lasHabitaciones}">


 <option value="${unaHab.hid}"> Calle: ${unaHab.calle}</option>
			

		    </c:forEach>
    
    
    
    
    
    
    
    
    
    
    
    
</select>
</div>
<!--  

<p ><label>Fecha de nacimiento</label><p><input type="date">

<p ><label>�Eres un pipa?</label><input type="checkbox"  name="password" id="password" ></p>

  <input type="radio" name="gender" value="male"> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other<br>  


 <p> Telephone:<p> <input type="tel" placeholder="phonenumber" name="usrtel" id="phone" name="phone"
       pattern="[0https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/tel-9]{3}-[0-9]{3}-[0-9]{4}"
       ><br>
       
       
        <p> Add your homepage:</p> <input type="url" name="homepage"><br>

  
  
  
  
  <label for="pais"><br>Pais<br></label>

  
  
   -->
 <p><input type="reset" value="Reset"> <button> Enter</button> </p>

 </div>
<div><p></p></div>

</form>



</body>
</html>