/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Datos.Resolucion;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.value;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;


/**
 *
 * @author Gonzalo
 */
public class Mostrar_Resoluciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mostrar_Resoluciones
     */
    public Mostrar_Resoluciones() {
        initComponents();
    }
    Resolucion modelo_res= new Resolucion();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_res_matricula = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btn_listar_res_mat = new javax.swing.JButton();
        MostrarPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_res_mat = new org.jdesktop.swingx.JXTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        btn_listar_res_mat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checklist.png"))); // NOI18N
        btn_listar_res_mat.setText("Listar");
        btn_listar_res_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_res_matActionPerformed(evt);
            }
        });

        MostrarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder-14.png"))); // NOI18N
        MostrarPDF.setText("Mostrar Resolucion");
        MostrarPDF.setEnabled(false);
        MostrarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPDFActionPerformed(evt);
            }
        });

        table_res_mat.setModel(new javax.swing.table.DefaultTableModel(
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
        table_res_mat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_res_matMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_res_mat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_listar_res_mat)
                        .addGap(31, 31, 31)
                        .addComponent(MostrarPDF)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_listar_res_mat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_res_matricula.addTab("Resoluciones", jPanel1);

        jLabel1.setText("Mostrar Resoluciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab_res_matricula)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(tab_res_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listar_res_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_res_matActionPerformed
        try {
            // TODO add your handling code here:
            LlenarTabla(table_res_mat);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gestionar_Resoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_listar_res_matActionPerformed

    private void table_res_matMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_res_matMouseClicked
        String num = table_res_mat.getValueAt(table_res_mat.getSelectedRow(),0).toString();
        String ruta = table_res_mat.getValueAt(table_res_mat.getSelectedRow(),5).toString();
        System.out.println(num+ruta);
        
        MostrarPDF.setEnabled(true);
    }//GEN-LAST:event_table_res_matMouseClicked

    private void MostrarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPDFActionPerformed
        String num = table_res_mat.getValueAt(table_res_mat.getSelectedRow(),0).toString();
        String ruta = table_res_mat.getValueAt(table_res_mat.getSelectedRow(),5).toString();
         try {
            File path = new File (ruta);
            Desktop.getDesktop().open(path);
       }catch (IOException ex) {
            ex.printStackTrace();
       }
    }//GEN-LAST:event_MostrarPDFActionPerformed
    
    public void LlenarTabla(JXTable tabla) throws ClassNotFoundException{
        DefaultTableModel modeloT = new DefaultTableModel();
        tabla.setModel(modeloT);
        
        modeloT.addColumn("Numero Res.");
        modeloT.addColumn("Estado");
        modeloT.addColumn("Tipo");
        modeloT.addColumn("Fecha Res.");
        modeloT.addColumn("Legajo Socio");
        modeloT.addColumn("Ruta Res.");
        
        Object[] columna = new Object[6];
        
        int numeroRegistros= modelo_res.listar().size();
        //        System.out.println(numeroRegistros);
        for ( int i=0; i<numeroRegistros;i++){
            
            //verfificarPago(modelo_res.listarSocios().get(i).getLegajo_socio());
            
            //String estado=modelo_socios.listarSocios().get(i).getEstado();
            //System.out.println("Estado del socio luego de verificar los pago y cambiar estado: "+estado+"\n");
            //int compare = estado.compareTo("moroso");
                columna[0]=modelo_res.listar().get(i).getNumero_resolucion();
                columna[1]=modelo_res.listar().get(i).getEstado();
                columna[2]=modelo_res.listar().get(i).getTipo();
                //columna[3]=modelo_res.listar().get(i).getFecha();
                columna[4]=modelo_res.listar().get(i).getLegajo_socio();
                columna[5]=modelo_res.listar().get(i).getRuta();

                modeloT.addRow(columna);
                //Cells are by default rendered as a JLabel.

        }
        
    }//FIn-LlenarTabla

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostrarPDF;
    private javax.swing.JButton btn_listar_res_mat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tab_res_matricula;
    private org.jdesktop.swingx.JXTable table_res_mat;
    // End of variables declaration//GEN-END:variables
}
