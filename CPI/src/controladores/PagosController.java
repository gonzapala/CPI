/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Datos.Pago;
import Datos.Pago_cuota;
import Datos.Socio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;
import vistas.Gestionar_Pagos;

/**
 *
 * @author Gonza
 */
public class PagosController {
    
    Socio socio = new Socio();
    Pago pago = new Pago();
    Pago_cuota cuota = new Pago_cuota();
       
    public void PagosController(){
    }

        
    public void LlenarTabla(JXTable tabla_socios){
        DefaultTableModel modeloT = new DefaultTableModel();
        tabla_socios.setModel(modeloT);
        
        modeloT.addColumn("Legajo");
        modeloT.addColumn("Apellido");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("DNI");
        modeloT.addColumn("Socio");
        
        Object[] columna = new Object[5];
        
        int numeroRegistros= socio.listarSocios().size();
        for ( int i=0; i<numeroRegistros;i++){
            columna[0]=socio.listarSocios().get(i).getLegajo_socio();
            columna[1]=socio.listarSocios().get(i).getApellido();
            columna[2]=socio.listarSocios().get(i).getNombre();
            columna[3]=socio.listarSocios().get(i).getDni();
            columna[4]=socio.listarSocios().get(i).getEstado();
            modeloT.addRow(columna);
        
        }
        
    }//FIn-LlenarTabla
      
    public void LlenarTablaCuotas(ArrayList<Pago_cuota> listaCuotas, JTable tabla){
        DefaultTableModel modeloT = new DefaultTableModel();
        tabla.setModel(modeloT);
        
        modeloT.addColumn("N° Cuota");
        modeloT.addColumn("Fecha");
        modeloT.addColumn("Vencimiento");
        modeloT.addColumn("Monto");
        modeloT.addColumn("Estado");
        
        Object[] columna = new Object[5];
        
        for(Pago_cuota c:listaCuotas){
            //System.out.println(c.getNumero_cuota());
            columna[0]=c.getNumero_cuota();
            columna[1]=c.getFecha();
            columna[2]=c.getFecha_limite();
            columna[3]=c.getMonto();
            columna[4]=c.getEstado();
            modeloT.addRow(columna);
        }
    }//FIn-LlenarTabla
    
    public ArrayList<Pago_cuota> buscarDeuda(Socio s){
        ArrayList<Pago> listaPagos = new ArrayList<Pago>();
        ArrayList<Pago_cuota> listaCuotas= new ArrayList<Pago_cuota>();
        int id = s.getId_socio();
        listaPagos = pago.buscarPagos(id);
        System.out.println("ID SOCIO:"+s.getId_socio());
        for (Pago p: listaPagos) {
             System.out.println("ID pago:"+p.getId_pago());
             System.out.println("Tipo:"+p.getTipo());
             if (p.getTipo()==3) { //Deuda
                listaCuotas = cuota.buscarCuotas(p.getId_pago());
            }
        }
        return listaCuotas;
    }
}
