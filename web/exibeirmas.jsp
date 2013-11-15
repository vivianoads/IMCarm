
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
<title>Cadastro de Irmas</title>
<link href="ListadeIrmas.css" rel="stylesheet" type="text/css">
</head>
	<body>
	
		<div id="container"> 
			
			<div id="topo">
			
			</div>
			
			<div id="menu">
			
				<div id="login">
				
					<div id="elementos">
					<c:choose>
						<c:when test="${freiras != null}">
							<table border="1">
								<thead style="text-align: center;">
									<tr>
										<td>Nome Civil</td>
										<td>Nome Religioso</td>
										<td>Pai</td>
										<td>Mãe</td>
										<td>RG</td>
										<td>CPF</td>
										<td>Data de Nascimento</td>
										<td>Data do Aspirantado</td>
										<td>Data do Postulantado</td>
										<td>Data do Noviciado Canônico</td>
										<td>Data da Profissão Temporária</td>
										<td>Data da Profissão Perpétua</td>
									</tr>
								</thead>
								<thead>
									<c:forEach items="${freiras}" var="freira">
										<tr>
											<td>${freira.nomeCivil}</td>
											<td>${freira.nomeReligioso}</td>
											<td>${freira.nomePai}</td>
											<td>${freira.nomeMae}</td>
											<td>${freira.rg}</td>
											<td>${freira.cpf}</td>
											<td>${freira.dataNascimento}</td>
											<td>${freira.dataAspirantado}</td>
											<td>${freira.dataPostulantado}</td>
											<td>${freira.dataNoviciadoCanonico}</td>
											<td>${freira.dataProfissaoTemporaria}</td>
											<td>${freira.dataProfissaoPerpetua}</td>
											<td><form name="irmaaapagar" action="/ImCarm/ServletControler?action=3" method="post">
													<input type=hidden name="tipo_consulta" value="cpf">
													<input type=hidden name="dados" value="${freira.cpf}">
													<input type=hidden name="acao" value="alterar">
													<input type="submit" value="Alterar">
												</form>
												<form name="irmaaapagar" action="/ImCarm/ServletControler?action=3" method="post">
													<input type=hidden name="tipo_consulta" value="cpf">
													<input type=hidden name="dados" value="${freira.cpf}">
													<input type=hidden name="acao" value="apagar">
													<input type="submit" value="apagar">
												</form>
											</td>
											
										</tr>
									</c:forEach>
								</thead>
							</table>
						</c:when>
					</c:choose>					
					
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



