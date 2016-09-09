/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo
 */
public class Socio {
    private int id_socio;
    private String legajo_socio;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String domicilio;
    private String estado_pago;
    private String categoria;
    private String estado;
    private String cuilcuit;
    private String email;
    
    private Statement sentencia;
    private ResultSet rsDatos;

    /**
     * @return the id_socio
     */
    public int getId_socio() {
        return id_socio;
    }

    /**
     * @return the legajo_socio
     */
    public String getLegajo_socio() {
        return legajo_socio;
    }

    /**
     * @param legajo_socio the legajo_socio to set
     */
    public void setLegajo_socio(String legajo_socio) {
        this.legajo_socio = legajo_socio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the estado_pago
     */
    public String getEstado_pago() {
        return estado_pago;
    }

    /**
     * @param estado_pago the estado_pago to set
     */
    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
     * @return the cuilcuit
     */
    public String getCuilcuit() {
        return cuilcuit;
    }

    /**
     * @param cuilcuit the cuilcuit to set
     */
    public void setCuilcuit(String cuilcuit) {
        this.cuilcuit = cuilcuit;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
//comentario nuevo
    public Socio BuscarX(String Legajo) throws ClassNotFoundException
    {   
        Socio nuevoSocio=new Socio();
        try {
            
            Connection cn = Conexion.Cadena();
        
            String SQL = "SELECT * FROM socio"+ " WHERE legajo_socio ='"+Legajo+"' ";
            System.out.println(SQL);
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            rsDatos = sentencia.executeQuery(SQL);
            System.out.println("Correcto");
            //cn.commit();
            
            String nom,ape,dom,estado_pago,categ,estado,cuilcuit,email, leg;
            int dni_socio,tel;
            if(rsDatos.first()){    
                nom=rsDatos.getString("nombre");
                ape=rsDatos.getString("apellido");
                estado_pago=rsDatos.getString("estado_pago");
                categ=rsDatos.getString("categoria");
                estado=rsDatos.getString("estado");
                cuilcuit=rsDatos.getString("cuilcuit");
                email=rsDatos.getString("email");
                dni_socio=rsDatos.getInt("dni");
                leg=rsDatos.getString("legajo_socio");
                tel=rsDatos.getInt("telefono");
                
//                System.out.println(nom);
//                System.out.println(ape);
//                System.out.println(categ);
//                System.out.println(leg);
//                System.out.println(tel);
                
                nuevoSocio.nombre=nom;
                nuevoSocio.apellido=ape;
                nuevoSocio.dni=dni_socio;
                nuevoSocio.estado_pago=estado_pago;
                nuevoSocio.categoria=categ;
                nuevoSocio.estado=estado;
                nuevoSocio.cuilcuit=cuilcuit;
                nuevoSocio.setLegajo_socio(leg);
                nuevoSocio.telefono=tel;
                
                
                       
            }else{
                System.out.println("es nulo");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("No Correcto");
            Logger.getLogger(Socio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nuevoSocio;
    }



}
