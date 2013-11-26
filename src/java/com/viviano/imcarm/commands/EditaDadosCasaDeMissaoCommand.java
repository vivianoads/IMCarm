/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.persistencia.FraternidadeDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class EditaDadosCasaDeMissaoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "";
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        System.out.println(request.getParameter("id_fraternidade"));
        try {
            System.out.println(fraternidadeDao.getFraternidade(new Integer(request.getParameter("id_fraternidade"))));
            request.setAttribute("fraternidadebean", fraternidadeDao.getFraternidade(new Integer(request.getParameter("id_fraternidade"))));
            nextPage = "formcadastracasademissao.jsp";
        } catch (SQLException ex) {
            Logger.getLogger(EditaDadosCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditaDadosCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
