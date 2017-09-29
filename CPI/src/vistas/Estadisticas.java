package vistas;

import Datos.Conexion;
import Datos.Socio;
//import com.sun.imageio.plugins.png.RowFilter;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Anahi Silvana Brao
 */
public class Estadisticas extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    private Statement sentencia;
    private ResultSet rsDatos;

    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;//para recibir resultados de una cosulta
    Socio ES = new Socio();

    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buscarTodo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnListarSocios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Socios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTotalRegistros = new javax.swing.JTextField();
        txtTotalActivo = new javax.swing.JTextField();
        labelActivos = new javax.swing.JLabel();
        labelAspirantes = new javax.swing.JLabel();
        txtTotalAspirante = new javax.swing.JTextField();
        labelMorosos = new javax.swing.JLabel();
        txtTotalMoroso = new javax.swing.JTextField();
        cbxOpcion = new javax.swing.JComboBox<>();
        buscarPrueba = new javax.swing.JButton();
        cbxComboCatEst = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalProf = new javax.swing.JTextField();
        txtTotalIdoneo = new javax.swing.JTextField();
        txtTotalAInfor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Estadisticas de Socio");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Estadisticas");

        buscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTodoActionPerformed(evt);
            }
        });
        buscarTodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarTodoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Buscar por:");

        btnListarSocios.setText("Listar");
        btnListarSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarSociosActionPerformed(evt);
            }
        });

        tabla_Socios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_Socios);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Total Registros = ");

        txtTotalRegistros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalRegistros.setEnabled(false);
        txtTotalRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalRegistrosActionPerformed(evt);
            }
        });

        txtTotalActivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalActivo.setEnabled(false);

        labelActivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelActivos.setText("Total Activos = ");

        labelAspirantes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAspirantes.setText("Total Aspirantes =");

        txtTotalAspirante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalAspirante.setEnabled(false);
        txtTotalAspirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAspiranteActionPerformed(evt);
            }
        });

        labelMorosos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMorosos.setText("Total Morosos =");

        txtTotalMoroso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalMoroso.setEnabled(false);
        txtTotalMoroso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMorosoActionPerformed(evt);
            }
        });

        cbxOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Año de Ingreso", "Categoria", "Estado", " " }));
        cbxOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxOpcionItemStateChanged(evt);
            }
        });
        cbxOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOpcionActionPerformed(evt);
            }
        });

        buscarPrueba.setText("Buscar");
        buscarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPruebaActionPerformed(evt);
            }
        });
        buscarPrueba.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarPruebaKeyPressed(evt);
            }
        });

        cbxComboCatEst.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxComboCatEstItemStateChanged(evt);
            }
        });
        cbxComboCatEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComboCatEstActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Total Profesional =");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total Idoneo =");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Aux. Informatico =");

        txtTotalProf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalProf.setEnabled(false);

        txtTotalIdoneo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalIdoneo.setEnabled(false);
        txtTotalIdoneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalIdoneoActionPerformed(evt);
            }
        });

        txtTotalAInfor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalAInfor.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnListarSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalIdoneo)
                            .addComponent(txtTotalProf)
                            .addComponent(txtTotalAInfor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(cbxComboCatEst, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buscarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelAspirantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMorosos, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(labelActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalMoroso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAspirante, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxComboCatEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarPrueba))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarSocios))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAspirante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAspirantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalIdoneo, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMorosos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMoroso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalAInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(25, 90, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void buscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodoActionPerformed

    }//GEN-LAST:event_buscarTodoActionPerformed

    private void buscarTodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTodoKeyPressed

        // Este es el metodo que funciona bien!!!!!!!!!
        //    String[] titulos = {"id_socio", "legajo_socio", "nombre", "apellido", "dni", "telefono", "domicilio",
        //      "estado_pago", "categoria", "estado", "cuilcuit", "email", "fechaNac"};
        //categoria: 1 = profesional; 2 = Idoneo; 3 = Auxiliar Informatico.
        //estado: 1 = Activo; 2 = Aspirante; 3 = Moroso.
        /*String[] registros = new String[50];

        String sql = "SELECT *FROM socio WHERE id_socio LIKE '%" + buscarTodo.getText() + "%'"
                + "OR legajo_socio LIKE '%" + buscarTodo.getText() + "%'"
                + "OR nombre LIKE '%" + buscarTodo.getText() + "%'"
                + "OR apellido LIKE '%" + buscarTodo.getText() + "%'"
                + "OR dni LIKE '%" + buscarTodo.getText() + "%'"
                + "OR telefono LIKE '%" + buscarTodo.getText() + "%'"
                + "OR domicilio LIKE '%" + buscarTodo.getText() + "%'"
                + "OR estado_pago LIKE '%" + buscarTodo.getText() + "%'"
                + "OR categoria LIKE '%" + buscarTodo.getText() + "%'"
                + "OR estado LIKE '%" + buscarTodo.getText() + "%'"
                + "OR cuilcuit LIKE '%" + buscarTodo.getText() + "%'"
                + "OR email LIKE '%" + buscarTodo.getText() + "%'"
                + "OR fechaNac LIKE '%" + buscarTodo.getText() + "%'";

        model = new DefaultTableModel(null, titulos);

        try {
            connection = Conexion.Cadena();
            sentencia = (Statement) connection.createStatement();
            rsDatos = sentencia.executeQuery(sql);

            while (rsDatos.next()) {

                registros[0] = rsDatos.getString("id_socio");
                registros[1] = rsDatos.getString("legajo_socio");
                registros[2] = rsDatos.getString("nombre");
                registros[3] = rsDatos.getString("apellido");
                registros[4] = rsDatos.getString("dni");
                registros[5] = rsDatos.getString("telefono");
                registros[6] = rsDatos.getString("domicilio");
                registros[7] = rsDatos.getString("estado_pago");
                registros[8] = rsDatos.getString("categoria");
                registros[9] = rsDatos.getString("estado");
                registros[10] = rsDatos.getString("cuilcuit");
                registros[11] = rsDatos.getString("email");
                registros[12] = rsDatos.getString("fechaNac");
                model.addRow(registros);
            }

            tabla_Socios.setModel(model);

            contarCategoriaSocios();
            contarEstadoSocios();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
    }//GEN-LAST:event_buscarTodoKeyPressed

    public void limpiarCampos1() {

        txtTotalAspirante.setText(null);
        txtTotalActivo.setText(null);
        txtTotalMoroso.setText(null);
        buscarTodo.setText(null);
        txtTotalRegistros.setText(null);
    }

    public void limpiarCampos2() {

        txtTotalProf.setText(null);
        txtTotalIdoneo.setText(null);
        txtTotalAInfor.setText(null);
        buscarTodo.setText(null);
        txtTotalRegistros.setText(null);
    }

    public void graficarEstado() {

        String TAct = txtTotalActivo.getText();
        String TAsp = txtTotalAspirante.getText();
        String TMor = txtTotalMoroso.getText();

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Aspirante", new Integer(TAsp));
        pieDataset.setValue("Activo", new Integer(TAct));
        pieDataset.setValue("Moroso", new Integer(TMor));

        JFreeChart chart = ChartFactory.createPieChart3D("Estado de los Socios", pieDataset, true, true, true);
        PiePlot3D p = (PiePlot3D) chart.getPlot();

        ChartFrame frame = new ChartFrame("Grafico de Torta", chart);
        frame.setVisible(true);
        frame.setSize(700, 500);
    }

    public void graficarCategoria() {

        String TProf = txtTotalProf.getText();
        String TId = txtTotalIdoneo.getText();
        String TAInf = txtTotalAInfor.getText();

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Profesional", new Integer(TProf));
        pieDataset.setValue("Idoneo", new Integer(TId));
        pieDataset.setValue("Auxiliar Informatico", new Integer(TAInf));

        JFreeChart chart = ChartFactory.createPieChart3D("Categoria de los Socios", pieDataset, true, true, true);
        PiePlot3D p = (PiePlot3D) chart.getPlot();

        ChartFrame frame = new ChartFrame("Grafico de Torta", chart);
        frame.setVisible(true);
        frame.setSize(700, 500);
    }

    private void btnListarSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarSociosActionPerformed

        String[] titulos = {"id_socio", "legajo_socio", "nombre", "apellido", "dni",
            //"telefono", "domicilio", "estado_pago", 
            "categoria", "estado",};
        //"cuilcuit", "email", "fechaNac"};

        String[] registros = new String[50];
        String sql = "SELECT *FROM socio";

        model = new DefaultTableModel(null, titulos);

        try {
            Connection cn = Conexion.Cadena();
            sentencia = (Statement) cn.createStatement();
            rsDatos = sentencia.executeQuery(sql);

            while (rsDatos.next()) {
                registros[0] = rsDatos.getString("id_socio");
                registros[1] = rsDatos.getString("legajo_socio");
                registros[2] = rsDatos.getString("nombre");
                registros[3] = rsDatos.getString("apellido");
                registros[4] = rsDatos.getString("dni");
                //     registros[5] = rsDatos.getString("telefono");
                //     registros[6] = rsDatos.getString("domicilio");
                //    registros[7] = rsDatos.getString("estado_pago");
                registros[5] = rsDatos.getString("categoria");
                registros[6] = rsDatos.getString("estado");
                //    registros[10] = rsDatos.getString("cuilcuit");
                //    registros[11] = rsDatos.getString("email");
                //   registros[12] = rsDatos.getString("fechaNac");

                model.addRow(registros);

                //Cuenta la filas de tabla de los socios
                for (int x = 0; x <= tabla_Socios.getRowCount(); x++) {
                    txtTotalRegistros.setText("" + x);
                }
            }

            tabla_Socios.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, closable, title, HEIGHT);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarSociosActionPerformed

    private void txtTotalRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalRegistrosActionPerformed

    }//GEN-LAST:event_txtTotalRegistrosActionPerformed

    private void buscarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPruebaActionPerformed

        String[] titulos = {"id_socio", "legajo_socio", "nombre", "apellido", "dni",
            // "telefono", "domicilio","estado_pago", 
            "categoria", "estado"};
        //"cuilcuit", "email", "fechaNac"};

        String[] registros = new String[50];

        String sql = "SELECT *FROM socio WHERE id_socio LIKE '%" + buscarTodo.getText() + "%'"
                + "OR legajo_socio LIKE '%" + buscarTodo.getText() + "%'"
                + "OR nombre LIKE '%" + buscarTodo.getText() + "%'"
                + "OR apellido LIKE '%" + buscarTodo.getText() + "%'"
                + "OR dni LIKE '%" + buscarTodo.getText() + "%'"
                //    + "OR telefono LIKE '%" + buscarTodo.getText() + "%'"
                //    + "OR domicilio LIKE '%" + buscarTodo.getText() + "%'"
                //    + "OR estado_pago LIKE '%" + buscarTodo.getText() + "%'"
                + "OR categoria LIKE '%" + buscarTodo.getText() + "%'"
                + "OR estado LIKE '%" + buscarTodo.getText() + "%'";
        //   + "OR cuilcuit LIKE '%" + buscarTodo.getText() + "%'"
        //    + "OR email LIKE '%" + buscarTodo.getText() + "%'"
        //    + "OR fechaNac LIKE '%" + buscarTodo.getText() + "%'";

        model = new DefaultTableModel(null, titulos);

        try {
            connection = Conexion.Cadena();
            sentencia = (Statement) connection.createStatement();
            rsDatos = sentencia.executeQuery(sql);

            while (rsDatos.next()) {

                registros[0] = rsDatos.getString("id_socio");
                registros[1] = rsDatos.getString("legajo_socio");
                registros[2] = rsDatos.getString("nombre");
                registros[3] = rsDatos.getString("apellido");
                registros[4] = rsDatos.getString("dni");
                //  registros[5] = rsDatos.getString("telefono");
                //  registros[6] = rsDatos.getString("domicilio");
                // registros[7] = rsDatos.getString("estado_pago");
                registros[5] = rsDatos.getString("categoria");
                registros[6] = rsDatos.getString("estado");
                //  registros[10] = rsDatos.getString("cuilcuit");
                //  registros[11] = rsDatos.getString("email");
                // registros[12] = rsDatos.getString("fechaNac");
                model.addRow(registros);
            }

            tabla_Socios.setModel(model);

            String item = (String) cbxOpcion.getSelectedItem();
            int valor = item.compareTo("Año de Ingreso");
            int TP = 0;
            int TI = 0;
            int TAI =0;
            //  System.out.println("valor" + valor);
            for (int x = 0; x < tabla_Socios.getRowCount(); x++) {
                if (valor == 0) {
                    String cat = (String) tabla_Socios.getValueAt(x, 5);
                    System.out.println("categoria: " + cat);
                    if (cat.equals("Profesional")) {
                        txtTotalProf.setText("" + TP++);
                    } else {
                        if (cat.equals("Idoneo")) {
                            txtTotalIdoneo.setText("" + TI++);
                        } else {
                            if (cat.equals("Auxiliar Informatico")) {
                                txtTotalAInfor.setText("" + TAI);
                            }
                        }
                    }

                    // contarAño(cat);
                } else {
                    System.out.println("no funciona ");
                }

                //     txtTotalRegistros.setText("" + x);
            }
            if ((buscarTodo.getText().equals("Aspirante")) || (buscarTodo.getText().equals("Activo")) || (buscarTodo.getText().equals("Moroso"))) {
                contarEstadoSocios();
                graficarEstado();
                limpiarCampos2();

            } else {
                if ((buscarTodo.getText().equals("Profesional")) || (buscarTodo.getText().equals("Idoneo")) || (buscarTodo.getText().equals("Auxiliar Informatico"))) {
                    contarCategoriaSocios();
                    graficarCategoria();
                    limpiarCampos1();
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarPruebaActionPerformed

    //Para Combobox Anidados
    public String[] getOpcion(String opc) {

        String[] opciones = new String[3];

        if (opc.equalsIgnoreCase("Categoria")) {

            opciones[0] = "Profesional";
            opciones[1] = "Idoneo";
            opciones[2] = "Auxiliar Informatico";
        }

        if (opc.equalsIgnoreCase("Estado")) {

            opciones[0] = "Aspirante";
            opciones[1] = "Activo";
            opciones[2] = "Moroso";
        }
        //agregado desde aqui
        if (opc.equalsIgnoreCase("Año de Ingreso")) {

            opciones[0] = "2015";
            opciones[1] = "2016";
            opciones[2] = "2017";

        }
        return opciones;
    }

    private void cbxOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxOpcionItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cbxOpcion.getSelectedIndex() > 0) {
                this.cbxComboCatEst.setModel(new DefaultComboBoxModel(this.getOpcion(this.cbxOpcion.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cbxOpcionItemStateChanged

    //Pasa la opcion seleccionada en el cbx al jtext
    private void cbxComboCatEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComboCatEstActionPerformed

        buscarTodo.setText(cbxComboCatEst.getSelectedItem().toString());
    }//GEN-LAST:event_cbxComboCatEstActionPerformed

    private void buscarPruebaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPruebaKeyPressed

    }//GEN-LAST:event_buscarPruebaKeyPressed

    private void cbxComboCatEstItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxComboCatEstItemStateChanged

    }//GEN-LAST:event_cbxComboCatEstItemStateChanged

    private void txtTotalMorosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMorosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalMorosoActionPerformed

    private void txtTotalIdoneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalIdoneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalIdoneoActionPerformed

    private void txtTotalAspiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAspiranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAspiranteActionPerformed

    private void cbxOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOpcionActionPerformed

    }//GEN-LAST:event_cbxOpcionActionPerformed

    //Parece que no hace falta :/
    /*public String obtenerAñoIngreso(String leg) {

        // String DNI = "34994331";
        // String cat = "profesional";
        // String AI = "2017";
        String legajo = "leg" + leg;
        System.out.println("Legajo sin Split:   " + leg + "/n");
        String[] arrayLeg = legajo.split("/");

// En este momento tenemos un array en el que cada elemento es un color.
        for (int i = 0; i < arrayLeg.length; i++) {

            System.out.println(arrayLeg[i]);
        }
        
        String anio = arrayLeg[2];
        System.out.println(" anio de ingreso: " + anio);
        
        return anio;

    }*/
    public void contarAño(String cat) {

        for (int x = 0; x <= tabla_Socios.getRowCount(); x++) {
            if (cat.equals("Profesional")) {
                txtTotalProf.setText("" + x);
            }
        }
    }

    public void contarEstadoSocios() {

        for (int x = 0; x <= tabla_Socios.getRowCount(); x++) {
            if (buscarTodo.getText().equals("Aspirante")) {
                txtTotalAspirante.setText("" + x);
            } else {
                if (buscarTodo.getText().equals("Activo")) {
                    txtTotalActivo.setText("" + x);
                } else {
                    if (buscarTodo.getText().equals("Moroso")) {
                        txtTotalMoroso.setText("" + x);
                    }
                }
            }
            txtTotalRegistros.setText("" + x);
        }
    }

    public void contarCategoriaSocios() {

        for (int x = 0; x <= tabla_Socios.getRowCount(); x++) {
            if (buscarTodo.getText().equals("Profesional")) {
                txtTotalProf.setText("" + x);
            } else {
                if (buscarTodo.getText().equals("Idoneo")) {
                    txtTotalIdoneo.setText("" + x);
                } else {
                    if (buscarTodo.getText().equals("Auxiliar Informatico")) {
                        txtTotalAInfor.setText("" + x);
                    }
                }
            }
            txtTotalRegistros.setText("" + x);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarSocios;
    private javax.swing.JButton buscarPrueba;
    private javax.swing.JTextField buscarTodo;
    private javax.swing.JComboBox<String> cbxComboCatEst;
    private javax.swing.JComboBox<String> cbxOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelActivos;
    private javax.swing.JLabel labelAspirantes;
    private javax.swing.JLabel labelMorosos;
    private javax.swing.JTable tabla_Socios;
    private javax.swing.JTextField txtTotalAInfor;
    private javax.swing.JTextField txtTotalActivo;
    private javax.swing.JTextField txtTotalAspirante;
    private javax.swing.JTextField txtTotalIdoneo;
    private javax.swing.JTextField txtTotalMoroso;
    private javax.swing.JTextField txtTotalProf;
    private javax.swing.JTextField txtTotalRegistros;
    // End of variables declaration//GEN-END:variables
}
