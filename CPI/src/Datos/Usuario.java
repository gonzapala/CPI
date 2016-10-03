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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private String tipo;

    /**
     * @return the id
     */
    public int getId() {
        return id;
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
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
    
    public int verificarUsuario(String nom,String pass) throws ClassNotFoundException{
        //devuelve
        //0 Incorrecto
        //1 Correcto - usuario Administrador
        //2 Correcto - usuario Comun
        //
        Usuario user = new Usuario();
        user=user.buscarUsuario(nom, pass);
        System.out.println(user.getNombre()+user.getContraseña()+user.getTipo());
        int verificado;
        int usuarioV=user.getNombre().compareTo(nom);
        int passV=user.getContraseña().compareTo(pass);
        if (usuarioV==0) {
            if (passV==0) {
                int tipoV = user.getTipo().compareTo("administrador");
                if (tipoV==0) {
                    return verificado=1;
                }else{
                    return verificado=2;
                }
                
            }else{
                System.out.println("Contraseña Incorrecta.");
                JOptionPane.showMessageDialog(null, "Nombre de Usuario Incorrecto.");
                return verificado=0;
            }
            
        }else{
            System.out.println("Nombre de Usuario Incorrecto.");
            JOptionPane.showMessageDialog(null, "Nombre de Usuario Incorrecto.");
            return verificado=0;
        } 
        
    }
    
    public Usuario buscarUsuario(String nom,String pass) throws ClassNotFoundException{
        Usuario user = new Usuario();
        String nombre,contraseña,tipo;
            int id;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM usuario "+" WHERE nombre ='"+nom+"' ";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            if(rsDatos.first()){
                nombre = rsDatos.getString("nombre");
                contraseña=rsDatos.getString("contraseña");
                id=rsDatos.getInt("id_usuario");
                tipo = rsDatos.getString("tipo");

                user.setId(id);user.setNombre(nombre);user.setContraseña(contraseña);user.setTipo(tipo);
            }
            else{
                System.out.println("es nulo");
            }
            
        } catch (SQLException ex) {
            
        }
    return user;
    }//BuscarSocio
    public void guardarnuevoU(Usuario nuevoU) throws ClassNotFoundException, SQLException{
        Connection connection = Conexion.Cadena();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO usuario (nombre, contraseña,tipo) VALUES (?,?,?)");
        preparedStatement.setString(1, nuevoU.getNombre());
        preparedStatement.setString(2, nuevoU.getContraseña());
        preparedStatement.setString(3, nuevoU.getTipo());
        
         int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuario Guardado");
                //LimpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Usuario");
                //LimpiarCajas();
            }

            connection.close();

    }
     public ArrayList<Usuario> listar(){
        ArrayList lista = new ArrayList();
        Usuario usuario;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM usuario";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            
            while (rsDatos.next()) {                
                usuario = new Usuario();
                usuario.setNombre(rsDatos.getString(2));
                usuario.setContraseña(rsDatos.getString(3));
                usuario.setTipo(rsDatos.getString(4));
                lista.add(usuario);
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
