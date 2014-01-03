/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelarBaixaEmFreira implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodeirmas.jsp";
        Integer idFreira = new Integer(request.getParameter("id_Freira_apagar"));
        String antigoTipoAtivo = request.getParameter("tipo_ativo_antigo");
        
        FreiraDao freiraDao = new FreiraDao();
        try {
            freiraDao.ReativarFreira(idFreira, antigoTipoAtivo);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelarBaixaEmFreira.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelarBaixaEmFreira.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nextPage;
    }
    
}
