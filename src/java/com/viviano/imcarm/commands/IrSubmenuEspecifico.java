/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class IrSubmenuEspecifico implements Command{

    
    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = new String();
        Integer optionConsulta = new Integer(request.getParameter("option_consulta"));
        
        switch(optionConsulta){
            case 1 : nextPage = "submenu_consulta_freira.jsp";break;
            case 2 : nextPage = "submenu_consulta_formanda.jsp";break;
            case 3 : nextPage = "submenu_consulta_equipe_de_servico.jsp";break;
            case 4 : nextPage = "submenu_consulta_fraternidade.jsp";break;
        }
        return nextPage;
    }
    
}
