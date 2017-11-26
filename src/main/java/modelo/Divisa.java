/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author s2c52
 */
public class Divisa {
    private String alpha3;
    private String currencyId;
    private String currencySymbol;
    private String currencyName;
    private String name;

    public Divisa() {
    }
    
    public Divisa(String currencyId, String name) {
        this.currencyId = currencyId;
        this.currencyName = name;
    }
    
    public String getAlpha3() {
        return alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return currencyName;
    }

    public void setName(String name) {
        this.currencyName = name;
    }

    @Override
    public String toString() {
        return "Divisa{" + "currencyId=" + currencyId + ", name=" + name + '}';
    }
    
}
