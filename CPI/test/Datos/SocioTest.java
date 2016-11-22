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
    
     instance = new Socio(2,"123/1/2016","Carlos","Perez",789456,35156,"Catamarca","Pagado","Profesional","Activo","20-789456-1","carlos@hotmail.com","1992-01-01");
    
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
    System.out.println("getLegajo_socio");      
        String expResult = "123/1/2016";
        String result = instance.getLegajo_socio();
        assertEquals(expResult, result);
        
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
       
    }

    /**
     * Test of getNombre method, of class Socio.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");       
        String expResult = "Carlos";
        String result = instance.getNombre();
        assertEquals(expResult, result);      
    }

//    /**
//     * Test of setNombre method, of class Socio.
//     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Pedro";     
        instance.setNombre(nombre);
        
    }
//
//    /**
//     * Test of getApellido method, of class Socio.
//     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");    
        String expResult = "Perez";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of setApellido method, of class Socio.
//     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "Sanchez";       
        instance.setApellido(apellido);        
    }
//
//    /**
//     * Test of getDni method, of class Socio.
//     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");     
        int expResult = 789456;
        int result = instance.getDni();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of setDni method, of class Socio.
//     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 37130154;       
        instance.setDni(dni);       
    }
//
//    /**
//     * Test of getTelefono method, of class Socio.
//     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");      
        int expResult = 35156;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        
       
    }
//
//    /**
//     * Test of setTelefono method, of class Socio.
//     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 421937;
        Socio instance = new Socio();
        instance.setTelefono(telefono);
        
        
    }
//
//    /**
//     * Test of getDomicilio method, of class Socio.
//     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");       
        String expResult = "Catamarca";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
       
      
    }
//
//    /**
//     * Test of setDomicilio method, of class Socio.
//     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "Tomas Edison";    
        instance.setDomicilio(domicilio);
       
      
    }
//
//    /**
//     * Test of getEstado_pago method, of class Socio.
//     */
    @Test
    public void testGetEstado_pago() {
        System.out.println("getEstado_pago");       
        String expResult = "Pagado";
        String result = instance.getEstado_pago();
        assertEquals(expResult, result);
       
    }

//    /**
//     * Test of setEstado_pago method, of class Socio.
//     */
    @Test
    public void testSetEstado_pago() {
        System.out.println("setEstado_pago");
        String estado_pago = "Debe";       
        instance.setEstado_pago(estado_pago);
       
    }
//
//    /**
//     * Test of getCategoria method, of class Socio.
//     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");       
        String expResult = "Profesional";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
       
    }
//
//    /**
//     * Test of setCategoria method, of class Socio.
//     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String categoria = "Idoneo";        
        instance.setCategoria(categoria);
       
    }
//
//    /**
//     * Test of getEstado method, of class Socio.
//     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");      
        String expResult = "Activo";
        String result = instance.getEstado();
        assertEquals(expResult, result);
       
    }
//
//    /**
//     * Test of setEstado method, of class Socio.
//     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "Suspendido";     
        instance.setEstado(estado);
       
    }
//
//    /**
//     * Test of getCuilcuit method, of class Socio.
//     */
    @Test
    public void testGetCuilcuit() {
        System.out.println("getCuilcuit");       
        String expResult = "20-789456-1";
        String result = instance.getCuilcuit();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of setCuilcuit method, of class Socio.
//     */
    @Test
    public void testSetCuilcuit() {
        System.out.println("setCuilcuit");
        String cuilcuit = "20-37130154-2";
        Socio instance = new Socio();
        instance.setCuilcuit(cuilcuit);
       
    }
//
//    /**
//     * Test of getEmail method, of class Socio.
//     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");     
        String expResult = "carlos@hotmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
       
    }
//
//    /**
//     * Test of setEmail method, of class Socio.
//     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "carlos@gmail.com";       
        instance.setEmail(email);
       
    }
   
}
