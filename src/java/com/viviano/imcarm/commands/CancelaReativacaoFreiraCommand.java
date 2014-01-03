/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelaReativacaoFreiraCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodeirmas.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_freira_cancelar"));
        String motivo = request.getParameter("antigo_estado_atividade");
        
//        FormandaDao formandaDao = new FormandaDao();
        FreiraDao freiraDao = new FreiraDao();
        try {
            freiraDao.alteraFreira(idFormanda, motivo);
//            formandaDao.DarBaixaFormandaBean(idFormanda, motivo);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaReativacaoFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaReativacaoFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
