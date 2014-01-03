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
public class AlteraDadosFreiraCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_cadastro_de_freira.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira_alterar_dados"));
        FreiraBean freiraBean = new FreiraBean();
        try {
            freiraBean = new FreiraDao().getFreiraBean(idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlteraDadosFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AlteraDadosFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("option", "alterar");
        request.setAttribute("freira", freiraBean);
        request.setAttribute("id_fase_de_formacao", request.getParameter("id_fase_de_formacao"));
        System.out.println("id fase formacao no command de alterar dados freira = " + request.getAttribute("id_fase_de_formacao"));
        return nextPage;
    }
    
}
