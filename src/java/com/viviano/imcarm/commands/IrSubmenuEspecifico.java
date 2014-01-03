/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.GovernoGeralDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            case 3 : nextPage = "submenu_consulta_equipe_de_servico.jsp";
                    Integer idGovernoGeral = null;
                     List<EquipeServicoBean> equipes = new ArrayList<EquipeServicoBean>();
                    try {
                        idGovernoGeral = new GovernoGeralDao().getGovernoGeralAtual().getIdGoverno();
                        equipes = new EquipeServicoDao().getAllEquipeServicoBeanDeGovernoGeral(idGovernoGeral);
                        
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(IrSubmenuEspecifico.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(IrSubmenuEspecifico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("list_equipes", equipes);
                    break;
            case 4 : nextPage = "submenu_consulta_fraternidade.jsp";
                    List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
                    try {
                        fraternidades = new FraternidadeDao().getAllFraternidade();
                    } catch (SQLException ex) {
                        Logger.getLogger(IrSubmenuEspecifico.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(IrSubmenuEspecifico.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("list_fraternidades", fraternidades);
                    break;
        }
        return nextPage;
    }
    
}
