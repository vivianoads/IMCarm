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
							<td><a href="/ImCarm/formcadastracasademissao.jsp"><img src="IconeAdicionarCasasdeMissao.png"></a></td> 
							<td><a href="/ImCarm/ServletControler?action=10"><img src="IconeAlterarDadosCasasdeMissao.png"></a></td> 
							<td><a href="/ImCarm/ServletControler?action=10"><img src="IconeApagarCasasdeMissao.png"></a></td> 
												
						</tr>
						<tr>
							<td><a href="/ImCarm/ExibeCasasDeMissaoParaAdicionarIrmas"><!--<img src="IconeAdicionarIrmas.png">--></a></td> 
							<td><a href="/ImCarm/#"><!--<img src="IconeTransferirIrmas.png">--></a></td> 
							<td></td> 
						</tr>
						<tr>
							<td><a href="/ImCarm/#"><!--<img src="IconeAdicionarCoordenacao.png">--></a></td> 
							<td><a href="/ImCarm/#"><!--<img src="IconeAlterarDadosDeCoordenacao.png">--></a></td> 
							<td></td> 
						<tr>
						</table>
					</div>			
						
					
				</div>
			
			</div>
			
			<div id="rodape">
			</div>
		
		</div>
		
	</body>
</html>