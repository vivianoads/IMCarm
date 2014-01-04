/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.utilconsulta.UtilData;
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
public class BuscaFreiraEspecifica implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "especifico_irma_consulta.jsp";
//        List<FreiraBean> freira = new ArrayList<FreiraBean>();
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        FreiraBean freira = new FreiraBean();
        FreiraDao freiraDao = new FreiraDao();
        
        try {
            freira = freiraDao.getFreiraBean(idFreira);
//            for(FreiraBean f : aux){
//                if(UtilData.getIdade(f.getDataNascimento()).equals(idade)){
//                freiras.add(f);
//                }
//            }
//            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaFreiraEspecifica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaFreiraEspecifica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("freira", freira);
        return nextPage;
    }
    
}
