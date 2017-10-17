package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Window extends JFrame implements ActionListener,FocusListener  {
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void focusGained(FocusEvent e){
        this.cp.val.setText("");
    }
    
    public void focusLost(FocusEvent e){
    }
    
}
