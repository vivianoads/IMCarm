/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.CongregacaoBean;
import com.viviano.imcarm.persistencia.CongregacaoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CadastraCongregacao implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_cadastro_de_congregacao.jsp";
        String option = request.getParameter("option");
        String nome = request.getParameter("nome");
        String carisma = request.getParameter("carisma");
        String lema = request.getParameter("lema");
        String dataFundacao = request.getParameter("data_fundacao");
        String dataAgregacaoOrdem = request.getParameter("data_agregacao_a_ordem");
        String dataErecaoCanonica = request.getParameter("data_erecao_canonica");
        String cidadeFundacao = request.getParameter("cidade_fundacao");
        String fundador = request.getParameter("fundador");
        String coFundador = request.getParameter("co_fundador");
        
        CongregacaoBean congregacaoBean = new CongregacaoBean();
        
        congregacaoBean.setCarisma(carisma);
        congregacaoBean.setCidadeFundacao(cidadeFundacao);
        congregacaoBean.setCoFundador(coFundador);
        congregacaoBean.setDataAgregacaoOrdem(dataAgregacaoOrdem);
        congregacaoBean.setDataErecaoCanonica(dataErecaoCanonica);
        congregacaoBean.setDataFundacao(dataFundacao);
        congregacaoBean.setFundador(fundador);
        congregacaoBean.setLema(lema);
        congregacaoBean.setNome(nome);
        
        CongregacaoDao congregacaoDao = new CongregacaoDao();
        try {
            if(option.equals("alterar")){
                System.out.println("alterar");
                congregacaoDao.alteraCongregacao(new Integer(request.getParameter("id_congregacao")), congregacaoBean);
                request.setAttribute("congregacao", congregacaoDao.getCongregacao());
            }
            else{
            congregacaoDao.GravaCongregacao(congregacaoBean);
            request.setAttribute("congregacao", congregacaoDao.getCongregacao());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastraCongregacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            request.setAttribute("error_message", ex.getMessage());
            request.setAttribute("congregacao", congregacaoBean);
            Logger.getLogger(CadastraCongregacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
