/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.persistencia.GovernoGeralDao;
import com.viviano.imcarm.utilconsulta.UtilData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class BuscaEquipeDeDervicoEspecifica implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "especifico_equipe_de_servico_consulta.jsp";
        Integer idEquipe = new Integer(request.getParameter("id_equipe"));
//        List<EquipeServicoBean> equipes = new ArrayList<EquipeServicoBean>();
        EquipeServicoBean equipeServico = new EquipeServicoBean();
        EquipeServicoDao equipeServicoDao = new EquipeServicoDao();
//        GovernoGeralDao governoGeralDao = new GovernoGeralDao();
        FreiraBean coordenadora = new FreiraBean();
        List<FormandaBean> listFormandas = new ArrayList<FormandaBean>();
        List<FreiraBean> listfFreiras = new ArrayList<FreiraBean>();
        try {
            equipeServico = equipeServicoDao.getEquipeServicoBean(idEquipe);
            coordenadora = new FreiraDao().getFreiraBean(equipeServico.getCoordenadora());
            listFormandas = new FormandaDao().getAllFormandaBeanPorEquipe(equipeServico.getIdEquipe());
            listfFreiras = new FreiraDao().getAllFreiraBeanPorEquipe(equipeServico.getIdEquipe());
//            for(FreiraBean f : aux){
//                if(UtilData.getIdade(f.getDataNascimento()).equals(idade)){
//                freiras.add(f);
//                }
//            }
//            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscaEquipeDeDervicoEspecifica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaEquipeDeDervicoEspecifica.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.println("FREIRAS SIZE = " + listfFreiras.size());
//        System.out.println("FORMANDAS SIZE" + listFormandas.size());
        request.setAttribute("equipe", equipeServico);
        request.setAttribute("coordenadora", coordenadora);
        request.setAttribute("list_freiras_associar_equipe", listfFreiras);
        request.setAttribute("list_formandas_associar_equipe", listFormandas);
        return nextPage;
    }
    
}
