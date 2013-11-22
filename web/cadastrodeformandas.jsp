<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Bem Vindo</title>
        <link href="EstiloCadastroDeformandas.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="container"> 
            <div id="topo">
                <div id="conteudo_topo">
                    <img src="informatize_logo_system.png">
                </div>
                <div id="user_options">
                    <br/>
                    Usuario Logado:  [ VIVIANO ] ${usuariologado.nome}
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
                            <a href="/ImCarm_2.0/formcadastraformanda.jsp">
                                <button class="i2Style_menu">Criar Formanda</button>
                            </a>
                            <a href="/ImCarm_2.0/ServletControler?action=7">
                                <button class="i2Style_menu">Modificar Formanda</button>
                            </a>
                            <a href="/ImCarm_2.0/ServletControler?action=7">
                                <button class="i2Style_menu">Apagar Formanda</button>
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
                                <td>Seja Bem Vindo ${usuarioLogado.cpfFreira}</td>
                            </tr>
                            <tr>
                                <td><a href="/ImCarm/formcadastraformanda.jsp"><img src="IconeAdicionarFormandas.png"></a></td> 
                                <td><a href="/ImCarm/ServletControler?action=7"><img src="IconeAlterarDadosFormanda.png"></a></td> 
                                <td><a href="/ImCarm/ServletControler?action=7"><img src="IconeApagarFormandas.png"></a></td> 
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