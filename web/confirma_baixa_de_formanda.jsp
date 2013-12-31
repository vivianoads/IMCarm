<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Casa de Missão</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_confirma_cadastro_de_congregacao.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <div id="linha_menu_escolhida">
                                <form name="cad_fraternidade" action="/ImCarm_2.0/ServletControler" method="post">
                                    <input type=hidden name="action" value="12">
                                    <input type=hidden name="next_url" value="cadastrodecasasdemissao.jsp">
                                    <input type="image" src="IconeCadastrarCasaDeMissao.png">
                                </form>
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

                            <h3 align="center">Baixa de Formanda Efetuada com Sucesso</h3>
                            
                            
                            
                            
                            
                            
                            
                            <b>Nome: ${formanda.nome}</b>
                                
                                <b>Data de Nascimento: ${formanda.dataNascimento}</b>
                                <br/>
                                <b>Pai: ${formanda.pai}</b>
                                <b>Mãe: ${formanda.mae}</b>
                                <br/>
                                <br/>
                                <b>Rua: ${formanda.rua}</b>
                                <b>Núm.: ${formanda.numero}</b>
                                <b>Bairro:${formanda.bairro}</b>
                                <br/>
                                <br/>
                                <b>Cidade:${formanda.cidade}</b>
                                <b>Estado: ${formanda.uf}</b>
                                <b>CEP: ${formanda.cep}</b>
                                <br/>
                                <br/>
                                <b>Email: ${formanda.email}</b>
                                <b>Tel.: ${formanda.telefone}</b>
                                <b>Diocese: ${formanda.diocese}</b>
                                <br/>
                                <br/>
                                <b>Etapa de Formação Atual: ${formanda.etapa}</b>
                                <b>Data de Ingressso nesta Etapa:${formanda.dataEtapaAtual}</b>
                                <br/>
                                <b>Atividade: </b>
                                <c:choose>
                                    <c:when test="${formanda.atividade eq 'sim'}">
                                        <b>Formanda Ativa</b>
                                    </c:when>
                                    <c:otherwise>
                                        <b>Formanda Inativa</b>
                                        <b>
                                            Motivo : ${formanda.motivoInatividade}
                                        </b>
                                    </c:otherwise>
                                </c:choose>
                                <br/>
                                <br/>
                            
                            ${formanda.idFormanda}
                            
                            
                            
                            
                            
                           
                            <div id="linha_buttons">
                                <div id="option_buttons_1">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="61">
                                        <input type="hidden" name="id_formanda_Cancelar" value="${formanda.idFormanda}">
                                        <input type="submit" class="i2Style_apagar" value="Calcelar Baixa">
                                    </form>
                                </div>
                                <div id="option_buttons_2">
<!--                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="55">
                                        <input type="hidden" name="id_formanda_alterar_dados" value="${formandagravada.idFormanda}">
                                        
                                        <input type="submit" class="i2Style_alterar" value="Alterar Dados">
                                    </form>-->
                                </div>
                                <div id="option_buttons_3">
                                    <form action="/ImCarm_2.0/ServletControler" method="post">
                                        <input type="hidden" name="action" value="60">
                                        <input type="submit" class="i2Style" value="Confirmar Baixa">
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