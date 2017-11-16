/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import unilidades.Conexion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author s2c52
 */
public class Central {
    
    Conexion ct = new Conexion();
    
    public double convertir(String in, String out) throws IOException {
        return ct.Conexion(in, out);
    }
}
