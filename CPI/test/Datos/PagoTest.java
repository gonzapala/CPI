/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gonza
 */
public class PagoTest {
    
    public PagoTest() {
    }
    Pago instance;
    
    @Before
    public void before(){
        instance = new Pago(40,"2017/4561/2/2016", 0, "0", 500, "2016-09-11", 26);
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
     * Test of getNumero_pago method, of class Pago.
     */
    @Test
    public void testGetNumero_pago() {
        System.out.println("getNumero_pago");
        //Pago instance = new Pago();
        String expResult = "2017/456/1/2016";
        String result = instance.getNumero_pago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result.equals(expResult)){
            System.out.println("  -Es Correcto");
        }else{
            fail("The test case is a prototype.");
        }
    }

   

    /**
     * Test of getMonto method, of class Pago.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        //Pago instance = new Pago();
        float expResult = 123.0F;
        float result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result == expResult){
            System.out.println("  -Es Correcto");
        }else{
            fail("The test case is a prototype.");
        }
    }



    /**
     * Test of buscarUltimoPago method, of class Pago.
     */
    @Test
    public void testBuscarUltimoPago() {
        System.out.println("buscarUltimoPago");
        int id_socio = 26;
        Pago expResult = instance;
        String expString = instance.getNumero_pago();
        Pago result = instance.buscarUltimoPago(id_socio);
        String resultString = result.getNumero_pago();
        
        assertEquals(expString, resultString);
        System.out.println(result.getNumero_pago());
        
        // TODO review the generated test code and remove the default call to fail.
        if(resultString.equals(expString)){
            System.out.println("  -Es Correcto");
        }else{
            fail("The test case is a prototype.");
        }
    }
    
}
