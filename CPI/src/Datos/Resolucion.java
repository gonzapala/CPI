/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Bruno Matias
 */
public class Resolucion {
    
    private int id_resolucion;
    private String numero_resolucion;
    private String tipo;
    private String estado;
    private String descripcion_solicitud;
    //private fecha_resolucion
    private int legajo_socio;
    
    private Statement sentencia;
    private ResultSet rsDatos;
    
    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;

    /**
     * @return the id_resolucion
     */
    public int getId_resolucion() {
        return id_resolucion;
    }

    /**
     * @return the numero_resolucion
     */
    public String getNumero_resolucion() {
        return numero_resolucion;
    }

    /**
     * @param numero_resolucion the numero_resolucion to set
     */
    public void setNumero_resolucion(String numero_resolucion) {
        this.numero_resolucion = numero_resolucion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the descripcion_solicitud
     */
    public String getDescripcion_solicitud() {
        return descripcion_solicitud;
    }

    /**
     * @param descripcion_solicitud the descripcion_solicitud to set
     */
    public void setDescripcion_solicitud(String descripcion_solicitud) {
        this.descripcion_solicitud = descripcion_solicitud;
    }

    /**
     * @return the legajo_socio
     */
    public int getLegajo_socio() {
        return legajo_socio;
    }

    /**
     * @param legajo_socio the legajo_socio to set
     */
    public void setLegajo_socio(int legajo_socio) {
        this.legajo_socio = legajo_socio;
    }
  
    /**
     *
     * @param socioX
     */
    public void GenerarResolucionMatricula(Socio socioX){
  
    try {
        
        System.out.println("Hola entre");
        String Legajo = socioX.getLegajo_socio();
        connection = Conexion.Cadena();    
        String nResolucion = "123";
        String Estado = "Socio";
        String descripcionS = "Solicitud de Matriculacion";
        String descripcionR = "Matriculacion Aceptada";
        String Tipo = "Matriculacion";        

        preparedStatement = connection.prepareStatement("INSERT INTO resolucion (numero_resolucion,tipo,estado,descripcion_solicitud,descripcion_resolucion) VALUES (?, ?, ?, ?, ?)");
                preparedStatement.setString(1, nResolucion);
                preparedStatement.setString(2, Tipo);
                preparedStatement.setString(3, Estado);
                preparedStatement.setString(4, descripcionS);
                preparedStatement.setString(5, descripcionR);
                //preparedStatement.setString(6, null);       ,fecha_resolucion,legajo_socio       
                //preparedStatement.setString(7, Legajo); , ?, ?
             
              
        
        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Resolucion Guardada");
            //LimpiarCajas();
        } else {
            JOptionPane.showMessageDialog(null, "Error al Guardar Resolucion");
            //LimpiarCajas();
        }

        connection.close();
    } catch (Exception e) {
        boolean ex;
      
    }



    

} // fin de generar Resolcuion
    
    
} // Fin de CLASS RESOLCUION



