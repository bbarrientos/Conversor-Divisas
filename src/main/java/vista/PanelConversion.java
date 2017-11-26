package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import utilidades.Lector;

public class PanelConversion extends JPanel {
    
    public JTextField cantidad ;
    public JComboBox divisaInicial;
    public JComboBox divisaFinal;
    public JButton btnConvertir;
    public JButton btnSwitch;
    private Lector divisas = new Lector();
    
    
    public PanelConversion(){
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        
        this.cantidad = new JTextField(5);
        this.add(cantidad);
        
        this.divisaInicial = divisas.leerArchivo();
        this.add(divisaInicial);
        
        this.btnSwitch = new JButton("<-->");
        this.add(btnSwitch);
        
        this.divisaFinal = divisas.leerArchivo();
        this.add(divisaFinal);
        
        this.btnConvertir = new JButton("Convertir");
        this.add(btnConvertir);
        this.setBackground(new Color(20, 54, 93));
        
    }
    
}
