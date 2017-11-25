/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Colonello-sensei
 */
public class CalculosTest {
    
    public CalculosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcular method, of class Calculos.
     */
    @Test
    public void testCalcular01() {
        System.out.println("calcular01");
        Calculos calculadora = new Calculos();
        String divIn = "USD";
        String divOut = "CLP";
        double cant = 20.0;
        String expResult = "12668.800";
        String result = calculadora.calcular(divIn, divOut, cant);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcular02(){
        System.out.println("calcular02");
        Calculos calculadora = new Calculos();
        String divIn = "CLP";
        String divOut = "USD";
        double cant = 20.0;
        String expResult = ".032";
        String result = calculadora.calcular(divIn, divOut, cant);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcular03(){
    System.out.println("calcular03");
        Calculos calculadora = new Calculos();
        String divIn = "USD";
        String divOut = "CLP";
        double cant = 0;
        String expResult = ".000";
        String result = calculadora.calcular(divIn, divOut, cant);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcular4(){
        System.out.println("calcular04");
        Calculos calculadora = new Calculos();
        String divIn = "USD";
        String divOut = "CLP";
        double cant = -1;
        String expResult = "-633.440";
        String result = calculadora.calcular(divIn, divOut, cant);
        assertEquals(expResult, result);
    }
    
}
