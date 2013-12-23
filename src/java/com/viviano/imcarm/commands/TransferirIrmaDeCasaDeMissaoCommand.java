/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.AgregacaoBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.AgregacaoDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class TransferirIrmaDeCasaDeMissaoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = request.getParameter("next_url");
        
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        System.out.println("id_freira "+idFreira);
        System.out.println("id_fraternidade "+idFraternidade);
        AgregacaoBean agregacaoBean = new AgregacaoBean();
        agregacaoBean.setFraternidade(idFraternidade);
        agregacaoBean.setFreira(idFreira);
        AgregacaoBean aux = new AgregacaoBean();
        AgregacaoDao agregacaoDao = new AgregacaoDao();
        
        FreiraBean freiraBean = new FreiraBean();
        FreiraDao freiraDao = new FreiraDao();
        
        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        
        try {
            aux = agregacaoDao.getAgregacaoFreira(idFreira);
            agregacaoDao.alteraAgregacoes(aux.getFraternidade(), aux.getFreira(), agregacaoBean);
            freiraBean = freiraDao.getFreiraBean(idFreira);
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            request.setAttribute("freira", freiraBean);
            request.setAttribute("fraternidade", fraternidadeBean);
            request.setAttribute("fraternidadeantiga", aux);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferirIrmaDeCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferirIrmaDeCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nextPage;
    }
    
}
