/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author s2c52
 */
public class Lector {
    
    public void leerjson(){
        String rutaArchivoDivisas = "data/divisas.json";
        Gson gs = new Gson();
        JsonParser jsonParser = new JsonParser();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivoDivisas));
            JsonElement jsonElement = jsonParser.parse(br);
            JsonObject object = jsonElement.getAsJsonObject();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        
        
        //return null
    }/*
    public JComboBox leerArchivo(){
        String ARCHIVO = "data/paises_y_divisas";
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
    }*/
}
