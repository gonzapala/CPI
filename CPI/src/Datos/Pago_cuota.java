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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonza
 */
public class Pago_cuota {
    private int id;
    private String fecha;
    private int numero_cuota;
    private int monto;
    private int estado;
    private String fecha_limite;
    private int id_pago;

    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;//para recibir resultados de una cosulta
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the numero_cuota
     */
    public int getNumero_cuota() {
        return numero_cuota;
    }

    /**
     * @param numero_cuota the numero_cuota to set
     */
    public void setNumero_cuota(int numero_cuota) {
        this.numero_cuota = numero_cuota;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the fecha_limite
     */
    public String getFecha_limite() {
        return fecha_limite;
    }

    /**
     * @param fecha_limite the fecha_limite to set
     */
    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    /**
     * @return the id_pago
     */
    public int getId_pago() {
        return id_pago;
    }

    /**
     * @param id_pago the id_pago to set
     */
    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }
    
    public void generarCuotas(int id_pago, int cant_cuotas, int montoPorCuota){
        Pago_cuota cuota = new Pago_cuota();
        cuota.setId_pago(id_pago);
        cuota.setEstado(0);
        cuota.setMonto(montoPorCuota);
        
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_actual = formatoFecha.format(fechaActual);
        cuota.setFecha(fecha_actual);
        
        String fechaVencimiento = fecha_actual;
        cuota.setFecha_limite(fechaVencimiento);
        cuota.setNumero_cuota(1);
        int res = cuota.guardarCuota(cuota);//Guardo la primera cuota que tendrá como fecha de vencimiento la fecha actual.
        for(int i=1; i<cant_cuotas; i++){
            cuota.setNumero_cuota(i+1);
            fechaVencimiento = calcularFechaVencimiento(fechaVencimiento);
            cuota.setFecha_limite(fechaVencimiento);
            res = cuota.guardarCuota(cuota);
            if(res==1){
                System.out.println("Nuevo Cuota");
            }else{
                JOptionPane.showMessageDialog(null, "Error de Operación");
            }
        }//for
    }
    
    public String calcularFechaVencimiento(String fecha){
        
        String[] parts = fecha.split("-");
        String parts1_Año = parts[0];
        String parts2_mes = parts[1];
        String parts3_dia = parts[2];

        int Fecha_año = Integer.parseInt(parts1_Año);
        int Fecha_mes = Integer.parseInt(parts2_mes);
        int Fecha_dia = Integer.parseInt(parts3_dia);
        //System.out.println("Fecha_mes: "+ Fecha_mes);
        //System.out.println("num_cuota: "+ num_cuota);
        int mes = Fecha_mes+1;
        if(mes<=12){
            //System.out.println("mes: "+ mes);
            String fecha_dev = Integer.toString(Fecha_año)+"-"+Integer.toString(mes)+"-"+Integer.toString(Fecha_dia);
            System.out.println(fecha_dev);
            return fecha_dev;
        }else{
            mes = 1;
            int año = Fecha_año+1;
            String fecha_dev = Integer.toString(año)+"-"+Integer.toString(mes)+"-"+Integer.toString(Fecha_dia);
            System.out.println(fecha_dev);
            return fecha_dev;
        }
        
    }
    
     public int guardarCuota(Pago_cuota cuota){
            int res = 0;
            try {
                    String query = "INSERT INTO pago_cuota (fecha, fecha_limite, numero_cuota, monto, estado, id_pago) VALUES (?,?,?,?,?,?)";
                    connection = Conexion.Cadena();
                    preparedStatement = connection.prepareStatement(query);

                    preparedStatement.setString(1, cuota.getFecha());  
                    preparedStatement.setString(2, cuota.getFecha_limite());
                    preparedStatement.setInt(3, cuota.getNumero_cuota());
                    preparedStatement.setInt(4, cuota.getMonto());
                    preparedStatement.setInt(5, cuota.getEstado());
                    preparedStatement.setInt(6, cuota.getId_pago());

                    res = preparedStatement.executeUpdate();

            } catch (Exception ex) {
                    System.out.println(ex);
            }
             if (res > 0) {
                    return 1;
                }else {
                    return 0;
                }
    }
     
      public ArrayList<Pago_cuota> buscarCuotas(int id_pago){
        ArrayList<Pago_cuota> cuotas = new ArrayList<Pago_cuota>();
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM pago_cuota"+ " WHERE id_pago ='"+id_pago+"' ";
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            while (rsDatos.next()) {
                    Pago_cuota cuota = new Pago_cuota();
                    cuota.setId(rsDatos.getInt("id"));
                    cuota.setFecha(rsDatos.getString("fecha"));
                    cuota.setFecha_limite(rsDatos.getString("fecha_limite"));
                    cuota.setNumero_cuota(rsDatos.getInt("numero_cuota"));
                    cuota.setMonto(rsDatos.getInt("monto"));
                    cuota.setEstado(rsDatos.getInt("estado"));
                    cuota.setId_pago(rsDatos.getInt("id_pago"));
                    //System.out.println( "monto: "+Pago.getMonto());
                    cuotas.add(cuota);
                }
        } catch (Exception e) {
        }
        
        return cuotas;
    }
      
        public void pagarCuota(int id) throws SQLException {
            String query = "UPDATE pago_cuota SET estado = ? WHERE id ="+id+" ";
        try {
            connection = Conexion.Cadena();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pago_cuota.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pago_cuota.class.getName()).log(Level.SEVERE, null, ex);
        }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            
            int res = preparedStatement.executeUpdate();
                if (res > 0) {
                    System.out.println("Estado cabiado a 1: \n");
                    JOptionPane.showMessageDialog(null, "Cuota Pagada:");
                } else {
                    System.out.println("Error al Actualizar Socio\n");
                    //JOptionPane.showMessageDialog(null, "Error al Actualizar Socio");
                }

                connection.close();
            
            
        }

}