/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FaseFormacaoBean;
import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FaseFormacaoDao;
import com.viviano.imcarm.persistencia.FormandaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class ConcluirFormacaoFormandaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "form_cadastro_de_freira.jsp";
        Integer idFormanda = new Integer(request.getParameter(""));
        String dataConclusao = request.getParameter("");
        
        FormandaDao formandaDao = new FormandaDao();
        FormandaBean formandaBean = new FormandaBean();
        FreiraBean f = new FreiraBean();
        
        Map<String, String> fasesConcluidas = new HashMap<String, String>();
        try {
            for(FaseFormacaoBean fase : new FaseFormacaoDao().getAllFaseFormacaoBeanPorFormanda(idFormanda)){
                fasesConcluidas.put(fase.getNome(), fase.getDataSaida());
            }
       
        
        String[] junioradoRenovacoes = new String[10];
        junioradoRenovacoes[0] = fasesConcluidas.get("Juniorado"); 
        junioradoRenovacoes[1] = fasesConcluidas.get("Juniorado - I Renovação"); 
        junioradoRenovacoes[2] = fasesConcluidas.get("Juniorado - II Renovação"); 
        junioradoRenovacoes[3] = fasesConcluidas.get("Juniorado - III Renovação");  
        junioradoRenovacoes[4] = fasesConcluidas.get("Juniorado - IV Renovação");  
        junioradoRenovacoes[5] = fasesConcluidas.get("Juniorado - V Renovação");  
        junioradoRenovacoes[6] = fasesConcluidas.get("Juniorado - VI Renovação");  
        junioradoRenovacoes[7] = fasesConcluidas.get("Juniorado - VII Renovação");  
        junioradoRenovacoes[8] = fasesConcluidas.get("Juniorado - VIII Renovação");  
        junioradoRenovacoes[9] = fasesConcluidas.get("Juniorado - IX Renovação"); 
        
        
        
        formandaBean = formandaDao.getFormandaBean(idFormanda);
        
        formandaBean.setAtividade("nao");
        formandaBean.setMotivoInatividade("Conclusão da Formação");
        formandaBean.setEtapa("Profissão Perpétua");
        formandaBean.setDataEtapaAtual(dataConclusao);
        
        formandaDao.alteraFormanda(idFormanda, formandaBean);
        
        f.setBairroFamilia(formandaBean.getBairro());
        f.setCepFamilia(formandaBean.getBairro());
        f.setCidadeFamilia(formandaBean.getCidade());
        f.setDataAspirantado(fasesConcluidas.get("Aspirantado"));
        f.setDataNascimento(formandaBean.getDataNascimento());
        f.setDataNoviciadoApostolico("Noviciado Apostólico");
        f.setDataNoviciadoCanonico("Noviciado Canônico");
        f.setDataPostulantado("Postulantado");
        f.setDataProfissaoPerpetua(dataConclusao);
        f.setDataProfissaoTemporaria("Profissão Simples");
        
        f.setDatasJuniorado(junioradoRenovacoes);
        
        f.setDiocese(formandaBean.getDiocese());
        f.setEmail(formandaBean.getEmail());
        f.setEstadoFamilia(formandaBean.getUf());
        f.setNomeCivil(formandaBean.getNome());
        f.setNomeMae(formandaBean.getMae());
        f.setNomePai(formandaBean.getPai());
        f.setNumeroFamilia(formandaBean.getNumero());
        f.setRuaFamilia(formandaBean.getRua());
        f.setTelefone(formandaBean.getTelefone());
        
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConcluirFormacaoFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConcluirFormacaoFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("freira", f);
        return nextPage;
    }
    
}
