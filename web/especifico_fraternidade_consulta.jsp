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
<!--                        <form action="/ImCarm_2.0/ServletControler" method="post">
                            <input type="hidden" name="action" value="83">
                            <input type="submit" class="i2Style_alterar" value="Menu">
                        </form>-->
                    </div>
                            <h3 align="center">Listar Fraternidades</h3>
                            <br/>
                            <br/>
                            <b>Nome:</b>
                            ${fraternidadebean.nome}
                            <b>Data de Fundação:</b> 
                            ${fraternidadebean.dataFundacao}
                            <br/>
                            <br/>
                            <br/>
                            <b>Rua:</b>
                            ${fraternidadebean.rua}
                            <b>Numero:</b>
                            ${fraternidadebean.numeroCasa}
                            <b>Bairro:</b>
                            ${fraternidadebean.bairro}
                            <br/>
                            <br/>
                            <br/>
                            <b>Cidade:</b>
                            ${fraternidadebean.cidade}
                            <b>CEP:</b>
                            ${fraternidadebean.cep}
                            <b>UF:</b>
                            ${fraternidadebean.uf}
                            <br/>
                            <br/>
                            <br/>
                            <b>Telefone:</b>
                            ${fraternidadebean.telefone}
                            <b>Email:</b>
                            ${fraternidadebean.email}
                            <br/>
                            <br/>
                            <br/>
                            <b>Diocese</b>
                            ${fraternidadebean.diocese}
                            <b>Bispo</b>
                            ${fraternidadebean.bispo}
                            <br/>
                            <br/>
                            <br/>
                            <b>Status</b>
                            <b>${fraternidadebean.status}</b>
                            ${fraternidadebean.idFraternidade}
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