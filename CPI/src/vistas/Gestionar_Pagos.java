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
import java.util.Calendar;
import java.util.Date;
import Datos.Pago;
import Datos.Registro;
import Datos.Usuario;
import Datos.Pago_cuota;
import Datos.SocioController;
import controladores.PagosController;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


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
        btn_realizarPago.setEnabled(false);
    }
    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;//para recibir resultados de una cosulta
    Socio NS = new Socio();
    Socio socio = new Socio();
    SocioController socioController = new SocioController();
    PagosController pagoController = new PagosController();
    login loginActual = new login();
    
    int montoAPagar = 0;
    
    private Statement sentencia;
    private ResultSet rsDatos;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labelMontoTotal1 = new javax.swing.JLabel();
        btn_realizarPago = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        label_fechaUltimoPago = new javax.swing.JLabel();
        txtEstadoE = new javax.swing.JLabel();
        label_cantCuotasAdeuda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_MontoPagar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LabelIngreseMonto = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        combo_cantCuotas = new javax.swing.JComboBox<>();
        label_montoPorCuota = new javax.swing.JLabel();
        label_cantCuotas = new javax.swing.JLabel();
        btn_CalcularMonto = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_cuotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labellegajo = new javax.swing.JLabel();
        input_filtroSocios = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label_estadoSocio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Socios = new org.jdesktop.swingx.JXTable();
        btn_ListarSocios = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        labelMontoTotal1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelMontoTotal1.setText("Monto a Pagar: ");

        btn_realizarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        btn_realizarPago.setText("Realizar Pago");
        btn_realizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_realizarPagoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Fecha del Ultimo Pago: ");

        label_fechaUltimoPago.setText("-");

        label_cantCuotasAdeuda.setText("-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Estado de Pago:  _________________________________________________________");

        label_MontoPagar.setForeground(new java.awt.Color(255, 0, 0));
        label_MontoPagar.setText("-");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText(" Pagos:  ________________________________________________________________");

        LabelIngreseMonto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelIngreseMonto.setText("Monto a pagar por cuota");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Cantidad de Cuotas: ");

        combo_cantCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-","1", "3", "6", "9" }));
        combo_cantCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cantCuotasActionPerformed(evt);
            }
        });

        label_montoPorCuota.setText("-");

        label_cantCuotas.setText("-");

        btn_CalcularMonto.setText("CalcularMonto");
        btn_CalcularMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularMontoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Cuotas seleccionadas: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoE, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelMontoTotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_MontoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_fechaUltimoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_cantCuotasAdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(119, 119, 119))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(btn_realizarPago))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_cantCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelIngreseMonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_montoPorCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_cantCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_CalcularMonto)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstadoE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(label_fechaUltimoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cantCuotasAdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontoTotal1)
                    .addComponent(label_MontoPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(combo_cantCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CalcularMonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(label_cantCuotas)
                    .addComponent(LabelIngreseMonto)
                    .addComponent(label_montoPorCuota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_realizarPago)
                .addGap(90, 90, 90))
        );

        jTabbedPane1.addTab("Pago de Derecho Anual de Ejercicio y Matricula", jPanel2);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText(" Cuotas:  ________________________________________________________________");

        tabla_cuotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla_cuotas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(569, 569, 569))
        );

        jTabbedPane1.addTab(" Deudas", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gestionar Pagos");

        labellegajo.setText("Filtrar: ");

        input_filtroSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_filtroSociosActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("    Datos del Socio:  _________________________________________________________");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Estado: ");

        label_estadoSocio.setText("-");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setLabelFor(label_apellido);
        jLabel12.setText("Apellido: ");

        label_apellido.setText("-");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Nombre: ");

        label_nombre.setText("-");

        Tabla_Socios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Legajo", "Apellido", "Nombre", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_Socios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_SociosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tabla_SociosMouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla_Socios);

        btn_ListarSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checklist.png"))); // NOI18N
        btn_ListarSocios.setText("Listar");
        btn_ListarSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarSociosActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("__ Buscar  ____________________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_ListarSocios)
                                        .addGap(18, 18, 18)
                                        .addComponent(labellegajo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_filtroSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_estadoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labellegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_filtroSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ListarSocios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(label_estadoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Realiza el pago. guarda el pago de la pestaña "Pago de derecho anula de ejercicio y matricula"
    private void btn_realizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_realizarPagoActionPerformed
        System.out.println("------------------- RealizarPago Derecho Anual y Matricula-----------------");
        String Leg = input_filtroSocios.getText();
        int TipoP = 0;
        try {
            NS = NS.BuscarX(Leg);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechap = formatoFecha.format(fechaActual);

            Calendar fecha = Calendar.getInstance();
            int añoActual = fecha.get(Calendar.YEAR);

            switch(NS.getEstado()){
                case "aspirante":
                    TipoP = 1;//Matricula
                break;
                case "activo":
                    TipoP = 2;//"Derecho de Ejercicio" 
                break;
                case "moroso":
                    TipoP = 3; //"Deuda"
                break;
            }
            
            //***********Guardar Pago************//
            connection = Conexion.Cadena();
            preparedStatement = connection.prepareStatement("INSERT INTO pago (numero_pago, tipo, forma, monto_total, fecha, id_socio) VALUES (?,?,?,?,?,?)");

            String numP = añoActual + "/" + Leg;
            preparedStatement.setString(1, numP);  
            preparedStatement.setInt(2, TipoP);
            preparedStatement.setString(3, " ");
            preparedStatement.setString(4, label_MontoPagar.getText());
            preparedStatement.setString(5, fechap);
            preparedStatement.setInt(6, NS.getId_socio());
            

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                //Generar las cuotas
                int id_pago = 0;
                String SQL = "SELECT MAX(id_pago) AS id_pago FROM pago"; // selecciono y obtengo el ultimo ID ingresado en la tabla.
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(SQL);
                if(rs.next()){
                    id_pago=rs.getInt("id_pago");
                }
                //System.out.println("ID el ultimo pago"+ id_pago);
                Pago_cuota cuotas = new Pago_cuota();// llamo al metodo que generará las cuotas de este pago
                String a = (String) combo_cantCuotas.getSelectedItem();
                int cantCuotas = Integer.parseInt(a);
                String mpc = label_montoPorCuota.getText();
                int montoPorCuota = Integer.parseInt(mpc);
                cuotas.generarCuotas(id_pago, cantCuotas, montoPorCuota);
                
                //Cambiar Estado del socio
                System.out.println(NS.getId_socio());
                NS.setEstado("Activo");
                // 1 = Matriculacion
                // 2 = suspension
                int estadoE = 1;
                Resolucion nuevaR = new Resolucion();
                nuevaR = nuevaR.GenerarResolucion(NS, estadoE);
                
                //generar PDF
                generarPDF pdf = new generarPDF();
                pdf.generarPDF_Resolucion(NS, nuevaR.getNumero_resolucion(), 1);

                int estadoES = 2;
                Socio nuevoS = new Socio();
                nuevoS.cambiarEstado(NS, estadoES);
                limpiarFormulario();
                
                JOptionPane.showMessageDialog(null, "Pago Realizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error de Operación");
               
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btn_realizarPagoActionPerformed

    private void combo_cantCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cantCuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cantCuotasActionPerformed

    //Calcula el monto a pagar deacuerdo a la cantidad de cuotas
    private void btn_CalcularMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularMontoActionPerformed
        String value = (String) combo_cantCuotas.getSelectedItem();
        int cant = Integer.parseInt(value);
        label_cantCuotas.setText(value);
        int monto = montoAPagar / cant;
        label_montoPorCuota.setText(Integer.toString(monto));
        btn_realizarPago.setEnabled(true);
    }//GEN-LAST:event_btn_CalcularMontoActionPerformed
    
    //Muestra la informacion del SOCIO seleccionado
    private void Tabla_SociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SociosMouseClicked
        try {
            String legajo = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(), 0).toString();
            socio = socio.BuscarX(legajo);
            switch (socio.getEstado()) {
                case "aspirante":
                    //se matriculó pero no pagó la matricula. Tiene que pagar Matricula
                    mostrarInformacion(socio, 1);
                    break;
                case "activo":
                    mostrarInformacion(socio, 2);
                    break;
                case "moroso":
                    mostrarInformacion(socio, 3);
                    break;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(gestionarSocios.class
                .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tabla_SociosMouseClicked

    private void Tabla_SociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SociosMouseExited

    }//GEN-LAST:event_Tabla_SociosMouseExited

    //Busca y muestra en la tabla TODOS los socios
    private void btn_ListarSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarSociosActionPerformed
        pagoController.LlenarTabla(Tabla_Socios);
    }//FIn-LlenarTabla    }//GEN-LAST:event_btn_ListarSociosActionPerformed
    
    //Filtro
    private void input_filtroSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_filtroSociosActionPerformed
        DefaultTableModel model = null;
        String[] titulosTabla = {"legajo_socio", "nombre", "apellido", "dni", "categoria", "estado"};
        
        model = new DefaultTableModel(null, titulosTabla);
        model = socio.buscarSocioporFiltro(model, input_filtroSocios.getText());
        Tabla_Socios.setModel(model);
    }//GEN-LAST:event_input_filtroSociosActionPerformed
    
    //  Muestra la informacion del socio en los campos
    public void mostrarInformacion(Socio NS, int estado) {
        try {
            System.out.println("------------------- mostrarInformacion -----------------");
            System.out.println(NS.getEstado());
            System.out.println(NS.getApellido());

            String Id = Integer.toString(NS.getId_socio());
            String nombreS = NS.getNombre();
            String apeS = NS.getApellido();
            String montoPagar;
            ArrayList<Pago_cuota> listaCuotas= new ArrayList<Pago_cuota>();

            label_nombre.setText(nombreS);
            label_apellido.setText(apeS);
            if (estado == 1) {
                label_estadoSocio.setText("El socio es Aspirante");
                label_fechaUltimoPago.setText("-");
                label_cantCuotasAdeuda.setText("-");

                montoAPagar = 450;//variable global
                montoPagar = String.valueOf(montoAPagar);
                label_MontoPagar.setText(montoPagar);
            }
            if (estado == 2) {
                label_estadoSocio.setText("El socio está al dia");
                label_fechaUltimoPago.setText("-");
                label_cantCuotasAdeuda.setText("-");
                label_MontoPagar.setText("-");
                
                //Mostrar Deudas
                listaCuotas = pagoController.buscarDeuda(NS);
                pagoController.LlenarTablaCuotas(listaCuotas, tabla_cuotas);
            }
            if (estado == 3) {
                int CantM = calcularCantidadMeses(NS);
                label_estadoSocio.setText("El socio es Moroso");
                label_cantCuotasAdeuda.setText("El socio debe " + CantM + " Cuotas");

                montoAPagar = CantM * 500;//variable global
                montoPagar = String.valueOf(montoAPagar);
                label_MontoPagar.setText(montoPagar);
                
                //Mostrar Deudas
                listaCuotas = pagoController.buscarDeuda(NS);
                pagoController.LlenarTablaCuotas(listaCuotas, tabla_cuotas);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gestionar_Pagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Calcula la cantidad de meses que debe el socio
    public int calcularCantidadMeses(Socio NS) throws ClassNotFoundException {

        int idSocio = NS.getId_socio();
        int CantM = 0;
        //FECHA ACTUAL
        Calendar fecha = Calendar.getInstance();
        int añoActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH) + 1;
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);

        //FECHA DEL ULTIMO PAGO
        Pago deuda = new Pago();
        deuda = deuda.buscarUltimoPago(idSocio);
        String FechaD = deuda.getFecha();
        //System.out.println(FechaD);  // FECHA QUE DEBE EL SOCIO

        String ultFecha = deuda.getFecha();
        String[] parts = ultFecha.split("-");
        String parts1_Año = parts[0];
        String parts2_mes = parts[1];
        String parts3_dia = parts[2];

        int ultFecha_año = Integer.parseInt(parts1_Año);
        int ultFecha_mes = Integer.parseInt(parts2_mes);
        int ultFecha_dia = Integer.parseInt(parts3_dia);

        System.out.println("El mes del ultimo pago es: " + ultFecha_mes + " Año:" + ultFecha_año);
        System.out.println("El mes actual es: " + mesActual);

        if (ultFecha_año == añoActual) {
            CantM = mesActual - ultFecha_mes - 1;
        } else {
            if (añoActual > ultFecha_año) {
                int cantAños = añoActual - ultFecha_año;
                CantM = (12 * cantAños - ultFecha_mes) + mesActual;
            }
            //considerar el dia para ver si falta pagar el mes acutal
        }

        label_fechaUltimoPago.setText(ultFecha);

        return CantM;
    }

    //Limpia el formulario
    public void limpiarFormulario(){
        input_filtroSocios.setText("");
        label_estadoSocio.setText("-");
        label_apellido.setText("-");
        label_nombre.setText("-");
        label_fechaUltimoPago.setText("-");
        label_cantCuotasAdeuda.setText("-");
        label_MontoPagar.setText("-");
        label_cantCuotas.setText("-");        
        label_montoPorCuota.setText("-");     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelIngreseMonto;
    public org.jdesktop.swingx.JXTable Tabla_Socios;
    private javax.swing.JButton btn_CalcularMonto;
    public javax.swing.JButton btn_ListarSocios;
    private javax.swing.JButton btn_realizarPago;
    private javax.swing.JComboBox<String> combo_cantCuotas;
    private javax.swing.JTextField input_filtroSocios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelMontoTotal1;
    private javax.swing.JLabel label_MontoPagar;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_cantCuotas;
    private javax.swing.JLabel label_cantCuotasAdeuda;
    private javax.swing.JLabel label_estadoSocio;
    private javax.swing.JLabel label_fechaUltimoPago;
    private javax.swing.JLabel label_montoPorCuota;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel labellegajo;
    public javax.swing.JTable tabla_cuotas;
    private javax.swing.JLabel txtEstadoE;
    // End of variables declaration//GEN-END:variables
}
