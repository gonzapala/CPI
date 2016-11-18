/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Datos.Conexion;
import Datos.Rol;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class Permiso {
    private int id_permiso;
    private String nombre;

    /**
     * @return the id_permiso
     */
    public int getId_permiso() {
        return id_permiso;
    }

    /**
     * @param id_permiso the id_permiso to set
     */
    public void setId_permiso(int id_permiso) {
        this.id_permiso = id_permiso;
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
    public Rol buscarRolNombre(String nom_rol){
    
        Rol nuevoRol=new Rol();
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM rol"+ " WHERE nombre='"+nom_rol+"' ";
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
    public ArrayList<Permiso> listar(){
        ArrayList lista = new ArrayList();
        Permiso permiso;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM permiso";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            
            while (rsDatos.next()) {                
                permiso = new Permiso();
                permiso.setNombre(rsDatos.getString(2));
                
                lista.add(permiso);
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }
}
