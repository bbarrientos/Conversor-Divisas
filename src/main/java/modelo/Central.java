/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author s2c52
 */
public class Central {
    
    private String value;
    private int Conversion=0;
    Conexion ct = new Conexion();
    //Tablero tab = new Tablero();
    
    public void convertir(String in, String out) throws IOException {     
        value = ct.Conexion(in, out);
        //System.out.println("IN : "+in+" OUT: "+out);
        System.out.println("Valor"+value);
        int monedaBint = Integer.parseInt(value);
        //int cantidadDint = Integer.parseInt(cantidadD);
        
        //Conversion = monedaBint * cantidadDint;
        System.out.println(Conversion);
        
    }
}
