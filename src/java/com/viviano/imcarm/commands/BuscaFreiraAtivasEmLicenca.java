/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;
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
public class BuscaFreiraAtivasEmLicenca implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "lista_irma_consulta.jsp";
        List<FreiraBean> freiras = new ArrayList<FreiraBean>();
        FreiraDao freiraDao = new FreiraDao();
        
        try {
            List<FreiraBean> aux = freiraDao.getAllFreiraBeanAtivas();
            for(FreiraBean f : aux){
                if(f.getTipoAtivo().equals("licenca")){
                freiras.add(f);
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaFreiraAtivasEmLicenca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaFreiraAtivasEmLicenca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("freiras", freiras);
        return nextPage;
    }
    
}
