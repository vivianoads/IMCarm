
<%@page contentType="text/html" isErrorPage="true"%>
<html>
	<head>
		<title>Administra��o</title>
	</head>
	<body>
	<b> erro</b>
		<p><%= request.getParameter("mensagemDeErro")%></p>
		<a href="/ImCarm/Home.html"> Voltar � P�gina de Login </a>
		
		${"mensagemDeErro"}
		
	</body>
</html>