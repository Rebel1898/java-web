console.log("Hola!");

if(document.getElementById('volver')) document.getElementById('volver').onclick=function(){
	window.history.back();
}

$('#enviaboton').click(function(e){
	e.preventDefault();
	console.log("Validando!!");

	document.querySelectorAll('.error').forEach(elem => {
		elem.classList.add('esconder');
	});

	if(document.getElementById('formy').checkValidity()){
		//enviar;
		document.getElementById('formy').submit();
	}else{
		if(!document.getElementById('email').checkValidity()){
			document.getElementById('emailmal').classList.remove('esconder');
		}

		//verificar el resto campos...incuido password coincidente
	}

	

});