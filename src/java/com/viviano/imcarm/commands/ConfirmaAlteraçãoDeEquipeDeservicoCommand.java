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
public class ConfirmaAlteraçãoDeEquipeDeservicoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecongregacoes.jsp";
        request.getSession().removeAttribute("coordenadora_equipe");
        request.getSession().removeAttribute("equipe");
        request.getSession().removeAttribute("map_funcoes_freira");
        request.getSession().removeAttribute("map_funcoes_formanda");
        request.getSession().removeAttribute("list_freiras_associar_equipe");
        request.getSession().removeAttribute("list_formandas_associar_equipe");
        return nextPage;
    }
    
}
