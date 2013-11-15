
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
						<c:when test="${formandas != null}">
							<table border="1">
								<thead style="text-align: center;">
									<tr>
										<td>ID</td>
										<td>Nome Civil</td>
										<td>Pai</td>
										<td>Mãe</td>
										<td>Rua</td>
										<td>Numero</td>
										<td>Bairro</td>
										<td>Cidade</td>
										<td>Diocese</td>
										<td>UF</td>
									</tr>
								</thead>
								<thead>
									<c:forEach items="${formandas}" var="formanda">
										<tr>
											<td>${formanda.idFormanda}</td>
											<td>${formanda.nome}</td>
											<td>${formanda.nomePai}</td>
											<td>${formanda.nomeMae}</td>
											<td>${formanda.rua}</td>
											<td>${formanda.numeroCasa}</td>
											<td>${formanda.bairro}</td>
											<td>${formanda.cidade}</td>
											<td>${formanda.diocese}</td>
											<td>${formanda.uf}</td>
											<td><form name="formandaalterar" action="/ImCarm/ServletControler?action=6" method="post">
													<input type=hidden name="dados" value="${formanda.idFormanda}">
													<input type=hidden name="acao" value="alterar">
													<input type="submit" value="Alterar">
												</form>
												<form name="formandaapagar" action="/ImCarm/ServletControler?action=6" method="post">
													<input type=hidden name="dados" value="${formanda.idFormanda}">
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
</html>



