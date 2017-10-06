/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2c52.implementacion;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Coneccion {
    public Coneccion(){
        
    }
    public String Coneccion(String MonedaBase, String MonedaCambiante) throws IOException {
        String d = "http://free.currencyconverterapi.com/api/v3/convert?q="+MonedaBase+"_"+MonedaCambiante+"&compact=y";

        URL url = new URL(d);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(root);
        return jsonString; 
    }
}
