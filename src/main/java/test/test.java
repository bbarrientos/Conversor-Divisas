package test;

import java.io.IOException;
import unilidades.Conexion;

public class test {

    public static void main(String[] args) {
        Conexion cn = new Conexion();
        try{
            System.out.println(cn.Conexion("JPY", "CLP"));
        }catch(IOException ae){
            System.err.println(ae.getMessage());
        }
    }
    
}
