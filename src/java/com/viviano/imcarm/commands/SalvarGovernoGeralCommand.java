/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.GovernoGeralBean;
import com.viviano.imcarm.persistencia.GovernoGeralDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SalvarGovernoGeralCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_cadastro_de_governo_geral.jsp";
        String dataInicio = request.getParameter("data_inicio");
        String dataTermino = request.getParameter("data_termino");
        String isAtual = request.getParameter("is_atual");
        GovernoGeralBean governoGeralBean = (GovernoGeralBean) request.getSession().getAttribute("governo_geral");
        governoGeralBean.setDataInicio(dataInicio);
        governoGeralBean.setDataTermino(dataTermino);
        governoGeralBean.setIsaAtual(isAtual);
        request.getSession().setAttribute("governo_geral", governoGeralBean);
        GovernoGeralDao governoGeralDao = new GovernoGeralDao();
        GovernoGeralBean antigoAtual = null;
        System.out.println("isatual " +governoGeralBean.getIsaAtual());
        if (governoGeralBean.getIsaAtual().equalsIgnoreCase("sim")) {
            System.out.println("Este é um governo Atual");
            try {
                antigoAtual = governoGeralDao.getGovernoGeralAtual();
                if (antigoAtual != null) {
                    governoGeralDao.alteraGovernoGeralAtual(antigoAtual.getIdGoverno(), "nao");
                    antigoAtual.setIsaAtual("nao");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SalvarGovernoGeralCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SalvarGovernoGeralCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            governoGeralDao.gravaGovernoGeral(governoGeralBean);
            governoGeralBean = governoGeralDao.getUltimoGovernoGeralCadastrado();
            request.getSession().setAttribute("governo_geral", governoGeralBean);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarGovernoGeralCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarGovernoGeralCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("antigo_atual", antigoAtual);
        return nextPage;
    }
    
}
