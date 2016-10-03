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
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private String descripcion_resolucion;
    private String fecha;
    private int id_socio;
    private String legajo_socio;
    private String ruta;

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
     *
     *
     * /
     **
     * @param tipoEstado
     *
     * @param socioX
     */
    public Resolucion GenerarResolucion(Socio socioX, int tipoEstado) {
        //Tipo de Resolucion que puede tener el socio
        //        Matriculacion    
        //        suspendido

        //        1 = activo
        //        2 = suspendido
        Resolucion re = new Resolucion();
        try {

            setConnection(Conexion.Cadena());

            int id_Socio = socioX.getId_socio();

            String leg = socioX.getLegajo_socio();

            String Estado = "Aceptada";
            String descripcionR = "Fue Aceptada";

            String descripcionS = "";
            String tipoRes = "";

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
                    tipoRes = "matriculacion";
                    descripcionS = "La solicitud es de Matriculacion0";
                    preparedStatement.setString(2, tipoRes);
                    preparedStatement.setString(4, descripcionS);
                    break;

                case 2:
                    tipoRes = "suspension";
                    descripcionS = "La solicitud es de Suspension";
                    preparedStatement.setString(2, tipoRes);
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
                //System.out.println("Hola entre Si");

                //CAMBIAR ESTADO DEL SOCIO AFUERA DE ESTE METODO, PUEDE SER ANTES
                //Socio cambioE = new Socio();
                //cambioE.cambiarEstado(socioX, 2);
                
                re.setNumero_resolucion(nResolucion);
                re.setTipo(tipoRes);
                re.setEstado(Estado);
                re.setDescripcion_solicitud(descripcionS);
                re.setDescripcion_resolucion(descripcionR);
                re.setFecha(fechaResolucion);
                re.setLegajo_socio(leg);
                re.setId_socio(id_Socio);
                        
            
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Resolucion");
                System.out.println("Hola entre NO");
            }

            getConnection().close();

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            boolean ex;

        }
        return re;//devuelve resolucio sin ID
    } // fin de generar Resolcuion
    
    public void guardarRutaArchivo(int id_res, String ruta) throws ClassNotFoundException, SQLException{
        try {
                connection = Conexion.Cadena();
                System.out.println("ID RES: "+id_res);
                System.out.println("Ruta: "+ruta);
                preparedStatement = connection.prepareStatement("UPDATE resoluciones SET ruta = ? WHERE id_resolucion=?");
                preparedStatement.setString(1, ruta);
                preparedStatement.setInt(2, id_res);

                int resp = preparedStatement.executeUpdate();
                if (resp > 0) {
                    //System.out.println("Nuevo Estado: "+socioX.getEstado()+"\n");
                    System.out.println("Resolucion Actualizado");
                    //JOptionPane.showMessageDialog(null, "Socio Actualizado: "+socioX.getId_socio());
                    //LimpiarCajas();
                } else {
                    System.out.println("Error\n");
                    //JOptionPane.showMessageDialog(null, "Error al Actualizar Socio");
                    //LimpiarCajas();
                }

                connection.close();
            
        } catch (Exception e) {
        }
            
    }
    
    public Resolucion BuscarX(String num_res) throws ClassNotFoundException
    {   
        Resolucion nuevaRes=new Resolucion();
        try {
            
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM resoluciones"+ " WHERE numero_resolucion ='"+num_res+"' ";
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            
            String num,tipo,estado,descrip_solic,descrip_res,fecha,leg_socio, ruta;
            int id_res,id_socio;
            if(rsDatos.first()){
                id_res=rsDatos.getInt("id_resolucion");
                id_socio=rsDatos.getInt("id_socio");
                num=rsDatos.getString("numero_resolucion");
                tipo=rsDatos.getString("tipo");
                estado=rsDatos.getString("estado");
                descrip_solic=rsDatos.getString("descripcion_solicitud");
                descrip_res=rsDatos.getString("descripcion_resolucion");
                leg_socio=rsDatos.getString("legajo_socio");
                ruta=rsDatos.getString("ruta");
                
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                fecha = formatoFecha.format(rsDatos.getDate("fecha_resolucion"));
//                System.out.println(nom);
//                System.out.println(ape);
//                System.out.println(categ);
//                System.out.println(leg);
//                System.out.println(tel);
               nuevaRes.setId_resolucion(id_res);
               nuevaRes.setId_socio(id_socio);
               nuevaRes.setNumero_resolucion(num);
               nuevaRes.setTipo(tipo);
               nuevaRes.setEstado(estado);
               nuevaRes.setDescripcion_solicitud(descrip_solic);
               nuevaRes.setDescripcion_resolucion(descrip_res);
               nuevaRes.setFecha(fecha);
               nuevaRes.setLegajo_socio(leg_socio);
               nuevaRes.setRuta(ruta);
                       
                
            }else{
                System.out.println("es nulo");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("No Correcto");
            Logger.getLogger(Socio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nuevaRes;
    }
    
    public ArrayList<Resolucion> listar(){
        ArrayList listaResoluciones = new ArrayList();
        Resolucion res;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM resoluciones";
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            
            while (rsDatos.next()) {                
                res = new Resolucion();
                res.setNumero_resolucion(rsDatos.getString(2));
                res.setTipo(rsDatos.getString(3));
                res.setEstado(rsDatos.getString(4));
                res.setFecha(rsDatos.getString(7));
                res.setLegajo_socio(rsDatos.getString(8));
                res.setRuta(rsDatos.getString(9));
                listaResoluciones.add(res);
            }
            
        } catch (Exception e) {
        }
        
        return listaResoluciones;
    }
    

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

    /**
     * @return the descripcion_resolucion
     */
    public String getDescripcion_resolucion() {
        return descripcion_resolucion;
    }

    /**
     * @param descripcion_resolucion the descripcion_resolucion to set
     */
    public void setDescripcion_resolucion(String descripcion_resolucion) {
        this.descripcion_resolucion = descripcion_resolucion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @param id_socio the id_socio to set
     */
    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    /**
     * @param legajo_socio the legajo_socio to set
     */
    public void setLegajo_socio(String legajo_socio) {
        this.legajo_socio = legajo_socio;
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @param id_resolucion the id_resolucion to set
     */
    public void setId_resolucion(int id_resolucion) {
        this.id_resolucion = id_resolucion;
    }

} // Fin de CLASS RESOLCUION

