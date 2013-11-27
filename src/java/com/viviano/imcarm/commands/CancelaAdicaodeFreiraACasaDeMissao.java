/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.persistencia.AgregacaoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelaAdicaodeFreiraACasaDeMissao implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecasasdemissao.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        
        AgregacaoDao agregacaoDao = new AgregacaoDao();
        try {
            agregacaoDao.apagaAgregacao(idFraternidade, idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaAdicaodeFreiraACasaDeMissao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaAdicaodeFreiraACasaDeMissao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nextPage;
        }
    
}
