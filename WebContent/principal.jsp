

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script language="JavaScript">
	function DataHora() {
		var data = new Date();
		tempo.innerHTML = data;
		setTimeout("DataHora()", 1000)
	}
</script>
<meta charset="UTF-8">

<title>Principal</title>
<link rel="stylesheet" type="text/css" href="css\menu.css" />
<link rel="stylesheet" type="text/css" href="css\modal_tela.css" />
<title>Sistema de Passagens Aéreas</title>
</head>
<body>
<body onload="DataHora()">

	<%
	
	
		String usuario = (String) session.getAttribute("Autenticado");

		if (usuario == null)
			throw new ServletException("Nenhum usuário logado");
		
	
	 int numero = (int)(request.getSession().getAttribute("PerfilAcesso"));	
	 if(numero == 0 ){
	  
	 }
	 
	%>


	<h1>
		Seja Bem vindo:
		<%=usuario%>
	</h1>


	<h2>
		<span id=tempo></span>
	</h2>
<BODY BACKGROUND="images\Boeing.jpg">
	<p align="center">
	<div class="drop">
		<ul class="drop_menu">

			<li><a href='#'>Configurações</a>

				<ul>

					<li><a href="sair.jsp">Sair</a></li>

					<li><a href="trocarusuario.jsp">Trocar Usuário</a></li>

					<li><a href="sobre.jsp">Sobre</a></li>

				</ul></li>

			<li><a href='#'>Voo</a>

				<ul>
					<li><a href="ConsultarVoo.jsp">Consultar
							Voo</a></li>
					<li><a href="RegistrarVoo.jsp ">Registrar Voo</a></li>
					<li><a href="Status.jsp">Situação de Voo</a></li>


				</ul></li>

			<li><a href='#'>Aeronave</a>

				<ul>

					<li><a href="ConsultarAeronave.jsp">Consultar Aeronave</a></li>

					<li><a href="RegistrarAeronave.jsp">Cadastrar Aeronave</a></li>
				</ul></li>

			<li><a href="">Passagens</a>
				<ul>
					<li><a href="ConsultarPassagem.jsp">Consultar Passagem</a></li>

					<li><a href="Checkin.jsp">Checkin</a></li></li>
		</ul>
	</div>
	


	




</body>
</html>