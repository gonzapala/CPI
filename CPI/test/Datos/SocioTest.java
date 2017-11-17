/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
    
     instance = new Socio(2,"123/1/2016","Carlos","Perez",789456,35156,"Catamarca",
             "Pagado","Profesional","Activo","20-789456-1","carlos@hotmail.com","1992-01-01");
    
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


    /**
     * Test of getId_socio method, of class Socio.
     */
    @Test
    public void testGetId_socio() {
        System.out.println("getId_socio");
        int expResult = 2;
        int result = instance.getId_socio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == expResult){
            System.out.println(" -Es Correcto");
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setID method, of class Socio.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id = 0;
        Socio instance = new Socio();
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarX method, of class Socio.
     */
    @Test
    public void testBuscarX() throws Exception {
        System.out.println("BuscarX");
        String Legajo = "123/1/2016";// 123/1/2016
        Socio instancia = new Socio();
        Socio expResult = instance;
        String expLegajo = expResult.getLegajo_socio();
        Socio result = instancia.BuscarX(Legajo);
        String legajo = result.getLegajo_socio();
        assertEquals(expLegajo, legajo);
        // TODO review the generated test code and remove the default call to fail.
        if(legajo.equals(expLegajo)){
            System.out.println(" -Es Correcto");
        }else{
            fail("The test case is a prototype.");
        }
    }


   

    /**
     * Test of cambiarEstado method, of class Socio.
     */
//    @Test
//    public void testCambiarEstado() {
//        System.out.println("cambiarEstado");
//        Socio socioX = null;
//        int tipo_estado = 0;
//        Socio instance = new Socio();
//        instance.cambiarEstado(socioX, tipo_estado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   
}
