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
import Datos.Socio;


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
    private int id_socio;
    private String legajo_socio;
    

    
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
     * @param tipoEstado
     *
     * @param socioX
     */
    public void GenerarResolucionMatricula(Socio socioX, int tipoEstado){
   //Tipo de Resolucion que puede tener el socio
        //        Matriculacion    
        //        suspendido
             
        //        1 = activo
        //        2 = suspendido
      
    try {         
      
        setConnection(Conexion.Cadena());

        int id_Socio = socioX.getId_socio();

        String leg = socioX.getLegajo_socio();

                String Estado = "Aceptada";
                String descripcionR = "Fue Aceptada";
               
                String descripcionS = "";

                Date fechaActual = new Date();

                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fechaResolucion = formatoFecha.format(fechaActual);

                Calendar fecha = Calendar.getInstance();
                int año = fecha.get(Calendar.YEAR);
                System.out.println(año);

                String nResolucion = id_Socio + "/" + año;

                preparedStatement = connection.prepareStatement("INSERT INTO resoluciones (numero_resolucion,tipo,estado,descripcion_Solicitud ,descripcion_resolucion,fecha_resolucion,legajo_socio,id_socio) VALUES (?, ? , ? , ?, ?,?,?,?)");
              
                preparedStatement.setString(1, nResolucion); 
               // preparedStatement.setString(2, "Matriculacion");
                
                switch (tipoEstado) {
                    case 1:
                         descripcionS="La solicitud es de Matriculacion0";
                         preparedStatement.setString(2,  "Matriculacion");
                         preparedStatement.setString(4, descripcionS);
                        break;

                    case 2:
                         descripcionS="La solicitud es de Suspension";
                         preparedStatement.setString(2, "Suspension");
                         preparedStatement.setString(4, descripcionS);
                          preparedStatement.setString(4, descripcionS);

                        break;

                } // Fin Switch   
                
                preparedStatement.setString(3, Estado);
              
                preparedStatement.setString(5, descripcionR);
                preparedStatement.setString(6, fechaResolucion);
                preparedStatement.setString(7, leg);
                preparedStatement.setInt(8, id_Socio);

                int res = getPreparedStatement().executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Resolucion Guardada");
                    System.out.println("Hola entre Si");

                    Socio cambioE = new Socio();

                    cambioE.cambiarEstado(socioX, 2);

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

    /**
     * @return the legajo_socio
     */
    public String getLegajo_socio() {
        return legajo_socio;
    }
    
    
} // Fin de CLASS RESOLCUION



