<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Bem Vindo</title>
        <link href="EstiloCadastroDeCongregacoes.css" rel="stylesheet" type="text/css">
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
                                    <input type=hidden name="action" value="12">
                                    <input type=hidden name="next_url" value="cadastrodecongregacoes.jsp">
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
                            <div id="linha_menu_interno">
                                <div id="conteudo_menu_interno1">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="30">
                                        <!--<input type=hidden name="next_url" value="formcadastracasademissao.jsp">-->
                                        <button class="i2Style_menu">Criar Congregação</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno2">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="32">
                                        <button class="i2Style_menu">Modificar Congregação</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno3">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="36">
<!--                                        <input type=hidden name="initial_index" value="0">
                                        <input type=hidden name="next_url" value="listacadasdemissaoparaeditar.jsp">-->
                                        <button class="i2Style_menu">Add Governo Geral</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno4">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="*">
                                        <input type=hidden name="initial_index" value="0">
                                        <input type=hidden name="next_url" value="listacadasdemissaoparaadicionarirmas.jsp">
                                        <button class="i2Style_menu">**Definir Gov. Geral Atual</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno5">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="20">
<!--                                        <input type=hidden name="initial_index_freira" value="0">
                                        <input type=hidden name="next_url" value="listafreirasparatransferirdecasademissao.jsp">-->
                                        <button class="i2Style_menu">**Modificar Gov. Geral</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno6">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="42">
                                        <button class="i2Style_menu">Add Equipe de Serviço</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno7">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="42">
                                        <button class="i2Style_menu">Modificar Eq. de Serviço</button>
                                        <!--INTERNO A ESSE MENU DEVE SER MOSTRADO UM FORMULÁRIO DE ALTERAÇÃO
                                        DE DADOS DE EQUIPE DE SERVIÇO E BOTÕES DE ADIÇÃO E BAIXA DE IRMÃS E FORMANDAS
                                        
                                        *ERRO: A TABELA AGREGAÇÃO DEVE SER SUBSTITUIDA PELA TABELA RESIDENCIA FRATERNIDADE-->
                                    </form>
                                </div>
                            </div>
<!--                            <a href="/ImCarm/#">
                                <button class="i2Style_menu">Criar Congregação</button>
                            </a>
                            <a href="/ImCarm/#">
                                <button class="i2Style_menu">Modificar Congregação</button>
                            </a>
                            <a href="/ImCarm/#">
                                <button class="i2Style_menu">Apagar Congregação</button>
                            </a>-->
                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>






        <!--        
                <div id="container">
                    <div id="topo">
                    </div>
                    <div id="menu">
                        <div id="login">
                            <div id="elementos">
                                <table cellspacing="37" width="780">
                                    <tr>
                                        <td>Seja Bem Vindo </td>
                                    </tr>
                                    <tr>
                                        <td><a href="/ImCarm/#"><img src="IconeAdicionarCongregacoes.png"></a></td> 
                                        <td><a href="/ImCarm/#"><img src="IconeAlterarDadosCongregacoes.png"></a></td> 
                                        <td><a href="/ImCarm/#"><img src="IconeApagarCongregacoes.png"></a></td> 
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div id="rodape">
                    </div>
                </div>-->
    </body>
</html>