/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
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
public class ListaEquipesParaEditar implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "lista_equipes_para_editar.jsp";
        List<EquipeServicoBean> equipes = new ArrayList<EquipeServicoBean>();
        EquipeServicoDao equipeServicoDao = new EquipeServicoDao();
        Integer idGovernoAtual;
        try {
            idGovernoAtual = new GovernoGeralDao().getGovernoGeralAtual().getIdGoverno();
            equipes = equipeServicoDao.getAllEquipeServicoBeanDeGovernoGeral(idGovernoAtual);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListaEquipesParaEditar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListaEquipesParaEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("list_equipes", equipes);
        return nextPage;
    }
    
}
