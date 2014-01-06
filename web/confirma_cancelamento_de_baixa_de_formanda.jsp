<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_confirma_cadastro_de_congregacao.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <div id="linha_menu_escolhida">
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

                            <h3 align="center">Reativação de Formanda Efetuada com Sucesso</h3>
                            
                            
                            
                            
                            
                            
                            
                            
                            <b>Nome: </b>${formandagravada.nome}
                                <b>Data de Nascimento: </b>${formandagravada.dataNascimento}
                                <br/>
                                <b>Pai: </b>${formandagravada.pai}
                                <b>Mãe: </b>${formandagravada.mae}
                                <br/>
                                <br/>
                                <b>Rua: </b>${formandagravada.rua}
                                <b>Núm.: </b>${formandagravada.numero}
                                <b>Bairro: </b>${formandagravada.bairro}
                                <br/>
                                <br/>
                                <b>Cidade: </b>${formandagravada.cidade}
                                <b>UF: </b>${formandagravada.uf}
                                <b>CEP: </b>${formandagravada.cep}
                                <br/>
                                <br/>
                                <b>Email: </b>${formandagravada.email}
                                <b>Tel.: </b>${formandagravada.telefone}
                                <b>Diocese: </b>${formandagravada.diocese}
                                <br/>
                                <br/>
                                <b>Etapa de Formação Atual: </b>${formandagravada.etapa}
                                <b>Data de Ingressso nesta Etapa: </b>${formandagravada.dataEtapaAtual}
                                <br/>
                                <b>Atividade: </b>
                                <c:choose>
                                    <c:when test="${formandagravada.atividade eq 'sim'}">
                                        Formanda Ativa
                                    </c:when>
                                    <c:otherwise>
                                        Formanda Inativa
                                        <b>
                                            Motivo : 
                                        </b>
                                        ${formandagravada.motivoInatividade}
                                    </c:otherwise>
                                </c:choose>
                                <br/>
                                <br/>
                                                        
                            
                            
                            
                            
                           
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="59">
                                        <input type="hidden" name="motivo" value="${motivo}">
                                        <input type="hidden" name="id_formanda_baixa" value="${formanda.idFormanda}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar Reativação">
                                    </form>
                                </div>
                                <div id="option_buttons_2">
<!--                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="55">
                                        <input type="hidden" name="id_formanda_alterar_dados" value="${formandagravada.idFormanda}">
                                        
                                        <input type="submit" class="i2Style_alterar" value="Alterar Dados">
                                    </form>-->
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="60">
                                        <input type="submit" class="i2Style" value="Confirmar Reativação">
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