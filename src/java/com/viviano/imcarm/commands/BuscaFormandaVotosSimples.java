/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FormandaDao;
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
public class BuscaFormandaVotosSimples implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "lista_formanda_consulta.jsp";
//        String nome = request.getParameter("formanda_por_etapa");
        List<FormandaBean> formandas = new ArrayList<FormandaBean>();
        FormandaDao formandaDao = new FormandaDao();
        
        try {
            formandas = formandaDao.getAllFormandaBeanEmProfisãoSimplesGeral();
//            for(FreiraBean f : aux){
//                if(UtilData.getIdade(f.getDataNascimento()).equals(idade)){
//                freiras.add(f);
//                }
//            }
//            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaFormandaVotosSimples.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaFormandaVotosSimples.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("formandas", formandas);
        request.setAttribute("quantidade", formandas.size());
        return nextPage;
    }
    
}
