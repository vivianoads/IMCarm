<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_form_cadastro_de_governo_geral.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                    <form action="/ImCarm_2.0/ServletControler" method="post">
                        <input type=hidden name="action" value="11">
                        <input type="submit" class="i2Style_logout" value="Sair">
                    </form>
                </div>
            </div>
            <div id="centro">
                <div id="conteudo_centro">
                    <div id="menu">
                        <div id="conteudo_menu">
                            <div id="linha_menu_escolhida">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="29">
                                    <input type="image" src="IconeCadastrarCongregacao.png">
                                </form>
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="12">
                                    <input type="image" src="IconeCadastrarCasaDeMissao.png">
                                </form>
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="34">
                                    <input type="image" src="IconeCadastrarFormandas.png">
                                </form>
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="35">
                                    <input type="image" src="IconeCadastrarFreiras.png">
                                </form>
                            </div>
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="83">
                                    <input type="image" src="IconeRealizarBuscasNoSistema.png">
                                </form>
                            </div>
                        </div>
                    </div>
                    <div id="funcionalidade">
                        <div id="conteudo_funcionalidade">
                            <div id="conteudo_funcionalidade_conteudo_right">
                                <h3 align="center">Cadastrar Governo Geral da Congregação</h3>
                                <h5>${error_message}</h5>
                                <br/>
                                <b>Madre Geral:</b> 
                                ${governo_geral.madreGeral.nomeReligioso}
                                <br/>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="madre">
                                    <input class="i2Style_internal" type="submit" value="Add Madre Geral">
                                </form>
                                <br/>
                                <b>Vice Geral:</b> 
                                ${governo_geral.viceGeral.nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="vice">
                                    <input class="i2Style_internal" type="submit" value="Add Vice Geral">
                                </form>
                                <br/>
                                <b>Economa Geral:</b> 
                                ${governo_geral.economaGeral.nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="economa">
                                    <input class="i2Style_internal" type="submit" value="Add Economa Geral">
                                </form>
                                <br/>
                                <b>Secretária Geral:</b> 
                                ${governo_geral.secretariaGeral.nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="secretaria">
                                    <input class="i2Style_internal" type="submit" value="Add Secretária Geral">
                                </form>
                                <br/>
                                <b>Conselheira Titular [1]:</b> 
                                ${governo_geral.conselheirasTitulares[0].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular1">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Titular [1]">
                                </form>
                                <br/>
                                <b>Conselheira Titular [2]:</b> 
                                ${governo_geral.conselheirasTitulares[1].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular2">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Titular [2]">
                                </form>
                                <br/>
                                <b>Conselheira Titular [3]:</b> 
                                ${governo_geral.conselheirasTitulares[2].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular3">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Titular [3]">
                                </form>
                            </div>
                                    <br/>
                            <div id="conteudo_funcionalidade_conteudo_left">
                                <b>Conselheira Titular [4]:</b> 
                                ${governo_geral.conselheirasTitulares[3].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular4">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Titular [4]">
                                </form>
                                <br/>
                                <b>Conselheira Suplente [1]:</b> 
                                ${governo_geral.conselheirasSuplentes[0].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_suplente1">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Suplente [1]">
                                </form>
                                <br/>
                                <b>Conselheira Suplente [2]:</b> 
                                ${governo_geral.conselheirasSuplentes[1].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_suplente2">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Suplente [2]">
                                </form>
                                <br/>
                                <b>Conselheira Fiscal [1]:</b> 
                                ${governo_geral.conselhoFiscal[0].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal1">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Fiscal [1]">
                                </form>
                                <br/>    
                                <b>Conselheira Fiscal [2]:</b> 
                                ${governo_geral.conselhoFiscal[1].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal2">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Fiscal [2]">
                                </form>
                                <br/>
                                <b>Conselheira Fiscal [3]:</b> 
                                ${governo_geral.conselhoFiscal[2].nomeReligioso}
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal3">
                                    <input class="i2Style_internal" type="submit" value="Add Cons. Fiscal [3]">
                                </form>
                                <br/>
                                <b>Data Início: &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;Data Término:</b>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="39">
                                    <input type="date" name="data_inicio">
                                    <input type="date" name="data_termino">
                                    <br/>
                                    <br/>
                                    <b>Este é o Governo Geral Atual?</b>
                                    <input type="radio" name="is_atual" value="sim"> Sim
                                    <input type="radio" name="is_atual" value="nao" checked> Não
                                    <input class="i2Style_menu" type="submit" value="Salvar">
                                </form>
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