<%@page import="bean.LoginBean"%>
<%@page contentType="text/html" errorPage="erro.jsp"%>

<html>
	<head>
		<title>Administra��o</title>
	</head>
	<body>
			
	<b> cpfFreira </b>	
	
	<p> teste: 	<%= session.getAttribute("usuarioLogado")%> </p>
	${params.usuarioLogado.senha}
	
	</body>
</html>