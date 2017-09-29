/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


/**
 *
 * @author Gonza
 */
public class Pago_cuota {
    private int id;
    private String fecha;
    private int numero_cuota;
    private int monto;
    private String estado;
    private String fecha_limite;
    private int id_pago;

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
    
    
    
}
