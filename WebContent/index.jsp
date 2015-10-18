<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css\style.css">

<script type="text/javascript"> 
function validar() {
	if(document.formulario.usuario.value==""){
		alert("Usuário não informado");
		return false;
	}
	
	
	if(document.formulario.senha.value==""){
		alert("Senha não informada");
		return false;
	}
	
	document.formulario.submit();
}




</script>	


<title>Acesso</title>
</head>
<body>
<div id="ajustar_tela">
	<form name="formulario"action="Login" method="post">
		<p align="center">
	<table>
	<td> <input type="image" src="images\btnPort.jpg" value="submit" width="30" height="30" id="imgport"> </td>
	 <td> <input type="image" src="images\btnEsp.jpg" value="submit" width="30" height="30"id="imgesp"> </td>
	 <td> <input type="image" src="images\btnIng.jpg" value="submit" width="30" height="30"id="imging"> </td>
	<div id="elem">
	<tr> <td> <label for="senha">Usuário:</label>
		</td><td> <input type="text" name="usuario" class="txt"/> </td> </tr>
		<tr> <td> <label for="senha">Senha:</label>
		</td> <td> <input type="password" name="senha" class="txt"/> </td> </tr>
		<tr> <td> <label for="senha">   </label> </td> 
		<br>
		 <td> <input type='submit' name='login' value='Login' class="btn btn-lg btn-success btn-block"></td> </tr>
		<div>
	</form>
	</table>
</div>
</body>
</html>