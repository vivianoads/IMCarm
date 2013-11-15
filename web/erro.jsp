
<%@page contentType="text/html" isErrorPage="true"%>
<html>
	<head>
		<title>Administração</title>
	</head>
	<body>
	<b> erro</b>
		<p><%= request.getParameter("mensagemDeErro")%></p>
		<a href="/ImCarm/Home.html"> Voltar à Página de Login </a>
		
		${"mensagemDeErro"}
		
	</body>
</html>