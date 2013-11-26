/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class VerificaUsuarioLogadoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "";
        
        FreiraBean freiraBean = null;
        freiraBean = (FreiraBean) request.getSession().getAttribute("usuarioLogado");
        if(freiraBean != null) nextPage = request.getParameter("next_url");
        
        return nextPage;
    }
    
}
