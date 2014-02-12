<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_lista_irmas_consulta.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="container"> 
            <div id="topo">
                <div id="conteudo_topo">
                    <img src="informatize_logo_system.png">
                </div>
            </div>
            <div id="centro">
                <div id="conteudo_centro">
                    <br/>
                    <div id="voltar">
                        <a href="javascript:window.history.go(-1)"><button class="i2Style_alterar">Voltar</button></a>
                    </div>
                    <div id="voltar_menu">
                        <button onClick="javascript:window.print()" class="i2Style_alterar">Imprimir</button>
                    </div>
                            <h3 align="center">Listar Formandas</h3>
                            <br/>
                                <b>Nome: </b>${formanda.nome}
                                <br/>
                                <br/>
                                <b>Data de Nascimento: </b>${formanda.dataNascimento}
                                <br/>
                                <br/>
                                <b>Pai: </b>${formanda.pai}
                                <b>Mãe: </b>${formanda.mae}
                                <br/>
                                <br/>
                                <b>Rua: </b>${formanda.rua}
                                <b>Núm.: </b>${formanda.numero}
                                <b>Bairro: </b>${formanda.bairro}
                                <br/>
                                <br/>
                                <b>Cidade: </b>${formanda.cidade}
                                <b>Estado: </b>${formanda.uf}
                                <b>CEP: </b>${formanda.cep}
                                <br/>
                                <br/>
                                <b>Email: </b>${formanda.email}
                                <b>Tel.: </b>${formanda.telefone}
                                <b>Diocese: </b>${formanda.diocese}
                                <br/>
                                <br/>
                                <b>Etapa de Formação Atual: </b>${formanda.etapa}
                                <b>Data de Ingressso nesta Etapa:</b>${formanda.dataEtapaAtual}
                                <br/>
                                <br/>
                                <b>Atividade: </b>
                                <c:choose>
                                    <c:when test="${formanda.atividade eq 'sim'}">
                                        Formanda Ativa
                                    </c:when>
                                    <c:otherwise>
                                        Formanda Inativa
                                        <b>
                                            Motivo : 
                                        </b>
                                        ${formanda.motivoInatividade}
                                    </c:otherwise>
                                </c:choose>
                                <br/>
                                <br/>    
                </div>
            </div>
        </div>
    </body>
</html>