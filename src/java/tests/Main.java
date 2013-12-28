/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import com.viviano.imcarm.entidades.CongregacaoBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.GovernoGeralBean;
import com.viviano.imcarm.persistencia.CongregacaoDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.persistencia.GovernoGeralDao;
import java.sql.SQLException;
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
        
        GovernoGeralBean gb = new GovernoGeralBean();
        GovernoGeralDao gDao = new GovernoGeralDao();
        FreiraBean IrSineide = new FreiraBean();
        FreiraDao fd = new FreiraDao();
       
        try {
            IrSineide = fd.getFreiraBean(1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(IrSineide.getNomeCivil());
        
        gb.setMadreGeral(IrSineide);
        gb.setViceGeral(IrSineide);
        gb.setEconomaGeral(IrSineide);
        try {
            gDao.gravaGovernoGeral(gb);
            gb = gDao.getUltimoGovernoGeralCadastrado();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(gb.getIdGoverno());
        System.out.println("ok");
        
        
        
    }
}
