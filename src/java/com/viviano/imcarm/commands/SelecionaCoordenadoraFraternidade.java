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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SelecionaCoordenadoraFraternidade implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "formcadastracoordenacaodecasademissao.jsp";
        
        Integer idFraternidade = new Integer(request.getParameter("id_fraternidade"));
        Integer idCoordenadora = 0;
        Integer idTesoureira = 0;
        Integer idSecretaria = 0;
        try{
        idCoordenadora = new Integer(request.getParameter("id_coordenadora"));
        }catch (NumberFormatException nbe){}
        try{
        idTesoureira = new Integer(request.getParameter("id_tesoureira"));
        }catch (NumberFormatException nbe){}
        try{
        idSecretaria = new Integer(request.getParameter("id_secretaria"));
        }catch (NumberFormatException nbe){}
        
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        FraternidadeBean fraternidadeBean = new FraternidadeBean();
        
        FreiraDao freiraDao = new FreiraDao();
        FreiraBean coordenadora = new FreiraBean();
        FreiraBean tesoureira = new FreiraBean();
        FreiraBean secretaria = new FreiraBean();
        
        try {
            System.out.println("setando parametros novamente");
            fraternidadeBean = fraternidadeDao.getFraternidade(idFraternidade);
            request.setAttribute("fraternidade", fraternidadeBean);
            if(idCoordenadora != 0){
            coordenadora = freiraDao.getFreiraBean(idCoordenadora);
            request.setAttribute("coordenadora", coordenadora);
            }
            if(idTesoureira !=0){
                tesoureira = freiraDao.getFreiraBean(idTesoureira);
                request.setAttribute("tesoureira", tesoureira);
            }
            if(idSecretaria !=0){
                secretaria = freiraDao.getFreiraBean(idSecretaria);
                request.setAttribute("secretaria", secretaria);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SelecionaCoordenadoraFraternidade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SelecionaCoordenadoraFraternidade.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        System.out.println("fraternidade " + fraternidadeBean.getNome());
        try{
        System.out.println("coordenadora " + coordenadora.getNomeReligioso());
        }catch(Exception e){}
        try{
        System.out.println("tesoureira" + tesoureira.getNomeCivil());
        }catch(Exception e){}
        try{
        System.out.println("secretaria" + secretaria);
        }catch(Exception e){}
        
        
        return nextPage;
    }
    
}
