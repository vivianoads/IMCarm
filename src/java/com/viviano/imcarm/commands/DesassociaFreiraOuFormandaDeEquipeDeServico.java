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
public class DesassociaFreiraOuFormandaDeEquipeDeServico implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_modificacao_de_equipe_de_servico.jsp";
        Integer idDesassociar = new Integer(request.getParameter("id_desassociar"));
        String opcaoDesassociar = request.getParameter("opcao_desassociar");
        
        Map<Integer, String> mapFuncoesEquipeFreira = (Map<Integer, String>) request.getSession().getAttribute("map_funcoes_freira");
        Map<Integer, String> mapFuncoesEquipeFormanda = (Map<Integer, String>) request.getSession().getAttribute("map_funcoes_formanda");
        
        
        if (opcaoDesassociar.equals("freira")) {
            List<FreiraBean> freirasAssociar = (List<FreiraBean>) request.getSession().getAttribute("list_freiras_associar_equipe");
            if(mapFuncoesEquipeFreira != null){
            mapFuncoesEquipeFreira.remove(idDesassociar);
            }
            request.getSession().setAttribute("map_funcoes_freira", mapFuncoesEquipeFreira);
            
            if (freirasAssociar != null) {
                FreiraBean desassociar = new FreiraBean();
                for (FreiraBean f : freirasAssociar) {
                    if (idDesassociar.equals(f.getId())) {
                        desassociar = f;
                    }
                }
                freirasAssociar.remove(desassociar);
            }
            request.getSession().setAttribute("list_freiras_associar_equipe", freirasAssociar);
        } else {
            List<FormandaBean> formandasAssociar = (List<FormandaBean>) request.getSession().getAttribute("list_formandas_associar_equipe");
            if(mapFuncoesEquipeFormanda != null){
            mapFuncoesEquipeFormanda.remove(idDesassociar);
            }
            request.getSession().setAttribute("map_funcoes_formanda", mapFuncoesEquipeFormanda);
            if (formandasAssociar != null) {
                FormandaBean desassociar = new FormandaBean();
                for (FormandaBean f : formandasAssociar) {
                    if (idDesassociar == f.getIdFormanda()) {
                        desassociar = f;
                    }
                }
                formandasAssociar.remove(desassociar);
            }
            request.getSession().setAttribute("list_formandas_associar_equipe", formandasAssociar);
        }
        return nextPage;
    }
    
}
