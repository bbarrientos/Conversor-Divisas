package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import modelo.Calculos;
import modelo.Central;

public class Ventana extends JFrame implements ActionListener  {
    private Calculos calculadora;
    private PanelConversion panelConversion;
    private PanelSalida panelSalida;
    
    public Ventana(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        this.panelConversion = new PanelConversion();
        this.panelConversion.btnConvertir.addActionListener(this);
        this.add(this.panelConversion,BorderLayout.CENTER);
        
        this.panelSalida = new PanelSalida();
        this.add(this.panelSalida,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,100);
        this.setTitle("Conversor de Divisas (CC)");
        this.setLocation(100,100);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(panelConversion.btnConvertir == ae.getSource()){
            String primeraDivisa = (String) panelConversion.divisaInicial.getSelectedItem();
            String segundaDivisa = (String) panelConversion.divisaFinal.getSelectedItem();
            calculadora.calcular("JPY", "CLP",1.0);
        }else{System.out.println("Se presiono otro botón.");}
    }

}
