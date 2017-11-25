package modelo;

import java.io.IOException;
import java.text.DecimalFormat;
import servicios.Conexion;

public class Calculos {
    
    private Conexion con = new Conexion();
    
    public String calcular(String divIn, String divOut, double cant){
        
        double exchange = 1;
        try {
            exchange = con.Conexion(divIn, divOut);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        double conversion = exchange*cant;
        DecimalFormat dF = new DecimalFormat("#.000"); 
        
        return dF.format(conversion);
        
    }
}
