/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anahi
 */
public class Registro {

    private int id_reg;
    private float hora;

    private Statement sentencia;
    private ResultSet rsDatos;

    public Registro() {
    }

    /**
     * @return the id_reg
     */
    public int getId_reg() {
        return id_reg;
    }

    /**
     * @param id_reg the id_reg to set
     */
    public void setId_reg(int id_reg) {
        this.id_reg = id_reg;
    }

    /**
     * @return the hora
     */
    public float getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(float hora) {
        this.hora = hora;
    }

    //no debe ser  'void'
    public void buscarRegistro() {
        
        //return Registro;
    }
    public void gaurdarReg(int id_user, int id_desc) {                                                   

        try {
            
            Connection connection = Conexion.Cadena();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO registro (id_usuario) VALUES (?)");
            
            preparedStatement.setInt(1, id_user);
            
            //falta hora

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                System.out.println("Se Guardo correctamente el registro.");

            } else {
                JOptionPane.showMessageDialog(null, "Error de Operación");

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
