/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Anahi
 */
public class Pagos {
    
    
    private int id_pago;
    private int numero_pago;
    private String tipo;
    private String forma;
    private int cant_cuotas;
    private float monto;
    private int anio;
    private int id_socio;

    /**
     * @return the id_pago
     */
    public int getId_pago() {
        return id_pago;
    }

    /**
     * @return the numero_pago
     */
    public int getNumero_pago() {
        return numero_pago;
    }

    /**
     * @param numero_pago the numero_pago to set
     */
    public void setNumero_pago(int numero_pago) {
        this.numero_pago = numero_pago;
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
     * @return the forma
     */
    public String getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(String forma) {
        this.forma = forma;
    }

    /**
     * @return the cant_cuotas
     */
    public int getCant_cuotas() {
        return cant_cuotas;
    }

    /**
     * @param cant_cuotas the cant_cuotas to set
     */
    public void setCant_cuotas(int cant_cuotas) {
        this.cant_cuotas = cant_cuotas;
    }

    /**
     * @return the monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the id_socio
     */
    public int getId_socio() {
        return id_socio;
    }

    /**
     * @param id_socio the id_socio to set
     */
    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }
    public Pagos buscarUltimoPago(int id_socio){
        Pagos ultimoPago = new Pagos();
            try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM pago"+ " WHERE id_socio ='"+id_socio+"' ";
            System.out.println(SQL);
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            System.out.println("Correcto");
            int num_pago;
            if (rsDatos.last()) {
                    num_pago=rsDatos.getInt("numero_pago");
                    System.out.println( num_pago);
                }
            
            
        } catch (Exception e) {
        }
        
        return ultimoPago;
    }
}
