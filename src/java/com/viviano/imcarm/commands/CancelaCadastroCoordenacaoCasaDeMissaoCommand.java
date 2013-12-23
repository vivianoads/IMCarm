/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.persistencia.CoordenacaoFraternidadeDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CancelaCadastroCoordenacaoCasaDeMissaoCommand implements Command{
    
    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "cadastrodecasasdemissao.jsp";
        Integer idCoordenacaoFraternidade = new Integer(request.getParameter("id_coordenacao_fraternidade"));
        CoordenacaoFraternidadeDao coordenacaoFraternidadeDao = new CoordenacaoFraternidadeDao();
        try {
            coordenacaoFraternidadeDao.apagaCoordenacaoFraternidade(idCoordenacaoFraternidade);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelaCadastroCoordenacaoCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CancelaCadastroCoordenacaoCasaDeMissaoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextPage;
    }
}
