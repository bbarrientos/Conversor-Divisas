/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unilidades;

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
import javax.swing.JComboBox;

public class Conexion {
    
    public void Conexion(String divisaInicial, String divisaFinal) throws IOException {
        String d = "http://free.currencyconverterapi.com/api/v3/convert?q="+divisaInicial+"_"+divisaFinal+"&compact=y";

        URL url = new URL(d);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject object = root.getAsJsonObject();
        
        System.out.println(object.get("id"));
    }
}
