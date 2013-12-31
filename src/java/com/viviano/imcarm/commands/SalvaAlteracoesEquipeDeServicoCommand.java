/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.FormandaEquipeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.FreiraEquipeBean;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
import com.viviano.imcarm.persistencia.FormandaEquipeDao;
import com.viviano.imcarm.persistencia.FreiraEquipeDao;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SalvaAlteracoesEquipeDeServicoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_modificacao_de_equipe_de_servico.jsp";
        String nomeEquipe = request.getParameter("nome_equipe");
        
        EquipeServicoBean eq = (EquipeServicoBean) request.getSession().getAttribute("equipe");
        Map<Integer, String> mapFuncoesFreira = (Map<Integer, String>) request.getSession().getAttribute("map_funcoes_freira");
        Map<Integer, String> mapFuncoesFormanda = (Map<Integer, String>) request.getSession().getAttribute("map_funcoes_formanda");
        List<FreiraBean> listFreiras = (List<FreiraBean>) request.getSession().getAttribute("list_freiras_associar_equipe");
        List<FormandaBean> listFormandas = (List<FormandaBean>) request.getSession().getAttribute("list_formandas_associar_equipe");
        
        FreiraEquipeBean freiraEquipeBean;
        FormandaEquipeBean formandaEquipeBean;
        
        EquipeServicoDao equipeServicoDao = new EquipeServicoDao();
        FreiraEquipeDao freiraEquipeDao = new FreiraEquipeDao();
        FormandaEquipeDao formandaEquipeDao = new FormandaEquipeDao();
       
        try {
            eq.setNome(nomeEquipe);
            equipeServicoDao.alteraEquipeServico(eq.getIdEquipe(), eq);
            
            freiraEquipeDao.apagaAllFreiraEquipeBeanPorEquipe(eq.getIdEquipe());
            for(FreiraBean fb : listFreiras){
                freiraEquipeBean = new FreiraEquipeBean();
                freiraEquipeBean.setEquipe(eq.getIdEquipe());
                freiraEquipeBean.setFuncao(mapFuncoesFreira.get(fb.getId()));
                freiraEquipeBean.setIdFreira(fb.getId());
                freiraEquipeDao.gravaFreiraEquipe(freiraEquipeBean);
            }
            formandaEquipeDao.apagaAllFormandaEquipePorEquipe(eq.getIdEquipe());
            for(FormandaBean fb : listFormandas){
                formandaEquipeBean = new FormandaEquipeBean();
                formandaEquipeBean.setEquipe(eq.getIdEquipe());
                formandaEquipeBean.setFuncao(mapFuncoesFormanda.get(fb.getIdFormanda()));
                formandaEquipeBean.setFormanda(fb.getIdFormanda());
                formandaEquipeDao.gravaformandaEquipe(formandaEquipeBean);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvaAlteracoesEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvaAlteracoesEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        EquipeServicoBean equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("equipe_antigo");
        System.out.println("Equipe Bean Antigo Na Hora de Salvar Alterações = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
        
        return nextPage;
    } 
}
