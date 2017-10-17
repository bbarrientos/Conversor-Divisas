package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversionPanel extends JPanel {
    
    public JTextField val;
    private JComboBox in;
    private JComboBox out;
    public JButton conv;
    private String []monedas = {"USD","EUR","CLP"};
    
    public ConversionPanel(){
        this.initComponents();
    }

    private void initComponents() {
        
        FlowLayout lay = new FlowLayout();
        this.setLayout(lay);
        
        this.val = new JTextField(5);
        this.add(val);
        
        this.in = new JComboBox(monedas);
        this.add(in);
        
        this.out = new JComboBox(monedas);
        this.add(out);
        
        this.conv = new JButton("Convert");
        this.add(conv);
        
    }
    
}
