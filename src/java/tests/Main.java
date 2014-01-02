/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import com.viviano.imcarm.entidades.CongregacaoBean;
import com.viviano.imcarm.entidades.EquipeServicoBean;
import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.GovernoGeralBean;
import com.viviano.imcarm.persistencia.CongregacaoDao;
import com.viviano.imcarm.persistencia.EquipeServicoDao;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.persistencia.GovernoGeralDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viviano
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Obrigado Senhor.");
//        CongregacaoDao congregacaoDao = new CongregacaoDao();
//        CongregacaoBean cb = new CongregacaoBean();
//        cb.setNome("IMC");
//        try {
//            congregacaoDao.GravaCongregacao(cb);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//        Integer[] x = new Integer[5];
//        x[0] = 0;
//        x[1] = 1;
//        x[2] = 2;
//        x[3] = null;
//        x[4] = 4;
//        for(int i = 0; i < x.length; i++){
//            System.out.println(x[i]);
//        }
//        System.out.println("segundo for: ");
//        for(int i = 0; i < x.length; i++){
//            System.out.println(x[i]);
//            if(x[i] == null){
//                x[i] = 7;
//                System.out.println(x[i]);
//                break;
//            }
//            
//        }
        
//        String x = "viviano1";
//        Integer index = new Integer(x.substring(x.length()-1));
//        System.out.println(index+1);
        
//        GovernoGeralBean gb = new GovernoGeralBean();
//        GovernoGeralDao gDao = new GovernoGeralDao();
//        FreiraBean IrSineide = new FreiraBean();
//        FreiraDao fd = new FreiraDao();
//       
//        try {
//            IrSineide = fd.getFreiraBean(1);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(IrSineide.getNomeCivil());
//        
//        gb.setMadreGeral(IrSineide);
//        gb.setViceGeral(IrSineide);
//        gb.setEconomaGeral(IrSineide);
//        try {
//            gDao.gravaGovernoGeral(gb);
//            gb = gDao.getUltimoGovernoGeralCadastrado();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(gb.getIdGoverno());
//        System.out.println("ok");
        
//        FreiraBean freiraBean = new FreiraBean();
//        FreiraDao freiraDao = new FreiraDao();
//        try {
//            freiraBean = freiraDao.getFreiraBean(57);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(freiraBean.getNomeReligioso());
        
        
//        List<EquipeServicoBean> equipes = new ArrayList<EquipeServicoBean>();
//        
//        EquipeServicoBean esb1 = new EquipeServicoBean();
//        esb1.setCoordenadora(1);
//        esb1.setGoverno(1);
//        esb1.setIdEquipe(1);
//        esb1.setNome("Um");
//        EquipeServicoBean esb2 = new EquipeServicoBean();
//        esb2.setCoordenadora(2);
//        esb2.setGoverno(2);
//        esb2.setIdEquipe(2);
//        esb2.setNome("Dois");
//        
//        equipes.add(esb1);
//        
//        System.out.println("Equipes{");
//        for(EquipeServicoBean e : equipes){
//            System.out.println(e.getNome());
//        }
//        
//        System.out.println("}");
//        
//        equipes.remove(esb1);
//        System.out.println("Equipes depois de remove 1{");
//        for(EquipeServicoBean e : equipes){
//            System.out.println(e.getNome());
//        }
//        System.out.println("}");
        
//        EquipeServicoBean esb = new EquipeServicoBean();
//        esb.setCoordenadora(1);
//        esb.setGoverno(33);
//        esb.setIdEquipe(5);
//        esb.setNome("AAAAA");
//        
//        EquipeServicoDao dao = new EquipeServicoDao();
//        try {
//            dao.alteraEquipeServico(5, esb);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//                String nome = "nome";
//                String pai = "pai";
//                String mae = "mae";
//                String rua = "rua";
//                String numero = "numero";
//                String bairro = "bairro";
//                String cidade = "cidade";
//                String uf = "uf";
//                String cep = "cep";
//                String diocese = "diocese";
//                String dataNascimento = "data_nasc";
//                String email = "email";
//                String telefone = "telefone";
//                String etapaFormacaoAtual = "etapa_formacao_atual";
//                String dataIngressoEtapaAtual = "data_ing";
//                String atividade = "ativid";
//                String motivoInatividade = "motivo_inatividade";
//		
//                FormandaBean f = new FormandaBean();
//                
//                f.setNome(nome);
//                f.setAtividade(atividade);
//                f.setBairro(bairro);
//                f.setCep(cep);
//                f.setCidade(cidade);
//                f.setDataEtapaAtual(dataIngressoEtapaAtual);
//                f.setDataNascimento(dataNascimento);
//                f.setDiocese(diocese);
//                f.setEmail(email);
//                f.setEtapa(etapaFormacaoAtual);
//                f.setMae(mae);
//                f.setMotivoInatividade(motivoInatividade);
//                f.setNumero(numero);
//                f.setPai(pai);
//                f.setRua(rua);
//                f.setTelefone(telefone);
//                f.setUf(uf);
//                
//                FormandaDao dao = new FormandaDao();
//                FormandaBean gravada = null;
//                try {
//                    dao.gravaFormanda(f);
//                    gravada =  dao.getUltimaFormandaBeanCadastrada();
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SQLException ex) {
//                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                }   
//        
//                gravada.setNome("ALTERADO");
//        try {
//            dao.alteraFormanda(gravada.getIdFormanda(), gravada);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        for(int i = 0; i< 34; i++){
            System.out.println("ps.setString("+(i+1)+", freira.get);");
        }
    }
}
