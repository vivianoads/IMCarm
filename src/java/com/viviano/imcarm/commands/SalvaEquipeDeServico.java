/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.persistencia.GovernoGeralDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SalvaEquipeDeServico implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_cadastro_de_equipe_de_servico";
        String nome = request.getParameter("nome");
        Integer idCoordenadora = new Integer(request.getParameter("id_coordenadora"));
        GovernoGeralDao governoGeralDao = new GovernoGeralDao();
        EquipeServicoBean equipeServicoBean = new EquipeServicoBean();
        equipeServicoBean.setCoordenadora(idCoordenadora);
        equipeServicoBean.setNome(nome);
        FreiraBean coordenadora = new FreiraBean();
        try {
            equipeServicoBean.setGoverno(governoGeralDao.getGovernoGeralAtual().getIdGoverno());
            equipeServicoBean = new EquipeServicoDao().getUltimoEquipeServicoBeanCadastrada();
            coordenadora = new FreiraDao().getFreiraBean(equipeServicoBean.getCoordenadora());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvaEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvaEquipeDeServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("coordenadora_equipe", coordenadora);
        request.setAttribute("nome_equipe", equipeServicoBean.getNome());
        return nextPage;
    }
    
}
