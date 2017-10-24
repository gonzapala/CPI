/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Datos.Socio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;
import vistas.gestionarSocios;

/**
 *
 * @author Gonzalo
 */
public class SocioController implements ActionListener{
    
    gestionarSocios vistaCRUD = new gestionarSocios();
    Socio modeloCRUD = new Socio();
    Socio socio = new Socio();
    
      
    public SocioController (gestionarSocios vistaCRUD,Socio modeloCRUD){
        this.modeloCRUD=modeloCRUD;
        this.vistaCRUD=vistaCRUD;
        //this.vistaCRUD.btnRegistrar.addActionListener(this);
        this.vistaCRUD.btnListar.addActionListener(this);
    }

    public SocioController() {
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
        
        int numeroRegistros= modeloCRUD.listarSocios().size();
        for ( int i=0; i<numeroRegistros;i++){
            columna[0]=modeloCRUD.listarSocios().get(i).getLegajo_socio();
            columna[1]=modeloCRUD.listarSocios().get(i).getApellido();
            columna[2]=modeloCRUD.listarSocios().get(i).getNombre();
            columna[3]=modeloCRUD.listarSocios().get(i).getDni();
            columna[4]=modeloCRUD.listarSocios().get(i).getEstado();
            modeloT.addRow(columna);
        
        }
        
    }//FIn-LlenarTabla
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==vistaCRUD.btnRegistrar){
//            System.out.println("Registrar");
//        }
        
        if(e.getSource()==vistaCRUD.btnListar){
            LlenarTabla(vistaCRUD.Tabla_Socios);
        }
            
    }
    

    

}
