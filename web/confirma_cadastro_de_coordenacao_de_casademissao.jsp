<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_confirma_cadastro_de_coordenacao_de_casas_de_missao.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <div id="linha_menu">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="29">
                                    <input type="image" src="IconeCadastrarCongregacao.png">
                                </form>
                            </div>
                            <div id="linha_menu_escolhida">
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
                            <h3 align="center">Coordenação de Casa de Missão Cadastrada com Sucesso</h3>
                            <h5>${mensagem_erro}</h5>
                            <b>Fraternidade:</b>
                            ${fraternidade.nome}
                            <br/>
                            <br/>
                            <b>Coordenadora:</b> 
                            ${coordenadora.nomeReligioso}
                            <br/>
                            <br/>
                            <br/>
                            <b>Tesoureira:</b> 
                            ${tesoureira.nomeReligioso}
                            <br/>
                            <br/>
                            <b>Secretária:</b> 
                            ${secretaria.nomeReligioso}
                            <br/>
                            <br/>
                            <b>Data de Entrada desta Coordenação</b>
                            ${data_inicio_split}
                            <br/>
                            <br/>
                            <b>Data de Saída desta Coordenação</b>
                            ${data_termino_split}
                            <br/>
                            <br/>
                            <c:choose>
                                <c:when test="${is_atual eq 'Não'}">
                                    Esta NÃO é a Coordenação Atual desta Fraternidade
                                </c:when>
                                <c:when test="${is_atual eq 'Sim'}">
                                   Esta É a Coordenação Atual desta Fraternidade
                                </c:when>
                            </c:choose>
                            <br/>
                            <br/>
                            <b>
                                <b>Esta é a atual Coordenação desta Fraternidade?</b> ${is_atual}
                            </b>
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="27">
                                        <input type="hidden" name="id_coordenacao_fraternidade" value="${id_coordenacao}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar">
                                    </form>
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="15">
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