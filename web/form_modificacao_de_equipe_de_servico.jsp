<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_form_modificacao_de_equipe_de_servico.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <h3 align="center">Modificar Equipe de Serviço</h3>
                                <h5>${mensagem_erro}</h5>
                                <b>Coordenadora:</b>
                                ${coordenadora_equipe.nomeReligioso}
                                <br/>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="coordenadora">
                                    <input type="hidden" name="opcao" value="modificar">
                                    <input type="hidden" name="nome_equipe" value="${equipe.nome}">
                                    <input class="i2Style_internal" type="submit" value="Alt Coordenadora">
                                </form>
                                <br/>
                                <c:forEach items="${list_freiras_associar_equipe}" var="freira">
                                    <table>
                                        <tr>
                                            <td width="300px">
                                                <b>Nome: ${freira.nomeReligioso}</b>
                                            </td>
                                            <td>
                                                <b>Função: <c:out value="${map_funcoes_freira[freira.id]}"></c:out></b>
                                            </td>
                                            <td>
                                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                                    <input type="hidden" name="action" value="50">
                                                    <input type="hidden" name="id_desassociar" value="${freira.id}">
                                                <input type="hidden" name="opcao_desassociar" value="freira">
                                                    <input class="i2Style_internal" type="submit" value="Remover">
                                                </form>
                                            </td>
                                        </tr>
                                    </table>
                                </c:forEach>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="37">
                                    <input type="hidden" name="initial_index_freira" value="0">
                                    <input type="hidden" name="tipo_cargo" value="membro_equipe_freira">
                                    <input class="i2Style_internal" type="submit" value="Add Freira">
                                </form>
                                <br/>
                                <table>
                                <c:forEach items="${list_formandas_associar_equipe}" var="formanda">
                                    <tr>
                                            <td width="300px">
                                                <b>Nome: ${formanda.nome}</b>
                                            </td>
                                            <td>
                                                <b>Função: <c:out value="${map_funcoes_formanda[formanda.idFormanda]}"></c:out></b>
                                            </td>
                                            <td>
                                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                                    <input type="hidden" name="action" value="50">
                                                    <input type="hidden" name="id_desassociar" value="${formanda.idFormanda}">
                                                    <input type="hidden" name="opcao_desassociar" value="formanda">
                                                    <input class="i2Style_internal" type="submit" value="Remover">
                                                </form>
                                            </td>
                                        </tr>
                                </c:forEach>
                                </table>
                                <form action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type="hidden" name="action" value="48">
                                    <input type="hidden" name="initial_index_formanda" value="0">
                                    <input class="i2Style_internal" type="submit" value="Add Formanda">
                                </form>
                                <br/>
                                <form name="cadastroFormandas" action="/ImCarm_2.0/ServletControler" method="post">	
                                    <b>Nome:</b>
                                    <input size="80" type="text" name="nome_equipe" value="${equipe.nome}">
                                    <input type="hidden" name="action" value="51">
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