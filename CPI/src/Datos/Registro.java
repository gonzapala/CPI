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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anahi
 */
public class Registro {

    private int id_reg;
    private int id_usuario;
    private String fecha;
    private String descripcion;

    private Statement sentencia;
    private ResultSet rsDatos;

    public Registro() {
    }

    /**
     * @return the id_reg
     */
    public int getId_reg() {
        return id_reg;
    }

    /**
     * @param id_reg the id_reg to set
     */
    public void setId_reg(int id_reg) {
        this.id_reg = id_reg;
    }


    //no debe ser  'void'
    public void buscarRegistro() {
        
        //return Registro;
    }
    public void gaurdarReg(int id_user, int id_desc) {                                                   
        
        try {
            
            Connection connection = Conexion.Cadena();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO registro (id_usuario,fecha,descripcion) VALUES (?,?,?)");
            
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechap = formatoFecha.format(fechaActual);
            String desc="";
            switch(id_desc){
                        case 1:
                            desc="Realizo un Nuevo Pago";
                        break;
                        case 2:
                            desc="Agrego un Nuevo Socio";
                        break;
                        case 3:
                            desc="Realizo un Nuevo Usuario";
                        break;      
                }
            preparedStatement.setInt(1, id_user);
            preparedStatement.setString(2, fechap);
            preparedStatement.setString(3, desc);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                System.out.println("Se Guardo correctamente el registro.");

            } else {
                JOptionPane.showMessageDialog(null, "Error de Operación");

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public ArrayList<Registro> listar(){
        ArrayList lista = new ArrayList();
        Registro reg;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM registro";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            
            while (rsDatos.next()) {          
                reg = new Registro();
                reg.setId_usuario(rsDatos.getInt(2));
                reg.setFecha(rsDatos.getString(3));
                reg.setDescripcion(rsDatos.getString(4));
                lista.add(reg);
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
}
