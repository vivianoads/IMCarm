/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.utilconsulta;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author viviano
 */
public class Bodas {
    public static Integer getBodas(String boda){
        Map<String, Integer> m = new HashMap<String, Integer>();
         m.put("bodas_Papel", 1);
         m.put("bodas_Madeira", 5);
         m.put("bodas_Estanho", 10);
         m.put("bodas_Cristal", 15);
         m.put("bodas_Porcelana", 20);
         m.put("bodas_Prata", 25);
         m.put("bodas_Pérola", 30);
         m.put("bodas_Coral", 35);
         m.put("bodas_Esmeralda", 40);
         m.put("bodas_Platina", 45);
         m.put("bodas_Ouro", 50);
         m.put("bodas_Ametista", 55);
         m.put("bodas_Diamante", 60);
         m.put("bodas_Ferro", 65);
         m.put("bodas_Vinho", 70);
         m.put("bodas_Brilhante", 75);
         m.put("bodas_Carvalho", 80);
         m.put("bodas_Girassol", 85);
         m.put("bodas_Álamo", 90);
         m.put("bodas_Sândalo", 95);
         m.put("bodas_Cânhamo", 100);
         
         return m.get(boda);
    }
}
