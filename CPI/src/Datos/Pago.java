/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Anahi
 */
public class Pago {
    
    
    private int id_pago;
    private int numero_pago;
    private int tipo;
    private String forma;
    private int cant_cuotas;
    private float monto;
    private String fecha;
    private int id_socio;

    /**
     * @return the id_pago
     */
    public int getId_pago() {
        return id_pago;
    }
    
    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
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
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
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
    


  
    public Pago buscarUltimoPago(int id_socio){
        Pago ultimoPago = new Pago();
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM pago"+ " WHERE id_socio ='"+id_socio+"' ";
            //System.out.println(SQL);
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            int num_pago;
            if (rsDatos.last()) {
//                    num_pago=rsDatos.getInt("numero_pago");
//                    System.out.println("num pago: "+ num_pago);
                                        
                    ultimoPago.setNumero_pago(rsDatos.getInt("numero_pago"));
                    ultimoPago.setTipo(rsDatos.getInt("tipo"));
                    ultimoPago.setForma(rsDatos.getString("forma"));
                    ultimoPago.setFecha(rsDatos.getString("fecha"));
                }
            
            
        } catch (Exception e) {
        }
        
        return ultimoPago;
    }
    public String toString() {
        return "[ID de Pago: "+this.getId_pago()+ "] [Numero de Pago: "+this.getNumero_pago()+"] [Tipo: "+this.getTipo()+"]";
    }
    public ArrayList<Pago> buscarPagos(int id_socio){
        ArrayList listaPagos = new ArrayList();
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM pago"+ " WHERE id_socio ='"+id_socio+"' ";
            //System.out.println(SQL);
            Statement sentencia = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            while (rsDatos.next()) {
                    Pago Pago = new Pago();
                    Pago.setId_pago(rsDatos.getInt("id_pago"));
                    Pago.setNumero_pago(rsDatos.getInt("numero_pago"));
                    Pago.setTipo(rsDatos.getInt("tipo"));
                    Pago.setForma(rsDatos.getString("forma"));
                    Pago.setMonto(rsDatos.getInt("monto_total"));
                    Pago.setFecha(rsDatos.getString("fecha"));
                    Pago.setId_socio(rsDatos.getInt("id_socio"));
                   // System.out.println("Num pago: "+Pago.getNumero_pago() );
                   // System.out.println("id_pago: "+Pago.getId_pago());
                    //System.out.println( "monto: "+Pago.getMonto());
                   // System.out.println( "socio: "+Pago.getId_socio()+"\n\n");
                    listaPagos.add(Pago);
                }
        } catch (Exception e) {
        }
        
        return listaPagos;
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
}
