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

    private String currencyId;

    private String name;

    public Divisa() {
    }
    
    public Divisa(String currencyId, String name) {
        this.currencyId = currencyId;
        this.name = name;
    }
    
    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Divisa{" + "currencyId=" + currencyId + ", name=" + name + '}';
    }
    
}
