/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FormandaDao;
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
public class ListaIrmasSelecionarFormandaParaIntegrarEquipeDeServicoCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String opcao = request.getParameter("opcao");
        request.setAttribute("opcao", opcao);
        String nextPage = "lista_irma_para_selecionar_membro_equipe_formanda_geral.jsp";//"listacadasdemissaoparaeditar.jsp";
        Integer initialIndex = new Integer(request.getParameter("initial_index_formanda"));
        if(initialIndex != 0){
            initialIndex = initialIndex-1;
            initialIndex = initialIndex*10;
        }
//        FreiraDao freiraDao = new FreiraDao();
        FormandaDao formandaDao = new FormandaDao();
//        List<FreiraBean> freiras = new ArrayList<FreiraBean>();
        List<FormandaBean> formandas = new ArrayList<FormandaBean>();
//        List<FreiraBean> freirasapaginada = new ArrayList<FreiraBean>();
        List<FormandaBean> formandaspaginada = new ArrayList<FormandaBean>();

        try {
//            freiras = freiraDao.getAllFreiraBeanSemAgregacao();
            formandas = formandaDao.getAllFormandaBean();
            for (int i = initialIndex; i < initialIndex + 10; i++) {
                if(i<formandas.size()) formandaspaginada.add(formandas.get(i));
            }
            Integer[] paginacao = new Integer[formandas.size() / 10 + 1];
            for (int i = 0; i < paginacao.length; i++) {
                paginacao[i] = i + 1;
            }
            request.setAttribute("paginacao", paginacao);
            request.setAttribute("formandaspaginada", formandaspaginada);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nextPage;
    }
}
