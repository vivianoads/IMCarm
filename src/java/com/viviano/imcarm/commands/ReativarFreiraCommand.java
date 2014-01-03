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
public class ReativarFreiraCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_reativacao_de_freira.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira_reativar"));
        String motivo = request.getParameter("novo_estado_atividade");
        
        FreiraDao freiraDao = new FreiraDao();
//        FormandaDao formandaDao = new FormandaDao();
//        FormandaBean fb = new FormandaBean();
        FreiraBean freiraBean = new FreiraBean();
        String antigoEstadoAtividade =  new String();
        try {
            antigoEstadoAtividade = freiraDao.getFreiraBean(idFreira).getTipoAtivo();
            freiraDao.ReativarFreira(idFreira, motivo);
            freiraBean = freiraDao.getFreiraBean(idFreira);
//            new FormandaDao().DarBaixaFormandaBean(idFreira, motivo);
//            fb = formandaDao.getFormandaBean(idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReativarFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReativarFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("antigo_estado_atividade", antigoEstadoAtividade);
        request.setAttribute("freira", freiraBean);
        return nextPage;
    }
    
}
