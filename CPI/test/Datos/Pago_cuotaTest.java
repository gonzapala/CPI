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
public class Pago_cuotaTest {
    
    public Pago_cuotaTest() {
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
     * Test of getId method, of class Pago_cuota.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pago_cuota instance = new Pago_cuota();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pago_cuota.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pago_cuota.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pago_cuota instance = new Pago_cuota();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Pago_cuota.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Pago_cuota instance = new Pago_cuota();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero_cuota method, of class Pago_cuota.
     */
    @Test
    public void testGetNumero_cuota() {
        System.out.println("getNumero_cuota");
        Pago_cuota instance = new Pago_cuota();
        int expResult = 0;
        int result = instance.getNumero_cuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero_cuota method, of class Pago_cuota.
     */
    @Test
    public void testSetNumero_cuota() {
        System.out.println("setNumero_cuota");
        int numero_cuota = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.setNumero_cuota(numero_cuota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Pago_cuota.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Pago_cuota instance = new Pago_cuota();
        int expResult = 0;
        int result = instance.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Pago_cuota.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        int monto = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Pago_cuota.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pago_cuota instance = new Pago_cuota();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Pago_cuota.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_limite method, of class Pago_cuota.
     */
    @Test
    public void testGetFecha_limite() {
        System.out.println("getFecha_limite");
        Pago_cuota instance = new Pago_cuota();
        String expResult = "";
        String result = instance.getFecha_limite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha_limite method, of class Pago_cuota.
     */
    @Test
    public void testSetFecha_limite() {
        System.out.println("setFecha_limite");
        String fecha_limite = "";
        Pago_cuota instance = new Pago_cuota();
        instance.setFecha_limite(fecha_limite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_pago method, of class Pago_cuota.
     */
    @Test
    public void testGetId_pago() {
        System.out.println("getId_pago");
        Pago_cuota instance = new Pago_cuota();
        int expResult = 0;
        int result = instance.getId_pago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_pago method, of class Pago_cuota.
     */
    @Test
    public void testSetId_pago() {
        System.out.println("setId_pago");
        int id_pago = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.setId_pago(id_pago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarCuotas method, of class Pago_cuota.
     */
    @Test
    public void testGenerarCuotas() {
        System.out.println("generarCuotas");
        int id_pago = 0;
        int cant_cuotas = 0;
        int montoPorCuota = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.generarCuotas(id_pago, cant_cuotas, montoPorCuota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFechaVencimiento method, of class Pago_cuota.
     */
    @Test
    public void testCalcularFechaVencimiento() {
        System.out.println("calcularFechaVencimiento");
        String fecha = "";
        Pago_cuota instance = new Pago_cuota();
        String expResult = "";
        String result = instance.calcularFechaVencimiento(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarCuota method, of class Pago_cuota.
     */
    @Test
    public void testGuardarCuota() {
        System.out.println("guardarCuota");
        Pago_cuota cuota = null;
        Pago_cuota instance = new Pago_cuota();
        int expResult = 0;
        int result = instance.guardarCuota(cuota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCuotas method, of class Pago_cuota.
     */
    @Test
    public void testBuscarCuotas() {
        System.out.println("buscarCuotas");
        int id_pago = 0;
        Pago_cuota instance = new Pago_cuota();
        ArrayList<Pago_cuota> expResult = null;
        ArrayList<Pago_cuota> result = instance.buscarCuotas(id_pago);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagarCuota method, of class Pago_cuota.
     */
    @Test
    public void testPagarCuota() throws Exception {
        System.out.println("pagarCuota");
        int id = 0;
        Pago_cuota instance = new Pago_cuota();
        instance.pagarCuota(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
