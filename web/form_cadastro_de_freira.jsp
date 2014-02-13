<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_form_cadastro_de_freiras.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <div id="linha_menu_escolhida">
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
                                <h3 align="center">Cadastrar/Alterar Freira</h3>
                                <h5>${mensagem_erro}</h5>
                                <b>Nome Civil: </b>
                                <input size="55" type="text" name="nome_civil" value="${freira.nomeCivil}">
                                <b>Nome Religioso: </b>
                                <input size="50" type="text" name="nome_religioso" value="${freira.nomeReligioso}">
                                <br/>
                                <b>Data de Nascimento: </b>
                                <input type="date" name="data_nascimento" value="${freira.dataNascimento}">
                                <b>CPF: </b>
                                <input size="38" type="text" name="cpf" value="${freira.cpf}">
                                <b>RG: </b>
                                <input size="38" type="text" name="rg" value="${freira.rg}">
                                </br>
                                <b>Pai: </b>
                                <input size="61" type="text" name="nome_pai" value="${freira.nomePai}">
                                <b>Mãe: </b>
                                <input size="61" type="text" name="nome_mae" value="${freira.nomeMae}">
                                <br/>
                                <b>Rua: </b>
                                <input size="60" type="text" name="rua_familia" value="${freira.ruaFamilia}">
                                <b>Núm.: </b>
                                <input size="6" type="text" name="numero_familia" value="${freira.numeroFamilia}">
                                <b>Bairro: </b>
                                <input size="41" type="text" name="bairro_familia" value="${freira.bairroFamilia}">
                                <br/>
                                <b>Cidade: </b>
                                <input size="57" type="text" name="cidade_familia" value="${freira.cidadeFamilia}">
                                <b>UF: </b>
                                <input size="9" type="text" name="estado_familia" value="${freira.estadoFamilia}">
                                <b>CEP: </b>
                                <input size="43" type="text" name="cep_familia" value="${freira.cepFamilia}">
                                <br/>
                                <b>Diocese: </b>
                                <input size="38" type="text" name="diocese" value="${freira.diocese}">
                                <b>Tel.: </b>
                                <input size="26" type="text" name="telefone" value="${freira.telefone}">
                                <b>Email: </b>
                                <input size="41" type="text" name="email" value="${freira.email}">
                                <br/>
                                <b>Aspirantado: </b>
                                <input type="date" name="data_aspirantado" value="${freira.dataAspirantado}">
                                <b>Postulantado: </b>
                                <input type="date" name="data_postulantado" value="${freira.dataPostulantado}">
                                <b>Noviciado Canônico: </b>
                                <input type="date" name="data_noviciado_canonico" value="${freira.dataNoviciadoCanonico}">
                                <br/>
                                <b>Noviciado Apostólico: </b>
                                <input type="date" name="data_noviciado_apostolico" value="${freira.dataNoviciadoApostolico}">
                                 <b>Profissão Simples: </b>
                                <input type="date" name="data_profissao_temporaria" value="${freira.dataProfissaoTemporaria}">
                                <br/>
                                <b>Juniorato I Renovação: </b>
                                <input type="date" name="data_juniorado_1" value="${freira.datasJunioradoI}">
                                <br/>
                                <b>Juniorato II Renov.: </b>
                                <input type="date" name="data_juniorado_2" value="${freira.datasJunioradoII}">
                                <b>Juniorato III Renov.: </b>
                                <input type="date" name="data_juniorado_3" value="${freira.datasJunioradoIII}">
                                <b>Juniorato IV Renov.: </b>
                                <input type="date" name="data_juniorado_4" value="${freira.datasJunioradoIV}">
                                <br/>
                                <b>Juniorato V Renov.: </b>
                                <input type="date" name="data_juniorado_5" value="${freira.datasJunioradoV}">
                                <b>Juniorato VI Renov.: </b>
                                <input type="date" name="data_juniorado_6" value="${freira.datasJunioradoVI}">
                                <b>Juniorato VII Renov.: </b>
                                <input type="date" name="data_juniorado_7" value="${freira.datasJunioradoVII}">
                                <br/>
                                <b>Juniorato VIII Renov.: </b>
                                <input type="date" name="data_juniorado_8" value="${freira.datasJunioradoVIII}">
                                <b>Juniorato IX Renov.: </b>
                                <input type="date" name="data_juniorado_9" value="${freira.datasJunioradoIX}">
                               
                                <b>Profissão Perpétua: </b>
                                <input type="date" name="data_profissao_perpetua" value="${freira.dataProfissaoPerpetua}">
                                <b>Situação: </b>${freira.ativo}
                                <input type="radio" name="ativo" value="sim" checked> Ativa
                                <input type="radio" name="ativo" value="nao"> Inativa
                                <b>Tipo de Atividade: </b>${formanda.tipoAtivo}
                                <select name="tipo_ativo">
                                    <option value="regular">Regular</option>
                                    <option value="licenca">Licença</option>
                                    <option value="enclaustrada">Enclaustrada</option>
                                    <option value="saida">Saída</option>
                                    <option value="obito">Óbito</option>
                                </select>
                                <br/>
                                <!--id_fase_formacao= ${id_fase_de_formacao}-->
                                <input type="hidden" name="action" value="70">
                                <input type="hidden" name="option" value="${option}">
                                <input type="hidden" name="id_freira" value="${freira.id}">
                                <input type="hidden" name="id_fase_de_formacao" value="${id_fase_de_formacao}">
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