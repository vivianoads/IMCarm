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
                    <h3 align="center">Exibe Dados Freiras</h3>
                    <br/>
                    <br/>
                    <b>Nome Civil: </b>${freira.nomeCivil}
                    <br/>
                    <br/>
                    <b>Nome Religioso: </b>${freira.nomeReligioso}
                    <br/>
                    <br/>
                    <b>Data de Nascimento: </b>${freira.dataNascimento}
                    <b>CPF: </b>${freira.cpf}
                    <b>RG: </b>${freira.rg}
                    </br>
                    <br/>
                    <b>Pai: </b>${freira.nomePai}
                    <b>Mãe: </b>${freira.nomeMae}
                    <br/>
                    <br/>
                    <b>Rua: </b>${freira.ruaFamilia}
                    <b>Núm.: </b>${freira.numeroFamilia}
                    <b>Bairro: </b>${freira.bairroFamilia}
                    <br/>
                    <br/>
                    <b>Cidade: </b>${freira.cidadeFamilia}
                    <b>UF: </b>${freira.estadoFamilia}
                    <b>CEP: </b>${freira.cepFamilia}
                    <br/>
                    <br/>
                    <b>Diocese: </b>${freira.diocese}
                    <b>Tel.: </b>${freira.telefone}
                    <b>Email: </b>${freira.email}
                    <br/>
                    <br/>
                    <b>Aspirantado: </b>${freira.dataAspirantado}
                    <b>Postulantado: </b>${freira.dataPostulantado}
                    <b>Noviciado Canônico: </b>${freira.dataNoviciadoCanonico}
                    <br/>
                    <br/>
                    <b>Noviciado Apostólico: </b>${freira.dataNoviciadoApostolico}
                    <b>Juniorado: </b>${freira.datasJuniorado}
                    <b>Juniorado I Renovação: </b>${freira.datasJunioradoI}
                    <br/>
                    <br/>
                    <b>Juniorado II Renov.: </b>${freira.datasJunioradoII}
                    <b>Juniorado III Renov.: </b>${freira.datasJunioradoIII}
                    <b>Juniorado IV Renov.: </b>${freira.datasJunioradoIV}
                    <br/>
                    <br/>
                    <b>Juniorado V Renov.: </b>${freira.datasJunioradoV}
                    <b>Juniorado VI Renov.: </b>${freira.datasJunioradoVI}
                    <b>Juniorado VII Renov.: </b>${freira.datasJunioradoVII}
                    <br/>
                    <br/>
                    <b>Juniorado VIII Renov.: </b>${freira.datasJunioradoVIII}
                    <b>Juniorado IX Renov.: </b>${freira.datasJunioradoIX}
                    <b>Profissão Simples: </b>${freira.dataProfissaoTemporaria}
                    <br/>
                    <br/>
                    <b>Profissão Perpétua: </b>${freira.dataProfissaoPerpetua}
                    <b>Atividade: </b>
                    <c:choose>
                        <c:when test="${freira.ativo eq 'sim'}">
                            Freira Ativa
                        </c:when>
                        <c:otherwise>
                            Freira Inativa
                        </c:otherwise>
                    </c:choose>
                    <b>Tipo de Atividade: </b>${freira.tipoAtivo}
                    <br/>
                </div>
            </div>
        </div>
    </body>
</html>