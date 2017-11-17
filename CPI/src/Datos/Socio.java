/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.Estadisticas;
import vistas.Gestionar_Pagos;
import vistas.Gestionar_Resoluciones;

/**
 *
 * @author Gonzalo
 */
public class Socio {
    private int id_socio;
    private String legajo_socio;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String domicilio;
    private String estado_pago;
    private String categoria;
    private String estado;
    private String cuilcuit;
    private String email;
    private String fechaNac;
    
    private Statement sentencia;
    private ResultSet rsDatos;
    Connection connection;//para la Conexion
    PreparedStatement preparedStatement;//para preparar las querys
    ResultSet resultSet;//para recibir resultados de una cosulta
    public Socio(){
    }
    
    public Socio (int id, String leg, String nom, String ape, int dniS,int tel, String dom, String estadoP,String cat,String est, String cuil,String mail,String fechnac ){
        this.id_socio=id;
        this.legajo_socio=leg;
        this.nombre=nom;
        this.apellido=ape;
        this.dni=dniS;
        this.telefono=tel;
        this.domicilio=dom;
        this.estado_pago=estadoP;
        this.categoria=cat;
        this.estado=est;
        this.cuilcuit=cuil;
        this.email=mail;
        this.fechaNac=fechnac;   
        
        
    }
    
    
//    static public void assertEquals(String message, Object expected, Object actual) {
//    if (expected == null && actual == null)
//        System.out.println("son nulos");
//        return;
//    
//    }

    /**
     * @return the id_socio
     */
    public int getId_socio() {
        return id_socio;
    }
    
    public void setID(int id) {
        this.id_socio = id;
    }

    /**
     * @return the legajo_socio
     */
    public String getLegajo_socio() {
        return legajo_socio;
    }

    /**
     * @param legajo_socio the legajo_socio to set
     */
    public void setLegajo_socio(String legajo_socio) {
        this.legajo_socio = legajo_socio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the estado_pago
     */
    public String getEstado_pago() {
        return estado_pago;
    }

    /**
     * @param estado_pago the estado_pago to set
     */
    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cuilcuit
     */
    public String getCuilcuit() {
        return cuilcuit;
    }

    /**
     * @param cuilcuit the cuilcuit to set
     */
    public void setCuilcuit(String cuilcuit) {
        this.cuilcuit = cuilcuit;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
//comentario nuevo
    public Socio BuscarX(String Legajo) throws ClassNotFoundException
    {   
        Socio nuevoSocio=new Socio();
        try{
             
            Connection cn = Conexion.Cadena(); 
            String SQL = "SELECT * FROM socio"+ " WHERE legajo_socio ='"+Legajo+"' "; 
            //System.out.println(SQL); 
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            rsDatos = sentencia.executeQuery(SQL); 
            //System.out.println("Correcto"); 
            //cn.commit(); 
             
            String nom,ape,dom,estado_pago,categ,estado,cuilcuit,email, leg,fNac; 
            int dni_socio,tel,idS; 
            if(rsDatos.first()){ 
                idS=rsDatos.getInt("id_socio"); 
                nom=rsDatos.getString("nombre"); 
                ape=rsDatos.getString("apellido"); 
                estado_pago=rsDatos.getString("estado_pago"); 
                categ=rsDatos.getString("categoria"); 
                estado=rsDatos.getString("estado"); 
                cuilcuit=rsDatos.getString("cuilcuit"); 
                email=rsDatos.getString("email"); 
                dni_socio=rsDatos.getInt("dni"); 
                leg=rsDatos.getString("legajo_socio"); 
                tel=rsDatos.getInt("telefono"); 
                dom=rsDatos.getString("domicilio"); 
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd"); 
                fNac = formatoFecha.format(rsDatos.getDate("fechaNac")); 
//                System.out.println(nom); 
//                System.out.println(ape); 
//                System.out.println(categ); 
//                System.out.println(leg); 
//                System.out.println(tel); 
                 
                nuevoSocio.nombre=nom; 
                nuevoSocio.apellido=ape; 
                nuevoSocio.dni=dni_socio; 
                nuevoSocio.estado_pago=estado_pago; 
                nuevoSocio.categoria=categ; 
                nuevoSocio.estado=estado; 
                nuevoSocio.cuilcuit=cuilcuit; 
                nuevoSocio.setLegajo_socio(leg); 
                nuevoSocio.telefono=tel; 
                nuevoSocio.id_socio=idS;                 
                nuevoSocio.setFechaNac(fNac); 
                nuevoSocio.setDomicilio(dom); 
                nuevoSocio.setEmail(email); 
                 
            }else{ 
                System.out.println("es nulo"); 
            } 
             
             
        }  catch (SQLException ex) {
            System.out.println("No Correcto");
            Logger.getLogger(Socio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nuevoSocio;
    }
    
    public Socio mostrarSocios() throws ClassNotFoundException, SQLException{
        Socio socios =new Socio();
        
        Connection cn = Conexion.Cadena();
        String SQL = "SELECT * FROM socio";
        sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rsDatos = sentencia.executeQuery(SQL);
        System.out.println("Correcto");
        return socios;
    }
    
    public void verificarSocios() throws ClassNotFoundException, SQLException{
        Socio socio;
        
        Connection cn = Conexion.Cadena();
        String SQL = "SELECT * FROM socio";
        sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rsDatos = sentencia.executeQuery(SQL);
        while (rsDatos.next()) {                
            socio = new Socio();
            socio.setID(rsDatos.getInt(1));
            socio.setLegajo_socio(rsDatos.getString(2));
            socio.setNombre(rsDatos.getString(3));
            socio.setApellido(rsDatos.getString(4));
            socio.setDni(rsDatos.getInt(5));
            socio.setEstado(rsDatos.getString(10));
            socio.setEstado_pago(rsDatos.getString(8));
            System.out.println(socio.getApellido() +" -> "+ socio.getEstado());
            //verifica estado de pago los socios y cambia el estado
            socio.verificarFechaPago(socio);
            
        }
    }
    
    //Verificar ultima Fecha de Pago y cambia el estado del socio
    public void verificarFechaPago(Socio socio) throws ClassNotFoundException{
        //FECHA ACTUAL
        Calendar fecha = Calendar.getInstance(); 
        int añoActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH) + 1;
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);
        int idSocio = socio.getId_socio();
        
        if(socio.getEstado().compareTo("aspirante")!=0){
            // FECHA QUE DEBE EL SOCIO
            Pago deuda = new Pago();
            deuda = deuda.buscarUltimoPago(idSocio);
            String FechaD = deuda.getFecha();
            String ultFecha = deuda.getFecha();
            String[] parts = ultFecha.split("-");
            String parts1_Año = parts[0];
            String parts2_mes = parts[1];
            String parts3_dia = parts[2];
            int año_ultFecha = Integer.parseInt(parts1_Año);
            int mes_ultFecha = Integer.parseInt(parts2_mes);
            int dia_ultFecha = Integer.parseInt(parts3_dia);

            System.out.println("El mes del ultimo pago es: " + mes_ultFecha + " Año:"+ año_ultFecha);
            System.out.println("El mes actual es: " + mesActual );

            if(año_ultFecha==añoActual){
                if(mesActual>mes_ultFecha){
                    if(diaActual>dia_ultFecha){
                        //moroso
                        Gestionar_Resoluciones nresolucion = new Gestionar_Resoluciones();
                        nresolucion.verfificarPago2(socio.getLegajo_socio());
                        socio.cambiarEstado(socio, 1);
                    }
                }else{
                    //activo
                    Gestionar_Resoluciones nresolucion = new Gestionar_Resoluciones();
                    nresolucion.verfificarPago2(socio.getLegajo_socio());
                    socio.cambiarEstado(socio, 2);
                
                }
            }else{
                if(añoActual > año_ultFecha){
                    //moroso
                    Gestionar_Resoluciones nresolucion = new Gestionar_Resoluciones();
                    nresolucion.verfificarPago2(socio.getLegajo_socio());
                    socio.cambiarEstado(socio, 1);
                }
                //considerar el dia para ver si falta pagar el mes acutal
            }

        }
       
    }
    
    public ArrayList<Socio> listarSocios(){
        ArrayList listaSocio = new ArrayList();
        Socio socio;
        try {
            Connection cn = Conexion.Cadena();
            String SQL = "SELECT * FROM socio";
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery(SQL);
            //System.out.println("Correcto");
            
            while (rsDatos.next()) {                
                socio = new Socio();
                socio.setLegajo_socio(rsDatos.getString(2));
                socio.setNombre(rsDatos.getString(3));
                socio.setApellido(rsDatos.getString(4));
                socio.setDni(rsDatos.getInt(5));
                socio.setEstado(rsDatos.getString(10));
                socio.setEstado_pago(rsDatos.getString(8));
                listaSocio.add(socio);
            }
            
        } catch (Exception e) {
        }
        
        return listaSocio;
    }

    /**
     * @return the fechaNac
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
     
    public void guardar(String nombre, String apellido, int dni, int telefono, String domicilio, String categoria, String cuil, String email, String legajo, String fechaNacimiento) throws ClassNotFoundException, SQLException{
        System.out.println("Guardar");
        try {
            System.out.println("Guardar");
            System.out.println(nombre + "/n" + apellido + "/n" + dni + "/n" + telefono + "/n" + domicilio + "/n" + estado + "/n" + cuil + "/n" + email + "/n" + legajo + "/n" + fechaNacimiento);
            connection = Conexion.Cadena();
            preparedStatement = connection.prepareStatement("INSERT INTO socio (legajo_socio, nombre, apellido, dni, telefono, domicilio, categoria, cuilcuit, email) VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, legajo);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apellido);
            preparedStatement.setInt(4, dni);
            preparedStatement.setInt(5, telefono);
            preparedStatement.setString(6, domicilio);
            preparedStatement.setString(7, categoria);
            preparedStatement.setString(8, cuil);
            preparedStatement.setString(9, email);
            //preparedStatement.setString(10,fechaNacimiento);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Socio Guardado");

                //registro de actividad
//                Usuario user = new Usuario();
//                String nombreUsuario = user.getNombreLogueado();
//                String contraseña =  user.getContraseñaLogueada();
//                user = user.buscarUsuario(nombreUsuario, contraseña);
//                int id_desc=2;
//                Registro reg= new Registro();
//                reg.gaurdarReg(user.getId(), id_desc);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Personal");
                //LimpiarCajas();
            }

            connection.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void cambiarEstado(Socio socioX,int tipo_estado){
        //Estados que puede tener el socio
        //        Aspirante
        //        activo
        //        moroso
        //        suspendido
        //        expulsado
        //        renuncia
        
        //        1 = moroso
        //        2 = activo
        //        3 = suspendido
        //        4 = expulsado
        //        5 = renuncia
        try {
            System.out.println("Entra a cambiar estado");
                Connection connection = Conexion.Cadena();
                int id_socio = socioX.getId_socio();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE socio SET estado = ? WHERE id_socio=?");
                //Ejemplo UPDATE: "UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?");
                    switch(tipo_estado){
                        case 1:
                            socioX.setEstado("moroso");
                            preparedStatement.setString(1, "moroso");
                            preparedStatement.setInt(2, id_socio);
                        break;
                        case 2:
                            socioX.setEstado("activo");
                            preparedStatement.setString(1, "activo");
                            preparedStatement.setInt(2, id_socio);
                        break;
                        case 3:
                            socioX.setEstado("suspendido");
                            preparedStatement.setString(1, "suspendido");
                            preparedStatement.setInt(2, id_socio);
                        break;
                        case 4:
                            socioX.setEstado("expulsado");
                            preparedStatement.setString(1, "expulsado");
                            preparedStatement.setInt(2, id_socio);
                        break;    
                        case 5:
                            socioX.setEstado("renuncia ");
                            preparedStatement.setString(1, "renuncia");
                            preparedStatement.setInt(2, id_socio);
                        break; 
                }
               
                int res = preparedStatement.executeUpdate();
                if (res > 0) {
                    System.out.println("Nuevo Estado: "+socioX.getEstado()+"\n");
                    System.out.println("Socio Actualizado: "+socioX.getId_socio()+"\n");
                    //JOptionPane.showMessageDialog(null, "Socio Actualizado: "+socioX.getId_socio());
                    //LimpiarCajas();
                } else {
                    System.out.println("Error al Actualizar Socio\n");
                    //JOptionPane.showMessageDialog(null, "Error al Actualizar Socio");
                    //LimpiarCajas();
                }

                connection.close();
            
            
        } catch (Exception e) {
        }
        
    }
    
    public DefaultTableModel buscarSocioporFiltro(DefaultTableModel model, String input_filtroSocios){
        String[] registros = new String[50];
        String sql = "SELECT *FROM socio WHERE id_socio LIKE '%" +  input_filtroSocios + "%'"
                + "OR legajo_socio LIKE '%" +  input_filtroSocios+ "%'"
                + "OR nombre LIKE '%" +  input_filtroSocios + "%'"
                + "OR apellido LIKE '%" +  input_filtroSocios + "%'"
                + "OR dni LIKE '%" +  input_filtroSocios + "%'"
                + "OR telefono LIKE '%" +  input_filtroSocios+ "%'"
                + "OR domicilio LIKE '%" +  input_filtroSocios + "%'"
                + "OR estado_pago LIKE '%" +  input_filtroSocios+ "%'"
                + "OR categoria LIKE '%" +  input_filtroSocios + "%'"
                + "OR estado LIKE '%" +  input_filtroSocios + "%'"
                + "OR cuilcuit LIKE '%" +  input_filtroSocios + "%'"
                + "OR email LIKE '%" +  input_filtroSocios + "%'"
                + "OR fechaNac LIKE '%" +  input_filtroSocios + "%'";
        try {
            connection = Conexion.Cadena();
            sentencia = (Statement) connection.createStatement();
            rsDatos = sentencia.executeQuery(sql);

            while (rsDatos.next()) {

                //registros[0] = rsDatos.getString("id_socio");
                registros[0] = rsDatos.getString("legajo_socio");
                registros[1] = rsDatos.getString("nombre");
                registros[2] = rsDatos.getString("apellido");
                registros[3] = rsDatos.getString("dni");
                //registros[5] = rsDatos.getString("telefono");
                //registros[6] = rsDatos.getString("domicilio");
                //registros[7] = rsDatos.getString("estado_pago");
                registros[4] = rsDatos.getString("categoria");
                registros[5] = rsDatos.getString("estado");
                //registros[10] = rsDatos.getString("cuilcuit");
                //registros[11] = rsDatos.getString("email");
                //registros[12] = rsDatos.getString("fechaNac");
                model.addRow(registros);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
        
    }



}
