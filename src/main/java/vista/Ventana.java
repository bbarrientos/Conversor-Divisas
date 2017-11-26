package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Calculos;

public class Ventana extends JFrame implements ActionListener  {
    public Calculos calculadora = new Calculos();
    private PanelConversion panelConversion;
    private PanelSalida panelSalida;
    
    public Ventana(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        this.setBackground(Color.yellow);
        this.panelConversion = new PanelConversion();
        this.panelConversion.btnSwitch.addActionListener(this);
        this.panelConversion.btnConvertir.addActionListener(this);
        
        this.add(this.panelConversion,BorderLayout.CENTER);
        
        this.panelSalida = new PanelSalida();
        this.add(this.panelSalida,BorderLayout.SOUTH);

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,110);
        
        this.setTitle("Conversor de Divisas (CC)");
        this.setLocation(100,100);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("imagenes/icono.jpg");
        this.setIconImage(icon.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        boolean vali = validacion(this.panelConversion.cantidad.getText());
        if(vali != false){
            if(this.panelConversion.btnConvertir == ae.getSource()){
                
                convertir();
            }else if(this.panelConversion.btnSwitch == ae.getSource()){
                intercambiar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Solo se Aceptan Numeros");
        }
    }
    
    private boolean validacion(String cantidadInicial){
        double numero;
        try{
            numero = Double.parseDouble(cantidadInicial);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
   
    private void convertir(){
        String primeraDivisa = (String) panelConversion.divisaInicial.getSelectedItem();
            String segundaDivisa = (String) panelConversion.divisaFinal.getSelectedItem();

            double dinero = Double.valueOf(panelConversion.cantidad.getText());
            
            String primera = primeraDivisa.substring(primeraDivisa.length()-3,primeraDivisa.length());
            String segundo = segundaDivisa.substring(segundaDivisa.length()-3,segundaDivisa.length()); 
            String c = calculadora.calcular(primera, segundo,dinero);
            
            this.panelSalida.cantidadInicial.setText(String.valueOf(dinero));
            this.panelSalida.cantidadFinal.setText(c);
            this.panelSalida.divisaInicial.setText(primeraDivisa);
            this.panelSalida.divisaFinal.setText(segundaDivisa);
    }
    
    private void intercambiar(){
        String primeraDivisa = (String) panelConversion.divisaInicial.getSelectedItem();
            String segundaDivisa = (String) panelConversion.divisaFinal.getSelectedItem();
            String aux1= primeraDivisa;
            
            this.panelConversion.divisaInicial.setSelectedItem(segundaDivisa);
            this.panelConversion.divisaFinal.setSelectedItem(aux1);
            
            
            double dinero = Double.valueOf(panelConversion.cantidad.getText());
            
            String primera = primeraDivisa.substring(primeraDivisa.length()-3,primeraDivisa.length());
            String segundo = segundaDivisa.substring(segundaDivisa.length()-3,segundaDivisa.length()); 
            
            
            
            String c = calculadora.calcular(primera, segundo,dinero);
            
            this.panelSalida.cantidadInicial.setText(String.valueOf(dinero));
            this.panelSalida.cantidadFinal.setText(c);
            this.panelSalida.divisaInicial.setText(primeraDivisa);
            this.panelSalida.divisaFinal.setText(segundaDivisa);
    }

}
