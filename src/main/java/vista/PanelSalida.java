package vista;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSalida extends JPanel {
    
    private JLabel cantidadInicial;
    private JLabel divisaInicial;
    private JLabel cantidadFinal;
    private JLabel divisaFinal;
    private JLabel flecha;
    
    public PanelSalida(){
        this.initComponents();
    }
    
    private void initComponents(){
        
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
