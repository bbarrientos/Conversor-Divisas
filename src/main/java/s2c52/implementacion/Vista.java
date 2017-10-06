/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2c52.implementacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author s2c52
 */
public class Vista extends JFrame{
    
    private PanelBotones botones;
    private Tablero tab;
    
    public Vista(){
        this.initComponets();
    }
    public void initComponets(){
        
        this.tab = new Tablero(2,2);
        this.add(this.tab,BorderLayout.CENTER);
        
        this.botones = new PanelBotones();
        this.add(this.botones,BorderLayout.EAST);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocation(100,100);
        this.setVisible(true);

//        FlowLayout distribucion = new FlowLayout();
//        JComboBox jbc = new JComboBox(Monedas);
//        this.add(jbc, BorderLayout.CENTER);
    }
}
