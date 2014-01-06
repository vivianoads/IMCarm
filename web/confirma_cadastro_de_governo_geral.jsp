<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_confirma_cadastro_de_governo_geral.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="12">
                                    <!--<input type=hidden name="next_url" value="cadastrodecasasdemissao.jsp">-->
                                    <input type="image" src="IconeCadastrarCasaDeMissao.png">
                                </form>
<!--                                <a href="/ImCarm_2.0/cadastrodecasasdemissao.jsp">
                                    <img src="IconeCadastrarCasaDeMissao.png">
                                </a>-->
                            </div>
                            <div id="linha_menu_escolhida">
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

                            <h3 align="center">Governo Geral Cadastrado com Sucesso</h3>
                            <h5>${error_message}</h5>
                            <br/>
                                <b>Madre Geral:</b> 
                                ${governo_geral.madreGeral.nomeReligioso}
                                <br/>
                                <br/>
                                <b>Vice Geral:</b> 
                                ${governo_geral.viceGeral.nomeReligioso}
                                <br/>
                                <b>Economa Geral:</b> 
                                ${governo_geral.economaGeral.nomeReligioso}
                                <br/>
                                <b>Secretária Geral:</b> 
                                ${governo_geral.secretariaGeral.nomeReligioso}
                                <br/>
                                <b>Conselheira Titular [1]:</b> 
                                ${governo_geral.conselheirasTitulares[0].nomeReligioso}
                                <br/>
                                <b>Conselheira Titular [2]:</b> 
                                ${governo_geral.conselheirasTitulares[1].nomeReligioso}
                                <br/>
                                <b>Conselheira Titular [3]:</b> 
                                ${governo_geral.conselheirasTitulares[2].nomeReligioso}
                                <br/>
                                <b>Conselheira Titular [4]:</b> 
                                ${governo_geral.conselheirasTitulares[3].nomeReligioso}
                                <br/>
                                <b>Conselheira Suplente [1]:</b> 
                                ${governo_geral.conselheirasSuplentes[0].nomeReligioso}
                                <br/>
                                <b>Conselheira Suplente [2]:</b> 
                                ${governo_geral.conselheirasSuplentes[1].nomeReligioso}
                                <br/>
                                <b>Conselheira Fiscal [1]:</b> 
                                ${governo_geral.conselhoFiscal[0].nomeReligioso}
                                <br/>    
                                <b>Conselheira Fiscal [2]:</b> 
                                ${governo_geral.conselhoFiscal[1].nomeReligioso}
                                <br/>
                                <b>Conselheira Fiscal [3]:</b> 
                                ${governo_geral.conselhoFiscal[2].nomeReligioso}
                                <br/>
                                <b>Data Início: ${governo_geral.dataInicio}&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;Data Término: ${governo_geral.dataTermino}</b>
                                <br/>
                                <b>Este é o Governo Geral Atual? **${governo_geral.isaAtual}**</b>
                                    
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="40">
                                        <input type="hidden" name="id_antigo_atual" value="${antigo_atual.idGoverno}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar">
                                    </form>
                                </div>
                                <div id="option_buttons_2">
<!--                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="32">
                                        <input type="hidden" name="option" value="alterar">
                                        
                                        <input type="submit" class="i2Style_alterar" value="Alterar Dados">
                                    </form>-->
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="41">
                                        <input type="submit" class="i2Style" value="Confirma">
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
    </body>
</html>