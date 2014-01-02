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
        Integer idFormanda = new Integer(request.getParameter("id_formanda_concluir"));
        String dataConclusao = request.getParameter("data_conclusao_formacao");
        
        FormandaDao formandaDao = new FormandaDao();
        FormandaBean formandaBean = new FormandaBean();
        FreiraBean f = new FreiraBean();
        FaseFormacaoBean faseFormacaoBean = new FaseFormacaoBean();
        
        Map<String, String> fasesConcluidas = new HashMap<String, String>();
        try {
            for(FaseFormacaoBean fase : new FaseFormacaoDao().getAllFaseFormacaoBeanPorFormanda(idFormanda)){
                fasesConcluidas.put(fase.getNome(), fase.getDataSaida());
            }
        formandaBean = formandaDao.getFormandaBean(idFormanda);
        
        
        faseFormacaoBean.setFormanda(formandaBean);
        faseFormacaoBean.setDataEntrada(formandaBean.getDataEtapaAtual());
        faseFormacaoBean.setDataSaida(dataConclusao);
        faseFormacaoBean.setNome(formandaBean.getEtapa());
        
        new FaseFormacaoDao().gravaFaseFormacao(faseFormacaoBean);
        
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
        f.setDataNoviciadoApostolico(fasesConcluidas.get("Noviciado Apostólico"));
        f.setDataNoviciadoCanonico(fasesConcluidas.get("Noviciado Canônico"));
        f.setDataPostulantado(fasesConcluidas.get("Postulantado"));
        f.setDataProfissaoPerpetua(dataConclusao);
        f.setDataProfissaoTemporaria(fasesConcluidas.get("Profissão Simples"));
        
        f.setDatasJuniorado(fasesConcluidas.get("Juniorado")); 
        f.setDatasJunioradoI(fasesConcluidas.get("Juniorado - I Renovação")); 
        f.setDatasJunioradoII(fasesConcluidas.get("Juniorado - II Renovação")); 
        f.setDatasJunioradoIII(fasesConcluidas.get("Juniorado - III Renovação"));  
        f.setDatasJunioradoIV(fasesConcluidas.get("Juniorado - IV Renovação"));  
        f.setDatasJunioradoV(fasesConcluidas.get("Juniorado - V Renovação"));  
        f.setDatasJunioradoVI(fasesConcluidas.get("Juniorado - VI Renovação"));  
        f.setDatasJunioradoVII(fasesConcluidas.get("Juniorado - VII Renovação"));  
        f.setDatasJunioradoVIII(fasesConcluidas.get("Juniorado - VIII Renovação"));  
        f.setDatasJunioradoIX(fasesConcluidas.get("Juniorado - IX Renovação"));     
        
        f.setDiocese(formandaBean.getDiocese());
        f.setEmail(formandaBean.getEmail());
        f.setEstadoFamilia(formandaBean.getUf());
        f.setNomeCivil(formandaBean.getNome());
        f.setNomeMae(formandaBean.getMae());
        f.setNomePai(formandaBean.getPai());
        f.setNumeroFamilia(formandaBean.getNumero());
        f.setRuaFamilia(formandaBean.getRua());
        f.setTelefone(formandaBean.getTelefone());
        
        faseFormacaoBean = new FaseFormacaoDao().getUltimaFaseFormacaoBeanCadastrada(faseFormacaoBean.getFormanda().getIdFormanda(), faseFormacaoBean.getNome(), faseFormacaoBean.getDataEntrada(), faseFormacaoBean.getDataSaida());
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConcluirFormacaoFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConcluirFormacaoFormandaCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("id_fase_de_formacao", faseFormacaoBean.getIdFase());
        request.setAttribute("freira", f);
        return nextPage;
    }
    
}
