<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="Estilolistacasasdemissaoparaadicionarirmas.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <div id="linha_menu_escolhida">
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
                            <h3 align="center">Selecionar Fraternidade para Adicionar Irmãs</h3>
                            <c:forEach items="${fraternidadespaginada}" var="fraternidade">
                                <div id="linha_conteudo">
                                    <div id="linha_conteudo_nome">
                                        ${fraternidade.nome}
                                    </div>
                                    <div id="linha_conteudo_apagar">
                                        <form action="/ImCarm_2.0/ServletControler" method="post">
                                            <input type="hidden" name="action" value="17">
                                            <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                            <input type="hidden" name="initial_index_freira" value="0">
                                            <input type="hidden" name="next_url" value="listafreirasparaadicionaracasasdemissao.jsp">
                                            <button class="i2Style_apagar">Adicionar Irmãs</button>
                                        </form>
                                    </div>
                                </div>
                            </c:forEach>
                            <table>
                                <tr>
                                    <c:forEach items="${paginacao}" var="pagina">
                                        <td>
                                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                                <input type="hidden" name="action" value="10">
                                                <input type="hidden" name="initial_index" value="${pagina}">
                                                <input type=hidden name="next_url" value="listacadasdemissaoparaadicionarirmas.jsp">
                                                <input type="submit" value="${pagina}">
                                            </form>
                                        </td>
                                    </c:forEach>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>
    </body>
</html>