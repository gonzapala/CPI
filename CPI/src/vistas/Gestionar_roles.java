/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Datos.Permiso;
import Datos.Rol;
import Datos.Usuario;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author Gonzalo
 */
public class Gestionar_roles extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gestionar_usuarios
     */
    Usuario modelo = new Usuario();
    public Gestionar_roles() {
        initComponents();
    }
    
    String permisos = "";
    
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_nombreRol = new javax.swing.JTextField();
        text_descRol = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new org.jdesktop.swingx.JXTable();
        btnListar = new javax.swing.JButton();
        editar_socio = new javax.swing.JButton();
        btnListar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelPermisos = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gestionar Roles");

        jLabel2.setText("Nombre ");

        jLabel3.setText("Descripcion");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nuevo Rol");

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_usuarios);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checklist.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        editar_socio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compose.png"))); // NOI18N
        editar_socio.setText("Editar");
        editar_socio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editar_socio.setEnabled(false);
        editar_socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_socioActionPerformed(evt);
            }
        });

        btnListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png"))); // NOI18N
        btnListar1.setText("Eliminar");
        btnListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Permisos");

        jButton2.setText("Cargar permisos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jList1);

        jScrollPane2.setViewportView(jScrollPane4);

        labelPermisos.setText("Permisos: ");

        jButton3.setText("Agregar permiso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnListar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editar_socio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListar1))
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(text_descRol, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_nombreRol, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(65, 65, 65)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(labelPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnListar)
                        .addComponent(editar_socio)
                        .addComponent(btnListar1))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txt_nombreRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(text_descRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPermisos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Rol nuevoR = new Rol();
        nuevoR.setNombre(txt_nombreRol.getText());
        nuevoR.setDescripcion(text_descRol.getText());
        
        try {
            
            nuevoR.guardarnuevoR(nuevoR);
            String nombre_rol=nuevoR.getNombre();
            nuevoR=nuevoR.buscarRolNombre(nombre_rol);
            Permiso nuevoper= new Permiso();
            if(permisos.charAt(0)==';'){
                permisos= permisos.substring(1, permisos.length());
            }
            String permisosRol []=permisos.split(";");

            for (int i = 0; i < permisosRol.length; i++) {
                System.out.println(i+permisosRol[i]);
                nuevoper=nuevoper.buscarpermisoNombre(permisosRol[i]);
                nuevoR.guardarRol_permiso(nuevoR.getId_rol(),nuevoper.getId_permiso());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gestionar_roles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gestionar_roles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editar_socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_socioActionPerformed
       
    }//GEN-LAST:event_editar_socioActionPerformed
    public void windowOpened(WindowEvent e){
//        Rol roles=new Rol();    
//        ArrayList listaRoles=roles.listar();
//        String rol;
//        int numeroRegistros= roles.listar().size();
//        System.out.println("cantidad de roles: "+numeroRegistros);
//        for ( int i=0; i<numeroRegistros;i++){
//                rol=roles.listar().get(i).getNombre();
//                combo_tipoUsuario.addItem(rol);
//        }
      }
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       try {
            // TODO add your handling code here:
            LlenarTabla(tabla_usuarios);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gestionar_Resoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListar1ActionPerformed
       
    }//GEN-LAST:event_btnListar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel modeloLista=new DefaultListModel(); 
        Permiso permisos=new Permiso();    
        ArrayList<Permiso> listaPermisos=permisos.listar();
        //System.out.println("cantidad de permisos: "+listaPermisos.size());
        
        for ( int i=0; i<listaPermisos.size();i++){
                //System.out.println(listaPermisos.get(i).getNombre());                
                modeloLista.addElement(listaPermisos.get(i).getNombre());
        }
        jList1.setModel(modeloLista);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String selección=jList1.getSelectedValue();

        permisos =permisos+";"+selección;
        String labelper= labelPermisos.getText();
        labelPermisos.setText(labelper+" "+selección);
        System.out.println(permisos);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void LlenarTabla(JXTable tabla) throws ClassNotFoundException{
        
        DefaultTableModel modeloT = new DefaultTableModel();
        tabla.setModel(modeloT);
        
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Usuario");
        modeloT.addColumn("Tipo");
        
        Object[] columna = new Object[3];
        
        int numeroRegistros= modelo.listar().size();
        //        System.out.println(numeroRegistros);
        for ( int i=0; i<numeroRegistros;i++){
                columna[0]=modelo.listar().get(i).getNombre();
                columna[1]=modelo.listar().get(i).getContraseña();
                columna[2]=modelo.listar().get(i).getId_rol();

                modeloT.addRow(columna);
        }
        
    }//FIn-LlenarTabla

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnListar;
    public javax.swing.JButton btnListar1;
    public javax.swing.JButton editar_socio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelPermisos;
    private org.jdesktop.swingx.JXTable tabla_usuarios;
    private javax.swing.JTextField text_descRol;
    private javax.swing.JTextField txt_nombreRol;
    // End of variables declaration//GEN-END:variables

    void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
