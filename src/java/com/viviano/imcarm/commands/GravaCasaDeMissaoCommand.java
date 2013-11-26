package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GravaCasaDeMissaoCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {

        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        String option = request.getParameter("option");
        String nextPage = "";

        String nome = request.getParameter("nome");
        String status = request.getParameter("status");
        String rua = request.getParameter("rua");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String uf = request.getParameter("uf");
        String diocese = request.getParameter("diocese");
        String bispo = request.getParameter("bispo");
        String numeroCasa = request.getParameter("numero");
        String dataFundacao = request.getParameter("data_fundacao");
        String cep = request.getParameter("cep");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");

        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        fraternidadeBean.setNome(nome);
        fraternidadeBean.setStatus(status);
        fraternidadeBean.setRua(rua);
        fraternidadeBean.setBairro(bairro);
        fraternidadeBean.setCidade(cidade);
        fraternidadeBean.setUf(uf);
        fraternidadeBean.setDiocese(diocese);
        fraternidadeBean.setBispo(bispo);
        fraternidadeBean.setNumeroCasa(numeroCasa);
        fraternidadeBean.setDataFundacao(dataFundacao);
        fraternidadeBean.setCep(cep);
        fraternidadeBean.setEmail(email);
        fraternidadeBean.setTelefone(telefone);
        
        FreiraBean freiraBean = null;
        freiraBean = (FreiraBean) request.getSession().getAttribute("usuarioLogado");
        if (freiraBean != null) {
            System.out.println("entrou no IF");
            try {
                FraternidadeBean fraternidadeBeanAux = fraternidadeDao.getFraternidadePorNome(fraternidadeBean.getNome());
                System.out.println(fraternidadeBeanAux);
                if(!fraternidadeBean.getNome().isEmpty()){
                    if(fraternidadeBeanAux == null){
                        request.setAttribute("fraternidadebean", fraternidadeBean);
                        fraternidadeDao.gravaFraternidade(fraternidadeBean);
                        request.setAttribute("fraternidadebean", fraternidadeDao.getFraternidadePorNome(fraternidadeBean.getNome()));
                        nextPage = "confirmacadastrocasasdemissao.jsp";
                    }else if(fraternidadeBeanAux.getIdFraternidade() != 0){
                        System.out.println("atualizar");
                        fraternidadeDao.alteraFraternidade(fraternidadeBeanAux.getIdFraternidade(), fraternidadeBean);
                        request.setAttribute("fraternidadebean", fraternidadeDao.getFraternidadePorNome(fraternidadeBean.getNome()));
                        nextPage = "confirmacadastrocasasdemissao.jsp";
                    }else{
                        request.setAttribute("mensagem_erro", "**NOME DE FRATERNIDADE INVALIDO**");
                        nextPage = "formcadastracasademissao.jsp";
                    }
                }else{
                    System.out.println("nao entrou em nada");
                    nextPage = "formcadastracasademissao.jsp";
                }
            } catch (SQLException ex) {
                Logger.getLogger(GravaCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravaCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
//            
//            
//            
//            
//            
//            
//            
//            try {
//                System.out.println("fraternidadeBean.getNome() "+ fraternidadeBean.getNome());
//                    System.out.println("fraternidadeBean.getNome().isEmpty() " + fraternidadeBean.getNome().isEmpty());
//                    System.out.println("fraternidadeDao.getFraternidadePorNome(nome) "+ fraternidadeDao.getFraternidadePorNome(nome));
//                if ((!fraternidadeBean.getNome().isEmpty()) || (fraternidadeDao.getFraternidadePorNome(nome) == null)) {
//                    
//                    try {
//                        fraternidadeDao.gravaFraternidade(fraternidadeBean);
//                        List<FraternidadeBean> fraternidades = fraternidadeDao.getAllFraternidade();
//                        FraternidadeBean fraternidadeBeanGravada = fraternidadeDao.getFraternidade(fraternidades.get(fraternidades.size() - 1).getIdFraternidade());
//                        request.setAttribute("fraternidadebean", fraternidadeBeanGravada);
//                        nextPage = "/cadastracasasdemissao.jsp";
//                    } catch (ClassNotFoundException e) {
//                        e.printStackTrace();
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                } else {
//                    nextPage = "/formcadastracasademissao.jsp";
//                }
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        } else {
            nextPage = "";
        }
        return nextPage;
    }

}
