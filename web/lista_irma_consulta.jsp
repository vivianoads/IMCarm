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
                    <div id="voltar">
                        <a href="javascript:window.history.go(-1)"><button class="i2Style_alterar">Voltar</button></a>
                    </div>
                    <div id="voltar_menu">
                        <button onClick="javascript:window.print()" class="i2Style_alterar">Imprimir</button>
                    </div>
                    <h3 align="center">Listar Freiras</h3>
                            <c:forEach items="${freiras}" var="freira">
                                <div id="linha_conteudo">
                                    <div id="linha_conteudo_nome">
                                        ${freira.nomeReligioso}
                                    </div>
                                    <div id="linha_conteudo_apagar">
                                        <form action="/ImCarm_2.0/ServletControler" method="post">
                                            <input type="hidden" name="action" value="111">
                                            <input type="hidden" name="id_freira" value="${freira.id}">
                                            <button class="i2Style_apagar">Detalhes</button>
                                        </form>
                                    </div>
                                </div>
                            </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>