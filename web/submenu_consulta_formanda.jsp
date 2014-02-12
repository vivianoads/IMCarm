<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_submenu_de_consulta_freira.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                                    <input type=hidden name="action" value="29">
                                    <input type="image" src="IconeCadastrarCongregacao.png">
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
                            <div id="linha_menu_escolhida">
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
                                <div id="left">
                                    <h3 align="center">Consultar Formandas</h3>
                                    <br/>
                                    <b>Formanda por Etapa: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Formanda por Nome: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Formanda Ativas: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Formandas Inativas: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Todas as Formandas: </b>
                                </div>
                                <div id="right">
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="formanda_por_etapa" style="width: 100px;">
                                            <option value="Aspirantado">Aspirantado</option>
                                            <option value="Postulantado">Postulantado</option>
                                            <option value="Noviciado Canônico">Noviciado Canônico</option>
                                            <option value="Noviciado Apostólico">Noviciado Apostólico</option>
                                            <option value="Juniorado">Juniorado</option>
                                            <option value="Juniorado - I Renovação">Juniorado - I Renovação</option>
                                            <option value="Juniorado - II Renovação">Juniorado - II Renovação</option>
                                            <option value="Juniorado - III Renovação">Juniorado - III Renovação</option>
                                            <option value="Juniorado - IV Renovação">Juniorado - IV Renovação</option>
                                            <option value="Juniorado - V Renovação">Juniorado - V Renovação</option>
                                            <option value="Juniorado - VI Renovação">Juniorado - VI Renovação</option>
                                            <option value="Juniorado - VII Renovação">Juniorado - VII Renovação</option>
                                            <option value="Juniorado - VIII Renovação">Juniorado - VIII Renovação</option>
                                            <option value="Juniorado - IX Renovação">Juniorado - IX Renovação</option>
                                            <option value="Profissão Simples">Profissão Simples</option>
                                            <option value="Profissão Perpétua">Profissão Perpétua</option>
                                        </select>
                                        <input type="hidden" name="action" value="99">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="100">
                                        <input type="text" name="formanda_por_nome" size="20">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="101">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="102">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="103">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                </div>
                            </div>
                            <div id="conteudo_funcionalidade_conteudo_left">
                                <div id="left">
                                </div>
                                <div id="right">
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