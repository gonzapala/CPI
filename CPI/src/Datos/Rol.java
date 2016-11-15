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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo
 */
public class Rol {
    private int id_rol;
    private String nombre;
    private String descripcion;

    /**
     * @return the id_rol
     */
    public int getId_rol() {
        return id_rol;
    }

    /**
     * @param id_rol the id_rol to set
     */
    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Rol buscarRol(int id_rol){
    
        Rol nuevoRol=new Rol();
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM rol"+ " WHERE id_rol='"+id_rol+"' ";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            String nom, desc;
            int idR;
            if (rsDatos.first()) {
                idR=rsDatos.getInt("id_rol");
                nom=rsDatos.getString("nombre");
                desc = rsDatos.getString("descripcion");
                nuevoRol.setId_rol(idR);
                nuevoRol.setDescripcion(desc);
                nuevoRol.setNombre(nom);
            }else{
                System.out.println("es nulo");
            }
            
            
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        return nuevoRol;
    }
//     public Socio BuscarX(String Legajo) throws ClassNotFoundException
//    {   
//        Socio nuevoSocio=new Socio();
//        try {
//            
//            Connection cn = Conexion.Cadena();
//            String SQL = "SELECT * FROM socio"+ " WHERE legajo_socio ='"+Legajo+"' ";
//            //System.out.println(SQL);
//            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            rsDatos = sentencia.executeQuery(SQL);
//            //System.out.println("Correcto");
//            //cn.commit();
//            
//            String nom,ape,dom,estado_pago,categ,estado,cuilcuit,email, leg,fNac;
//            int dni_socio,tel,idS;
//            if(rsDatos.first()){
//                idS=rsDatos.getInt("id_socio");
//                nom=rsDatos.getString("nombre");
//                ape=rsDatos.getString("apellido");
//                estado_pago=rsDatos.getString("estado_pago");
//                categ=rsDatos.getString("categoria");
//                estado=rsDatos.getString("estado");
//                cuilcuit=rsDatos.getString("cuilcuit");
//                email=rsDatos.getString("email");
//                dni_socio=rsDatos.getInt("dni");
//                leg=rsDatos.getString("legajo_socio");
//                tel=rsDatos.getInt("telefono");
//                dom=rsDatos.getString("domicilio");
//                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
//                fNac = formatoFecha.format(rsDatos.getDate("fechaNac"));
////                System.out.println(nom);
////                System.out.println(ape);
////                System.out.println(categ);
////                System.out.println(leg);
////                System.out.println(tel);
//                
//                nuevoSocio.nombre=nom;
//                nuevoSocio.apellido=ape;
//                nuevoSocio.dni=dni_socio;
//                nuevoSocio.estado_pago=estado_pago;
//                nuevoSocio.categoria=categ;
//                nuevoSocio.estado=estado;
//                nuevoSocio.cuilcuit=cuilcuit;
//                nuevoSocio.setLegajo_socio(leg);
//                nuevoSocio.telefono=tel;
//                nuevoSocio.id_socio=idS;                
//                nuevoSocio.setFechaNac(fNac);
//                nuevoSocio.setDomicilio(dom);
//                nuevoSocio.setEmail(email);
//                
//            }else{
//                System.out.println("es nulo");
//            }
//            
//            
//        } catch (SQLException ex) {
//            System.out.println("No Correcto");
//            Logger.getLogger(Socio.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return nuevoSocio;
//    }
    
    
}
