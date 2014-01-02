<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Congregação</title>
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
                                    <input type=hidden name="next_url" value="cadastrodecasasdemissao.jsp">
                                    <input type="image" src="IconeCadastrarCasaDeMissao.png">
                                </form>
                            </div>
                            <div id="linha_menu_escolhida">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="29">
                                    <input type="image" src="IconeCadastrarCongregacao.png">
                                </form>
                            </div>
                            <div id="linha_menu">
                                <a href="/ImCarm_2.0/cadastrodeformandas.jsp">
                                    <img src="IconeCadastrarFormandas.png">
                                </a>
                            </div>
                            <div id="linha_menu">
                                <a href="/ImCarm_2.0/cadastrodeirmas.jsp">
                                    <img src="IconeCadastrarFreiras.png">
                                </a>
                            </div>
                            <div id="linha_menu">
                                <a href="/ImCarm/#">
                                    <img src="IconeRealizarBuscasNoSistema.png">
                                </a>
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
                                <b>Juniorado: </b>
                                <input type="date" name="data_juniorado" value="${freira.datasJuniorado}">
                                <b>Juniorado I Renovação: </b>
                                <input type="date" name="data_juniorado_1" value="${freira.datasJunioradoI}">
                                <br/>
                                <b>Juniorado II Renov.: </b>
                                <input type="date" name="data_juniorado_2" value="${freira.datasJunioradoII}">
                                <b>Juniorado III Renov.: </b>
                                <input type="date" name="data_juniorado_3" value="${freira.datasJunioradoIII}">
                                <b>Juniorado IV Renov.: </b>
                                <input type="date" name="data_juniorado_4" value="${freira.datasJunioradoIV}">
                                <br/>
                                <b>Juniorado V Renov.: </b>
                                <input type="date" name="data_juniorado_5" value="${freira.datasJunioradoV}">
                                <b>Juniorado VI Renov.: </b>
                                <input type="date" name="data_juniorado_6" value="${freira.datasJunioradoVI}">
                                <b>Juniorado VII Renov.: </b>
                                <input type="date" name="data_juniorado_7" value="${freira.datasJunioradoVII}">
                                <br/>
                                <b>Juniorado VIII Renov.: </b>
                                <input type="date" name="data_juniorado_8" value="${freira.datasJunioradoVIII}">
                                <b>Juniorado IX Renov.: </b>
                                <input type="date" name="data_juniorado_9" value="${freira.datasJunioradoIX}">
                                <b>Profissão Simples: </b>
                                <input type="date" name="data_profissao_temporaria" value="${freira.dataProfissaoTemporaria}">
                                <br/>
                                <b>Profissão Perpétua: </b>
                                <input type="date" name="data_profissao_perpetua" value="${freira.dataProfissaoPerpetua}">
                                <b>Atividade: </b>
                                <input type="radio" name="ativo" value="sim" checked> Ativa
                                <input type="radio" name="ativo" value="nao"> Inativa
                                <b>Tipo de Atividade: </b>
                                <input size="46" type="text" name="tipo_ativo" value="${formanda.tipoAtivo}">
                                <br/>
                                
                                
                                
                                
                                
<!--                                
                                <b>Nome:</b>
                                <input size="80" type="text" name="nome" value="${formanda.nome}">
                                <b>Data de Nascimento:</b>
                                <input type="date" name="data_nascimento" value="${formanda.dataNascimento}">
                                <br/>
                                <br/>
                                <b>Pai:</b>
                                <input size="59" type="text" name="pai" value="${formanda.pai}">
                                <b>Mãe:</b>
                                <input size="59" type="text" name="mae" value="${formanda.mae}">
                                <br/>
                                <br/>
                                <b>Rua:</b>
                                <input size="58" type="text" name="rua" value="${formanda.rua}">
                                <b>Núm.:</b>
                                <input size="6" type="text" name="numero" value="${formanda.numero}">
                                <b>Bairro:</b>
                                <input size="39" type="text" name="bairro" value="${formanda.bairro}">
                                <br/>
                                <br/>
                                <b>Cidade:</b>
                                <input size="55" type="text" name="cidade" value="${formanda.cidade}">
                                <b>Estado: </b>
                                <input size="7" type="text" name="uf" value="${formanda.uf}">
                                <b>CEP: </b>
                                <input size="39" type="text" name="cep" value="${formanda.cep}">
                                <br/>
                                <br/>
                                <b>Email: </b>
                                <input size="56" type="text" name="email" value="${formanda.email}">
                                <b>Tel.: </b>
                                <input size="15" type="text" name="telefone" value="${formanda.telefone}">
                                <b>Diocese: </b>
                                <input size="31" type="text" name="diocese" value="${formanda.diocese}">
                                <br/>
                                <br/>
                                <b>Etapa de Formação Atual: </b>
                                <b>${formanda.etapa}</b>
                                <select name="etapa_formacao_atual">
                                    <option value="" selected></option>
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
                                <b>Data de Ingressso nesta Etapa:</b>
                                <input type="date" name="data_ingresso_etapa_atual" value="${formanda.dataEtapaAtual}">
                                <br/>
                                <b>Atividade</b>
                                <input type="radio" name="atividade" value="sim" checked> Ativa
                                <input type="radio" name="atividade" value="nao"> Inativa
                                <br/>
                                <b>Motivo(Caso Formanda em estado de INATIVIDADE)</b>
                                <input size="83" type="text" name="motivo_inatividade" value="${formanda.motivoInatividade}">
                                <br/>-->
                                <input type="hidden" name="action" value="70">
                                <input type="hidden" name="opcao" value="${opcao}">
                                <input type="hidden" name="id_formanda" value="${formanda.idFormanda}">
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



                                nome_civil character varying(254),
                                nome_religioso character varying(254),
                                data_nascimento character varying,
                                rg double precision,
                                cpf double precision,
                                nome_pai character varying(254),
                                nome_mae character varying(254),
                                rua_familia character varying(254),
                                numero_familia character varying(254),
                                bairro_familia character varying(254),
                                cidade_familia character varying(254),
                                estado_familia character varying(2),
                                cep_familia character varying(8),
                                diocese character varying(254),
                                telefone character varying(10),
                                email character varying(100),
                                
                                data_aspirantado character varying,
                                data_postulantado character varying,
                                data_noviciado_canonico character varying,
                                data_profissao_temporaria character varying,
                                data_profissao_perpetua character varying,
                                id serial NOT NULL,
                                
                                tipo_ativo character varying(20),
                                ativo character varying(7),
                                
                                tipo_inativo character varying(20),





</html>-->