/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicios.Conexion;

/**
 *
 * @author s2c52
 */
public class Calculos {
    
    private Conexion con = new Conexion();
    
    public String calcular(String divIn, String divOut, double cant){
        
        
        
        double exchange = 1;
        System.out.println(divIn+" "+divOut);
        try {
            exchange = con.Conexion(divIn, divOut);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        double conversion = exchange*cant;
        DecimalFormat dF = new DecimalFormat("#.00"); 
        
        return dF.format(conversion);
        
    }
}
