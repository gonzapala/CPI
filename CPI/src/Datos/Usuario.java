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
import vistas.login;

/**
 *
 * @author Gonzalo
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private int id_rol;
    public static String nombreLogueado;
    public static String ContraseñaLogueada;
    
    public Usuario() {
    }
    /**
     * @return the nombreLogueado
     */
    public String getNombreLogueado() {
        return nombreLogueado;
    }

    /**
     * @param nombreLogueado the nombreLogueado to set
     */
    public void setNombreLogueado(String nombreLogueado) {
        this.nombreLogueado = nombreLogueado;
    }

    /**
     * @return the ContraseñaLogueada
     */
    public String getContraseñaLogueada() {
        return ContraseñaLogueada;
    }

    /**
     * @param ContraseñaLogueada the ContraseñaLogueada to set
     */
    public void setContraseñaLogueada(String ContraseñaLogueada) {
        this.ContraseñaLogueada = ContraseñaLogueada;
    }
    
    

//    public login getLoginActual() {
//        return loginActual;
//    }
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

      
    public int verificarUsuario(String nom,String pass) throws ClassNotFoundException{
        //devuelve
        //0 Incorrecto
        //1 Correcto - usuario Administrador
        //2 Correcto - usuario Comun
        //
        Usuario user = new Usuario();
        Rol nuevoRol = new Rol();
        user=user.buscarUsuario(nom, pass);
        
        int verificado;
        int usuarioV=user.getNombre().compareTo(nom);
        int passV=user.getContraseña().compareTo(pass);
        if (usuarioV==0) {
            if (passV==0) {
                //aqui esta verificado el usuario                
                user.setNombreLogueado(user.getNombre());
                user.setContraseñaLogueada(user.getContraseña());
                System.out.println("----------------------------------------------------");
                System.out.println("Usuario Logueado: "+user.getNombreLogueado());
                System.out.println("Contraseña Logueada: "+user.getContraseñaLogueada());
                System.out.println("----------------------------------------------------");
                int id_rol = user.getId_rol();
                nuevoRol=nuevoRol.buscarRol(id_rol);
                int tipoV=nuevoRol.getNombre().compareTo("administrador");
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
    
    public String devolverLogin(){
        
        return nombreLogueado;
    }
    
    public Usuario buscarUsuario(String nom,String pass) throws ClassNotFoundException{
        Usuario user = new Usuario();
        String nombre,contraseña;
        int id,id_rol;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM usuario "+" WHERE nombre ='"+nom+"' ";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            if(rsDatos.first()){
                nombre = rsDatos.getString("nombre");
                contraseña=rsDatos.getString("contraseña");
                id=rsDatos.getInt("id_usuario");
                id_rol = rsDatos.getInt("id_rol");
                
                user.setId(id);
                user.setNombre(nombre);
                user.setContraseña(contraseña);
                user.setId_rol(id_rol);
                
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
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO usuario (nombre, contraseña,id_rol) VALUES (?,?,?)");
        preparedStatement.setString(1, nuevoU.getNombre());
        preparedStatement.setString(2, nuevoU.getContraseña());
        preparedStatement.setInt(3, nuevoU.getId_rol());
        
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
                usuario.setId_rol(rsDatos.getInt(4));
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
}
