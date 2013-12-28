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
public class ConfirmaCadastroGovernoGeral implements Command{
    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecongregacoes.jsp";
        request.getSession().removeAttribute("governo_geral");
        return nextPage;
    }
}
