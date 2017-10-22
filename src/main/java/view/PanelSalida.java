package view;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSalida extends JPanel {
    
    private JLabel inVal;
    private JLabel inCur;
    private JLabel outVal;
    private JLabel outCur;
    private JLabel arrow;
    
    public PanelSalida(){
        this.initComponents();
    }
    
    private void initComponents(){
        
        FlowLayout lay = new FlowLayout();
        this.setLayout(lay);
        
        this.inVal = new JLabel("Start quantity");
        this.add(inVal);
        this.inCur = new JLabel("Start currency");
        this.add(inCur);
        this.arrow = new JLabel("--->");
        this.add(arrow);
        this.outVal = new JLabel("Finish quantity");
        this.add(outVal);
        this.outCur = new JLabel("Finish currency");
        this.add(outCur);
        
    }
    
}
