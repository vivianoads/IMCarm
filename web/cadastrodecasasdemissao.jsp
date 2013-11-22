<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Bem Vindo</title>
        <link href="EstiloCadastroDeCasasDeMissao.css" rel="stylesheet" type="text/css">
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
                                <a href="/ImCarm_2.0/cadastrodecasasdemissao.jsp">
                                    <img src="IconeCadastrarCasaDeMissao.png">
                                </a>
                            </div>
                            <div id="linha_menu">
                                <a href="/ImCarm_2.0/cadastrodecongregacoes.jsp">
                                    <img src="IconeCadastrarCongregacao.png">
                                </a>
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
                            <a href="/ImCarm/formcadastracasademissao.jsp">
                                <button class="i2Style_menu">Criar Fraternidade</button>
                            </a>
                            <a href="/ImCarm/ServletControler?action=10">
                                <button class="i2Style_menu">Modificar Fraternidade</button>
                            </a>
                            <a href="/ImCarm/ServletControler?action=10">
                                <button class="i2Style_menu">Apagar Fraternidade</button>
                            </a>
                            <a href="/ImCarm/ExibeCasasDeMissaoParaAdicionarIrmas">
                                <button class="i2Style_menu">Adicionar Irmã à Fraternidade</button>
                            </a>
                            <a href="/ImCarm/#">
                                <button class="i2Style_menu">Transferir Irmã</button>
                            </a>
                            <a href="/ImCarm/#">
                                <button class="i2Style_menu">Criar Coordenacao</button>
                            </a>
                            <a href="/ImCarm/#">
                                <button class="i2Style_menu">Modificar Coordenação</button>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>















        <!--        <div id="container">
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
                                        <td><a href="/ImCarm/formcadastracasademissao.jsp"><img src="IconeAdicionarCasasdeMissao.png"></a></td> 
                                        <td><a href="/ImCarm/ServletControler?action=10"><img src="IconeAlterarDadosCasasdeMissao.png"></a></td> 
                                        <td><a href="/ImCarm/ServletControler?action=10"><img src="IconeApagarCasasdeMissao.png"></a></td> 
        
                                    </tr>
                                    <tr>
                                        <td><a href="/ImCarm/ExibeCasasDeMissaoParaAdicionarIrmas"><img src="IconeAdicionarIrmas.png"></a></td> 
                                        <td><a href="/ImCarm/#"><img src="IconeTransferirIrmas.png"></a></td> 
                                        <td></td> 
                                    </tr>
                                    <tr>
                                        <td><a href="/ImCarm/#"><img src="IconeAdicionarCoordenacao.png"></a></td> 
                                        <td><a href="/ImCarm/#"><img src="IconeAlterarDadosDeCoordenacao.png"></a></td> 
                                        <td></td> 
                                    <tr>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div id="rodape">
                    </div>
                </div>-->
    </body>
</html>