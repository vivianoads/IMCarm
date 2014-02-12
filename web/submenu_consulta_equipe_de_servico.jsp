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
                                    <h3 align="center">Consultar Equipes de Servi�o</h3>
                                    <br/>
                                    <b>Irm�s por Equipe: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Formandas por Equipe: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Equipes de Servi�o do Governo Atual: </b> 
                                </div>
                                <div id="right">
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="freira_por_equipe" style="width: 100px;">
                                            <c:forEach items="${list_equipes}" var="equipe">
                                                <option value="${equipe.idEquipe}">${equipe.nome}</option>
                                            </c:forEach>
                                        </select>
                                        <input type="hidden" name="action" value="104">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="formanda_por_equipe" style="width: 100px;">
                                            <c:forEach items="${list_equipes}" var="equipe">
                                                <option value="${equipe.idEquipe}">${equipe.nome}</option>
                                            </c:forEach>
                                        </select>
                                        <input type="hidden" name="action" value="105">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="106">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
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