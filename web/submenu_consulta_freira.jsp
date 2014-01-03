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
                    [ ${usuariologado.nomeCivil} ] 
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
                            <div id="linha_menu_interno">
                                <div id="conteudo_menu_interno1">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="84">
                                        <input type="hidden" name="option_consulta" value="1">
                                        <button class="i2Style_menu">Consultar <br/> Freiras</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno2">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="84">
                                        <input type="hidden" name="option_consulta" value="2">
                                        <button class="i2Style_menu">Consultar <br/> Formandas</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno3">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="84">
                                        <input type="hidden" name="option_consulta" value="3">
                                        <button class="i2Style_menu">Consultar <br/>  Eq. de Serviço</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno4">
                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="84">
                                        <input type=hidden name="option_consulta" value="4">
                                        <button class="i2Style_menu">Consultar <br/> Fraternidades</button>
                                    </form>
                                </div>
                                <div id="conteudo_menu_interno5">
<!--                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="63">
                                        <input type=hidden name="initial_index_formanda" value="0">
                                        <button class="i2Style_menu">Permuta de Fase</button>
                                    </form>-->
                                </div>
                                <div id="conteudo_menu_interno6">
<!--                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="*">
                                        <button class="i2Style_menu">Conclusão da Formação</button>
                                        DEPENDE DE TER CONCLUÍDO O CADASTRO DE FREIRAS, POIS DAQUI, O USUÁRIO DEVE SER REDIRECIONADO 
                                        PARA A PÁGINA DE FORMULÁRIO DE CADASTRO DE FREIRA PARA SEREM INFORMADOS OS DADOS COMPLEMENTARES AO CADASTRO
                                    </form>-->
                                </div>
                                <div id="conteudo_menu_interno7">
<!--                                    <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type=hidden name="action" value="*">
                                        <button class="i2Style_menu">**</button>
                                    </form>-->
                                </div>
                            </div>
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
                                <td><a href="/ImCarm/CadastroDeIrmas.html"> <img src="IconeAdicionarIrmas.png"> </a></td> 
                                <td><a href="/ImCarm/alteradadosirma.jsp"><img src="IconeAlterarDadosIrmas.png"></a></td> 
                                <td><a href="/ImCarm/alteradadosirma.jsp"><img src="IconeApagarIrmas.png"></a></td> 
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