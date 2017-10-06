 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2c52.implementacion;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author s2c52
 */
public class Tablero extends JPanel{
    private int filas;
    private int col;
    private String MonedaBase;
    private String MonedaCambio;
    private String CantidadDinero;
    public String []Monedas = {"USD","EUR","CLP"};
    public JComboBox jbc = new JComboBox(Monedas);
    public JComboBox jbc2 = new JComboBox(Monedas);
    
    public Tablero(){
        
    }
    
    public Tablero(int x, int y) {
        this.filas = x;
        this.col = y;
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        
        GridLayout distribucion = new GridLayout(filas,col);
        this.setLayout(distribucion);
        
        JTextField textfield = new JTextField(20);
        JTextField textfield2 = new JTextField(20);
        
        this.add(textfield);
        this.add(jbc);
        this.add(textfield2);
        this.add(jbc2);
        
        
        MonedaCambio = (String) jbc2.getSelectedItem();
        CantidadDinero = textfield.getText();
        
        System.out.println(MonedaBase);
        System.out.println(MonedaCambio);
        System.out.println(CantidadDinero);
    }
    
    public String getMonedaBase(){
        return MonedaBase;
    }
    public String getMonedaCambio(){
        return MonedaCambio;
    }
    public String getCandidadDinero(){
        return CantidadDinero;
    }
}
