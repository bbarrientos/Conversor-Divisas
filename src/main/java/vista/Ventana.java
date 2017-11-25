package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Calculos;

public class Ventana extends JFrame implements ActionListener  {
    public Calculos calculadora = new Calculos();
    private PanelConversion panelConversion;
    private PanelSalida panelSalida;
    
    public Ventana(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        this.panelConversion = new PanelConversion();
        this.panelConversion.btnSwitch.addActionListener(this);
        this.panelConversion.btnConvertir.addActionListener(this);
        
        this.add(this.panelConversion,BorderLayout.CENTER);
        //this.add(this.panelConversion.btnConvertir,BorderLayout.CENTER);
        
        this.panelSalida = new PanelSalida();
        this.add(this.panelSalida,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,100);
        this.setTitle("Conversor de Divisas (CC)");
        this.setLocation(100,100);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.panelConversion.btnConvertir == ae.getSource()){
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
            
            
            
        }else if(this.panelConversion.btnSwitch == ae.getSource()){
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

}
