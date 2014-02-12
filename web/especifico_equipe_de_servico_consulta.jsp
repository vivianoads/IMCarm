<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>#INFORMATIZE</title>
        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <link href="estilo_lista_irmas_consulta.css" rel="stylesheet" type="text/css"><!--EstiloCadastroDeIrmas.css-->
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
                            <h3 align="center">Listar Equipes de Servico</h3>
                            <br/>
                            <br/>
                            <b>Coordenadora:</b>
                                ${coordenadora.nomeReligioso}
                                <br/>
                                <br/>
                                <b>Nome:</b> 
                                ${equipe.nome}
                                <br/>
                                <c:forEach items="${list_freiras_associar_equipe}" var="freira">
                                    <table>
                                        <tr>
                                            <td width="300px">
                                                <b>Nome: ${freira.nomeReligioso}</b>
                                            </td>
                                            <td>
                                                <b>Função: <c:out value="${map_funcoes_freira[freira.id]}"></c:out></b>
                                            </td>
                                        </tr>
                                    </table>
                                </c:forEach>
                                <br/>
                                <table>
                                <c:forEach items="${list_formandas_associar_equipe}" var="formanda">
                                        <tr>
                                            <td width="300px">
                                                <b>Nome: ${formanda.nome}</b>
                                            </td>
                                            <td>
                                                <b>Função: <c:out value="${map_funcoes_formanda[formanda.idFormanda]}"></c:out></b>
                                            </td>
                                        </tr>
                                </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>