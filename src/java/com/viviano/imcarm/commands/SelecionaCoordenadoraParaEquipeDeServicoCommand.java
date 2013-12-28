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
public class SelecionaCoordenadoraParaEquipeDeServicoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_cadastro_de_equipe_de_servico.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        
        FreiraDao freiraDao = new FreiraDao();
        FreiraBean freiraBean = new FreiraBean();
        try {
            freiraBean = freiraDao.getFreiraBean(idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SelecionaCoordenadoraParaEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SelecionaCoordenadoraParaEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("coordenadora_equipe", freiraBean);
        return nextPage;
    }
    
}
