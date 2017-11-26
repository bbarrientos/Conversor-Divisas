package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSalida extends JPanel {
    
    public JLabel cantidadInicial;
    public JLabel divisaInicial;
    public JLabel cantidadFinal;
    public JLabel divisaFinal;
    private JLabel flecha;
    
    public PanelSalida(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        FlowLayout lay = new FlowLayout();
        this.setLayout(lay);
        
        this.cantidadInicial = new JLabel("Cantidad Inicial");
        this.cantidadInicial.setForeground(Color.WHITE); 
        this.add(cantidadInicial);
        
        this.divisaInicial = new JLabel("Divisa Inicial");
        this.divisaInicial.setForeground(Color.WHITE); 
        this.add(divisaInicial);
        
        this.flecha = new JLabel("--->");
        this.flecha.setForeground(Color.WHITE); 
        this.add(flecha);
        
        this.cantidadFinal = new JLabel("Cantidad Final");
        this.cantidadFinal.setForeground(Color.WHITE); 
        this.add(cantidadFinal);
        
        this.divisaFinal = new JLabel("Divisa Final");
        this.divisaFinal.setForeground(Color.WHITE); 
        this.add(divisaFinal);
        
        this.setBackground(new Color(20, 54, 93));
        
        
    }
    
}
