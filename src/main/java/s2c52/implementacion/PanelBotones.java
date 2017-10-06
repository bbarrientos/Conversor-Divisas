/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2c52.implementacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author s2c52
 */
public class PanelBotones extends JPanel{
    public PanelBotones(){
        this.ic();
    }
    public void ic(){
        Central Peticion = new Central();
        BoxLayout distribucion = new BoxLayout(this, BoxLayout.LINE_AXIS);
        this.setLayout(distribucion);

                
        JButton btnConvetir = new JButton("Convertir");
        this.add(btnConvetir);
        btnConvetir.addActionListener(  
                
                (ActionEvent e) -> {
                    Peticion.Calculos();
                }
        );
        
        
        
        
    }
    
    
}
