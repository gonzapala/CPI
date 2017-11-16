/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Datos.Socio;
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
public class Gestionar_PagosTest {
    
    public Gestionar_PagosTest() {
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
     * Test of mostrarInformacion method, of class Gestionar_Pagos.
     */
    @Test
    public void testMostrarInformacion() {
        System.out.println("mostrarInformacion");
        Socio NS = null;
        int estado = 2;
        Gestionar_Pagos instance = new Gestionar_Pagos();
        instance.mostrarInformacion(NS, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCantidadMeses method, of class Gestionar_Pagos.
     */
    @Test
    public void testCalcularCantidadMeses() throws Exception {
        System.out.println("calcularCantidadMeses");
        Socio NS = null;
        Gestionar_Pagos instance = new Gestionar_Pagos();
        int expResult = 0;
        int result = instance.calcularCantidadMeses(NS);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarFormulario method, of class Gestionar_Pagos.
     */
    @Test
    public void testLimpiarFormulario() {
        System.out.println("limpiarFormulario");
        Gestionar_Pagos instance = new Gestionar_Pagos();
        instance.limpiarFormulario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
