/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SelecionaCoordenadoraParaEquipeDeServicoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        EquipeServicoBean equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("antigo");
        System.out.println("Equipe Bean Antigo Na Hora de Selecionar Coordenadora (Início da Classe) = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
        
        
        String nextPage = "form_cadastro_de_equipe_de_servico.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        
        String option = request.getParameter("option");
        if(option == null) option = new String();
        FreiraDao freiraDao = new FreiraDao();
        FreiraBean freiraBean = new FreiraBean();
        try {
            freiraBean = freiraDao.getFreiraBean(idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SelecionaCoordenadoraParaEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SelecionaCoordenadoraParaEquipeDeServicoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("coordenadora_equipe", freiraBean);
        
        if(option.equals("modificar")){
            nextPage = "form_modificacao_de_equipe_de_servico.jsp";
            request.getSession().setAttribute("coordenadora_equipe", freiraBean);
            equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("antigo");
        System.out.println("Equipe Bean Antigo Na Hora de Selecionar Coordenadora (51-55) = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
            EquipeServicoBean equipeServicoBean = (EquipeServicoBean) request.getSession().getAttribute("equipe");
            equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("antigo");
        System.out.println("Equipe Bean Antigo Na Hora de Selecionar Coordenadora (57-61) = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
            equipeServicoBean.setCoordenadora(freiraBean.getId());
        equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("antigo");
        System.out.println("Equipe Bean Antigo Na Hora de Selecionar Coordenadora (63-) = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
            request.getSession().setAttribute("equipe",equipeServicoBean);
            
        }
        EquipeServicoBean equipeServicoBeanAntigo2 = (EquipeServicoBean) request.getSession().getAttribute("equipe");
        System.out.println("Equipe Bean Antigo Na Hora de Selecionar Coordenadora = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
        EquipeServicoBean equipeServicoBeanAntigo3 = (EquipeServicoBean) request.getSession().getAttribute("antigo");
        System.out.println("Equipe Bean Na Hora de Selecionar Coordenadora = "); 
        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
        return nextPage;
    }
    
}
