<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Cadastrar Irmã</title>
		<link href="EstiloCadastroDeIrmas.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					
					<form name="cadastroIrmas" action="/ImCarm/ServletControler?action=6" method="post">	
					<table cellspacing="35" width="590">
						<tr>
							<td colspan="2" align="center"><h3>Cadastrar Formanda</h3></td>
						</tr>
						<tr>
							<td><b>Nome Civil:</b></td> 
							<td> <input size="50" type="text" name="nome_civil" value="${formanda.nome}" ></td> 								
						</tr>
						<tr>
							<td><b>Nome do Pai:</b></td> 
							<td><input size="50" type="text" name="nome_pai" value="${formanda.nomePai}"></td> 								
						</tr>
						<tr>
							<td><b>Nome da Mãe:</b></td> 
							<td><input size="50" type="text" name="nome_mae" value="${formanda.nomeMae}"></td> 								
						</tr>
						<tr>
							<td><b>Rua:</b></td> 
							<td><input size="50" type="text" name="rua" value="${formanda.rua}"></td> 								
						</tr>
						<tr>
							<td><b>Numero:</b></td> 
							<td><input size="5" type="text" name="numero" value="${formanda.numeroCasa}"></td> 								
						</tr>
						<tr>
							<td><b>Bairro:</b></td> 
							<td><input size="50" type="text" name="bairro" value="${formanda.bairro}"></td> 								
						</tr>
						<tr>
							<td><b>Cidade:</b></td> 
							<td><input size="50" type="text" name="cidade" value="${formanda.cidade}"></td> 								
						</tr>
						<tr>
							<td><b>Diocese:</b></td> 
							<td><input size="50" type="text" name="diocese" value="${formanda.diocese}"></td> 								
						</tr>
						<tr>
							<td><b>UF:</b></td> 
							<td><input size="5" type="text" name="uf" maxlength="2" value="${formanda.uf}"></td> 								
						</tr>
						<tr>
							<td><input type=hidden name="dados" value="${formanda.idFormanda}"><input type=hidden name="acao" value="salvar"></td>
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