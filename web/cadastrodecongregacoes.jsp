<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Bem Vindo</title>
		<link href="EstiloUsuarioLogado.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					
						
					<table cellspacing="37" width="780">
						<tr>
							<td>Seja Bem Vindo ${usuarioLogado.cpfFreira}</td>
						</tr>
						<tr>
							<td><a href="/ImCarm/#"><img src="IconeAdicionarCongregacoes.png"></a></td> 
							<td><a href="/ImCarm/#"><img src="IconeAlterarDadosCongregacoes.png"></a></td> 
							<td><a href="/ImCarm/#"><img src="IconeApagarCongregacoes.png"></a></td> 
												
						</tr>
						
						</table>
					</div>			
						
					
				</div>
			
			</div>
			
			<div id="rodape">
			</div>
		
		</div>
		
	</body>
</html>