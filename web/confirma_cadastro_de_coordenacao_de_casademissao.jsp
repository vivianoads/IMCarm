<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Casa de Miss�o</title>
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
                    <button class="i2Style_logout"> Sair</button>
                </div>
            </div>
            <div id="centro">
                <div id="conteudo_centro">
                    <div id="menu">
                        <div id="conteudo_menu">
                            <div id="linha_menu_escolhida">
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

                            <h3 align="center">Coordena��o de Casa de Miss�o Cadastrada com Sucesso</h3>
                            <h5>${mensagem_erro}</h5>
                            <b>Fraternidade:</b>
                            ${fraternidade.nome}
                            <br/>
                            <br/>
                            <b>Coordenadora:</b> 
                            ${coordenadora.nomeReligioso}
                            <br/>
<!--                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                ${fraternidade.idFraternidade}
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                ${coordenadora.id}
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                ${tesoureira.id}
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                ${secretaria.id}
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_coordenadora.jsp">
                                <input type="submit" value="Add Coordenadora">
                            </form>-->
                            <br/>
                            <br/>
                            <b>Tesoureira:</b> 
                            ${tesoureira.nomeReligioso}
<!--                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">

                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">    
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_tesoureira.jsp">
                                <input type="submit" value="Add Tesoureira">
                            </form>-->
                            <br/>
                            <br/>
                            <b>Secret�ria:</b> 
                            ${secretaria.nomeReligioso}
<!--                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secret�ria">
                            </form>-->
                            <br/>
                            <br/>
                            <b>Data de Entrada desta Coordena��o</b>
                            ${data_inicio_split}
                            <br/>
                            <br/>
                            <b>Data de Sa�da desta Coordena��o</b>
                            ${data_termino_split}
                            <br/>
                            <br/>
                            <c:choose>
                                <c:when test="${is_atual eq 'N�o'}">
                                    Esta N�O � a Coordena��o Atual desta Fraternidade
                                </c:when>
                                <c:when test="${is_atual eq 'Sim'}">
                                   Esta � a Coordena��o Atual desta Fraternidade
                                </c:when>
                            </c:choose>
                            <br/>
                            <br/>
                            <b>
                                <b>Esta � a atual Coordena��o desta Fraternidade?</b> ${is_atual}
                            </b>
<!--                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="26">
                                <input type="date" name="data_inicio">
                                <input type="date" name="data_termino">
                                <b>Esta � a atual Coordena��o desta Fraternidade?</b>
                                <input type="radio" name="is_atual" value="Sim"> Sim
                                <input type="radio" name="is_atual" value="N�o" checked> N�o
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="submit" value="Salvar">
                            </form>-->
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="27">
                                        <input type="hidden" name="id_coordenacao_fraternidade" value="${id_coordenacao}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar">
                                    </form>
                                </div>
<!--                                <div id="option_buttons_2">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="13">
                                        <input type="hidden" name="id_fraternidade" value="${fraternidadebean.idFraternidade}">
                                        <input type="hidden" name="option" value="alterar">
                                        <input type="submit" class="i2Style_alterar" value="Alterar Dados">
                                    </form>
                                </div>-->
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







<!--		<div id="container"> 
                        
                        <div id="topo">
                        
                        </div>
                        
                        <div id="menu">
                        
                                <div id="login">
                                
                                        <div id="elementos">
                                        
                                        <form name="cadastroFormandas" action="/ImCarm/ServletControler?action=8" method="post">	
                                        <table cellspacing="35" width="590">
                                                <tr>
                                                        <td colspan="2" align="center"><h3>Cadastrar Casa de Miss�o</h3></td>
                                                </tr>
                                                <tr>
                                                        <td><b>Nome:</b></td> 
                                                        <td> <input size="50" type="text" name="nome" ></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Data de Funda��o:</b></td> 
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