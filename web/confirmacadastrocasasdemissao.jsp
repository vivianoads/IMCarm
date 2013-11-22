
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
        <title>Cadastro de Casa de Missão</title>
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
                                <td colspan="2" align="center"><h3>Casa de Missão Cadastrada com Sucesso</h3></td>
                            </tr>
                            <tr>
                                <td><b>Nome:</b></td> 
                                <td>${fraternidadebean.nome}</td> 								
                            </tr>
                            <tr>
                                <td><b>Data de Fundação:</b></td> 
                                <td>${fraternidadebean.dataFundacao}</td> 								
                            </tr>
                            <tr>
                                <td><b>Rua:</b></td> 
                                <td>${fraternidadebean.rua}</td> 								
                            </tr>
                            <tr>
                                <td><b>Numero:</b></td> 
                                <td>${fraternidadebean.numeroCasa}</td> 								
                            </tr>
                            <tr>
                                <td><b>Bairro:</b></td> 
                                <td>${fraternidadebean.bairro}</td> 								
                            </tr>
                            <tr>
                                <td><b>Cidade:</b></td> 
                                <td>${fraternidadebean.cidade}</td> 								
                            </tr>
                            <tr>
                                <td><b>Diocese:</b></td> 
                                <td>${fraternidadebean.diocese}</td> 								
                            </tr>
                            <tr>
                                <td><b>Bispo:</b></td> 
                                <td>${fraternidadebean.bispo}</td> 								
                            </tr>
                            <tr>
                                <td><b>UF:</b></td> 
                                <td>${fraternidadebean.uf}</td> 								
                            </tr>
                            <tr>
                                <td><b>Status:</b></td> 
                                <td>${fraternidadebean.status}</td> 								
                            </tr>
                            <tr>
                                <td>ID</td>
                                <td>${fraternidadebean.idFraternidade}</td>
                            </tr>
                            <tr>
                                <td><a href="/ImCarm/formcadastracasademissao.jsp"><button>Cadastrar Casa de Missão</button></a></td>
                                <td><form name="fraternidadealterar" action="/ImCarm/ServletControler?action=9" method="post">
                                        <input type=hidden name="dados" value="${fraternidadebean.idFraternidade}">
                                        <input type=hidden name="acao" value="alterar">
                                        <input type="submit" value="Alterar">
                                    </form>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><form name="levafraternidadeapagar" action="/ImCarm/ServletControler?action=9" method="post">
                                        <input type=hidden name="dados" value="${fraternidadebean.idFraternidade}">
                                        <input type=hidden name="acao" value="apagarfinal">
                                        <input type="submit" value="Apagar Casa de Missão">
                                    </form>
                                </td>
                            </tr>
                            <tr>
                                <td><a href="/ImCarm/cadastrodecasasdemissao.jsp"><button>Retornar ao Menu</button></a></td>
                            </tr>
                        </table>
                    </div> 
                </div>
                <div id="rodape">
                </div>
            </div>
        </div>
    </body>
</html>