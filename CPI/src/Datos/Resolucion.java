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
    private int id_socio;
    
    private Statement sentencia;
    private ResultSet rsDatos;
    
    private Connection connection;//para la Conexion
    private PreparedStatement preparedStatement;//para preparar las querys
    private ResultSet resultSet;

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
   

    /**
     * @param legajo_socio the legajo_socio to set
   
  
    /**
     *
     * @param socioX
     */
    public void GenerarResolucionMatricula(Socio socioX){
  
    try {
        
        System.out.println("Hola entre");
        
        int Legajo = 1234;
        
        //Legajo = socioX.getlegajo_socio();
            setConnection(Conexion.Cadena());    
        
        int leg= socioX.getId_socio();
        System.out.println(leg);
        
        String nResolucion = "123";
        String Estado = "Socio";
        String descripcionS = "Matriculacion";
        String descripcionR = "Aceptada";
        String Tipo = "Matriculacion";        

            setPreparedStatement(getConnection().prepareStatement("INSERT INTO resoluciones (numero_resolucion,tipo,estado ,descripcion_solicitud,descripcion_resolucion ) VALUES (?, ? , ? , ?, ?)"));
                getPreparedStatement().setString(1, nResolucion);
                getPreparedStatement().setString(2, Tipo);
                getPreparedStatement().setString(3, Estado);
                getPreparedStatement().setString(4, descripcionS);
                getPreparedStatement().setString(5, descripcionR);  
                //getPreparedStatement().setString(6, null);        
               // preparedStatement.setString(7, null);  
             //    , ?    ,fecha_resolucion    ,legajo_socio   , ?
             
            
                     
        int res = getPreparedStatement().executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Resolucion Guardada");
         System.out.println("Hola entre Si");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Guardar Resolucion");
            System.out.println("Hola entre NO");
        }

            getConnection().close();
    } catch (Exception e) {
        boolean ex;
      
    }



    

} // fin de generar Resolcuion

    /**
     * @return the id_socio
     */
    public int getId_socio() {
        return id_socio;
    }

    /**
     * @return the sentencia
     */
    public Statement getSentencia() {
        return sentencia;
    }

    /**
     * @param sentencia the sentencia to set
     */
    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    /**
     * @return the rsDatos
     */
    public ResultSet getRsDatos() {
        return rsDatos;
    }

    /**
     * @param rsDatos the rsDatos to set
     */
    public void setRsDatos(ResultSet rsDatos) {
        this.rsDatos = rsDatos;
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return the preparedStatement
     */
    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    /**
     * @param preparedStatement the preparedStatement to set
     */
    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    
} // Fin de CLASS RESOLCUION



