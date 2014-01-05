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
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class BuscaFreiraPorIdadeReligiosaSimples implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "lista_irma_consulta.jsp";
        Integer idade = new Integer(request.getParameter("idade_religiosa_simples"));
        List<FreiraBean> freiras = new ArrayList<FreiraBean>();
        FreiraDao freiraDao = new FreiraDao();
        
        try {
            List<FreiraBean> aux = new ArrayList<FreiraBean>();
            aux = freiraDao.getAllFreiraBean();
            System.out.println("aux.size " + aux.size());
            FreiraBean f = new FreiraBean();
            for(int i = 0; i < aux.size(); i++){
                System.out.println("i " + i);
                f = aux.get(i);
                System.out.println("aux.get(i) " + aux.get(i));
                if(UtilData.getIdade(f.getDataProfissaoTemporaria()).equals(idade)){
                freiras.add(f);
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaFreiraPorIdadeReligiosaSimples.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaFreiraPorIdadeReligiosaSimples.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("freiras", freiras);
        return nextPage;
    }
    
}
