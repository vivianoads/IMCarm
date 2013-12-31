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
public class AlterarDadosFormandaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_cadastro_de_formanda.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_formanda_alterar_dados"));
        System.out.println("id formanda = " + idFormanda);
        FormandaBean fb = new FormandaBean();
        try {
            fb = new FormandaDao().getFormandaBean(idFormanda);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlterarDadosFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AlterarDadosFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("formanda", fb);
        request.setAttribute("opcao", "alterar");
        return nextPage;
    }
    
}
