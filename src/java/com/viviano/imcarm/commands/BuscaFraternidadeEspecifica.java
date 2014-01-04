/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
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
public class BuscaFraternidadeEspecifica implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "especifico_fraternidade_consulta.jsp";
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
//        List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
        FraternidadeBean fraternidade = new FraternidadeBean();
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        
        try {
            fraternidade = fraternidadeDao.getFraternidade(idFraternidade);
//            for(FreiraBean f : aux){
//                if(UtilData.getIdade(f.getDataNascimento()).equals(idade)){
//                freiras.add(f);
//                }
//            }
//            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaFraternidadeEspecifica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaFraternidadeEspecifica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("fraternidade", fraternidade);
        return nextPage;
    }
    
}
