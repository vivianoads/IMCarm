<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_form_cadastro_de_formanda.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <form name="cadastroFormandas" action="/ImCarm_2.0/ServletControler" method="post">	
                                <h3 align="center">Cadastrar/Alterar Formanda</h3>
                                <h5>${mensagem_erro}</h5>
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
                                <br/>
                                <br/>
                                <input type="hidden" name="action" value="5">
                                <input type="hidden" name="opcao" value="${opcao}">
                                <input type="hidden" name="id_formanda" value="${formanda.idFormanda}">
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
</html>-->