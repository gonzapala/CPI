/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Gonzalo
 */
public class conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/sgcpi";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }
    
}
