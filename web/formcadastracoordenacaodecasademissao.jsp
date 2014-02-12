<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="EstiloFormularioCadastroDeCoordenacaoDeCasasDeMissao.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <h3 align="center">Cadastrar Coordenação de Casa de Missão</h3>
                            <h5>${mensagem_erro}</h5>
                            <b>Fraternidade:</b>
                            <b>${fraternidade.nome}</b>
                            <br/>
                            <br/>
                            <b>Coordenadora:</b> 
                            ${coordenadora.nomeReligioso}
                            <br/>
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                ${fraternidade.idFraternidade}
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                ${coordenadora.id}
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                ${tesoureira.id}
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                ${secretaria.id}
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_coordenadora.jsp">
                                <input type="submit" value="Add Coordenadora">
                            </form>
                            <br/>
                            <b>Tesoureira:</b> 
                            ${tesoureira.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">

                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">    
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_tesoureira.jsp">
                                <input type="submit" value="Add Tesoureira">
                            </form>
                            <br/>
                            <b>Secretária:</b> 
                            ${secretaria.nomeReligioso}
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="24">
                                <input type="hidden" name="initial_index_freira" value="0">
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="hidden" name="next_url" value="lista_irma_para_escolher_secretaria.jsp">
                                <input type="submit" value="Add Secretária">
                            </form>
                            <form action="/ImCarm_2.0/ServletControler" method="post">
                                <input type="hidden" name="action" value="26">
                                <input type="date" name="data_inicio">
                                <input type="date" name="data_termino">
                                <b>Esta é a atual Coordenação desta Fraternidade?</b>
                                <input type="radio" name="is_atual" value="Sim"> Sim
                                <input type="radio" name="is_atual" value="Não" checked> Não
                                <input type="hidden" name="id_fraternidade" value="${fraternidade.idFraternidade}">
                                <input type="hidden" name="id_coordenadora" value="${coordenadora.id}">
                                <input type="hidden" name="id_tesoureira" value="${tesoureira.id}">
                                <input type="hidden" name="id_secretaria" value="${secretaria.id}">
                                <input type="submit" value="Salvar">
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