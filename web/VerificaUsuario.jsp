
<%@page import="bean.LoginBean"%>
<%@page import="dao.LoginDao"%>
<%@page contentType="text/html" errorPage="Erro.html"%>
<html>
	<head>
		<title> Loga Usuario </title>
	</head>
	<body>
	<jsp:useBean id="usuarioLogado" class="bean.LoginBean" scope="session">
			<jsp:setProperty name="usuarioLogado" property="cpfFreira" param="usuario" />
			<jsp:setProperty name="usuarioLogado" property="senha" param="senha" />
	</jsp:useBean>
	
	<b> cpfFreira </b>	<jsp:getProperty name="usuarioLogado" property="cpfFreira"/>
	<body>
</html>

