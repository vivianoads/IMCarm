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
public class AssociaFreiraOuFormandaAEquipeDeServico implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_modificacao_de_equipe_de_servico.jsp";
        String tipoAssociacao = request.getParameter("tipo_associacao");
        Integer idAssociar = new Integer(request.getParameter("id_associar"));
        String funcao = request.getParameter("funcao_associar");
//        List<FreiraBean> freirasAssociar = new ArrayList<FreiraBean>();
        Map<Integer, String> mapFuncoesEquipeFreira = (Map<Integer, String>) request.getSession().getAttribute("map_funcoes_freira");
        Map<Integer, String> mapFuncoesEquipeFormanda = (Map<Integer, String>) request.getSession().getAttribute("map_funcoes_formanda");
        if(mapFuncoesEquipeFreira == null){
            mapFuncoesEquipeFreira = new HashMap<Integer, String>();
        }
        if(mapFuncoesEquipeFormanda == null){
            mapFuncoesEquipeFormanda = new HashMap<Integer, String>();
        }
        
        
        if(tipoAssociacao.equals("freira")){
            mapFuncoesEquipeFreira.put(idAssociar, funcao);
            request.getSession().setAttribute("map_funcoes_freira", mapFuncoesEquipeFreira);
            List<FreiraBean> freirasAssociar = (List<FreiraBean>) request.getSession().getAttribute("list_freiras_associar_equipe");
            if(freirasAssociar == null){
                freirasAssociar = new ArrayList<FreiraBean>();
            }
            try {
                freirasAssociar.add(new FreiraDao().getFreiraBean(idAssociar));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AssociaFreiraOuFormandaAEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AssociaFreiraOuFormandaAEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            request.getSession().setAttribute("list_freiras_associar_equipe", freirasAssociar);
        }else{
            List<FormandaBean> formandasAssociar = (List<FormandaBean>) request.getSession().getAttribute("list_formandas_associar_equipe");
            if(formandasAssociar == null){
                formandasAssociar = new ArrayList<FormandaBean>();
            }
            mapFuncoesEquipeFormanda.put(idAssociar, funcao);
            request.getSession().setAttribute("map_funcoes_formanda", mapFuncoesEquipeFormanda);
            try {
                formandasAssociar.add(new FormandaDao().getFormandaBean(idAssociar));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AssociaFreiraOuFormandaAEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AssociaFreiraOuFormandaAEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.getSession().setAttribute("list_formandas_associar_equipe", formandasAssociar);
        }
        return nextPage;
    }
    
}
