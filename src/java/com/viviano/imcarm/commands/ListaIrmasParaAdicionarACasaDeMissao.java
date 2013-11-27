/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

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
public class ListaIrmasParaAdicionarACasaDeMissao implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        System.out.println("request.getParameter(\"id_fraternidade\")" + request.getParameter("id_fraternidade"));
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        
        String nextPage = request.getParameter("next_url");//"listacadasdemissaoparaeditar.jsp";
        Integer initialIndex = new Integer(request.getParameter("initial_index_freira"));
        if(initialIndex != 0){
            initialIndex = initialIndex-1;
            initialIndex = initialIndex*10;
        }
        
        System.out.println("initialIndex= "+initialIndex);
        FreiraDao freiraDao = new FreiraDao();
        List<FreiraBean> freiras = new ArrayList<FreiraBean>();
        List<FreiraBean> freirasapaginada = new ArrayList<FreiraBean>();

        try {
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            freiras = freiraDao.getAllFreiraBeanSemAgregacao();
            for (int i = initialIndex; i < initialIndex + 10; i++) {
                System.out.println("getAllFreiraBeanSemAgregacao() " +freiras.size());
                if(i<freiras.size()) freirasapaginada.add(freiras.get(i));
            }
            Integer[] paginacao = new Integer[freiras.size() / 10 + 1];
            for (int i = 0; i < paginacao.length; i++) {
                paginacao[i] = i + 1;
            }
            request.setAttribute("fraternidade", fraternidadeBean);
            request.setAttribute("paginacao", paginacao);
            request.setAttribute("freiraspaginada", freirasapaginada);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Saindo do command de listar Irmas");
        return nextPage;
    }
}
