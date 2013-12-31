<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Cadastrar Formanda</title>
		<link href="EstiloCadastroDeIrmas.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					
					<form name="cadastroFormandas" action="/ImCarm/ServletControler?action=5" method="post">	
					<table cellspacing="35" width="590">
						<tr>
							<td colspan="2" align="center"><h3>Cadastrar Formanda</h3></td>
						</tr>
						<tr>
							<td><b>Nome Civil:</b></td> 
							<td> <input size="50" type="text" name="nome_civil" ></td> 								
						</tr>
						<tr>
							<td><b>Nome do Pai:</b></td> 
							<td><input size="50" type="text" name="nome_pai"></td> 								
						</tr>
						<tr>
							<td><b>Nome da Mãe:</b></td> 
							<td><input size="50" type="text" name="nome_mae"></td> 								
						</tr>
						<tr>
							<td><b>Rua:</b></td> 
							<td><input size="50" type="text" name="rua"></td> 								
						</tr>
						<tr>
							<td><b>Numero:</b></td> 
							<td><input size="5" type="text" name="numero"></td> 								
						</tr>
						<tr>
							<td><b>Bairro:</b></td> 
							<td><input size="50" type="text" name="bairro"></td> 								
						</tr>
						<tr>
							<td><b>Cidade</b></td> 
							<td><input size="50" type="text" name="cidade"></td> 								
						</tr>
						<tr>
							<td><b>Diocese</b></td> 
							<td><input size="50" type="text" name="diocese"></td> 								
						</tr>
						<tr>
							<td><b>UF</b></td> 
							<td><input size="5" type="text" name="uf" maxlength="2"></td> 								
						</tr>
						<tr>
							<td></td>
							<td align = "center"><input type="submit" value="Confirmar"></td>
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