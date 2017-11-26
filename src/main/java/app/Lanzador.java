package app;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import vista.Ventana;

public class Lanzador {
    
    public static void main(String[] args) {
        //Ventana ventanaPrincipal = new Ventana();
        String rutaArchivoDivisas = "data/divisas.json";
        Gson gs = new Gson();
        JsonParser jsonParser = new JsonParser();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivoDivisas));
            JsonElement jsonElement = jsonParser.parse(br);
            JsonObject object = jsonElement.getAsJsonObject();
            List<> objs = object.fromJson(jsonElement, new TypeToken<List<Menu>>() {
            }.getType());
            object.fo
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
