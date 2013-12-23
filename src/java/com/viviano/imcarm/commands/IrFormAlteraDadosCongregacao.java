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
public class IrFormAlteraDadosCongregacao implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_cadastro_de_congregacao.jsp";
        Integer idCongregacao = new Integer(request.getParameter("id_congregacao"));
        String option = request.getParameter("option");
        CongregacaoDao congregacaoDao = new CongregacaoDao();
        CongregacaoBean congregacaoBean = new CongregacaoBean();
        try {
            congregacaoBean = congregacaoDao.getCongregacao(idCongregacao);
            request.setAttribute("congregacao", congregacaoBean);
            request.setAttribute("option", option);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IrFormAlteraDadosCongregacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IrFormAlteraDadosCongregacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nextPage;
    }
    
}
