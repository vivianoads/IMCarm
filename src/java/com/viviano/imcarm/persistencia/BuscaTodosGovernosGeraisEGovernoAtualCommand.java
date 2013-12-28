/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.persistencia;

import com.viviano.imcarm.commands.Command;
import com.viviano.imcarm.entidades.GovernoGeralBean;
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
public class BuscaTodosGovernosGeraisEGovernoAtualCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "";
        GovernoGeralDao governoGeralDao = new GovernoGeralDao();
        GovernoGeralBean governoGeralAtual;
        List<GovernoGeralBean> governosGerais = new ArrayList<GovernoGeralBean>();
        try {
            governoGeralAtual = governoGeralDao.getGovernoGeralAtual();
            governosGerais = governoGeralDao.getAllGovernoGeralBean();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaTodosGovernosGeraisEGovernoAtualCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaTodosGovernosGeraisEGovernoAtualCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
