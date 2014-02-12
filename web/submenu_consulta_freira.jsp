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
                                    <h3 align="center">Consultar Freiras</h3>
                                    <br/>
                                    <b>Idade Religiosa Simples: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Idade Religiosa Perpétua: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Bodas de Votos Simples: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Bodas de Votos Perpétuos: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Idade Civil: </b> 
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Nome Civil: </b>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <b>Nome Religioso: </b>
                                </div>
                                <div id="right">
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="85">
                                        <input type="number" name="idade_religiosa_simples" size="40">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="86">
                                        <input type="number" name="idade_religiosa_perpetua" size="40">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
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
                                        <input type="hidden" name="action" value="87">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <select name="bodas_votos_perpetuos" style="width: 100px;">
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
                                        <input type="hidden" name="action" value="88">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="89">
                                        <input type="number" name="idade_civil" size="40">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="90">
                                        <input type="text" name="nome_civil" size="20">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="91">
                                        <input type="text" name="nome_religioso" size="20">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                </div>
                            </div>
                            <div id="conteudo_funcionalidade_conteudo_left">
                                <div id="left">
                                    <br/>
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
                                    <b>Irmãs Inativas por Óbito: </b> 
                                </div>
                                <div id="right">
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="92">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="93">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="94">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="95">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="96">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="97">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
                                    </form>
                                    <br/>
                                    <br/>
                                    <br/>
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="98">
                                        <input class="i2Style_internal" type="submit" value="Buscar">
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