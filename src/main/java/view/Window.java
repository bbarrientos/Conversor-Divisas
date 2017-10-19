package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Central;

public class Window extends JFrame implements ActionListener,FocusListener  {
    private Central central;
    private ConversionPanel cp;
    private ShowPanel sp;
    
    public Window(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        this.cp = new ConversionPanel();
        this.cp.val.addFocusListener(this);
        this.add(this.cp,BorderLayout.CENTER);
        
        this.sp = new ShowPanel();
        this.add(this.sp,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,100);
        this.setTitle("Currency Conversor");
        this.setLocation(100,100);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        cp.conv.addActionListener(
                (ActionEvent e) -> {
                    String firstValue = (String) cp.in.getSelectedItem();
                    String secondValue = (String) cp.out.getSelectedItem();
            try {
                central.Calculos(firstValue, secondValue);
            } catch (IOException ex) {
                Logger.getLogger("ERROR");
            }
                    });

                

                
        
    }
    
    public void focusGained(FocusEvent e){
        this.cp.val.setText("");
    }
    
    public void focusLost(FocusEvent e){
    }
    
}
