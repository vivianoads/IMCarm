/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.persistencia.FormandaDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelarBaixaFormandaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodeformandas.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_formanda_Cancelar"));
        FormandaDao formandaDao = new FormandaDao();
        try {
            formandaDao.CancelarBaixaFormandaBean(idFormanda);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelarBaixaFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelarBaixaFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nextPage;
    }
    
}
