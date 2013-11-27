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
public class ListaCasasDeMissaoParaTransferirIrma implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        Integer idFreira =  new Integer(request.getParameter("id_freira"));
        String nextPage = request.getParameter("next_url");//"listacadasdemissaoparaeditar.jsp";
        Integer initialIndex = new Integer(request.getParameter("initial_index"));
        if(initialIndex != 0){
            initialIndex = initialIndex-1;
            initialIndex = initialIndex*10;
        }
        
        FreiraDao freiraDao = new FreiraDao();
        FreiraBean freira = new FreiraBean();
        
        
        
        System.out.println("initialIndex= "+initialIndex);
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
        List<FraternidadeBean> fraternidadespaginada = new ArrayList<FraternidadeBean>();

        try {
            freira = freiraDao.getFreiraBean(idFreira);
            fraternidades = fraternidadeDao.getAllFraternidade();
            for (int i = initialIndex; i < initialIndex + 10; i++) {
                System.out.println("i= " +i);
                if(i<fraternidades.size()) fraternidadespaginada.add(fraternidades.get(i));
            }
            Integer[] paginacao = new Integer[fraternidades.size() / 10 + 1];
            for (int i = 0; i < paginacao.length; i++) {
                paginacao[i] = i + 1;
            }
            request.setAttribute("paginacao", paginacao);
            request.setAttribute("fraternidadespaginada", fraternidadespaginada);
            request.setAttribute("freira", freira);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nextPage;
    }
}
