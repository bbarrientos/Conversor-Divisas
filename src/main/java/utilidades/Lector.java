/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author s2c52
 */
public class Lector {
    private ArrayList []divisas; 
    public JComboBox leerArchivo(){
//        String AR0CHIVO = "data/divisas.txt";
//        FileReader lector = null;
//        int caracter;
//        try {
//            lector = new FileReader(ARCHIVO);
//            caracter = lector.read();
//            
//            while (caracter != -1) {
//                System.out.print((char) caracter);
//                caracter = lector.read();
//                //System.out.println(caracter);
//            }
//            return caracter;
//        } catch (IOException ex) {
//            System.out.println("Problemas leyendo el archivo " + ARCHIVO);
//        } finally {
//            try {
//                lector.close();
//            } catch (IOException ex) {
//                System.out.println("Problemas cerrando el archivo " + ARCHIVO);
//            }
//        }return 0;
        String ARCHIVO = "data/divisas.txt";
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            
            JComboBox cb = new JComboBox();
            while ((linea=input.readLine()) != null) {
                cb.addItem(linea);
            }
            return cb;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                System.out.println("Imposible abrir el archivo");
            }
        }return null;
    }
}
