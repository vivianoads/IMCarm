<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Casa de Missão</title>
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
                            <div id="linha_menu_escolhida">
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

                            <h3 align="center">Baixa de Freira Efetuada com Sucesso</h3>
                            
                            
                            
                            
                            
                            
                            
                                <b>Nome Civil: </b>${freira.nomeCivil}
                                <br/>
                                <br/>
                                <b>Nome Religioso: </b>${freira.nomeReligioso}
                                <br/>
                                <br/>
                                <b>Data de Nascimento: </b>${freira.dataNascimento}
                                <b>CPF: </b>${freira.cpf}
                                <b>RG: </b>${freira.rg}
                                <br/>
                                <br/>
                                <b>Pai: </b>${freira.nomePai}
                                <b>Mãe: </b>${freira.nomeMae}
                                <br/>
                                <br/>
                                <b>Rua: </b>${freira.ruaFamilia}
                                <b>Núm.: </b>${freira.numeroFamilia}
                                <b>Bairro: </b>${freira.bairroFamilia}
                                <b>Cidade: </b>${freira.cidadeFamilia}
                                <b>UF: </b>${freira.estadoFamilia}
                                <b>CEP: </b>${freira.cepFamilia}
                                <br/>
                                <br/>
                                <b>Diocese: </b>${freira.diocese}
                                <b>Tel.: </b>${freira.telefone}
                                <b>Email: </b>${freira.email}
                                <br/>
                                <br/>
                                <b>Aspirantado: </b>${freira.dataAspirantado}
                                <b>Postulantado: </b>${freira.dataPostulantado}
                                <b>Noviciado Canônico: </b>${freira.dataNoviciadoCanonico}
                                <b>Noviciado Apostólico: </b>${freira.dataNoviciadoApostolico}
                                <br/>
                                <br/>
                                <b>Juniorado: </b>${freira.datasJuniorado}
                                <b>Juniorado I Renovação: </b>${freira.datasJunioradoI}
                                <b>Juniorado II Renov.: </b>${freira.datasJunioradoII}
                                <b>Juniorado III Renov.: </b>${freira.datasJunioradoIII}
                                <br/>
                                <br/>
                                <b>Juniorado IV Renov.: </b>${$freira.datasJunioradoIV}
                                <b>Juniorado V Renov.: </b>${freira.datasJunioradoV}
                                <b>Juniorado VI Renov.: </b>${freira.datasJunioradoVI}
                                <b>Juniorado VII Renov.: </b>${freira.datasJunioradoVII}
                                <br/>
                                <br/>
                                <b>Juniorado VIII Renov.: </b>${freira.datasJunioradoVIII}
                                <b>Juniorado IX Renov.: </b>${freira.datasJunioradoIX}
                                <b>Profissão Simples: </b>${freira.dataProfissaoTemporaria}
                                <br/>
                                <br/>
                                <b>Profissão Perpétua: </b>${freira.dataProfissaoPerpetua}
                                <b>Atividade: <c:choose>
                                    <c:when test="${freira.ativo eq 'sim'}">
                                        Freira Ativa
                                    </c:when>
                                    <c:otherwise>
                                        Freira Inativa
                                    </c:otherwise>
                                </c:choose>
                                <b>Tipo de Atividade: </b>${freira.tipoAtivo}
                            
                            
                            
                            
                            
                            
                            
                            
                           
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="79">
                                        <input type="hidden" name="tipo_ativo_antigo" value="${tipo_ativo_antigo}">
                                        <input type="hidden" name="id_Freira_apagar" value="${freira.id}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar Baixa">
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
                                        <input type="hidden" name="action" value="78">
                                        <input type="submit" class="i2Style" value="Confirmar Baixa">
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