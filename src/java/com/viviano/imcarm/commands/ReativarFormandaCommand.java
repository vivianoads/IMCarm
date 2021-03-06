/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.persistencia.FormandaDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class ReativarFormandaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_cancelamento_de_baixa_de_formanda.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_formanda_reativar"));
        FormandaDao formandaDao = new FormandaDao();
        FormandaBean fb = new FormandaBean();
        String motivo = new String();
        try {
            fb = formandaDao.getFormandaBean(idFormanda);
            motivo = fb.getMotivoInatividade();
            formandaDao.CancelarBaixaFormandaBean(idFormanda);
            fb = formandaDao.getFormandaBean(idFormanda);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReativarFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReativarFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("motivo", motivo);
        request.setAttribute("formanda", fb);
        return nextPage;
    }
    
}
