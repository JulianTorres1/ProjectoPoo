/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.vistas.gui;

import co.edu.ude.poo.hospital.modelo.entidades.Users_1;
import co.edu.ude.poo.hospital.servicios.Users_1JpaController;
import co.edu.ude.poo.hospital.servicios.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julia
 */
public class VentanaCrudUsuarios {
    
    //objetos de la clase Usuario_1
    private Users_1 u = new Users_1();
    private JFrame jFrame = new JFrame();
    
    EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
    Users_1JpaController crudUser = new Users_1JpaController(conexionBD);
    
    public String InsertarUsuario(
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String codigoPostal,
            String nif,
            String numeroSeguridaSocial
    ){
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            u.setNombre(nombre);
            u.setDireccion(direccion);
            u.setTelefono(telefono);
            u.setPoblacion(poblacion);
            u.setProvincia(provincia);
            u.setCodigoPostal(codigoPostal);
            u.setNif(nif);
            u.setNumeroSeguridadSocial(numeroSeguridaSocial);
        
            // asignamo el objeto a el metodo create
            crudUser.create(u);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Guardados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al guardar los datos");
        }
        return mensaje;
    }
    
    
    public String editarUsuario(
            
            Integer id,
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String codigoPostal,
            String nif,
            String numeroSeguridaSocial
    ){
        
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            u.setIdUsers(id);
            u.setNombre(nombre);
            u.setDireccion(direccion);
            u.setTelefono(telefono);
            u.setPoblacion(poblacion);
            u.setProvincia(provincia);
            u.setCodigoPostal(codigoPostal);
            u.setNif(nif);
            u.setNumeroSeguridadSocial(numeroSeguridaSocial);
        
            // asignamo el objeto a el metodo create
            crudUser.edit(u);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Editados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al editar los datos");
        }
        
        
        
        
        
    
        return mensaje;
    }
    
    public String borrarUsuario(int id) {
    
        String mensaje = "";
    
        try{
               
               crudUser.destroy(id);
               JOptionPane.showMessageDialog(jFrame, "Eliminado Con Exito");
           }catch(Exception e){
               JOptionPane.showMessageDialog(jFrame, "Error al Eliminar el Usuario");
           }
        return mensaje;
    }
    
    public void buscarUsuario(JTable tabla) {
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        String [] titulo = {"ID","NOMBRE","DIRECCION","TELEFONO","POBLACION","PROVINCIA","CODIGO POSTAL","NIF","NUMERO DE SEGURIDAD SOCIAL"};
        model = new DefaultTableModel(null, titulo);
        
        List<Users_1> listaUsuario = crudUser.findUsers_1Entities();
        String [] datosUsuarios = new String[9];
        for (Users_1 crudUsers_1 : listaUsuario) {
            
            try {
                datosUsuarios[0] = crudUsers_1.getIdUsers()+"";
                datosUsuarios[1] = crudUsers_1.getNombre()+"";
                datosUsuarios[2] = crudUsers_1.getDireccion()+"";
                datosUsuarios[3] = crudUsers_1.getTelefono()+"";
                datosUsuarios[4] = crudUsers_1.getPoblacion()+"";
                datosUsuarios[5] = crudUsers_1.getProvincia()+"";
                datosUsuarios[6] = crudUsers_1.getCodigoPostal()+"";
                datosUsuarios[7] = crudUsers_1.getNif()+"";
                datosUsuarios[8] = crudUsers_1.getNumeroSeguridadSocial()+"";
                model.addRow(datosUsuarios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jFrame, "Error al mostrar los usuarios");   
            }
        }
        tabla.setModel(model);
        
    }
    
    public void mostrarUsuario(JTable tabla, int id){
        
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        String [] titulo = {"ID","NOMBRE","DIRECCION","TELEFONO","POBLACION","PROVINCIA","CODIGO POSTAL","NIF","NUMERO DE SEGURIDAD SOCIAL"};
        model = new DefaultTableModel(null, titulo);
        
        List<Users_1> listaUsuario = crudUser.findUsers_1Entities();
        String [] datosUsuarios = new String[9];
        
        
        
        
        datosUsuarios[1] = "";
    
        
    
    
    }
    
    
    
}
