/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.CoordenacaoFraternidadeBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.CoordenacaoFraternidadeDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.SplitString;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SalvarCoordenacaoDeFraternidade implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_cadastro_de_coordenacao_de_casademissao.jsp";
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        Integer idCoordenadora = new Integer(request.getParameter("id_coordenadora"));
        Integer idTesoureira = new Integer(request.getParameter("id_tesoureira"));
        Integer idSecretaria = new Integer(request.getParameter("id_secretaria"));
        String dataInicio = request.getParameter("data_inicio");
        String dataTermino = request.getParameter("data_termino");
        String isAtual = request.getParameter("is_atual");
        
//        Calendar dataInicio = Calendar.getInstance();
//        Calendar dataTermino = Calendar.getInstance();
//        
//        String[] trin = new String[3];
//        trin = dataInicios.split("-");
//        
//        dataInicio.set(new Integer(trin[0]), new Integer(trin[1]), new Integer(trin[2]));
//        
//        trin = dataTerminos.split("-");
//        dataTermino.set(new Integer(trin[0])-1, new Integer(trin[1])-1, new Integer(trin[2]));
        
                
        CoordenacaoFraternidadeDao coordenacaoFraternidadeDao = new CoordenacaoFraternidadeDao();
        
        CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
        coordenacaoFraternidadeBean.setIdFraternidade(idFraternidade);
        coordenacaoFraternidadeBean.setIdCoordenadora(idCoordenadora);
        coordenacaoFraternidadeBean.setIdTesoureira(idTesoureira);
        coordenacaoFraternidadeBean.setIdSecretaria(idSecretaria);
        coordenacaoFraternidadeBean.setDataInicio(dataInicio);
        coordenacaoFraternidadeBean.setDataTermino(dataTermino);
        coordenacaoFraternidadeBean.setIsAtual(isAtual);
        try {
            coordenacaoFraternidadeDao.gravaCoordenacaoFraternidade(coordenacaoFraternidadeBean);
            
            coordenacaoFraternidadeBean = coordenacaoFraternidadeDao.getUltimaCoordenacaoFraternidadeBeanCadastrada(idCoordenadora, idTesoureira, idSecretaria, dataInicio, dataTermino, isAtual, idFraternidade);
            
            if (coordenacaoFraternidadeBean != null) {
                FreiraDao freiraDao = new FreiraDao();
                FraternidadeDao fraternidadeDao = new FraternidadeDao();
                FraternidadeBean fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
                FreiraBean coordenadora = freiraDao.getFreiraBean(idCoordenadora);
                FreiraBean tesoureira = freiraDao.getFreiraBean(idTesoureira);
                FreiraBean secretaria = freiraDao.getFreiraBean(idSecretaria);
                
                SplitString splitString = new SplitString();
                
                request.setAttribute("id_coordenacao", coordenacaoFraternidadeBean.getIdCoordenacao());
                request.setAttribute("fraternidade", fraternidadeBean);
                request.setAttribute("coordenadora", coordenadora);
                request.setAttribute("tesoureira", tesoureira);
                request.setAttribute("secretaria", secretaria);
                request.setAttribute("data_inicio_split", splitString.splitStringMethod(dataInicio));
                request.setAttribute("data_termino_split", splitString.splitStringMethod(dataTermino));
                request.setAttribute("data_inicio", dataInicio);
                request.setAttribute("data_termino", dataTermino);
                request.setAttribute("is_atual", isAtual);
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarCoordenacaoDeFraternidade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarCoordenacaoDeFraternidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nextPage;
    }
    
}
