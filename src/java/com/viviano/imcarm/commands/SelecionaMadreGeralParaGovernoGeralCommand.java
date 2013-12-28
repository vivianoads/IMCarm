/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.GovernoGeralBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.UtilSetaCorpoGovernoGeral;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SelecionaMadreGeralParaGovernoGeralCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_cadastro_de_governo_geral.jsp";
        Integer idFreira = new Integer (request.getParameter("id_freira"));
        String funcao = request.getParameter("tipo_cargo");
        
        FreiraDao freiraDao = new FreiraDao();
        FreiraBean freiraBean = new FreiraBean();
        GovernoGeralBean governoGeralBean;
        if(request.getSession().getAttribute("governo_geral") == null){
             governoGeralBean = new GovernoGeralBean();
        }else{
            governoGeralBean = (GovernoGeralBean) request.getSession().getAttribute("governo_geral");
        }
        
       
        try {
            
            freiraBean = freiraDao.getFreiraBean(idFreira);
//            governoGeralBean.setMadreGeral(freiraBean);
            System.out.println("funcao = " + funcao);
            UtilSetaCorpoGovernoGeral util = new UtilSetaCorpoGovernoGeral();
            
            request.getSession().setAttribute("governo_geral", util.getCommand(governoGeralBean, freiraBean, funcao));
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SelecionaMadreGeralParaGovernoGeralCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SelecionaMadreGeralParaGovernoGeralCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(request.getSession().getId());
        
        return nextPage;
    }
    
}
