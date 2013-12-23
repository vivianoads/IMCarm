/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import com.viviano.imcarm.entidades.CongregacaoBean;
import com.viviano.imcarm.persistencia.CongregacaoDao;
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
        CongregacaoBean cb = new CongregacaoBean();
        cb.setNome("teste app");
        CongregacaoDao congregacaoDao = new CongregacaoDao();
        try {
            congregacaoDao.alteraCongregacao(18, cb);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
