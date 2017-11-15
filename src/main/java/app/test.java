package app;

import java.io.IOException;
import unilidades.Conexion;

public class test {

    public static void main(String[] args) {
        Conexion cn = new Conexion();
        try{
            cn.Conexion("JPY", "CLP");
        }catch(IOException ae){
            System.err.println("Error en la conexion.");
        }
    }
    
}
