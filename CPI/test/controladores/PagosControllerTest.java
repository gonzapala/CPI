/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Datos.Pago_cuota;
import Datos.Socio;
import java.util.ArrayList;
import javax.swing.JTable;
import org.jdesktop.swingx.JXTable;
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
public class PagosControllerTest {
    
    public PagosControllerTest() {
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
     * Test of PagosController method, of class PagosController.
     */
    @Test
    public void testPagosController() {
        System.out.println("PagosController");
        PagosController instance = new PagosController();
        instance.PagosController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LlenarTabla method, of class PagosController.
     */
    @Test
    public void testLlenarTabla() {
        System.out.println("LlenarTabla");
        JXTable tabla_socios = null;
        PagosController instance = new PagosController();
        instance.LlenarTabla(tabla_socios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LlenarTablaCuotas method, of class PagosController.
     */
    @Test
    public void testLlenarTablaCuotas() {
        System.out.println("LlenarTablaCuotas");
        ArrayList<Pago_cuota> listaCuotas = null;
        JTable tabla = null;
        PagosController instance = new PagosController();
        instance.LlenarTablaCuotas(listaCuotas, tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDeuda method, of class PagosController.
     */
    @Test
    public void testBuscarDeuda() {
        System.out.println("buscarDeuda");
        Socio s = null;
        PagosController instance = new PagosController();
        ArrayList<Pago_cuota> expResult = null;
        ArrayList<Pago_cuota> result = instance.buscarDeuda(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagarCuota method, of class PagosController.
     */
    @Test
    public void testPagarCuota() throws Exception {
        System.out.println("pagarCuota");
        int id = 24;
        PagosController instance = new PagosController();
        instance.pagarCuota(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
