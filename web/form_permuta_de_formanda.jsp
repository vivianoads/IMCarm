<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Congrega��o</title>
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
                                <h3 align="center">Cadastrar/Alterar Formanda</h3>
                                <h5>${mensagem_erro}</h5>
                                <b>Nome: ${formanda.nome}</b>
                                <b>Data de Nascimento: ${formanda.dataNascimento}</b>
                                <br/>
                                <br/>
                                Fases da Forma��o Conclu�das: 
                                <c:forEach items="${list_fases}" var="fase">
                                    Nome: ${fase.nome} Data de Entrada: ${fase.dataEntrada} Data de Sa�da: ${fase.dataSaida}
                                </c:forEach>
                                <br/>
                                <br/>
                                <b>Etapa de Forma��o Atual: </b>
                                <b>${formanda.etapa}</b>
                                <b>Data de Ingressso nesta Etapa: ${formanda.dataEtapaAtual}</b>
                                <br/>
                                <br/>
                                <b>Selecione a NOVA Etapa de Forma��o: </b>
                                <select name="etapa_formacao">
                                    <option value="" selected></option>
                                    <option value="Aspirantado">Aspirantado</option>
                                    <option value="Postulantado">Postulantado</option>
                                    <option value="Noviciado Can�nico">Noviciado Can�nico</option>
                                    <option value="Noviciado Apost�lico">Noviciado Apost�lico</option>
                                    <option value="Juniorado">Juniorado</option>
                                    <option value="Juniorado - I Renova��o">Juniorado - I Renova��o</option>
                                    <option value="Juniorado - II Renova��o">Juniorado - II Renova��o</option>
                                    <option value="Juniorado - III Renova��o">Juniorado - III Renova��o</option>
                                    <option value="Juniorado - IV Renova��o">Juniorado - IV Renova��o</option>
                                    <option value="Juniorado - V Renova��o">Juniorado - V Renova��o</option>
                                    <option value="Juniorado - VI Renova��o">Juniorado - VI Renova��o</option>
                                    <option value="Juniorado - VII Renova��o">Juniorado - VII Renova��o</option>
                                    <option value="Juniorado - VIII Renova��o">Juniorado - VIII Renova��o</option>
                                    <option value="Juniorado - IX Renova��o">Juniorado - IX Renova��o</option>
                                    <option value="Profiss�o Simples">Profiss�o Simples</option>
                                    <option value="Profiss�o Perp�tua">Profiss�o Perp�tua</option>
                                </select>
                                <b>Data de Ingressso NOVA Etapa:</b>
                                <input type="date" name="data_ingresso_nova_etapa">
                                <br/>
                                <br/>
                                <input type="hidden" name="action" value="*">
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