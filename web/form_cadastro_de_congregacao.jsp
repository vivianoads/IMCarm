<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_form_cadastro_de_congregacao.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <form name="cadastroFormandas" action="/ImCarm_2.0/ServletControler" method="post">	
                                <h3 align="center">Cadastrar/Alterar Congregação</h3>
                                <h5>${mensagem_erro}</h5>
                                <b>Nome:</b>
                                <input size="80" type="text" name="nome" value="${congregacao.nome}">
                                <b>Data de Fundação:</b>
                                <input type="date" name="data_fundacao" value="${congregacao.dataFundacao}">
                                <br/>
                                <br/>
                                <b>Carisma:</b>
                                <input size="123" type="text" name="carisma" value="${congregacao.carisma}">
                                <br/>
                                <br/>
                                <b>Lema:</b>
                                <input size="125" type="text" name="lema" value="${congregacao.lema}">
                                <br/>
                                <br/>
                                <b>Data de Agregação à Ordem do Carmo:</b>
                                <input type="date" name="data_agregacao_a_ordem" value="${congregacao.dataAgregacaoOrdem}">
                                <b>Data de Ereção Canônica:</b>
                                <input type="date" name="data_erecao_canonica" value="${congregacao.dataErecaoCanonica}">
                                <br/>
                                <br/>
                                <b>Cidade de Fundação:</b>
                                <input size="80" type="text" name="cidade_fundacao" value="${congregacao.cidadeFundacao}">
                                <br/>
                                <br/>
                                <b>Fundador</b>
                                <input size="52" type="text" name="fundador" value="${congregacao.fundador}">
                                <b>Co-fundadora</b>
                                <input size="52" type="text" name="co_fundador" value="${congregacao.coFundador}">
                                <br/>
                                <br/>
                                <input type="hidden" name="action" value="31">
                                <input type="hidden" name="id_congregacao" value="${congregacao.idCongregacao}">
                                id = ${congregacao.idCongregacao}
                                <input type="hidden" name="option" value="${option}">
                                <input type="submit" class="i2Style" value="Salvar">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>
    </body>
</html>