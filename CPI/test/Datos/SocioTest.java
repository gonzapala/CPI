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
 * @author Gonzalo
 */
public class SocioTest {
    
    public SocioTest() {
    }
    
    Socio instance;
    @Before
    public void before(){
      //String leg, String nom, String ape, int dni,int tel, String dom, String estadoP
      //,String cat,String est, String cuil,String email,String fechnac 
     instance = new Socio(2,"123/1/2016","Carlos","Lafarna",789456,35156,"Catamarca","Pagado","Profesional","Activo","20-12-1","lafarna@hotmail.com","1/1/1992");
    
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
     * Test of getLegajo_socio method, of class Socio.
     */
    @Test
    public void testGetLegajo_socio() {
      //  System.out.println("getLegajo_socio");
        //Socio instance = new Socio("123/1/2016","Carlos","Lafarna",78945612);
        String expResult = "123/1/2016";
        String result = instance.getLegajo_socio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setLegajo_socio method, of class Socio.
     */
    @Test
    public void testSetLegajo_socio() {
        System.out.println("setLegajo_socio");
        String legajo_socio = "555/1/2016";
        Socio instance = new Socio();
        instance.setLegajo_socio(legajo_socio);
        System.out.println("cambio de estado"+ instance.getLegajo_socio());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Socio.
     */
    @Test
    public void testGetNombre() {
       // System.out.println("getNombre");
        //Socio instance = new Socio("123/1/2016","Carlos","Lafarna",78945612);
        String expResult = "Carlos";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of setNombre method, of class Socio.
//     */
//    @Test
//    public void testSetNombre() {
//        System.out.println("setNombre");
//        String nombre = "";
//        Socio instance = new Socio();
//        instance.setNombre(nombre);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getApellido method, of class Socio.
//     */
//    @Test
//    public void testGetApellido() {
//        System.out.println("getApellido");
//        Socio instance = new Socio("123/1/2016","Carlos","Lafarna",78945612);
//        String expResult = "Lafarna";
//        String result = instance.getApellido();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setApellido method, of class Socio.
//     */
//    @Test
//    public void testSetApellido() {
//        System.out.println("setApellido");
//        String apellido = "";
//        Socio instance = new Socio();
//        instance.setApellido(apellido);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDni method, of class Socio.
//     */
//    @Test
//    public void testGetDni() {
//        System.out.println("getDni");
//        Socio instance = new Socio("123/1/2016","Carlos","Lafarna",78945612);
//        int expResult = 78945612;
//        int result = instance.getDni();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDni method, of class Socio.
//     */
//    @Test
//    public void testSetDni() {
//        System.out.println("setDni");
//        int dni = 0;
//        Socio instance = new Socio();
//        instance.setDni(dni);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTelefono method, of class Socio.
//     */
//    @Test
//    public void testGetTelefono() {
//        System.out.println("getTelefono");
//        Socio instance = new Socio();
//        int expResult = 0;
//        int result = instance.getTelefono();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTelefono method, of class Socio.
//     */
//    @Test
//    public void testSetTelefono() {
//        System.out.println("setTelefono");
//        int telefono = 0;
//        Socio instance = new Socio();
//        instance.setTelefono(telefono);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDomicilio method, of class Socio.
//     */
//    @Test
//    public void testGetDomicilio() {
//        System.out.println("getDomicilio");
//        Socio instance = new Socio();
//        String expResult = "";
//        String result = instance.getDomicilio();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDomicilio method, of class Socio.
//     */
//    @Test
//    public void testSetDomicilio() {
//        System.out.println("setDomicilio");
//        String domicilio = "";
//        Socio instance = new Socio();
//        instance.setDomicilio(domicilio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEstado_pago method, of class Socio.
//     */
//    @Test
//    public void testGetEstado_pago() {
//        System.out.println("getEstado_pago");
//        Socio instance = new Socio();
//        String expResult = "";
//        String result = instance.getEstado_pago();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEstado_pago method, of class Socio.
//     */
//    @Test
//    public void testSetEstado_pago() {
//        System.out.println("setEstado_pago");
//        String estado_pago = "";
//        Socio instance = new Socio();
//        instance.setEstado_pago(estado_pago);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCategoria method, of class Socio.
//     */
//    @Test
//    public void testGetCategoria() {
//        System.out.println("getCategoria");
//        Socio instance = new Socio();
//        String expResult = "";
//        String result = instance.getCategoria();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCategoria method, of class Socio.
//     */
//    @Test
//    public void testSetCategoria() {
//        System.out.println("setCategoria");
//        String categoria = "";
//        Socio instance = new Socio();
//        instance.setCategoria(categoria);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEstado method, of class Socio.
//     */
//    @Test
//    public void testGetEstado() {
//        System.out.println("getEstado");
//        Socio instance = new Socio();
//        String expResult = "";
//        String result = instance.getEstado();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEstado method, of class Socio.
//     */
//    @Test
//    public void testSetEstado() {
//        System.out.println("setEstado");
//        String estado = "";
//        Socio instance = new Socio();
//        instance.setEstado(estado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCuilcuit method, of class Socio.
//     */
//    @Test
//    public void testGetCuilcuit() {
//        System.out.println("getCuilcuit");
//        Socio instance = new Socio();
//        String expResult = "";
//        String result = instance.getCuilcuit();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCuilcuit method, of class Socio.
//     */
//    @Test
//    public void testSetCuilcuit() {
//        System.out.println("setCuilcuit");
//        String cuilcuit = "";
//        Socio instance = new Socio();
//        instance.setCuilcuit(cuilcuit);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEmail method, of class Socio.
//     */
//    @Test
//    public void testGetEmail() {
//        System.out.println("getEmail");
//        Socio instance = new Socio();
//        String expResult = "";
//        String result = instance.getEmail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEmail method, of class Socio.
//     */
//    @Test
//    public void testSetEmail() {
//        System.out.println("setEmail");
//        String email = "";
//        Socio instance = new Socio();
//        instance.setEmail(email);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of BuscarX method, of class Socio.
//     */
    
    
    
    @Test
    public void testBuscarX() throws Exception {
       
        String Legajo = "123/1/2016";
        instance = new Socio();
      
        Socio expResult = instance;
        Socio result = instance.BuscarX(Legajo);
        assertEquals(expResult, result);
        assertNotNull(result);
        assertNotNull(expResult);
        
        
      //  equals(expResult,result);
        
       // System.out.println( "Lo que Espero: "+ instance+" /Lo que traigo:"+ result);
     
        //assertEquals(expResult.toString(),result.toString());   
      
     //   equals(expResult.toString(), result.toString());
       // System.out.println("Esto"+expResult.toString() );
        
      
    }
//
//    /**
//     * Test of mostrarSocios method, of class Socio.
//     */
//    @Test
//    public void testMostrarSocios() throws Exception {
//        System.out.println("mostrarSocios");
//        Socio instance = new Socio();
//        Socio expResult = instance;
//        Socio result = instance.mostrarSocios();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }

//    /**
//     * Test of listarSocios method, of class Socio.
//     */
//    @Test
//    public void testListarSocios() {
//        System.out.println("listarSocios");
//        Socio instance = new Socio();
//        ArrayList<Socio> expResult = {"2","123/1/2016","Carlos","Lafarna","789456","35156","Catamarca","Pagado","Profesional","Activo","20-12-1","lafarna@hot","1/1/1992"};
//        ArrayList<Socio> result = instance.listarSocios();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of getFechaNac method, of class Socio.
//     */
////    @Test
////    public void testGetFechaNac() {
////        System.out.println("getFechaNac");
////        Socio instance = new Socio();
////        String expResult = "";
////        String result = instance.getFechaNac();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of setFechaNac method, of class Socio.
//     */
//    @Test
//    public void testSetFechaNac() {
//        System.out.println("setFechaNac");
//        String fechaNac = "";
//        Socio instance = new Socio();
//        instance.setFechaNac(fechaNac);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cambiarEstado method, of class Socio.
//     */
//    @Test
//    public void testCambiarEstado() {
//        System.out.println("cambiarEstado");
//      
//        Socio socioX = null;
//        int tipo_estado = 0;
//        Socio instance = new Socio();
//        instance.cambiarEstado(socioX, tipo_estado);
//        // TODO review the generated test code and remove the default call to fail.
//      //  fail("The test case is a prototype.");
//    }
   

