
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
						<form name="lista de Irmas" action="SalvarIrmasParaAdicioarACasasDeMissao" method="post">
							<table border="1">
								<thead style="text-align: center;">
									<tr>
										<td>Selecione Irmas para adicionar à Casa de Missão id: ${fraternidadeaadicionarirmas}</td>
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
											<td><input type="checkbox" name="irmas" value="${freira.cpf}"></td>
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
											
											
										</tr>
									</c:forEach>
									<td>
											
									<input type="submit" value="Confirmar">
									</form>
									</td>
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

</html>



