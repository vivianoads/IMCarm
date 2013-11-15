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
							<td><a href="/ImCarm/ServletControler?action=11"><button>SAIR</button></a></td>
						</tr>
						<tr>
							<td><a href="/ImCarm/cadastrodecasasdemissao.jsp"> <img src="IconeCadastrarCasaDeMissao.png"> </a></td> 
							<td><a href="/ImCarm/cadastrodecongregacoes.jsp"><img src="IconeCadastrarCongregacao.png"></a></td> 
							<td><a href="/ImCarm/cadastrodeformandas.jsp"><img src="IconeCadastrarFormandas.png"></a></td> 
												
						</tr>
						
						</table>
						<table cellspacing="57" width="780">
						<tr>
							<td align="center"><a href="/ImCarm/cadastrodeirmas.jsp"><img src="IconeCadastrarFreiras.png"></a></td> 
							<td align="center"><a href="/ImCarm/#"><img src="IconeRealizarBuscasNoSistema.png"></a></td>
						</tr>
						<tr>
						</tr>
					
					</table>
					</form>
					</div>			
						
					
				</div>
			
			</div>
			
			<div id="rodape">
			</div>
		
		</div>
		
	</body>
</html>