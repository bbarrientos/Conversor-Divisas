package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelConversion extends JPanel {
    
    public JTextField cantidad;
    public JComboBox divisaInicial;
    public JComboBox divisaFinal;
    public JButton btnConvertir;
    private final String []divisas = {"AFN","XCD","AED","ALL","AMD","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BDT","BGN","BHD","BIF","BND","BOB","BRL","BSD","BTN","BWP","BYR","BZD","CAD","CDF","CHF","CLP","CNY","COP","CRC","CUP","CZK","DJF","DKK","DOP","DZD","EGP",
                                "ERN","ETB","EUR","FJD","GBP","GEL","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","INR","IQD","IRR","ISK","JMD","JOD","JPY","KES","KGS","KHR","KMF","KPW","KWD","KYD","KZT","LAK","LBP","LKR","LRD",
                                "LSL","LVL","LYD","MAD","MDL","MGA","MKD","MMK","MNT","MOP","MRO","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NIO","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD",
                                "SCR","SDG","SEK","SGD","SHP","SLL","SOS","SRD","STD","SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TWD","TZS","UAH","UGX","USD","UYU","UZS","VEF","VND","VUV","WST","XAF","XCD","XOF","XPF","YER","ZAR","ZMW"};
    
    public PanelConversion(){
        this.initComponents();
    }

    private void initComponents() {
        
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        
        this.cantidad = new JTextField(5);
        this.add(cantidad);
        
        this.divisaInicial = new JComboBox(divisas);
        this.add(divisaInicial);
        
        this.divisaFinal = new JComboBox(divisas);
        this.add(divisaFinal);
        
        this.btnConvertir = new JButton("Convertir");
        this.add(btnConvertir);
        
    }
    
}
