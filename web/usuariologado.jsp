<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>
            Bem Vindo
        </title>
        <link href="EstiloUsuarioLogado.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="container"> 
            <div id="topo">
                <div id="conteudo_topo">
                    <img src="informatize_logo_system.png">
                </div>
                <div id="user_options">
                    Usuario Logado: 
                    <br/> [ ${usuarioLogado.nomeCivil} ] 
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
                                    <input type=hidden name="action" value="*">
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
                            <img src="bem_vindo_INFORMATIZE.png">
                        </div>
                    </div>
                </div>
            </div>
            <div id="rodape">
            </div>
        </div>
    </body>
</html>

<!--<div id="menu">
                <div id="login">
                    <div id="elementos">
                        <table cellspacing="37" width="780">
                            <tr>
                                <td>
                                    Seja Bem Vindo 
                                </td>
                                <td>
                                    <a href="/ImCarm/ServletControler?action=11">
                                        <button>
                                            SAIR
                                        </button>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a href="/ImCarm/cadastrodecasasdemissao.jsp">
                                        <img src="IconeCadastrarCasaDeMissao.png">
                                    </a>
                                </td> 
                                <td>
                                    <a href="/ImCarm/cadastrodecongregacoes.jsp">
                                        <img src="IconeCadastrarCongregacao.png">
                                    </a>
                                </td> 
                                <td>
                                    <a href="/ImCarm/cadastrodeformandas.jsp">
                                        <img src="IconeCadastrarFormandas.png">
                                    </a>
                                </td> 
                            </tr>
                        </table>
                        <table cellspacing="57" width="780">
                            <tr>
                                <td align="center">
                                    <a href="/ImCarm/cadastrodeirmas.jsp">
                                        <img src="IconeCadastrarFreiras.png">
                                    </a>
                                </td> 
                                <td align="center">
                                    <a href="/ImCarm/#">
                                        <img src="IconeRealizarBuscasNoSistema.png">
                                    </a>
                                </td>
                             </tr>
                             <tr>
                             </tr>
                        </table>
                    </div>
                </div>-->