/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Gonzalo
 */
public class Conexion {
//
//    public static final String URL = "jdbc:mysql://localhost:3306/sgcpi";
//    public static final String USERNAME = "root";
//    public static final String PASSWORD = "";
//
//    public static Connection getConnection() {
//        Connection connection = null;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return connection;
//    }
     public static Connection Cadena() throws ClassNotFoundException, SQLException
    {
         // Esta Función Establece la Conexion

        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost/sgcpi";

        Connection cn=DriverManager.getConnection(conStr, "root", "");
        //cn.setAutoCommit(false);       //  si no especifican esto el autocommit
                                         //  es por defecto true entonces no es necesario
                                         //  hacer los commit despues de las insersiones,
                                         //  eliminaciones o modificaciones
        //sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        return cn;
    }


}
