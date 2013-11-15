
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
					
					<b>Irmas Adicionadas com Sucesso</b>
					${casa}
					${nomes.isEmpty()}
					<c:choose>
						<c:when test="${nomes != null}">
							<table border="1">
								<thead style="text-align: center;">
									<tr>
										<td>Casa de Missao</td>
										<td>Nome Civil</td>
									</tr>
								</thead>
								<thead>
									<c:forEach items="${nomes}" var="nome">
										<tr>
											<td>${casa}</td>
											<td>${nome}</td>
										</tr>
									</c:forEach>
									<td>
									
									</td>
								</thead>
							</table>
						</c:when>
					</c:choose>					
					<a href="cadastrodecasasdemissao.jsp">Voltar ao Menu</a>
					</div>			
						
					
				</div>
			
			</div>
			
			<div id="rodape">
			</div>
		
		</div>
		
	</body>

</html>



