/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.utilconsulta;

import java.util.Calendar;

/**
 *
 * @author viviano
 */
public class UtilData {
    public static Integer getIdade(String dataComparar){
        Integer idade = 0;
        String[] data = new String[3];
        data = dataComparar.split("-");
        Integer diaComparar = new Integer(data[2]);
        Integer mesComparar = new Integer(data[1]);
        Integer anoComparar = new Integer(data[0]);
        
        Integer diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        Integer mesAtual = Calendar.getInstance().get(Calendar.MONTH+1);
        Integer anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        
        idade = (anoAtual - anoComparar);
        System.out.println("idade na comparação de anos = " + idade);
        System.out.println("mes atual = " + mesAtual + "mes comparar = " + mesComparar);
        System.out.println("dia atual = " + diaAtual + "dia comparar = " + diaComparar);
        System.out.println(mesComparar.equals(mesAtual));
        if((mesComparar > mesAtual)||((mesComparar.equals(mesAtual))&&(diaComparar > diaAtual))){
            idade = idade-1;
            System.out.println("idade na comparação de mes = " + idade);
        }
             
        return idade;
    }
}
