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
					
					<form name="cadastroIrmas" action="/ImCarm/ServletControler?action=4" method="post">	
					<table cellspacing="35" width="590">
						<tr>
							<td colspan="2" align="center"><h3>Cadastrar Irmã</h3></td>
						</tr>
						<tr>
							<td><b>Nome Civil:</b></td> 
							<td> <input size="50" type="text" name="nome_civil" value="${freiracpf.nomeCivil}" ></td> 								
						</tr>
						<tr>
							<td><b>Nome Religioso:</b></td> 
							<td><input size="50" type="text" name="nome_religioso" value="${freiracpf.nomeReligioso}"></td> 								
						</tr>
						<tr>
							<td><b>Nome do Pai:</b></td> 
							<td><input size="50" type="text" name="nome_pai" value="${freiracpf.nomePai}"></td> 								
						</tr>
						<tr>
							<td><b>Nome da Mãe:</b></td> 
							<td><input size="50" type="text" name="nome_mae" value="${freiracpf.nomeMae}"></td> 								
						</tr>
						<tr>
							<td><b>RG:</b></td> 
							<td><input size="50" type="number" name="rg" value="${freiracpf.rg}"></td> 								
						</tr>
						<tr>
							<td><b>CPF:</b></td> 
							<td><input size="50" type="number" name="cpf" value="${freiracpf.cpf}"></td> 								
						</tr>
						<tr>
							<td><b>Data de Nascimento:</b></td> 
							<td><input type="text" name="data_nascimento" maxlength="10" value="${freiracpf.dataNascimento}"></td> 								
						</tr>
						<tr>
							<td><b>Data - Aspirantado</b></td> 
							<td><input type="text" name="data_aspirantado" maxlength="10" value="${freiracpf.dataAspirantado}"></td> 								
						</tr>
						<tr>
							<td><b>Data - Postulantado</b></td> 
							<td><input type="text" name="data_postulantado" maxlength="10" value="${freiracpf.dataPostulantado}"></td> 								
						</tr>
						<tr>
							<td><b>Data - Noviciado Canônico</b></td> 
							<td><input type="text" name="data_noviciado" maxlength="10" value="${freiracpf.dataNoviciadoCanonico}"></td> 								
						</tr>
						<tr>
							<td><b>Data - Profissão Temporária</b></td> 
							<td><input type="text" name="data_profissao_temporaria" maxlength="10" value="${freiracpf.dataProfissaoTemporaria}"></td> 								
						</tr>
						<tr>
							<td><b>Data - Profissão Perpétua</b></b></td> 
							<td><input type="text" name="data_profissao_perpetua" maxlength="10" value="${freiracpf.dataProfissaoPerpetua}"></td> 								
						</tr>
						<tr>
							<td><input type=hidden name="cpforigem" value="${freiracpf.cpf}"><input type=hidden name="acao" value="alterar"></td>
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