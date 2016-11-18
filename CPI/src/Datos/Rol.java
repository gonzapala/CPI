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
    public ArrayList<Rol> listar(){
        ArrayList lista = new ArrayList();
        Rol rol;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM rol";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            
            while (rsDatos.next()) {                
                rol = new Rol();
                rol.setNombre(rsDatos.getString(2));
                rol.setDescripcion(rsDatos.getString(3));
                lista.add(rol);
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }
     public void guardarnuevoR(Rol nuevoR) throws ClassNotFoundException, SQLException{
        Connection connection = Conexion.Cadena();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO rol (nombre, descripcion) VALUES (?,?)");
        preparedStatement.setString(1, nuevoR.getNombre());
        preparedStatement.setString(2, nuevoR.getDescripcion());
        
        
         int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Rol Guardado");
                //LimpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Usuario");
                //LimpiarCajas();
            }

            connection.close();

    }
}
