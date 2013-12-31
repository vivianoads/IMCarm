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
public class IrFormPermutaFormanda implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_permuta_de_formanda.jsp";
        Integer idFormanda = new Integer(request.getParameter("id_formanda_permuta"));
        System.out.println("idFormanda " + idFormanda);
        FaseFormacaoDao faseFormacaoDao = new FaseFormacaoDao();
        List<FaseFormacaoBean> faseFormacaoBeans = new ArrayList<FaseFormacaoBean>();
        FormandaBean formandaBean = new FormandaBean();
        try {
            faseFormacaoBeans = faseFormacaoDao.getAllFaseFormacaoBeanPorFormanda(idFormanda);
            formandaBean = new FormandaDao().getFormandaBean(idFormanda);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IrFormPermutaFormanda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IrFormPermutaFormanda.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("formanda", formandaBean);
        request.setAttribute("list_fases", faseFormacaoBeans);
        return nextPage;
    }
    
}
