/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FormandaEquipeBean;
import com.viviano.imcarm.entidades.FreiraEquipeBean;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
import com.viviano.imcarm.persistencia.FormandaEquipeDao;
import com.viviano.imcarm.persistencia.FreiraEquipeDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelaModificacaoEquipeDeServicoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecongregacoes.jsp";
        
        EquipeServicoBean equipeServicoBean = (EquipeServicoBean) request.getSession().getAttribute("equipe_antigo");
        
        System.out.println("Equipe Bean = "); 
        System.out.println("Nome " + equipeServicoBean.getNome());
        System.out.println("Coordenadora " + equipeServicoBean.getCoordenadora());
        System.out.println("id " + equipeServicoBean.getIdEquipe());
        
        List<FreiraEquipeBean> listFreiras = (List<FreiraEquipeBean>) request.getSession().getAttribute("list_freiras_equipe_antigo");
        List<FormandaEquipeBean> listFormandas = (List<FormandaEquipeBean>) request.getSession().getAttribute("list_formandas_equipe_antigo");
        
        FreiraEquipeDao freiraEquipeDao = new FreiraEquipeDao();
        FormandaEquipeDao formandaEquipeDao = new FormandaEquipeDao();
        EquipeServicoDao equipeServicoDao = new EquipeServicoDao();
        
        try {
            freiraEquipeDao.apagaAllFreiraEquipeBeanPorEquipe(equipeServicoBean.getIdEquipe());
            formandaEquipeDao.apagaAllFormandaEquipePorEquipe(equipeServicoBean.getIdEquipe());
            equipeServicoDao.alteraEquipeServico(equipeServicoBean.getIdEquipe(), equipeServicoBean);
            
            for(FreiraEquipeBean feb : listFreiras){
                freiraEquipeDao.gravaFreiraEquipe(feb);
            }
            for(FormandaEquipeBean feb : listFormandas){
                formandaEquipeDao.gravaformandaEquipe(feb);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaModificacaoEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaModificacaoEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getSession().removeAttribute("coordenadora_equipe");
        request.getSession().removeAttribute("equipe");
        request.getSession().removeAttribute("map_funcoes_freira");
        request.getSession().removeAttribute("map_funcoes_formanda");
        request.getSession().removeAttribute("list_freiras_associar_equipe");
        request.getSession().removeAttribute("list_formandas_associar_equipe");
        
        request.getSession().removeAttribute("equipe_antigo");
        request.getSession().removeAttribute("list_freiras_equipe_antigo");
        request.getSession().removeAttribute("list_formandas_equipe_antigo");
        
        return nextPage;
    }
    
}
