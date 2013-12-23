/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.CoordenacaoFraternidadeBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.CoordenacaoFraternidadeDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.SplitString;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class EditaCoordenacaoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = request.getParameter("next_url");
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        CoordenacaoFraternidadeDao coordenacaoFraternidadeDao = new CoordenacaoFraternidadeDao();
        CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
        FreiraDao freiraDao = new FreiraDao();
        FreiraBean coordenadora = new FreiraBean();
        FreiraBean tesoureira = new FreiraBean();
        FreiraBean secretaria = new FreiraBean();
        try {
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            coordenacaoFraternidadeBean = coordenacaoFraternidadeDao.getCoordenacaoFraternidadeAtual(idFraternidade, "Sim");
            coordenadora = freiraDao.getFreiraBean(coordenacaoFraternidadeBean.getIdCoordenadora());
            tesoureira = freiraDao.getFreiraBean(coordenacaoFraternidadeBean.getIdTesoureira());
            secretaria = freiraDao.getFreiraBean(coordenacaoFraternidadeBean.getIdSecretaria());
            
            request.setAttribute("fraternidade", fraternidadeBean);
            request.setAttribute("coordenadora", coordenadora);
            request.setAttribute("tesoureira", tesoureira);
            request.setAttribute("secretaria", secretaria);
            request.setAttribute("data_inicio_split", new SplitString().splitStringMethod(coordenacaoFraternidadeBean.getDataInicio()));
            request.setAttribute("data_termino_split", new SplitString().splitStringMethod(coordenacaoFraternidadeBean.getDataTermino()));
            request.setAttribute("is_atual", coordenacaoFraternidadeBean.getIsAtual());
            
        } catch (SQLException ex) {
            Logger.getLogger(EditaCoordenacaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditaCoordenacaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
