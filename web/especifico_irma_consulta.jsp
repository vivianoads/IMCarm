<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Cadastra Casa de Missão</title>
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
                            <h3 align="center">Exibe Dados Freiras</h3>
                            <b>Nome Civil: ${freira.nomeCivil}</b>
                                <b>Nome Religioso: ${freira.nomeReligioso}</b>
                                <br/>
                                <b>Data de Nascimento: ${freira.dataNascimento}</b>
                                <b>CPF: ${freira.cpf}</b>
                                <b>RG: ${freira.rg}</b>
                                </br>
                                <b>Pai: ${freira.nomePai}</b>
                                <b>Mãe: ${freira.nomeMae}</b>
                                <br/>
                                <b>Rua: ${freira.ruaFamilia}</b>
                                <b>Núm.: ${freira.numeroFamilia}</b>
                                <b>Bairro: ${freira.bairroFamilia}</b>
                                <br/>
                                <b>Cidade: ${freira.cidadeFamilia}</b>
                                <b>UF: ${freira.estadoFamilia}</b>
                                <b>CEP: ${freira.cepFamilia}</b>
                                <br/>
                                <b>Diocese: ${freira.diocese}</b>
                                <b>Tel.: ${freira.telefone}</b>
                                <b>Email: ${freira.email}</b>
                                <br/>
                                <b>Aspirantado: ${freira.dataAspirantado}</b>
                                <b>Postulantado: ${freira.dataPostulantado}</b>
                                <b>Noviciado Canônico: ${freira.dataNoviciadoCanonico}</b>
                                <br/>
                                <b>Noviciado Apostólico: ${freira.dataNoviciadoApostolico}</b>
                                <b>Juniorado: ${freira.datasJuniorado}</b>
                                <b>Juniorado I Renovação: ${freira.datasJunioradoI}</b>
                                <br/>
                                <b>Juniorado II Renov.: ${freira.datasJunioradoII}</b>
                                <b>Juniorado III Renov.: ${freira.datasJunioradoIII}</b>
                                <b>Juniorado IV Renov.: ${freira.datasJunioradoIV}</b>
                                <br/>
                                <b>Juniorado V Renov.: ${freira.datasJunioradoV}</b>
                                <b>Juniorado VI Renov.: ${freira.datasJunioradoVI}</b>
                                <b>Juniorado VII Renov.: ${freira.datasJunioradoVII}</b>
                                <br/>
                                <b>Juniorado VIII Renov.: ${freira.datasJunioradoVIII}</b>
                                <b>Juniorado IX Renov.: ${freira.datasJunioradoIX}">
                                <b>Profissão Simples: ${freira.dataProfissaoTemporaria}</b>
                                <br/>
                                <b>Profissão Perpétua: ${freira.dataProfissaoPerpetua}</b>
                                <b>Atividade: <c:choose>
                                    <c:when test="${freira.ativo eq 'sim'}">
                                        <b>Freira Ativa</b>
                                    </c:when>
                                    <c:otherwise>
                                        <b>Freira Inativa</b>
                                    </c:otherwise>
                                </c:choose>
                                <b>Tipo de Atividade: ${freira.tipoAtivo}</b>
                                <br/>
                                         
                </div>
            </div>
        </div>
    </body>
</html>







<!--		<div id="container"> 
                        
                        <div id="topo">
                        
                        </div>
                        
                        <div id="menu">
                        
                                <div id="login">
                                
                                        <div id="elementos">
                                        
                                        <form name="cadastroFormandas" action="/ImCarm/ServletControler?action=8" method="post">	
                                        <table cellspacing="35" width="590">
                                                <tr>
                                                        <td colspan="2" align="center"><h3>Cadastrar Casa de Missão</h3></td>
                                                </tr>
                                                <tr>
                                                        <td><b>Nome:</b></td> 
                                                        <td> <input size="50" type="text" name="nome" ></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Data de Fundação:</b></td> 
                                                        <td><input size="10" type="text" name="data_fundacao" maxlength="10"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Rua:</b></td> 
                                                        <td><input size="50" type="text" name="rua"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Numero:</b></td> 
                                                        <td><input size="5" type="text" name="numero"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Bairro:</b></td> 
                                                        <td><input size="50" type="text" name="bairro"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Cidade</b></td> 
                                                        <td><input size="50" type="text" name="cidade"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Diocese</b></td> 
                                                        <td><input size="50" type="text" name="diocese"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Bispo</b></td> 
                                                        <td><input size="50" type="text" name="bispo"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>UF</b></td> 
                                                        <td><input size="5" type="text" name="uf" maxlength="2"></td> 								
                                                </tr>
                                                <tr>
                                                        <td><b>Status</b></td> 
                                                        <td>
                                                                
                                                                <input size="50" type="radio" name="status" value="ativa" checked><b>Ativa</b>
                                                                <input size="50" type="radio" name="status" value="inativa"><b>Inativa</b>
                                                        </td> 								
                                                </tr>
                                                <tr>
                                                        <td></td>
                                                        <td align = "center"><input type="submit" value="Confirmar"></td>
                                                </tr>
                                                
                                                </table>
                                                
                                        </form>
                                        
                                        </div>			
                                                
                                        
                                </div>
                        
                        </div>
                        
                        <div id="rodape">
                        </div>
                
                </div>
                
        </body>
</html>-->