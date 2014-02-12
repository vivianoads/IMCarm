
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <link href="EstiloConfirmaexclusaoDeCasasDeMissao.css" rel="stylesheet" type="text/css">
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
                            <h3 align="center">Fraternidade Excluída com Sucesso</h3>
                            <b>Nome:</b>
                            ${fraternidadebean.nome}
                            <b>Data de Fundação:</b> 
                            ${fraternidadebean.dataFundacao}
                            <br/>
                            <br/>
                            <br/>
                            <b>Rua:</b>
                            ${fraternidadebean.rua}
                            <b>Numero:</b>
                            ${fraternidadebean.numeroCasa}
                            <b>Bairro:</b>
                            ${fraternidadebean.bairro}
                            <br/>
                            <br/>
                            <br/>
                            <b>Cidade:</b>
                            ${fraternidadebean.cidade}
                            <b>CEP:</b>
                            ${fraternidadebean.cep}
                            <b>UF:</b>
                            ${fraternidadebean.uf}
                            <br/>
                            <br/>
                            <br/>
                            <b>Telefone:</b>
                            ${fraternidadebean.telefone}
                            <b>Email:</b>
                            ${fraternidadebean.email}
                            <br/>
                            <br/>
                            <br/>
                            <b>Diocese</b>
                            ${fraternidadebean.diocese}
                            <b>Bispo</b>
                            ${fraternidadebean.bispo}
                            <br/>
                            <br/>
                            <br/>
                            <b>Status</b>
                            ${fraternidadebean.status}
                            <br/>
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="nome" value="${fraternidadebean.nome}">
                                        <input type="hidden" name="data_fundacao" maxlength="10" value="${fraternidadebean.dataFundacao}">
                                        <input type="hidden" name="rua" value="${fraternidadebean.rua}">
                                        <input type="hidden" name="numero" value="${fraternidadebean.numeroCasa}">
                                        <input type="hidden" name="bairro" value="${fraternidadebean.bairro}">
                                        <input type="hidden" name="cidade" value="${fraternidadebean.cidade}">
                                        <input type="hidden" name="cep" value="${fraternidadebean.cep}">
                                        <input type="hidden" name="uf" maxlength="2" value="${fraternidadebean.uf}">
                                        <input type="hidden" name="telefone" value="${fraternidadebean.telefone}">
                                        <input type="hidden" name="email" value="${fraternidadebean.email}">
                                        <input type="hidden" name="diocese" value="${fraternidadebean.diocese}">
                                        <input type="hidden" name="bispo" value="${fraternidadebean.bispo}">
                                        <input type="hidden" name="status" value="${fraternidadebean.status}">
                                        <input type="hidden" name="action" value="8">
                                        <input type="submit" class="i2Style_apagar" value="Reverter Exclusão">
                                    </form>
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="15">
                                        <input type="hidden" name="id_fraternidade" value="${fraternidadebean.idFraternidade}">
                                        <input type="submit" class="i2Style" value="Confirmar Exclusão">
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