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
public class CancelaCadastroGovernoGeral implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecongregacoes.jsp";
        GovernoGeralDao governoGeralDao = new GovernoGeralDao();
        
        GovernoGeralBean governoGeralBean = (GovernoGeralBean) request.getSession().getAttribute("governo_geral");
        System.out.println(governoGeralBean.getIdGoverno());
        try {
            governoGeralDao.apagaGovernoGeral(governoGeralBean.getIdGoverno());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaCadastroGovernoGeral.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaCadastroGovernoGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(governoGeralBean.getIsaAtual().equals("sim")){
            Integer idAntigoAtual = new Integer(request.getParameter("id_antigo_atual"));
            try {
                governoGeralDao.alteraGovernoGeralAtual(idAntigoAtual, "sim");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CancelaCadastroGovernoGeral.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CancelaCadastroGovernoGeral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        request.getSession().removeAttribute("governo_geral");
        return nextPage;
    }
    
}
