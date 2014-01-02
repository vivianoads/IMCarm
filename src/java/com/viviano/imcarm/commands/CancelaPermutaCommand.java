/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FaseFormacaoBean;
import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.persistencia.FaseFormacaoDao;
import com.viviano.imcarm.persistencia.FormandaDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelaPermutaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodeformandas.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_formanda"));
        Integer IdFaseFormacaoAntiga = new Integer(request.getParameter("id_fase"));
        
        FaseFormacaoDao faseFormacaoDao = new FaseFormacaoDao();
        FaseFormacaoBean faseFormacaoBean = new FaseFormacaoBean();
        FormandaDao formandaDao = new FormandaDao();
        FormandaBean formandaBean = new FormandaBean();
        try {
            faseFormacaoBean = faseFormacaoDao.getFaseFormacaoBean(IdFaseFormacaoAntiga);
        
            formandaBean = formandaDao.getFormandaBean(idFormanda);

            formandaBean.setEtapa(faseFormacaoBean.getNome());
            formandaBean.setDataEtapaAtual(faseFormacaoBean.getDataEntrada());

            formandaDao.alteraFormanda(idFormanda, formandaBean);

            faseFormacaoDao.apagaFaseFormacao(faseFormacaoBean.getIdFase());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaPermutaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaPermutaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
    
}
