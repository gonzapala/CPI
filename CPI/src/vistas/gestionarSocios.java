/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Gonzalo
 */
import Datos.Conexion;
import Datos.Registro;
import Datos.Socio;
import Datos.Usuario;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class gestionarSocios extends javax.swing.JInternalFrame {

    /**
     * Creates new form nuevo
     */
    public gestionarSocios() {
        initComponents();
    }
    private Statement sentencia;
    private ResultSet rsDatos;
    Datos.Socio s;
    Socio socio;

    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;//para recibir resultados de una cosulta

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane_socios = new javax.swing.JTabbedPane();
        jPanel_socios = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Socios = new org.jdesktop.swingx.JXTable();
        editar_socio = new javax.swing.JButton();
        btn_BuscarSocio = new javax.swing.JButton();
        txtBuscarSocio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelLegajo = new javax.swing.JLabel();
        LabelDNI = new javax.swing.JLabel();
        LabelDom = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelCuil = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelEstado_pago = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelFechaNacc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        label_id_socio = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtEmailSocio = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtDomicilioSocio = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ComboBoxCategoriaSocio = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtCuilSocio = new javax.swing.JTextField();
        txtApellidoSocio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreSocio = new javax.swing.JTextField();
        txtDNISocio = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtTelefonoSocio = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btn_guardarNuevoSocio = new javax.swing.JButton();
        fechaNac_socio = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel_Edtar_socio = new javax.swing.JPanel();
        btn_actualizarSocio = new javax.swing.JButton();
        txtCuilSocio1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        fechaNac_socio1 = new com.toedter.calendar.JDateChooser();
        ComboBoxCategoriaSocio1 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtApellidoSocio1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNombreSocio1 = new javax.swing.JTextField();
        txtDNISocio1 = new javax.swing.JTextField();
        txtDomicilioSocio1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtEmailSocio1 = new javax.swing.JTextField();
        txtTelefonoSocio1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        fechaNac_editar = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(731, 594));
        setPreferredSize(new java.awt.Dimension(731, 594));
        setVisible(false);

        jTabbedPane_socios.setPreferredSize(new java.awt.Dimension(900, 550));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checklist.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(Tabla_Socios);
        if (Tabla_Socios.getColumnModel().getColumnCount() > 0) {
            Tabla_Socios.getColumnModel().getColumn(0).setResizable(false);
        }

        editar_socio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compose.png"))); // NOI18N
        editar_socio.setText("Editar");
        editar_socio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editar_socio.setEnabled(false);
        editar_socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_socioActionPerformed(evt);
            }
        });

        btn_BuscarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_BuscarSocio.setText("Buscar");
        btn_BuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarSocioActionPerformed(evt);
            }
        });

        txtBuscarSocio.setToolTipText("Ingrese Legajo");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Nombre: ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Apellido: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Legajo: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DNI:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Domicilio: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("CUIL / CUIT: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("E-Mail: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Estado de Pago: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("__ Datos Profesionales:  __________________________________________________________________________");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Categoria: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Estado: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Fecha Nac.:");

        labelFechaNacc.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDom, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(labelLegajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(LabelDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel35)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(labelCuil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel36)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelFechaNacc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(226, 226, 226))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEstado_pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelLegajo)
                    .addComponent(jLabel35)
                    .addComponent(labelNombre)
                    .addComponent(jLabel36)
                    .addComponent(labelApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LabelDNI)
                    .addComponent(jLabel8)
                    .addComponent(labelCuil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LabelDom, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(labelTel)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel15))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(labelEstado)
                            .addComponent(jLabel12)
                            .addComponent(labelCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(labelEstado_pago)))
                    .addComponent(labelFechaNacc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("__ Datos del Socio:  _______________________________________________________________________________");

        jLabel38.setText("Legajo:");

        jTextField1.setToolTipText("Ingrese Apellido");
        jTextField1.setEnabled(false);

        jLabel39.setText("Apellido");

        label_id_socio.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("__ Buscar  _____________________________________________________________________________________");

        javax.swing.GroupLayout jPanel_sociosLayout = new javax.swing.GroupLayout(jPanel_socios);
        jPanel_socios.setLayout(jPanel_sociosLayout);
        jPanel_sociosLayout.setHorizontalGroup(
            jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sociosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_sociosLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel_sociosLayout.createSequentialGroup()
                        .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_sociosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(label_id_socio))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_sociosLayout.createSequentialGroup()
                                .addComponent(btnListar)
                                .addGap(45, 45, 45)
                                .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_BuscarSocio)
                                .addGap(10, 10, 10)
                                .addComponent(editar_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel_sociosLayout.setVerticalGroup(
            jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_sociosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_sociosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnListar))
                    .addGroup(jPanel_sociosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_sociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_BuscarSocio)
                            .addComponent(editar_socio))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_id_socio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_socios.addTab("Socios", jPanel_socios);

        jLabel25.setText("Categoria");

        jLabel26.setText("E-mail");

        jLabel27.setText("Domicilio");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Datos Profesionales");

        ComboBoxCategoriaSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesional", "Idoneo", "Auxiliar Informatico" }));
        ComboBoxCategoriaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoriaSocioActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Datos Personales");

        jLabel30.setText("CUIL/CUIT");

        txtApellidoSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoSocioKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre");

        txtNombreSocio.setToolTipText("Nombre");
        txtNombreSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSocioActionPerformed(evt);
            }
        });
        txtNombreSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSocioKeyTyped(evt);
            }
        });

        txtDNISocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNISocioKeyTyped(evt);
            }
        });

        jLabel31.setText("DNI");

        jLabel32.setText("Telefono");

        txtTelefonoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoSocioActionPerformed(evt);
            }
        });

        jLabel34.setText("Apellido");

        btn_guardarNuevoSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btn_guardarNuevoSocio.setText("Guardar");
        btn_guardarNuevoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarNuevoSocioActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("______________________________________________________________________________________");

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("______________________________________________________________________________________");

        jLabel50.setText("Fecha de Nacimiento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel27))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtTelefonoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDomicilioSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtEmailSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaNac_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(txtApellidoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(txtDNISocio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(ComboBoxCategoriaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel30)
                                        .addComponent(txtCuilSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btn_guardarNuevoSocio)))
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel50)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApellidoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDNISocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaNac_socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefonoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDomicilioSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmailSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuilSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxCategoriaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(btn_guardarNuevoSocio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_socios.addTab("Nuevo Socio", jPanel4);

        btn_actualizarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btn_actualizarSocio.setText("Actualizar Socio");
        btn_actualizarSocio.setEnabled(false);
        btn_actualizarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarSocioActionPerformed(evt);
            }
        });

        txtCuilSocio1.setEnabled(false);

        jLabel40.setText("Apellido");

        jLabel33.setText("CUIL/CUIT");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Datos Personales");

        fechaNac_socio1.setEnabled(false);

        ComboBoxCategoriaSocio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesional", "Idoneo", "Auxiliar Informatico" }));
        ComboBoxCategoriaSocio1.setEnabled(false);
        ComboBoxCategoriaSocio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoriaSocio1ActionPerformed(evt);
            }
        });

        jLabel42.setText("Categoria");

        jLabel43.setText("E-mail");

        txtApellidoSocio1.setEnabled(false);

        jLabel16.setText("Nombre");

        txtNombreSocio1.setToolTipText("Nombre");
        txtNombreSocio1.setEnabled(false);
        txtNombreSocio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSocio1ActionPerformed(evt);
            }
        });

        txtDNISocio1.setEnabled(false);

        txtDomicilioSocio1.setEnabled(false);

        jLabel44.setText("DNI");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Datos Profesionales");

        jLabel46.setText("Telefono");

        txtEmailSocio1.setEnabled(false);

        txtTelefonoSocio1.setEnabled(false);
        txtTelefonoSocio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoSocio1ActionPerformed(evt);
            }
        });

        jLabel47.setText("Domicilio");

        jLabel48.setText("Fecha de Nacimiento");

        jLabel49.setText("Nueva Fecha");

        javax.swing.GroupLayout jPanel_Edtar_socioLayout = new javax.swing.GroupLayout(jPanel_Edtar_socio);
        jPanel_Edtar_socio.setLayout(jPanel_Edtar_socioLayout);
        jPanel_Edtar_socioLayout.setHorizontalGroup(
            jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Edtar_socioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel41)
                            .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_actualizarSocio)
                                            .addComponent(ComboBoxCategoriaSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(txtCuilSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel47))
                                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                        .addComponent(txtTelefonoSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDomicilioSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                        .addComponent(txtEmailSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(fechaNac_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechaNac_socio1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(199, 199, 199))
                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtNombreSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(txtApellidoSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel49)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(txtDNISocio1))
                                .addGap(434, 434, 434))))))
        );
        jPanel_Edtar_socioLayout.setVerticalGroup(
            jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel43)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)))
                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNISocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Edtar_socioLayout.createSequentialGroup()
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefonoSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDomicilioSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmailSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fechaNac_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel45)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Edtar_socioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCuilSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCategoriaSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(btn_actualizarSocio))
                    .addComponent(fechaNac_socio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_socios.addTab("Editar Datos Socio", jPanel_Edtar_socio);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gestionar Socios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane_socios, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane_socios, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoSocio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoSocio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoSocio1ActionPerformed

    private void txtNombreSocio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSocio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSocio1ActionPerformed

    private void ComboBoxCategoriaSocio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoriaSocio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCategoriaSocio1ActionPerformed

    private void btn_actualizarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarSocioActionPerformed
        try {
            connection = Conexion.Cadena();
            int numCat=0;
            String cat =ComboBoxCategoriaSocio1.getSelectedItem().toString().toLowerCase();
            switch(cat){
                case "profesional":
                numCat=01;
                break;
                case "idoneo":
                numCat=02;
                break;
                case "auxiliar informatico":
                numCat=03;
                break;
            }

            String numCateg = Integer.toString(numCat);
            String dniSocio = txtDNISocio1.getText();
            preparedStatement = connection.prepareStatement("UPDATE socio SET nombre=?, apellido=?,dni=?,telefono=?,domicilio=?,categoria=?,cuilcuit=?,email=?,legajo_socio=?,fechaNac=? WHERE id_socio=?");
            //Ejemplo UPDATE: "UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?");
        preparedStatement.setString(1, txtNombreSocio1.getText());
        preparedStatement.setString(2, txtApellidoSocio1.getText());
        preparedStatement.setString(3, dniSocio);
        preparedStatement.setString(4, txtTelefonoSocio1.getText());
        preparedStatement.setString(5, txtDomicilioSocio1.getText());
        preparedStatement.setString(6, ComboBoxCategoriaSocio1.getSelectedItem().toString());
        preparedStatement.setString(7, txtCuilSocio1.getText());
        preparedStatement.setString(8, txtEmailSocio1.getText());
        preparedStatement.setString(9, labelLegajo.getText());

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaNac = formatoFecha.format(fechaNac_socio1.getDate());
        preparedStatement.setString(10,fechaNac);

        int id =  Integer.parseInt(label_id_socio.getText());
        preparedStatement.setInt(11, id);

        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Socio Actualizado");
            jTabbedPane_socios.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Error al Guardar Personal");
            //LimpiarCajas();
        }

        connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btn_actualizarSocioActionPerformed

    private void btn_guardarNuevoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarNuevoSocioActionPerformed
        try {
            
            Date fechaActual = new Date();
            Calendar fecha = Calendar.getInstance();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            int hora = fecha.get(Calendar.HOUR_OF_DAY);
            int minuto = fecha.get(Calendar.MINUTE);
            int segundo = fecha.get(Calendar.SECOND);
            String anio= Integer.toString(año);

            int numCat=0;
            String cat = ComboBoxCategoriaSocio.getSelectedItem().toString().toLowerCase();
            switch(cat){
                case "profesional":
                numCat=01;
                break;
                case "idoneo":
                numCat=02;
                break;
                case "auxiliar informatico":
                numCat=03;
                break;
            }
            
            String numCateg = Integer.toString(numCat);
            String dniSocioString = txtDNISocio.getText();
            int dniSocio = Integer.parseInt(txtDNISocio.getText());
            int telefono = Integer.parseInt(txtTelefonoSocio.getText());
            String leg = dniSocioString+"/"+numCateg+"/"+anio;//el legajo es una concatencacion de el num. de categoria y el año + Dni + año
            System.out.println("leg: "+leg);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechaNac = formatoFecha.format(fechaNac_socio.getDate());
            System.out.println(txtNombreSocio.getText() + "\n" + txtApellidoSocio.getText() + "\n" +  dniSocio + "\n" +  telefono + "\n" + 
                    txtDomicilioSocio.getText() + "\n" +   "\n" +  ComboBoxCategoriaSocio.getSelectedItem().toString() + "\n" + 
                    txtCuilSocio.getText() + "\n" +  txtEmailSocio.getText() + "\n" +  leg + "\n" +  fechaNac );
            
            // s.guardar(txtNombreSocio.getText(), txtApellidoSocio.getText(), dniSocio, telefono, 
            // txtDomicilioSocio.getText(), ComboBoxCategoriaSocio.getSelectedItem().toString(), 
            // txtCuilSocio.getText(), txtEmailSocio.getText(), leg, fechaNac);
            
            connection = Conexion.Cadena();
            preparedStatement = connection.prepareStatement("INSERT INTO socio (legajo_socio, nombre, apellido, dni, telefono, domicilio, categoria, cuilcuit, email) VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, leg);
            preparedStatement.setString(2, txtNombreSocio.getText());
            preparedStatement.setString(3, txtApellidoSocio.getText());
            preparedStatement.setInt(4, dniSocio);
            preparedStatement.setInt(5, telefono);
            preparedStatement.setString(6, txtDomicilioSocio.getText());
            preparedStatement.setString(7, ComboBoxCategoriaSocio.getSelectedItem().toString());
            preparedStatement.setString(8, txtCuilSocio.getText());
            preparedStatement.setString(9, txtEmailSocio.getText());
            //preparedStatement.setString(10,fechaNacimiento);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Socio Guardado");

                //registro de actividad
                Usuario user = new Usuario();
                String nombreUsuario = user.getNombreLogueado();
                String contraseña =  user.getContraseñaLogueada();
                user = user.buscarUsuario(nombreUsuario, contraseña);
                int id_desc=2;
                Registro reg= new Registro();
                reg.gaurdarReg(user.getId(), id_desc);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Personal");
                //LimpiarCajas();
            }

            connection.close();
            

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btn_guardarNuevoSocioActionPerformed
    
//VALIDACIONES:
    private void txtTelefonoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoSocioActionPerformed
        
    }//GEN-LAST:event_txtTelefonoSocioActionPerformed

    private void txtDNISocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNISocioKeyTyped
        //validar campo dni
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtDNISocioKeyTyped

    private void txtNombreSocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSocioKeyTyped
        //validar el campo Nombre:
        char n = evt.getKeyChar();
        if ((n < 'a' || n > 'z') && (n < 'A' || n > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreSocioKeyTyped

    private void txtNombreSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSocioActionPerformed
        
    }//GEN-LAST:event_txtNombreSocioActionPerformed

    private void txtApellidoSocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoSocioKeyTyped

        //validar el campo Apellido:
        char a = evt.getKeyChar();
        if ((a < 'a' || a > 'z') && (a < 'A' || a > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoSocioKeyTyped

    private void ComboBoxCategoriaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoriaSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCategoriaSocioActionPerformed

    private void btn_BuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarSocioActionPerformed
        try {
            Datos.Socio nuevoSocio = new Socio();
            nuevoSocio=nuevoSocio.BuscarX(txtBuscarSocio.getText());

            labelNombre.setText(nuevoSocio.getNombre());
            labelApellido.setText(nuevoSocio.getApellido());
            labelLegajo.setText(nuevoSocio.getLegajo_socio());
            String dni = Integer.toString(nuevoSocio.getDni());
            LabelDNI.setText(dni);
            LabelDom.setText(nuevoSocio.getDomicilio());
            labelCategoria.setText(nuevoSocio.getCategoria());
            labelCuil.setText(nuevoSocio.getCuilcuit());
            labelEmail.setText(nuevoSocio.getEmail());
            labelEstado.setText(nuevoSocio.getEstado());
            labelEstado_pago.setText(nuevoSocio.getEstado_pago());
            String tel = Integer.toString(nuevoSocio.getTelefono());
            labelTel.setText(tel);
            labelFechaNacc.setText(nuevoSocio.getFechaNac());
            label_id_socio.setVisible(false);
            String id = Integer.toString(nuevoSocio.getId_socio());
            label_id_socio.setText(id);

            Date fechaActual = new Date();
            System.out.println(fechaActual);
            Calendar fecha = Calendar.getInstance();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            int hora = fecha.get(Calendar.HOUR_OF_DAY);
            int minuto = fecha.get(Calendar.MINUTE);
            int segundo = fecha.get(Calendar.SECOND);

            System.out.println("Fecha Actual: " + dia + "/" + (mes) + "/" + año);
            System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);
            System.out.println("-------------Fecha desglosada----------------");
            System.out.println("El año es: " + año);
            System.out.println("El mes es: " + mes);
            System.out.println("El día es: " + dia);
            System.out.printf("La hora es: %02d %n", hora);
            System.out.printf("El minuto es: %02d %n", minuto);
            System.out.printf("El segundo es: %02d %n", segundo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_BuscarSocioActionPerformed

    private void editar_socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_socioActionPerformed
        String legajo = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(),0).toString();
        String apellido = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(),1).toString();
        String nombre = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(),2).toString();
        String dni = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(),3).toString();
        String estado = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(),4).toString();
        System.out.println(legajo+apellido+nombre+dni+estado+"\n");
        //MenuPrincipal menu = new MenuPrincipal();
        //Editar_socio ventana = new Editar_socio();
        //menu.pane1.add(ventana);
        //ventana.setVisible(true);

        txtNombreSocio1.setEnabled(true);
        txtApellidoSocio1.setEnabled(true);
        txtDNISocio1.setEnabled(true);
        txtTelefonoSocio1.setEnabled(true);
        txtDomicilioSocio1.setEnabled(true);
        ComboBoxCategoriaSocio1.setEnabled(true);
        txtCuilSocio1.setEnabled(true);
        txtEmailSocio1.setEnabled(true);
        fechaNac_socio1.setEnabled(true);
        btn_actualizarSocio.setEnabled(true);

        txtNombreSocio1.setText(labelNombre.getText());
        txtApellidoSocio1.setText(labelApellido.getText());
        txtDNISocio1.setText(LabelDNI.getText());
        txtTelefonoSocio1.setText(labelTel.getText());
        txtDomicilioSocio1.setText(LabelDom.getText());
        //ComboBoxCategoriaSocio1.labelCategoria.getText();
        txtCuilSocio1.setText(labelCuil.getText());
        txtEmailSocio1.setText(labelEmail.getText());
        jTabbedPane_socios.setSelectedIndex(2);

        fechaNac_editar.setText(labelFechaNacc.getText());

        //        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //        String dateInString = labelFechaNacc.getText();
        //
        //        String fechaNac = formatter.format(dateInString);
        //
        //        Date date;
        //        try {
            //            date = formatter.parse(dateInString);
            //            System.out.println(date);
            //            System.out.println(formatter.format(date));
            //            fechaNac_socio1.setDate(date);
            //        } catch (ParseException ex) {
            //            Logger.getLogger(gestionarSocios.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_editar_socioActionPerformed

    private void Tabla_SociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SociosMouseExited

    }//GEN-LAST:event_Tabla_SociosMouseExited

    private void Tabla_SociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SociosMouseClicked
        editar_socio.setEnabled(true);
        String legajo = Tabla_Socios.getValueAt(Tabla_Socios.getSelectedRow(), 0).toString();
        Datos.Socio nuevoSocio = new Socio();
        try {
            nuevoSocio = nuevoSocio.BuscarX(legajo);
            //System.out.println(legajo+"\n");
            labelNombre.setText(nuevoSocio.getNombre());
            labelApellido.setText(nuevoSocio.getApellido());
            labelLegajo.setText(nuevoSocio.getLegajo_socio());
            String dni = Integer.toString(nuevoSocio.getDni());
            LabelDNI.setText(dni);
            LabelDom.setText(nuevoSocio.getDomicilio());
            labelCategoria.setText(nuevoSocio.getCategoria());
            labelCuil.setText(nuevoSocio.getCuilcuit());
            labelEmail.setText(nuevoSocio.getEmail());
            labelEstado.setText(nuevoSocio.getEstado());
            labelEstado_pago.setText(nuevoSocio.getEstado_pago());
            String tel = Integer.toString(nuevoSocio.getTelefono());
            labelTel.setText(tel);
            labelFechaNacc.setText(nuevoSocio.getFechaNac());
            label_id_socio.setVisible(false);
            String id = Integer.toString(nuevoSocio.getId_socio());
            label_id_socio.setText(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(gestionarSocios.class
                .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tabla_SociosMouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCategoriaSocio;
    private javax.swing.JComboBox<String> ComboBoxCategoriaSocio1;
    private javax.swing.JLabel LabelDNI;
    private javax.swing.JLabel LabelDom;
    public org.jdesktop.swingx.JXTable Tabla_Socios;
    public javax.swing.JButton btnListar;
    public javax.swing.JButton btn_BuscarSocio;
    private javax.swing.JButton btn_actualizarSocio;
    private javax.swing.JButton btn_guardarNuevoSocio;
    public javax.swing.JButton editar_socio;
    private javax.swing.JLabel fechaNac_editar;
    private com.toedter.calendar.JDateChooser fechaNac_socio;
    private com.toedter.calendar.JDateChooser fechaNac_socio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Edtar_socio;
    public javax.swing.JPanel jPanel_socios;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane_socios;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCuil;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelEstado_pago;
    private javax.swing.JLabel labelFechaNacc;
    private javax.swing.JLabel labelLegajo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel label_id_socio;
    private javax.swing.JTextField txtApellidoSocio;
    private javax.swing.JTextField txtApellidoSocio1;
    public javax.swing.JTextField txtBuscarSocio;
    private javax.swing.JTextField txtCuilSocio;
    private javax.swing.JTextField txtCuilSocio1;
    private javax.swing.JTextField txtDNISocio;
    private javax.swing.JTextField txtDNISocio1;
    private javax.swing.JTextField txtDomicilioSocio;
    private javax.swing.JTextField txtDomicilioSocio1;
    private javax.swing.JTextField txtEmailSocio;
    private javax.swing.JTextField txtEmailSocio1;
    private javax.swing.JTextField txtNombreSocio;
    private javax.swing.JTextField txtNombreSocio1;
    private javax.swing.JTextField txtTelefonoSocio;
    private javax.swing.JTextField txtTelefonoSocio1;
    // End of variables declaration//GEN-END:variables

}
