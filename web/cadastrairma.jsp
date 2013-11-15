
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
<title>Cadastro de Irmas</title>
<link href="EstiloCadastroDeIrmas.css" rel="stylesheet" type="text/css">
</head>
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					
						
					<table cellspacing="20" width="590">
						<tr>
							<td colspan="2" align="center"><h3>Irmã Cadastrada com Sucesso</h3></td>
						</tr>
						<tr>
							<td><b>Nome Civil:</b></td> 
							<td>${irmagravar.nomeCivil}</td> 								
						</tr>
						<tr>
							<td><b>Nome Religioso:</b></td> 
							<td>${irmagravar.nomeReligioso}</td> 								
						</tr>
						<tr>
							<td><b>Nome do Pai:</b></td> 
							<td>${irmagravar.nomePai}</td> 								
						</tr>
						<tr>
							<td><b>Nome da Mãe:</b></td> 
							<td>${irmagravar.nomeMae}</td> 								
						</tr>
						<tr>
							<td><b>RG:</b></td> 
							<td>${irmagravar.rg}</td> 								
						</tr>
						<tr>
							<td><b>CPF:</b></td> 
							<td>${irmagravar.cpf}</td> 								
						</tr>
						<tr>
							<td><b>Data de Nascimento:</b></td> 
							<td>${irmagravar.dataNascimento}</td> 								
						</tr>
						<tr>
							<td><b>Data - Aspirantado:</b></td> 
							<td>${irmagravar.dataAspirantado}</td> 								
						</tr>
						<tr>
							<td><b>Data - Postulantado:</b></td> 
							<td>${irmagravar.dataPostulantado}</td> 								
						</tr>
						<tr>
							<td><b>Data - Noviciado Canônico:</b></td> 
							<td>${irmagravar.dataNoviciadoCanonico}</td> 								
						</tr>
						<tr>
							<td><b>Data - Profissão Temporária:</b></td> 
							<td>${irmagravar.dataProfissaoTemporaria}</td> 								
						</tr>
						<tr>
							<td><b>Data - Profissão Perpétua:</b></b></td> 
							<td>${irmagravar.dataProfissaoPerpetua}</td> 								
						</tr>
						<tr>
							<td><a href="/ImCarm/CadastroDeIrmas.html"><button>Cadastrar Nova Irmã</button></a></td>
							<td><form name="levairmaalterar" action="/ImCarm/ServletControler?action=3" method="post">
									<input type=hidden name="tipo_consulta" value="cpf">
									<input type=hidden name="dados" value="${irmagravar.cpf}">
									<input type=hidden name="acao" value="alterar">
									<input type="submit" value="Alterar dados">
								</form>
							</td>
						</tr>
						<tr>
							<td></td>
							<td><form name="levairmaapagar" action="/ImCarm/ServletControler?action=4" method="post">
									<input type=hidden name="cpforigem" value="${irmagravar.cpf}">
									<input type=hidden name="acao" value="apagar">
									<input type="submit" value="Apagar Irmã">
								</form>
							</td>
						</tr>
						<tr>
							<td><a href="/ImCarm/cadastrodeirmas.jsp"><button>Retornar ao Menu</button></a></td>
						</tr>
						
						</table>
						
					
					
					</div>			
						
					
				</div>
			
			</div>
			
			<div id="rodape">
			</div>
		
		</div>
		
	</body>
<!-- <body>
	<b>Dados Gravados com Sucesso</b>
	<p> ${irmagravar.cpf} </p>
	<p> ${irmagravar.rg} </p>
	<p> ${irmagravar.nomeCivil} </p>
	<p> ${irmagravar.nomeReligioso} </p>
	<p> ${irmagravar.nomePai} </p>
	<p> ${irmagravar.nomeMae} </p>
	<p> ${irmagravar.dataNascimento} </p>
	<p> ${irmagravar.dataAspirantado} </p>
	<p> ${irmagravar.dataPostulantado} </p>
	<p> ${irmagravar.dataNoviciadoCanonico} </p>
	<p> ${irmagravar.dataProfissaoTemporaria} </p>
	<p> ${irmagravar.dataProfissaoPerpetua} </p>
	<a href="/ImCarm/CadastroDeIrmas.html">Cadastrar Nova Irmã</a> 
	<a href="/ImCarm/alterairma.jsp">Alterar esses dados</a>
	<a href="ImCarm/usuariologado.html">Retornar ao Menu</a>
</body> -->
</html>



