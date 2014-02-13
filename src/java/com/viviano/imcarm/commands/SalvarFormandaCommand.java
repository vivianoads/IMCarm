package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FaseFormacaoBean;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FaseFormacaoDao;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalvarFormandaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "form_cadastro_de_formanda.jsp";
		VerificaUsuario verificaUsuario = new VerificaUsuario();
                
                String nome = request.getParameter("nome");
                String pai = request.getParameter("pai");
                String mae = request.getParameter("mae");
                String rua = request.getParameter("rua");
                String numero = request.getParameter("numero");
                String bairro = request.getParameter("bairro");
                String cidade = request.getParameter("cidade");
                String uf = request.getParameter("uf");
                String cep = request.getParameter("cep");
                String diocese = request.getParameter("diocese");
                String dataNascimento = request.getParameter("data_nascimento");
                String email = request.getParameter("email");
                String telefone = request.getParameter("telefone");
                String etapaFormacaoAtual = request.getParameter("etapa_formacao_atual");
                String dataIngressoEtapaAtual = request.getParameter("data_ingresso_etapa_atual");
                String atividade = request.getParameter("atividade");
                String motivoInatividade = request.getParameter("motivo_inatividade");
		String cpf = request.getParameter("cpf");
                String rg = request.getParameter("rg");
                
                FormandaBean f = new FormandaBean();
                
                f.setNome(nome);
                f.setAtividade(atividade);
                f.setBairro(bairro);
                f.setCep(cep);
                f.setCidade(cidade);
                f.setDataEtapaAtual(dataIngressoEtapaAtual);
                f.setDataNascimento(dataNascimento);
                f.setDiocese(diocese);
                f.setEmail(email);
                f.setEtapa(etapaFormacaoAtual);
                f.setMae(mae);
                f.setMotivoInatividade(motivoInatividade);
                f.setNumero(numero);
                f.setPai(pai);
                f.setRua(rua);
                f.setTelefone(telefone);
                f.setUf(uf);
                f.setCpf(cpf);
                f.setRg(rg);
                
		FormandaDao formandaDao = new FormandaDao();
                String opcao = request.getParameter("opcao");
                System.out.println("opcao = " + opcao);
                System.out.println("f.getNome = " + f.getNome());
		if (!f.getNome().isEmpty()){
                    
                    if(opcao.equals("alterar")){
                        try {
                            formandaDao.alteraFormanda(new Integer(request.getParameter("id_formanda")), f);
                            System.out.println("Alterou Formanda");
                            FormandaBean formandaBeanGravada = formandaDao.getFormandaBean(new Integer(request.getParameter("id_formanda")));
                            
                            
//                            Isso Precisa ser feito
                            
//                            FaseFormacaoDao faseFormacaoDao = new FaseFormacaoDao();
//                            FaseFormacaoBean faseFormacaoBean = new FaseFormacaoBean();
//                            faseFormacaoBean.setNome(formandaBeanGravada.getEtapa());
//                            faseFormacaoBean.setFormanda(formandaBeanGravada);
//                            faseFormacaoBean.setDataEntrada(formandaBeanGravada.getDataEtapaAtual());
//                            faseFormacaoDao.alteraFaseFormacao(idFaseFormacao, faseFormacaoBean);
                            
                            request.setAttribute("formandagravada", formandaBeanGravada);
                            nextPage = "confirma_cadastro_de_formanda.jsp";
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(SalvarFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(SalvarFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else {
                        try {
                            formandaDao.gravaFormanda(f);
                            
                            
                            
                            FormandaBean formandaBeanGravada = formandaDao.getUltimaFormandaBeanCadastrada();
                            
//                            FaseFormacaoDao faseFormacaoDao = new FaseFormacaoDao();
//                            FaseFormacaoBean faseFormacaoBean = new FaseFormacaoBean();
//                            faseFormacaoBean.setNome(formandaBeanGravada.getEtapa());
//                            faseFormacaoBean.setFormanda(formandaBeanGravada);
//                            faseFormacaoBean.setDataEntrada(formandaBeanGravada.getDataEtapaAtual());
//                            faseFormacaoDao.gravaFaseFormacao(faseFormacaoBean);
                            
                            request.setAttribute("formandagravada", formandaBeanGravada);
                            nextPage = "confirma_cadastro_de_formanda.jsp";
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }else{
			request.setAttribute("formanda", f);
                    }
		return nextPage;
	}
	

}
