/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;

/**
 *
 * @author Bruno Matias
 */
public class ConexionResolucion {
    
    Connection conectar =null;
    
     public Connection conectar(){
     
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgcpi","root","");
             
         } catch (ClassNotFoundException | SQLException e) {
             System.out.println("Error al conectar :"+ e.getMessage());
         }
         return conectar;
     }
    
}
