/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class ListaIrmasSelecionarMadre implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String opcao = request.getParameter("opcao");
        request.setAttribute("opcao", opcao);
        String nextPage = "lista_irma_para_selecionar_" + request.getParameter("tipo_cargo") + "_geral.jsp";//"listacadasdemissaoparaeditar.jsp";
        Integer initialIndex = new Integer(request.getParameter("initial_index_freira"));
        if(initialIndex != 0){
            initialIndex = initialIndex-1;
            initialIndex = initialIndex*10;
        }
        FreiraDao freiraDao = new FreiraDao();
        List<FreiraBean> freiras = new ArrayList<FreiraBean>();
        List<FreiraBean> freirasapaginada = new ArrayList<FreiraBean>();

        try {
            freiras = freiraDao.getAllFreiraBeanSemAgregacao();
            for (int i = initialIndex; i < initialIndex + 10; i++) {
                if(i<freiras.size()) freirasapaginada.add(freiras.get(i));
            }
            Integer[] paginacao = new Integer[freiras.size() / 10 + 1];
            for (int i = 0; i < paginacao.length; i++) {
                paginacao[i] = i + 1;
            }
            request.setAttribute("paginacao", paginacao);
            request.setAttribute("freiraspaginada", freirasapaginada);
            request.setAttribute("tipo_cargo", request.getParameter("tipo_cargo"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        EquipeServicoBean equipeServicoBeanAntigo = (EquipeServicoBean) request.getSession().getAttribute("antigo");
//        System.out.println("Equipe Bean Antigo Na Hora de Escolher a Coordenadora = "); 
//        System.out.println("Nome " + equipeServicoBeanAntigo.getNome());
//        System.out.println("Coordenadora " + equipeServicoBeanAntigo.getCoordenadora());
//        System.out.println("id " + equipeServicoBeanAntigo.getIdEquipe());
        return nextPage;
    }
}
