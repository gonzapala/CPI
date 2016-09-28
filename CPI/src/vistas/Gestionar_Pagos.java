/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Datos.Conexion;
import Datos.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Datos.Resolucion;
import generadorPDF.generarPDF;

/**
 *
 * @author Anahi
 */
public class Gestionar_Pagos extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public Gestionar_Pagos() {
        initComponents();
        this.deshabilitarCampos();
    }
    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;//para recibir resultados de una cosulta
    Socio NS = new Socio();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPago = new javax.swing.JPanel();
        txtID_Socio = new javax.swing.JLabel();
        labelMontoTotal = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        txtNumeroPago = new javax.swing.JTextField();
        labelTipol = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Tipo = new javax.swing.JComboBox<>();
        labelNumeroPago = new javax.swing.JLabel();
        labelID_Socio = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labellegajo = new javax.swing.JLabel();
        txtLegajo1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labelID_S = new javax.swing.JLabel();
        labelTipol1 = new javax.swing.JLabel();
        Tipo1 = new javax.swing.JComboBox<>();
        txtNumeroPago1 = new javax.swing.JTextField();
        labelNumeroPago1 = new javax.swing.JLabel();
        labelMontoTotal1 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        txtMontoTotal1 = new javax.swing.JTextField();
        id_socio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gestionar Pagos");

        labelMontoTotal.setText("Monto Total:");

        txtMontoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoTotalActionPerformed(evt);
            }
        });

        txtNumeroPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPagoActionPerformed(evt);
            }
        });

        labelTipol.setText("Tipo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Matrícula"}));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        labelNumeroPago.setText("Número de Pago:_");

        labelID_Socio.setText("ID_Socio:");

        jLabel2.setText("Legajo");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagoLayout = new javax.swing.GroupLayout(panelPago);
        panelPago.setLayout(panelPagoLayout);
        panelPagoLayout.setHorizontalGroup(
            panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTipol, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPagoLayout.createSequentialGroup()
                                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNumeroPago)
                                    .addComponent(labelMontoTotal))
                                .addGap(18, 18, 18)
                                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroPago)
                                    .addComponent(txtMontoTotal)))))
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addComponent(labelID_Socio)
                        .addGap(18, 18, 18)
                        .addComponent(txtID_Socio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)))
                .addGap(58, 185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(42, 42, 42)
                .addComponent(btnSalir)
                .addGap(162, 162, 162))
        );
        panelPagoLayout.setVerticalGroup(
            panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID_Socio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID_Socio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(labelTipol)
                .addGap(18, 18, 18)
                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroPago)
                    .addComponent(txtNumeroPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontoTotal)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Pago de Matricula", panelPago);

        labellegajo.setText("Legajo:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelID_S.setText("ID_Socio:");

        labelTipol1.setText("Tipo");

        Tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Costo de Derecho Anual de Ejercicio"}));
        Tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo1ActionPerformed(evt);
            }
        });

        txtNumeroPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPago1ActionPerformed(evt);
            }
        });

        labelNumeroPago1.setText("Número de Pago");

        labelMontoTotal1.setText("Monto Total");

        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(txtLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelID_S)
                        .addGap(27, 27, 27)
                        .addComponent(id_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelMontoTotal1)
                        .addGap(96, 498, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelTipol1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tipo1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelNumeroPago1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMontoTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtNumeroPago1))))
                        .addGap(327, 327, 327))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar1)
                .addGap(75, 75, 75)
                .addComponent(btnSalir1)
                .addGap(99, 99, 99))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(labellegajo)
                    .addContainerGap(528, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(id_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(labelID_S)
                        .addGap(40, 40, 40)
                        .addComponent(labelTipol1)
                        .addGap(18, 18, 18)))
                .addComponent(Tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroPago1)
                    .addComponent(txtNumeroPago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontoTotal1)
                    .addComponent(txtMontoTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1)
                    .addComponent(btnSalir1))
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscar)
                        .addComponent(labellegajo))
                    .addContainerGap(334, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Pago de Derecho Anual de Ejercicio", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pagar Deuda", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void deshabilitarCampos() {

        //TXT
        txtNumeroPago.setEnabled(false);
        txtMontoTotal.setEnabled(false);
       // fecha_pago.setEnabled(false);

        //COMBOBOX
        Tipo.setEnabled(false);
       // Forma.setEnabled(false);
        //CantidadCuotas.setEnabled(false);

        //LABEL
        labelTipol.setEnabled(false);
        //labelAño.setEnabled(false);
        //labelCantCuotas.setEnabled(false);
        //labelForma.setEnabled(false);
        labelNumeroPago.setEnabled(false);
        labelMontoTotal.setEnabled(false);

        //BOTON
        btnGuardar.setEnabled(false);

    }

    public void habilitarCampos() {

        //TXT
        txtNumeroPago.setEnabled(true);
        txtMontoTotal.setEnabled(true);
//        fecha_pago.setEnabled(true);

        //COMBOBOX
        Tipo.setEnabled(true);
  //      Forma.setEnabled(true);
    //    CantidadCuotas.setEnabled(true);

        //LABEL
        labelTipol.setEnabled(true);
      //  labelAño.setEnabled(true);
       // labelCantCuotas.setEnabled(true);
        //labelForma.setEnabled(true);
        labelNumeroPago.setEnabled(true);
        labelMontoTotal.setEnabled(true);

        //BOTON
        btnGuardar.setEnabled(true);

    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNumeroPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPago1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String Leg = txtLegajo.getText();
      

        try {
            NS = NS.BuscarX(Leg);

            System.out.println(NS.getId_socio());
            if (NS.getEstado().compareTo("aspirante") == 0) {
                System.out.println(NS.getApellido());
                String Id = Integer.toString(NS.getId_socio());
                txtID_Socio.setText(Id);
                habilitarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "No es aspirante");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gestionar_Pagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        try {
            connection = Conexion.Cadena();
            preparedStatement = connection.prepareStatement("INSERT INTO pago (numero_pago, tipo, forma, cant_coutas, monto_total, fecha, id_socio) VALUES (?,?,?,?,?,?,?)");

            preparedStatement.setString(1, txtNumeroPago.getText());
            preparedStatement.setString(2, Tipo.getSelectedItem().toString());
     //       preparedStatement.setString(3, Forma.getSelectedItem().toString());
       //     preparedStatement.setString(4, CantidadCuotas.getSelectedItem().toString());
            preparedStatement.setString(5, txtMontoTotal.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
         //   String fecha = formatoFecha.format(fecha_pago.getDate());
           // preparedStatement.setString(6, fecha);
            // preparedStatement.setString(6, fecha.getDateFormatString());
            preparedStatement.setString(7, txtID_Socio.getText());

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                System.out.println(NS.getId_socio());
                NS.setEstado("socio");
                // 1 = Matriculacion
                // 2 = suspension
                int estadoE = 1;
                Resolucion nuevaR = new Resolucion();
                nuevaR = nuevaR.GenerarResolucion(NS, estadoE);
                //generar PDF
                generarPDF pdf = new generarPDF();
                pdf.generarPDF_Resolucion(NS, nuevaR, 1);

                JOptionPane.showMessageDialog(null, "Pago Realizado");

            } else {
                JOptionPane.showMessageDialog(null, "Error de Operación");
                //LimpiarCajas();
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNumeroPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPagoActionPerformed

    private void txtMontoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoTotalActionPerformed

    private void Tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JComboBox<String> Tipo1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel id_socio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelID_S;
    private javax.swing.JLabel labelID_Socio;
    private javax.swing.JLabel labelMontoTotal;
    private javax.swing.JLabel labelMontoTotal1;
    private javax.swing.JLabel labelNumeroPago;
    private javax.swing.JLabel labelNumeroPago1;
    private javax.swing.JLabel labelTipol;
    private javax.swing.JLabel labelTipol1;
    private javax.swing.JLabel labellegajo;
    private javax.swing.JPanel panelPago;
    private javax.swing.JLabel txtID_Socio;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtLegajo1;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtMontoTotal1;
    private javax.swing.JTextField txtNumeroPago;
    private javax.swing.JTextField txtNumeroPago1;
    // End of variables declaration//GEN-END:variables
}
