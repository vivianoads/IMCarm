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
                            <div id="linha_menu_escolhida">
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
                                <h3 align="center">Cadastrar/Alterar Formanda</h3>
                                <h5>${mensagem_erro}</h5>
                                <b>Nome: ${formanda.nome}</b>
                                <b>Data de Nascimento: ${formanda.dataNascimento}</b>
                                <br/>
                                <br/>
                                Fases da Forma��o Conclu�das: 
                                <br/>
                                <c:forEach items="${list_fases}" var="fase">
                                    Nome: ${fase.nome} Data de Entrada: ${fase.dataEntrada} Data de Sa�da: ${fase.dataSaida}
                                    <br/>
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
                                <input type="hidden" name="action" value="65">
                                <input type="hidden" name="id_formanda" value="${formanda.idFormanda}">
                                <input type="hidden" name="etapa_antiga" value="${formanda.etapa}">
                                <input type="hidden" name="data_entrada_etapa_antiga" value="${formanda.dataEtapaAtual}">
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