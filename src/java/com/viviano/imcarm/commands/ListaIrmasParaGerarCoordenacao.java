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
public class ListaIrmasParaGerarCoordenacao implements Command{

    @Override
    public String execute(HttpServletRequest request) {        
        String nextPage = request.getParameter("next_url");//"listacadasdemissaoparaeditar.jsp";
        Integer initialIndex = new Integer(request.getParameter("initial_index_freira"));
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        System.out.println("request.getParameter(\"id_fraternidade\")"+ request.getParameter("id_fraternidade"));
        Integer idCoordenadora = 0;
        Integer idTesoureira = 0;
        Integer idSecretaria = 0;
        try{
        idCoordenadora = new Integer(request.getParameter("id_coordenadora"));
        }catch (NumberFormatException nbe){
            System.out.println("exception = id_coordenadora");
        }
        try{
        idTesoureira = new Integer(request.getParameter("id_tesoureira"));
        }catch (NumberFormatException nbe){
            System.out.println("exception = id_tesoureira");
        }
        try{
        idSecretaria = new Integer(request.getParameter("id_secretaria"));
        }catch (NumberFormatException nbe){
            System.out.println("exception = id_secretaria");
        }
        if(initialIndex != 0){
            initialIndex = initialIndex-1;
            initialIndex = initialIndex*10;
        }
        
        System.out.println("initialIndex= "+initialIndex);
        FreiraDao freiraDao = new FreiraDao();
        List<FreiraBean> freiras = new ArrayList<FreiraBean>();
        List<FreiraBean> freirasapaginada = new ArrayList<FreiraBean>();
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        FreiraBean coordenadora = null;
        FreiraBean tesoureira = null;
        FreiraBean secretaria = null;
        
        try {
            if(idCoordenadora != 0){
            coordenadora = freiraDao.getFreiraBean(idCoordenadora);
            }
            if(idTesoureira !=0){
                tesoureira = freiraDao.getFreiraBean(idTesoureira);
            }
            if(idSecretaria !=0){
                secretaria = freiraDao.getFreiraBean(idSecretaria);
            }
            freiras = freiraDao.getAllFreiraBeanComAgregacaoEspecifica(idFraternidade);
            for (int i = initialIndex; i < initialIndex + 10; i++) {
                if(i<freiras.size()) freirasapaginada.add(freiras.get(i));
            }
            Integer[] paginacao = new Integer[freiras.size() / 10 + 1];
            for (int i = 0; i < paginacao.length; i++) {
                paginacao[i] = i + 1;
            }
            
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            request.setAttribute("paginacao", paginacao);
            request.setAttribute("freiraspaginada", freirasapaginada);
            request.setAttribute("coordenadora", coordenadora);
            request.setAttribute("tesoureira", tesoureira);
            request.setAttribute("secretaria", secretaria);
            request.setAttribute("fraternidade", fraternidadeBean);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nextPage;
    }
}
