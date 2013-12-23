/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.viviano.imcarm.servicetowork;

/**
 *
 * @author viviano
 */
public class SplitString {
    public String splitStringMethod(String s){
        String[] split = new String[3];
        split = s.split("-");
        
        s = split[2] +" / "+ split[1] +" / "+ split[0];
        
        return s;
        
    }
}
