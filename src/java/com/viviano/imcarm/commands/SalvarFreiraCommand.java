/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class SalvarFreiraCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "confirma_cadastro_de_freira.jsp";
        
        FreiraBean f = new FreiraBean();
        f.setAtivo(request.getParameter("ativo"));
        f.setBairroFamilia(request.getParameter("bairro_familia"));
        f.setCepFamilia(request.getParameter("cep_familia"));
        f.setCidadeFamilia(request.getParameter("cidade_familia"));
        f.setCpf(request.getParameter("cpf"));
        f.setDataAspirantado(request.getParameter("data_aspirantado"));
        f.setDataNascimento(request.getParameter("data_nascimento"));
        f.setDataNoviciadoApostolico(request.getParameter("data_noviciado_apostolico"));
        f.setDataNoviciadoCanonico(request.getParameter("data_noviciado_canonico"));
        f.setDataPostulantado(request.getParameter("data_postulantado"));
        f.setDataProfissaoPerpetua(request.getParameter("data_profissao_perpetua"));
        f.setDataProfissaoTemporaria(request.getParameter("data_profissao_temporaria"));
        f.setDatasJuniorado(request.getParameter("data_juniorado"));
        f.setDatasJunioradoI(request.getParameter("data_juniorado_1"));
        f.setDatasJunioradoII(request.getParameter("data_juniorado_2"));
        f.setDatasJunioradoIII(request.getParameter("data_juniorado_3"));
        f.setDatasJunioradoIV(request.getParameter("data_juniorado_4"));
        f.setDatasJunioradoV(request.getParameter("data_juniorado_5"));
        f.setDatasJunioradoVI(request.getParameter("data_juniorado_6"));
        f.setDatasJunioradoVII(request.getParameter("data_juniorado_7"));
        f.setDatasJunioradoVIII(request.getParameter("data_juniorado_8"));
        f.setDatasJunioradoIX(request.getParameter("data_juniorado_9"));
        f.setDiocese(request.getParameter("diocese"));
        f.setEmail(request.getParameter("email"));
        f.setEstadoFamilia(request.getParameter("estado_familia"));
        f.setNomeCivil(request.getParameter("nome_civil"));
        f.setNomeMae(request.getParameter("nome_mae"));
        f.setNomePai(request.getParameter("nome_pai"));
        f.setNomeReligioso(request.getParameter("nome_religioso"));
        f.setNumeroFamilia(request.getParameter("numero_familia"));
        f.setRg(request.getParameter("rg"));
        f.setRuaFamilia(request.getParameter("rua_familia"));
        f.setTelefone(request.getParameter("telefone"));
        f.setTipoAtivo(request.getParameter("tipo_ativo"));
        
        FreiraDao freiraDao = new FreiraDao();
        try {
            freiraDao.gravaFreira(f);
            f = freiraDao.getUltimaFreiraBeanCadastrada();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarFreiraCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("freira", f);
        request.setAttribute("id_fase_de_formacao", request.getParameter("id_fase_de_formacao"));
        return nextPage;
    }
    
}
