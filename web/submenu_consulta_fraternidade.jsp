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
                            <div id="linha_menu_escolhida">
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
                            <div id="conteudo_funcionalidade_conteudo_right">
                                <div id="left">
                                    <h3 align="center">Consultar Fraternidades</h3>
                                    <br/>
                                    <b>Irmãs por Fraternidade: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Fraternidades Ativas: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Fraternidades Inativas: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Todas as Fraternidades: </b> 
<!--                                    <b>Idade Civil: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Nome Civil: </b>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Nome Religioso: </b>-->
                                </div>
                                <div id="right">
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="freira_por_fraternidade" style="width: 100px;">
                                            <c:forEach items="${list_fraternidades}" var="fraternidade">
                                                <option value="${fraternidade.idFraternidade}">${fraternidade.nome}</option>
                                            </c:forEach>
                                        </select>
                                        <input type="hidden" name="action" value="107">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
<!--                                        <select name="bodas_votos_simples" style="width: 100px;">
                                            <//c:forEach items="${list_equipes}" var="equipe">
                                                <option value="${equipe.nome}">${equipe.nome}</option>
                                            <//c:forEach>
                                        </select>-->
                                        <input type="hidden" name="action" value="108">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
<!--                                        <select name="bodas_votos_simples" style="width: 100px;">
                                            <//c:forEach items="${list_equipes}" var="equipe">
                                                <option value="${equipe.nome}">${equipe.nome}</option>
                                            <//c:forEach>
                                        </select>-->
                                        <input type="hidden" name="action" value="109">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    
                                    
                                    
                                    
                                    
                                    
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="110">
                                        <!--<input type="number" name="idade_religiosa_simples" size="40">-->
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
<!--
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input type="number" name="idade_religiosa_perpetua" size="40">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="bodas_votos_simples" style="width: 100px;">
                                            <c:forEach items="${list_equipes}" var="equipe">
                                                <option value="${equipe.nome}">${equipe.nome}</option>
                                            </c:forEach>
                                        </select>
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="bodas_votos_simples" style="width: 100px;">
                                            <option value="bodas_Papel">Papel</option>
                                            <option value="bodas_Madeira">Madeira</option>
                                            <option value="bodas_Estanho">Estanho</option>
                                            <option value="bodas_Cristal">Cristal</option>
                                            <option value="bodas_Porcelana">Porcelana</option>
                                            <option value="bodas_Prata">Prata</option>
                                            <option value="bodas_Pérola">Pérola</option>
                                            <option value="bodas_Coral">Coral</option>
                                            <option value="bodas_Esmeralda">Esmeralda</option>
                                            <option value="bodas_Platina">Platina</option>
                                            <option value="bodas_Ouro">Ouro</option>
                                            <option value="bodas_Ametista">Ametista</option>
                                            <option value="bodas_Diamante">Diamante</option>
                                            <option value="bodas_Ferro">Ferro</option>
                                            <option value="bodas_Vinho">Vinho</option>
                                            <option value="bodas_Brilhante">Brilhante</option>
                                            <option value="bodas_Carvalho">Carvalho</option>
                                            <option value="bodas_Girassol">Girassol</option>
                                            <option value="bodas_Álamo">Álamo</option>
                                            <option value="bodas_Sândalo">Sândalo</option>
                                            <option value="bodas_Cânhamo">Cânhamo</option>
                                        </select>
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input type="number" name="idade_religiosa_simples" size="40">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input type="text" name="idade_religiosa_perpetua" size="20">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input type="text" name="idade_religiosa_perpetua" size="20">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>-->
                                </div>
<!--                                <h3 align="center">Consultar Freiras</h3>
                                <h5>${error_message}</h5>
                                <br/>
                                
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <b>por Idade Religiosa Simples: </b> 
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="madre">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="vice">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="economa">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="secretaria">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular1">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/> 
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular2">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/> 
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular3">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>-->
                            </div>
                                    <!--<br/>-->
                            <div id="conteudo_funcionalidade_conteudo_left">
                                <div id="left">
<!--                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Ativas: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Ativas Estado Regular: </b>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Ativas em Licença: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Ativas Enclaustradas: </b>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Inativas: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Inativas por Saída: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Irmãs Inativas por Óbito: </b> -->
                                </div>
                                <div id="right">
<!--                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="37">
                                        <input type="hidden" name="initial_index_freira" value="0">
                                        <input type="hidden" name="tipo_cargo" value="madre">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>-->
                                </div>
<!--                                
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_titular4">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_suplente1">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_suplente2">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/> 
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal1">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>    
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal2">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal3">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="conselheira_fiscal3">
                                    <input class="i2Style_internal" type="submit" value="Buscar">
                                </form>
                                <br/>-->










<!--                                <b>Data Início: &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;Data Término:</b>
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
                                </form>-->
                            </div>
<!--                            <h3 align="center">Cadastrar Governo Geral da Congregação</h3>
                            <h5>${error_message}</h5>
                            <br/>
                            <br/>
                            <b>Madre Geral:</b> 
                            ${coordenadora.nomeReligioso}
                            <br/>
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_coordenadora.jsp">
                                <input type="submit" value="Add Coordenadora">
                            </form>
                            <br/>
                            <b>Vice Geral:</b> 
                            ${tesoureira.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">    
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_tesoureira.jsp">
                                <input type="submit" value="Add Tesoureira">
                            </form>
                            <br/>
                            <b>Economa Geral:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Secretária Geral:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Titular [1]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Titular [2]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Titular [3]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Titular [4]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Suplente [1]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Suplente [2]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Fiscal [1]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>    
                            <b>Conselheira Fiscal [2]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Conselheira Fiscal [3]:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <br/>
                            <b>Data Início:</b>
                            <b>${fraternidade.nome}</b>
                            <br/>
                            <br/>
                            <b>Data Término:</b>
                            <b>${fraternidade.nome}</b>
                            <br/>
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="26">
                                <input type="date" name="data_inicio">
                                <input type="date" name="data_termino">
                                <b>Esta é a atual Coordenação desta Fraternidade?</b>
                                <input type="radio" name="is_atual" value="Sim"> Sim
                                <input type="radio" name="is_atual" value="Não" checked> Não
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="submit" value="Salvar">
                            </form>-->

                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>
    </body>
</html>







<!--		<div id="container"> 
                        
                        <div id="topo">
                        
                        </div>
                        
                        <div id="menu">
                        
                                <div id="login">
                                
                                        <div id="elementos">
                                        
                                        <form name="cadastroFormandas" action="/ImCarm/ServletControler?action=8" method="post">	
                                        <table cellspacing="35" width="590">
                                                <tr>
                                                        <td colspan="2" align="center"><h3>Cadastrar Casa de Missão</h3></td>
                                                </tr>
                                                <tr>
                                                        <td><b>Nome:</b></td> 
                                                        <td> <input size="50" type="text" name="nome" ></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Data de Fundação:</b></td> 
                                                        <td><input size="10" type="text" name="data_fundacao" maxlength="10"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Rua:</b></td> 
                                                        <td><input size="50" type="text" name="rua"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Numero:</b></td> 
                                                        <td><input size="5" type="text" name="numero"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Bairro:</b></td> 
                                                        <td><input size="50" type="text" name="bairro"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Cidade</b></td> 
                                                        <td><input size="50" type="text" name="cidade"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Diocese</b></td> 
                                                        <td><input size="50" type="text" name="diocese"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Bispo</b></td> 
                                                        <td><input size="50" type="text" name="bispo"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>UF</b></td> 
                                                        <td><input size="5" type="text" name="uf" maxlength="2"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Status</b></td> 
                                                        <td>
                                                                
                                                                <input size="50" type="radio" name="status" value="ativa" checked><b>Ativa</b>
                                                                <input size="50" type="radio" name="status" value="inativa"><b>Inativa</b>
                                                        </td> 								
                                                </tr>
                                                <tr>
                                                        <td></td>
                                                        <td align = "center"><input type="submit" value="Confirmar"></td>
                                                </tr>
                                                
                                                </table>
                                                
                                        </form>
                                        
                                        </div>			
                                                
                                        
                                </div>
                        
                        </div>
                        
                        <div id="rodape">
                        </div>
                
                </div>
                
        </body>
</html>-->