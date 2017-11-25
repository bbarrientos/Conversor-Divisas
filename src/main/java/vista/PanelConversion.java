package vista;

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
    private Lector div = new Lector();
    
    
    public PanelConversion(){
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        
        this.cantidad = new JTextField(5);
        this.add(cantidad);
        
        this.divisaInicial = div.leerArchivo();
        this.add(divisaInicial);
        
        this.btnSwitch = new JButton("<-->");
        this.add(btnSwitch);
        
        this.divisaFinal = div.leerArchivo();
        this.add(divisaFinal);
        
        this.btnConvertir = new JButton("Convertir");
        this.add(btnConvertir);
        
    }
    
}
