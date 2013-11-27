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
public class AdicionaIrmaACasadeMissaoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirmaadicaodefreiraacasasdemissao.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        
        FreiraBean freiraBean = new FreiraBean();
        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        FreiraDao freiraDao = new FreiraDao();
        
        AgregacaoDao agregacaoDao = new AgregacaoDao();
        AgregacaoBean agregacaoBean = new AgregacaoBean();
        agregacaoBean.setFraternidade(idFraternidade);
        agregacaoBean.setFreira(idFreira);
        try {
            agregacaoDao.gravaAgregacao(agregacaoBean);
            freiraBean = freiraDao.getFreiraBean(idFreira);
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            request.setAttribute("freira", freiraBean);
            request.setAttribute("fraternidade", fraternidadeBean);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdicionaIrmaACasadeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionaIrmaACasadeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
