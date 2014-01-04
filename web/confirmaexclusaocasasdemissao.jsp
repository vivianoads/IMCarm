
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
        <title>Cadastro de Casa de Missão</title>
        <link href="EstiloConfirmaexclusaoDeCasasDeMissao.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="container"> 
            <div id="topo">
                <div id="conteudo_topo">
                    <img src="informatize_logo_system.png">
                </div>
                <div id="user_options">
                    Usuario Logado: 
                    <br/>
                    [ ${usuarioLogado.nomeCivil} ] 
                    <br/>
                    <br/>
                    <button class="i2Style_logout"> Sair</button>
                </div>
            </div>
            <div id="centro">
                <div id="conteudo_centro">
                    <div id="menu">
                        <div id="conteudo_menu">
                            <div id="linha_menu_escolhida">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="12">
                                    <!--<input type=hidden name="next_url" value="cadastrodecasasdemissao.jsp">-->
                                    <input type="image" src="IconeCadastrarCasaDeMissao.png">
                                </form>
<!--                                <a href="/ImCarm_2.0/cadastrodecasasdemissao.jsp">
                                    <img src="IconeCadastrarCasaDeMissao.png">
                                </a>-->
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="29">
                                    <input type="image" src="IconeCadastrarCongregacao.png">
                                </form>
<!--                                <a href="/ImCarm_2.0/cadastrodecongregacoes.jsp">
                                    <img src="IconeCadastrarCongregacao.png">
                                </a>-->
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="34">
                                    <input type="image" src="IconeCadastrarFormandas.png">
                                </form>
<!--                                <a href="/ImCarm_2.0/cadastrodeformandas.jsp">
                                    <img src="IconeCadastrarFormandas.png">
                                </a>-->
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="35">
                                    <input type="image" src="IconeCadastrarFreiras.png">
                                </form>
<!--                                <a href="/ImCarm_2.0/cadastrodeirmas.jsp">
                                    <img src="IconeCadastrarFreiras.png">
                                </a>-->
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="83">
                                    <input type="image" src="IconeRealizarBuscasNoSistema.png">
                                </form>
<!--                                <a href="/ImCarm/#">
                                    <img src="IconeRealizarBuscasNoSistema.png">
                                </a>-->
                            </div>
                        </div>
                    </div>
                    <div id="funcionalidade">
                        <div id="conteudo_funcionalidade">
                            <h3 align="center">Fraternidade Excluída com Sucesso</h3>
                            <b>Nome:</b>
                            <b>${fraternidadebean.nome}</b>
                            <br/>
                            <b>Data de Fundação:</b> 
                            <b>${fraternidadebean.dataFundacao}</b>
                            <br/>
                            <br/>
                            <b>Rua:</b>
                            <b>${fraternidadebean.rua}</b>
                            <br/>
                            <b>Numero:</b>
                            <b>${fraternidadebean.numeroCasa}</b>
                            <br/>
                            <br/>
                            <b>Bairro:</b>
                            <b>${fraternidadebean.bairro}</b>
                            <br/>
                            <b>Cidade:</b>
                            <b>${fraternidadebean.cidade}</b>
                            <br/>
                            <br/>
                            <b>CEP:</b>
                            <b>${fraternidadebean.cep}</b>
                            <br/>
                            <b>UF:</b>
                            <b>${fraternidadebean.uf}</b>
                            <br/>
                            <br/>
                            <b>Telefone:</b>
                            <b>${fraternidadebean.telefone}</b>
                            <br/>
                            <b>Email:</b>
                            <b>${fraternidadebean.email}</b>
                            <br/>
                            <br/>
                            <b>Diocese</b>
                            <b>${fraternidadebean.diocese}</b>
                            <br/>
                            <b>Bispo</b>
                            <b>${fraternidadebean.bispo}</b>
                            <br/>
                            <b>Status</b>
                            <b>${fraternidadebean.status}</b>
                            <br/>
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="nome" value="${fraternidadebean.nome}">
                                        <input type="hidden" name="data_fundacao" maxlength="10" value="${fraternidadebean.dataFundacao}">
                                        <input type="hidden" name="rua" value="${fraternidadebean.rua}">
                                        <input type="hidden" name="numero" value="${fraternidadebean.numeroCasa}">
                                        <input type="hidden" name="bairro" value="${fraternidadebean.bairro}">
                                        <input type="hidden" name="cidade" value="${fraternidadebean.cidade}">
                                        <input type="hidden" name="cep" value="${fraternidadebean.cep}">
                                        <input type="hidden" name="uf" maxlength="2" value="${fraternidadebean.uf}">
                                        <input type="hidden" name="telefone" value="${fraternidadebean.telefone}">
                                        <input type="hidden" name="email" value="${fraternidadebean.email}">
                                        <input type="hidden" name="diocese" value="${fraternidadebean.diocese}">
                                        <input type="hidden" name="bispo" value="${fraternidadebean.bispo}">
                                        <input type="hidden" name="status" value="${fraternidadebean.status}">
                                        <input type="hidden" name="action" value="8">
                                        <input type="submit" class="i2Style_apagar" value="Reverter Exclusão">
                                    </form>
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="15">
                                        <input type="hidden" name="id_fraternidade" value="${fraternidadebean.idFraternidade}">
                                        <input type="submit" class="i2Style" value="Confirmar Exclusão">
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>













        <!--        <div id="container">
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
                                        <td><b>CEP:</b></td> 
                                        <td>${fraternidadebean.cep}</td> 								
                                    </tr>
                                    <tr>
                                        <td><b>Email:</b></td> 
                                        <td>${fraternidadebean.email}</td> 								
                                    </tr>
                                    <tr>
                                        <td><b>telefone:</b></td> 
                                        <td>${fraternidadebean.telefone}</td> 								
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
                </div>-->
    </body>
</html>