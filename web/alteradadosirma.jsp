<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>ERRO</title>
		<link href="EstiloErroPage.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					
					<form name="alteradadosirma" action="/ImCarm/ServletControler?action=3" method="post">
					
					<table cellspacing="25" width="500">
						<tr>
							<td colspan="2" > <b>Escolha a forma de busca e informe a Irmã que deseja alterar</b> </td>
							
						</tr>
						<tr>
							<td><b>Forma de Busca</b></td>
							<td><b>CPF ou NOME</b></td>
						</tr>
						
						<tr>
							
							<td><select name="tipo_consulta">
								<option value="cpf" selected >Buscar pelo CPF</option>
								<option value="nome">Buscar pelo NOME</option>
								</select>
								</td>
							<td><input type="text" name="dados"><input type=hidden name="acao" value="alterar"></td>
						</tr>
						
						<tr><td></td><td align="center"><input type="submit" value="Buscar"></td></tr>
						
						<tr><td></td></tr>
						<tr>
							
							<td align="center" colspan="2"> <a href="/ImCarm/cadastrodeirmas.jsp">Retornar para a Página Inicial.</a> </td>
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