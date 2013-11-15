
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
							<td>${formandagravada.nome}</td> 								
						</tr>
						<tr>
							<td><b>Nome do Pai:</b></td> 
							<td>${formandagravada.nomePai}</td> 								
						</tr>
						<tr>
							<td><b>Nome da Mãe:</b></td> 
							<td>${formandagravada.nomeMae}</td> 								
						</tr>
						<tr>
							<td><b>Rua:</b></td> 
							<td>${formandagravada.rua}</td> 								
						</tr>
						<tr>
							<td><b>Numero:</b></td> 
							<td>${formandagravada.numeroCasa}</td> 								
						</tr>
						<tr>
							<td><b>Bairro:</b></td> 
							<td>${formandagravada.bairro}</td> 								
						</tr>
						<tr>
							<td><b>Cidade:</b></td> 
							<td>${formandagravada.cidade}</td> 								
						</tr>
						<tr>
							<td><b>Diocese:</b></td> 
							<td>${formandagravada.diocese}</td> 								
						</tr>
						<tr>
							<td><b>UF:</b></td> 
							<td>${formandagravada.uf}</td> 								
						</tr>
						<tr>
							<td><b>ID:</b></td> 
							<td>${formandagravada.idFormanda}</td> 								
						</tr>
						<tr>
							<td><a href="/ImCarm/formcadastraformanda.jsp"><button>Cadastrar Nova Formanda</button></a></td>
							<td><form name="formandaalterar" action="/ImCarm/ServletControler?action=6" method="post">
										<input type=hidden name="dados" value="${formandagravada.idFormanda}">
										<input type=hidden name="acao" value="alterar">
										<input type="submit" value="Alterar esta Formanda">
								</form>
							</td>
						</tr>
						<tr>
							<td></td>
							<td><form name="levaformandaapagar" action="/ImCarm/ServletControler?action=6" method="post">
									<input type=hidden name="dados" value="${formandagravada.idFormanda}">
									<input type=hidden name="acao" value="apagarfinal">
									<input type="submit" value="Apagar Formanda">
								</form>
							</td>
						</tr>
						<tr>
							<td><a href="/ImCarm/cadastrodeformandas.jsp"><button>Retornar ao Menu</button></a></td>
						</tr>
						
						</table>
						
					
					
					</div>			
						
					
				</div>
			
			</div>
			
			<div id="rodape">
			</div>
		
		</div>
		
	</body>

</html>



