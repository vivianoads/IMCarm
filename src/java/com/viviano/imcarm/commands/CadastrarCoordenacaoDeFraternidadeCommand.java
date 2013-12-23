/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CadastrarCoordenacaoDeFraternidadeCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        
        String nextPage = request.getParameter("next_url");
        
        try {
            
            Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
            FraternidadeDao fraternidadeDao = new FraternidadeDao();
            FraternidadeBean fraternidadeBean = new FraternidadeBean();
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            request.setAttribute("fraternidade", fraternidadeBean);
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarCoordenacaoDeFraternidadeCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarCoordenacaoDeFraternidadeCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
