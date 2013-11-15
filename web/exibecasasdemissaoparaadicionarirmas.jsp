
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
<title>Escolha da Fraternidade</title>
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
						<c:when test="${fraternidades != null}">
							<table border="1">
								<thead style="text-align: center;">
									<tr><td>Escolha a Casa na qual deseja adicionar Irmãs</td>
										<td>ID</td>
										<td>Nome</td>
										<td>Data de Fundação</td>
										<td>Rua</td>
										<td>Numero</td>
										<td>Bairro</td>
										<td>Cidade</td>
										<td>Diocese</td>
										<td>Bispo</td>
										<td>UF</td>
										<td>Status</td>
									</tr>
								</thead>
								<thead>
									<c:forEach items="${fraternidades}" var="fraternidade">
										<tr>
											<td>${fraternidade.idFraternidade}</td>
											<td>${fraternidade.nome}</td>
											<td>${fraternidade.dataFundacao}</td>
											<td>${fraternidade.rua}</td>
											<td>${fraternidade.numeroCasa}</td>
											<td>${fraternidade.bairro}</td>
											<td>${fraternidade.cidade}</td>
											<td>${fraternidade.diocese}</td>
											<td>${fraternidade.bispo}</td>
											<td>${fraternidade.uf}</td>
											<td>${fraternidade.status}</td>
											<td><form name="fraternidadeparaadicionarirma" action="/ImCarm/SalvaACasasDeMissaoParaAdicioarIrmas" method="post">
													<input type=hidden name="dados" value="${fraternidade.idFraternidade}">
													<input type=hidden name="acao" value="selecionar">
													<input type="submit" value="Selecionar">
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
</html>



