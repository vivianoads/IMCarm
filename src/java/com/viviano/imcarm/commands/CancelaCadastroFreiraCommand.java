/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FaseFormacaoBean;
import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.persistencia.FaseFormacaoDao;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelaCadastroFreiraCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodeformandas.jsp";
        Integer idFreira = new Integer(request.getParameter("id_freira"));
        
        try {
            new FreiraDao().apagaFreira(idFreira);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaCadastroFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaCadastroFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("id fase formacao no momento de cancelar = " + request.getParameter("id_fase_de_formacao"));
        Integer idFaseFormacao = null;
        try{
            idFaseFormacao = new Integer(request.getParameter("id_fase_de_formacao"));
        }catch(Exception e){}
             if(idFaseFormacao == null){
                 nextPage = "cadastrodeirmas.jsp";
             }else{

                FaseFormacaoBean faseFormacaoBean = new FaseFormacaoBean();
                FormandaBean formandaBean = new FormandaBean();
                FormandaDao formandaDao = new FormandaDao();
                try {
                    faseFormacaoBean = new FaseFormacaoDao().getFaseFormacaoBean(idFaseFormacao);

                    formandaBean = formandaDao.getFormandaBean(faseFormacaoBean.getFormanda().getIdFormanda());

                    formandaBean.setAtividade("sim");
                    formandaBean.setDataEtapaAtual(faseFormacaoBean.getDataEntrada());
                    formandaBean.setEtapa(faseFormacaoBean.getNome());

                    formandaDao.alteraFormanda(formandaBean.getIdFormanda(), formandaBean);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CancelaCadastroFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CancelaCadastroFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
//        }catch(Exception e){
//            System.out.println("caiu na Exception");
//            
//        }
        
        
        return nextPage;
    }
    
}
