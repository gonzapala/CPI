/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Datos.Conexion;
import Datos.Socio;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import Datos.Resolucion;
=======


import Datos.Resolucion;
import Datos.Socio_Crud;
>>>>>>> master
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
<<<<<<< HEAD
>>>>>>> master
=======

>>>>>>> master
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author Gonzalo
 */
public class Gestionar_Resoluciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gestionar_Resoluciones
     */
    public Gestionar_Resoluciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarSocio = new javax.swing.JButton();
        txtBuscarSocio = new javax.swing.JTextField();
<<<<<<< HEAD
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
=======
        jLabel1 = new javax.swing.JLabel();
        btn_listar_morosos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXTable_morosos = new org.jdesktop.swingx.JXTable();
>>>>>>> master
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        btnBuscarSocio.setText("Buscar");
        btnBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSocioActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        tabla.setModel(new javax.swing.table.DefaultTableModel(
=======
        jLabel1.setText("Listar Socios Morosos");

        btn_listar_morosos.setText("Listar");
        btn_listar_morosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_morososActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar Por legajo");

        jXTable_morosos.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> master
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
<<<<<<< HEAD
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Listar Socios Morosos");

        jButton1.setText("Listar");

        jLabel2.setText("Buscar Por legajo");
=======
        jScrollPane2.setViewportView(jXTable_morosos);
>>>>>>> master

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
=======
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btn_listar_morosos))
>>>>>>> master
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarSocio)))))
<<<<<<< HEAD
                .addContainerGap(78, Short.MAX_VALUE))
=======
                .addContainerGap(70, Short.MAX_VALUE))
>>>>>>> master
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                    .addComponent(jButton1)
=======
                    .addComponent(btn_listar_morosos)
>>>>>>> master
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarSocio)))
                .addGap(18, 18, 18)
<<<<<<< HEAD
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
=======
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
>>>>>>> master
        );

        jTabbedPane1.addTab("Suspencion", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Gestionar Resoluciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    Gestionar_Resoluciones vista = new Gestionar_Resoluciones();
    Socio modelo_socios = new Socio();
    
    //public Gestionar_Resoluciones (Gestionar_Resoluciones vista,Socio modelo_socios){
//        this.modelo_socios=modelo_socios;
//        this.vista=vista;
//        //this.vistaCRUD.btnRegistrar.addActionListener(this);
//        this.vista.btn_listar_morosos.addActionListener(this);
    //}
    public void LlenarTabla(JXTable tabla_morosos){
        DefaultTableModel modeloT = new DefaultTableModel();
        tabla_morosos.setModel(modeloT);
        
        modeloT.addColumn("Legajo");
        modeloT.addColumn("Apellido");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("DNI");
        modeloT.addColumn("Estado");
        
        Object[] columna = new Object[5];
        
        int numeroRegistros= modelo_socios.listarSocios().size();
        System.out.println(numeroRegistros);
        for ( int i=0; i<numeroRegistros;i++){
            String estado_pago=modelo_socios.listarSocios().get(i).getEstado_pago();
            verficarPago(modelo_socios.listarSocios().get(i).getLegajo_socio());
            if(estado_pago.compareTo("moroso")){
            }
            columna[0]=modelo_socios.listarSocios().get(i).getLegajo_socio();
            columna[1]=modelo_socios.listarSocios().get(i).getApellido();
            columna[2]=modelo_socios.listarSocios().get(i).getNombre();
            columna[3]=modelo_socios.listarSocios().get(i).getDni();
            columna[4]=modelo_socios.listarSocios().get(i).getEstado();
            modeloT.addRow(columna);
        
        }
        
    }//FIn-LlenarTabla
    public void verfificarPago(String leg) throws ClassNotFoundException{
        Socio nSocio = new Socio();
        nSocio=nSocio.BuscarX(leg);
        
        
        
    }
    private void btnBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSocioActionPerformed
        String estado = this.txtBuscarSocio.getText().toString();
        Conexion cn = new Conexion();
        //       Resultset rs = cn.SeleccionarUsuario(estado);
        DefaultTableModel dfmbuscar= new DefaultTableModel();
<<<<<<< HEAD
        this.tabla.setModel(dfmbuscar);
=======
        //this.tabla.setModel(dfmbuscar);
>>>>>>> master
        // dfmbuscar.setColumnIdentifiers(new Object[]{legajo_socio,nombre, apellido,dni, telefono, estado_pago,categoria,estado,cuilcuit,email});
        try {

        } catch (Exception e) {
        }

        try {
            Datos.Socio nuevoSocio = new Socio();
            nuevoSocio=nuevoSocio.BuscarX(txtBuscarSocio.getText());
            System.out.println(nuevoSocio.getNombre());
            //labelNombre.setText(nuevoSocio.getNombre());
            //labelApellido.setText(nuevoSocio.getApellido());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
<<<<<<< HEAD

    }//GEN-LAST:event_btnBuscarSocioActionPerformed
=======

    }//GEN-LAST:event_btnBuscarSocioActionPerformed

    private void btn_listar_morososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_morososActionPerformed
        // TODO add your handling code here:
        LlenarTabla(jXTable_morosos);
    }//GEN-LAST:event_btn_listar_morososActionPerformed
>>>>>>> master


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarSocio;
<<<<<<< HEAD
    private javax.swing.JButton jButton1;
=======
    private javax.swing.JButton btn_listar_morosos;
>>>>>>> master
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
<<<<<<< HEAD
    private javax.swing.JTable tabla;
=======
    private org.jdesktop.swingx.JXTable jXTable_morosos;
>>>>>>> master
    private javax.swing.JTextField txtBuscarSocio;
    // End of variables declaration//GEN-END:variables

    private void verficarPago(String legajo_socio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
