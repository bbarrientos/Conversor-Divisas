package vista;

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
        this.add(cantidadInicial);
        this.divisaInicial = new JLabel("Divisa Inicial");
        this.add(divisaInicial);
        this.flecha = new JLabel("--->");
        this.add(flecha);
        this.cantidadFinal = new JLabel("Cantidad Final");
        this.add(cantidadFinal);
        this.divisaFinal = new JLabel("Divisa Final");
        this.add(divisaFinal);
        
    }
    
}
