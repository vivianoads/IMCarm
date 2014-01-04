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
public class IrMenuConsultas implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "menu_de_consultas.jsp";
        return nextPage;
    }
    
}
