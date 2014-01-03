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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class DarBaixaEmFreiraCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_baixa_de_freira.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira_baixa"));
        String motivo = request.getParameter("motivo_baixa");
        
        FreiraDao freiraDao = new FreiraDao();
//        FormandaDao formandaDao = new FormandaDao();
//        FormandaBean fb = new FormandaBean();
        FreiraBean freiraBean = new FreiraBean();
        String tipoAtivoAntigo = new String();
        
        try {
            tipoAtivoAntigo = freiraDao.getFreiraBean(idFreira).getTipoAtivo();
            freiraDao.alteraFreira(idFreira, motivo);
            freiraBean = freiraDao.getFreiraBean(idFreira);
//            new FormandaDao().DarBaixaFormandaBean(idFreira, motivo);
//            fb = formandaDao.getFormandaBean(idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DarBaixaEmFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DarBaixaEmFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("tipo_ativo_antigo", tipoAtivoAntigo);
        request.setAttribute("freira", freiraBean);
        return nextPage;
    }
    
}
