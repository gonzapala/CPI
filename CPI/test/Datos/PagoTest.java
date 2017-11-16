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
     * Test of getId_pago method, of class Pago.
     */
    @Test
    public void testGetId_pago() {
        System.out.println("getId_pago");
        Pago instance = new Pago();
        int expResult = 0;
        int result = instance.getId_pago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_pago method, of class Pago.
     */
    @Test
    public void testSetId_pago() {
        System.out.println("setId_pago");
        int id_pago = 0;
        Pago instance = new Pago();
        instance.setId_pago(id_pago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero_pago method, of class Pago.
     */
    @Test
    public void testGetNumero_pago() {
        System.out.println("getNumero_pago");
        Pago instance = new Pago();
        int expResult = 0;
        int result = instance.getNumero_pago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero_pago method, of class Pago.
     */
    @Test
    public void testSetNumero_pago() {
        System.out.println("setNumero_pago");
        int numero_pago = 0;
        Pago instance = new Pago();
        instance.setNumero_pago(numero_pago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Pago.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Pago instance = new Pago();
        int expResult = 0;
        int result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Pago.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        int tipo = 0;
        Pago instance = new Pago();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForma method, of class Pago.
     */
    @Test
    public void testGetForma() {
        System.out.println("getForma");
        Pago instance = new Pago();
        String expResult = "";
        String result = instance.getForma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForma method, of class Pago.
     */
    @Test
    public void testSetForma() {
        System.out.println("setForma");
        String forma = "";
        Pago instance = new Pago();
        instance.setForma(forma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCant_cuotas method, of class Pago.
     */
    @Test
    public void testGetCant_cuotas() {
        System.out.println("getCant_cuotas");
        Pago instance = new Pago();
        int expResult = 0;
        int result = instance.getCant_cuotas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCant_cuotas method, of class Pago.
     */
    @Test
    public void testSetCant_cuotas() {
        System.out.println("setCant_cuotas");
        int cant_cuotas = 0;
        Pago instance = new Pago();
        instance.setCant_cuotas(cant_cuotas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Pago.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Pago instance = new Pago();
        float expResult = 0.0F;
        float result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Pago.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        float monto = 0.0F;
        Pago instance = new Pago();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_socio method, of class Pago.
     */
    @Test
    public void testGetId_socio() {
        System.out.println("getId_socio");
        Pago instance = new Pago();
        int expResult = 0;
        int result = instance.getId_socio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_socio method, of class Pago.
     */
    @Test
    public void testSetId_socio() {
        System.out.println("setId_socio");
        int id_socio = 0;
        Pago instance = new Pago();
        instance.setId_socio(id_socio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUltimoPago method, of class Pago.
     */
    @Test
    public void testBuscarUltimoPago() {
        System.out.println("buscarUltimoPago");
        int id_socio = 0;
        Pago instance = new Pago();
        Pago expResult = null;
        Pago result = instance.buscarUltimoPago(id_socio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pago.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pago instance = new Pago();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPagos method, of class Pago.
     */
    @Test
    public void testBuscarPagos() {
        System.out.println("buscarPagos");
        int id_socio = 0;
        Pago instance = new Pago();
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = instance.buscarPagos(id_socio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pago.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pago instance = new Pago();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Pago.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Pago instance = new Pago();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
