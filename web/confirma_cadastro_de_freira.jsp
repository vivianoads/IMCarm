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
                            <div id="linha_menu_freira">
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

                            <h3 align="center">Freira Cadastrada com Sucesso</h3>
                            
                            
                            
                            
                            
                            
                            
                                <b>Nome Civil: ${freira.nomeCivil}</b>
                                <b>Nome Religioso: ${freira.nomeReligioso}</b>
                                <br/>
                                <b>Data de Nascimento: ${freira.dataNascimento}</b>
                                <b>CPF: ${freira.cpf}</b>
                                <b>RG: ${freira.rg}</b>
                                </br>
                                <b>Pai: ${freira.nomePai}</b>
                                <b>Mãe: ${freira.nomeMae}</b>
                                <br/>
                                <b>Rua: ${freira.ruaFamilia}</b>
                                <b>Núm.: ${freira.numeroFamilia}</b>
                                <b>Bairro: ${freira.bairroFamilia}</b>
                                <br/>
                                <b>Cidade: ${freira.cidadeFamilia}</b>
                                <b>UF: ${freira.estadoFamilia}</b>
                                <b>CEP: ${freira.cepFamilia}</b>
                                <br/>
                                <b>Diocese: ${freira.diocese}</b>
                                <b>Tel.: ${freira.telefone}</b>
                                <b>Email: ${freira.email}</b>
                                <br/>
                                <b>Aspirantado: ${freira.dataAspirantado}</b>
                                <b>Postulantado: ${freira.dataPostulantado}</b>
                                <b>Noviciado Canônico: ${freira.dataNoviciadoCanonico}</b>
                                <br/>
                                <b>Noviciado Apostólico: ${freira.dataNoviciadoApostolico}</b>
                                <b>Juniorado: ${freira.datasJuniorado}</b>
                                <b>Juniorado I Renovação: ${freira.datasJunioradoI}</b>
                                <br/>
                                <b>Juniorado II Renov.: ${freira.datasJunioradoII}</b>
                                <b>Juniorado III Renov.: ${freira.datasJunioradoIII}</b>
                                <b>Juniorado IV Renov.: ${freira.datasJunioradoIV}</b>
                                <br/>
                                <b>Juniorado V Renov.: ${freira.datasJunioradoV}</b>
                                <b>Juniorado VI Renov.: ${freira.datasJunioradoVI}</b>
                                <b>Juniorado VII Renov.: ${freira.datasJunioradoVII}</b>
                                <br/>
                                <b>Juniorado VIII Renov.: ${freira.datasJunioradoVIII}</b>
                                <b>Juniorado IX Renov.: ${freira.datasJunioradoIX}">
                                <b>Profissão Simples: ${freira.dataProfissaoTemporaria}</b>
                                <br/>
                                <b>Profissão Perpétua: ${freira.dataProfissaoPerpetua}</b>
                                <b>Atividade: <c:choose>
                                    <c:when test="${freira.ativo eq 'sim'}">
                                        <b>Freira Ativa</b>
                                    </c:when>
                                    <c:otherwise>
                                        <b>Freira Inativa</b>
                                    </c:otherwise>
                                </c:choose>
                                <b>Tipo de Atividade: ${freira.tipoAtivo}</b>
                                <br/>
                            
                            
                            ${freira.id}
                            
                           
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="73">
                                        <input type="hidden" name="id_fase_de_formacao" value="${id_fase_de_formacao}">
                                        <input type="hidden" name="id_freira" value="${freira.id}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar">
                                    </form>
                                </div>
                                <div id="option_buttons_2">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="71">
                                        
                                        <input type="hidden" name="id_freira_alterar_dados" value="${freira.id}">
                                        <input type="hidden" name="id_fase_de_formacao" value="${id_fase_de_formacao}">
                                        <input type="submit" class="i2Style_alterar" value="Alterar Dados">
                                    </form>
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="72">
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