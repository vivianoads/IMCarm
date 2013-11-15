<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>Cadastrar Casa de Missão</title>
		<link href="EstiloCadastroDeIrmas.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					
					<form name="cadastroFormandas" action="/ImCarm/ServletControler?action=9" method="post">	
					<table cellspacing="35" width="590">
						<tr>
							<td colspan="2" align="center"><h3>Cadastrar Casa de Missão</h3></td>
						</tr>
						<tr>
							<td><b>Nome:</b></td> 
							<td> <input size="50" type="text" name="nome" value="${fraternidade.nome}"></td> 								
						</tr>
						<tr>
							<td><b>Data de Fundação:</b></td> 
							<td><input size="10" type="text" name="data_fundacao" maxlength="10" value="${fraternidade.dataFundacao}"></td> 								
						</tr>
						<tr>
							<td><b>Rua:</b></td> 
							<td><input size="50" type="text" name="rua" value="${fraternidade.rua}"></td> 								
						</tr>
						<tr>
							<td><b>Numero:</b></td> 
							<td><input size="5" type="text" name="numero" value="${fraternidade.numeroCasa}"></td> 								
						</tr>
						<tr>
							<td><b>Bairro:</b></td> 
							<td><input size="50" type="text" name="bairro" value="${fraternidade.bairro}"></td> 								
						</tr>
						<tr>
							<td><b>Cidade</b></td> 
							<td><input size="50" type="text" name="cidade" value="${fraternidade.cidade}"></td> 								
						</tr>
						<tr>
							<td><b>Diocese</b></td> 
							<td><input size="50" type="text" name="diocese" value="${fraternidade.diocese}"></td> 								
						</tr>
						<tr>
							<td><b>Bispo</b></td> 
							<td><input size="50" type="text" name="bispo" value="${fraternidade.bispo}"></td> 								
						</tr>
						<tr>
							<td><b>UF</b></td> 
							<td><input size="5" type="text" name="uf" maxlength="2" value="${fraternidade.uf}"></td> 								
						</tr>
						<tr>
							<td><b>ID</b></td> 
							<td>${fraternidade.idFraternidade}</td> 								
						</tr>
						<tr>
							<td><b>Status</b></td> 
							<td>
								<input size="50" type="radio" name="status" value="ativa" checked><b>Ativa</b>
								<input size="50" type="radio" name="status" value="inativa"><b>Inativa</b>
							</td> 								
						</tr>
						
						<tr>
							<td></td>
							<td align = "center">
								<input type=hidden name="dados" value="${fraternidade.idFraternidade}">
								<input type=hidden name="acao" value="salvar">
								<input type="submit" value="Confirmar">
							</td>
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