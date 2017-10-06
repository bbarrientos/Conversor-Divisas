/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2c52.implementacion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s2c52
 */
public class Central {
    private String valor;
    private int Conversion=0;
    public Central(){
            
    }
    public void Calculos() {
        Coneccion ct = new Coneccion();
        Tablero tab = new Tablero();
        
        String monedaB = tab.getMonedaBase();
        String monedaC = tab.getMonedaCambio();
//        String monedaB = tab.getMonedaBase();
//        String monedaC = tab.getMonedaCambio();
        String cantidadD = tab.getCandidadDinero();
        
        
        
        
        System.out.println("*****************************************************");
        System.out.println(monedaB);
        System.out.println(monedaC);
        System.out.println(cantidadD);
        System.out.println("*****************************************************");;
        
        
        
        try {
            valor = ct.Coneccion(monedaB,monedaC);
        } catch (IOException ex) {
            Logger.getLogger(Central.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int monedaBint = Integer.parseInt(valor);
        int cantidadDint = Integer.parseInt(cantidadD);
        
        Conversion = monedaBint * cantidadDint;
        System.out.println(Conversion);
        
    }
}
