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
public class PermutarFormandaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_permuta_de_formanda.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_formanda"));
        String NovaFase = request.getParameter("etapa_formacao");
        String dataInicioNovaFase = request.getParameter("data_ingresso_nova_etapa");
        String antigaFase = request.getParameter("etapa_antiga");
        String dataInicioAntigaFase = request.getParameter("data_entrada_etapa_antiga");
        
        FormandaBean formandaBean = new FormandaBean();
        FormandaDao formandaDao = new FormandaDao();
        
        FaseFormacaoBean faseFormacaoBean = new FaseFormacaoBean();
        FaseFormacaoDao faseFormacaoDao = new FaseFormacaoDao();
        try {
            formandaBean = formandaDao.getFormandaBean(idFormanda);
            formandaBean.setEtapa(NovaFase);
            formandaBean.setDataEtapaAtual(dataInicioNovaFase);
            formandaDao.alteraFormanda(idFormanda, formandaBean);
            
            faseFormacaoBean.setDataEntrada(dataInicioAntigaFase);
            faseFormacaoBean.setDataSaida(dataInicioNovaFase);
            faseFormacaoBean.setFormanda(formandaBean);
            faseFormacaoBean.setNome(antigaFase);
            
            faseFormacaoDao.gravaFaseFormacao(faseFormacaoBean);
            faseFormacaoBean = faseFormacaoDao.getUltimaFaseFormacaoBeanCadastrada(idFormanda, antigaFase, dataInicioAntigaFase, dataInicioNovaFase);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PermutarFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PermutarFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("fase_formacao", faseFormacaoBean);
        return nextPage;
    }
    
}
