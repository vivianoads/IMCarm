/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.persistencia.EquipeServicoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class ApagaEquipeDeServico implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecongregacoes.jsp";
        Integer idEquipeServico = new Integer(request.getParameter("id_equipe_servico"));
        EquipeServicoDao equipeServicoDao = new EquipeServicoDao();
        try {
            equipeServicoDao.apagaEquipeServico(idEquipeServico);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApagaEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ApagaEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
