<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Casa de Missão</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="EstiloFormularioCadastroDeCasasDeMissao.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <form name="cadastroFormandas" action="/ImCarm_2.0/ServletControler" method="post">	
                                <h3 align="center">Cadastrar Casa de Missão</h3>
                                <h5>${mensagem_erro}</h5>
                                <b>Nome:</b>
                                <input size="90" type="text" name="nome" value="${fraternidadebean.nome}">
                                <b>Data de Fundação:</b> 
                                <input size="10" type="text" name="data_fundacao" maxlength="10" value="${fraternidadebean.dataFundacao}">
                                <br/>
                                <br/>
                                <br/>
                                <b>Rua:</b>
                                <input size="53" type="text" name="rua" value="${fraternidadebean.rua}">
                                <b>Numero:</b>
                                <input size="5" type="text" name="numero" value="${fraternidadebean.numeroCasa}">
                                <b>Bairro:</b>
                                <input size="40" type="text" name="bairro" value="${fraternidadebean.bairro}">
                                <br/>
                                <br/>
                                <br/>
                                <b>Cidade:</b>
                                <input size="75" type="text" name="cidade" value="${fraternidadebean.cidade}">
                                <b>CEP:</b>
                                <input size="22" type="text" name="cep" value="${fraternidadebean.cep}">
                                <b>UF:</b>
                                <input size="5" type="text" name="uf" maxlength="2" value="${fraternidadebean.uf}">
                                <br/>
                                <br/>
                                <br/>
                                <b>Telefone:</b>
                                <input size="30" type="text" name="telefone" value="${fraternidadebean.telefone}">
                                <b>Email:</b>
                                <input size="79" type="text" name="email" value="${fraternidadebean.email}">
                                <br/>
                                <br/>
                                <br/>
                                <b>Diocese</b>
                                <input size="55" type="text" name="diocese" value="${fraternidadebean.diocese}">
                                <b>Bispo</b>
                                <input size="56" type="text" name="bispo" value="${fraternidadebean.bispo}">
                                <br/>
                                <br/>
                                <br/>
                                <b>Status</b>
                                <input size="50" type="radio" name="status" value="ativa" checked><b>Ativa</b>
                                <input size="50" type="radio" name="status" value="inativa"><b>Inativa</b>
                                <input type="hidden" name="action" value="8">
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