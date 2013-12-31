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
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.persistencia.FormandaEquipeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.persistencia.FreiraEquipeDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class IrformModificarEquipeDeServiço implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        
        String nextPage = "form_modificacao_de_equipe_de_servico.jsp";
        Integer idEquipe = new Integer(request.getParameter("id_equipe"));
        EquipeServicoBean equipeServicoBean = new EquipeServicoBean();
        FreiraBean coordenadora = new FreiraBean();
        try {
            equipeServicoBean = new EquipeServicoDao().getEquipeServicoBean(idEquipe);
            coordenadora = new FreiraDao().getFreiraBean(equipeServicoBean.getCoordenadora());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IrformModificarEquipeDeServiço.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IrformModificarEquipeDeServiço.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        Map<Integer, String> mapFuncoesEquipeFreira = new HashMap<Integer, String>();
        Map<Integer, String> mapFuncoesEquipeFormanda = new HashMap<Integer, String>();
        List<FreiraBean> freirasAssociar = new ArrayList<FreiraBean>();    
        List<FormandaBean> formandasAssociar = new ArrayList<FormandaBean>();
        
        List<FreiraEquipeBean> freiraEquipeBeans = new ArrayList<FreiraEquipeBean>();
        try {
            freiraEquipeBeans = new FreiraEquipeDao().getFreiraEquipeBeanPorEquipe(idEquipe);
            for(FreiraEquipeBean feb: freiraEquipeBeans){
                mapFuncoesEquipeFreira.put(feb.getIdFreira(), feb.getFuncao());
                freirasAssociar.add(new FreiraDao().getFreiraBean(feb.getIdFreira()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IrformModificarEquipeDeServiço.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IrformModificarEquipeDeServiço.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<FormandaEquipeBean> formandaEquipeBeans = new ArrayList<FormandaEquipeBean>();
        try {
            formandaEquipeBeans = new FormandaEquipeDao().getFormandaEquipeBeanPorEquipe(idEquipe);
            for(FormandaEquipeBean feb : formandaEquipeBeans){
                mapFuncoesEquipeFormanda.put(feb.getFormanda(), feb.getFuncao());
                formandasAssociar.add(new FormandaDao().getFormandaBean(feb.getFormanda()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IrformModificarEquipeDeServiço.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IrformModificarEquipeDeServiço.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getSession().setAttribute("coordenadora_equipe", coordenadora);
        request.getSession().setAttribute("equipe", equipeServicoBean);
        request.getSession().setAttribute("map_funcoes_freira", mapFuncoesEquipeFreira);
        request.getSession().setAttribute("map_funcoes_formanda", mapFuncoesEquipeFormanda);
        request.getSession().setAttribute("list_freiras_associar_equipe", freirasAssociar);
        request.getSession().setAttribute("list_formandas_associar_equipe", formandasAssociar);
        
        EquipeServicoBean eb = equipeServicoBean;
        request.getSession().setAttribute("antigo", eb);
        request.getSession().setAttribute("list_freiras_equipe_antigo", freiraEquipeBeans);
        request.getSession().setAttribute("list_formandas_equipe_antigo", formandaEquipeBeans);
        
        EquipeServicoBean equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("antigo");
        System.out.println("Equipe Bean Antigo Na Hora de Postar = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
        
        return nextPage;
    }
    
}
