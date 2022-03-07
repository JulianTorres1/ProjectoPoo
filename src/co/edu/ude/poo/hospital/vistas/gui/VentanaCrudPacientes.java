/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.vistas.gui;

import co.edu.ude.poo.hospital.modelo.entidades.Doctors_1;
import co.edu.ude.poo.hospital.servicios.Doctors_1JpaController;
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
public class VentanaCrudPacientes {
    
    EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
    Doctors_1JpaController crudUser = new Doctors_1JpaController(conexionBD);
    
    //objetos de la clase Usuario_1
    private Doctors_1 p = new Doctors_1();
    private JFrame jFrame = new JFrame();
    
   
    
    public String InsertarDoctor(
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String codigoPostal,
            String nif,
            String numeroSeguridaSocial,
            String numeroDeColegiado,
            String tipoDeDoctor
    ){
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            p.setNombre(nombre);
            p.setDireccion(direccion);
            p.setTelefono(telefono);
            p.setPoblacion(poblacion);
            p.setProvincia(provincia);
            p.setCodigoPostal(codigoPostal);
            p.setNif(nif);
            p.setNumeroSeguridadSocial(numeroSeguridaSocial);
            p.setNumeroDeColegiado(numeroDeColegiado);
            p.setTipoDeDoctor(tipoDeDoctor);
            
            
        
            // asignamo el objeto a el metodo create
            crudUser.create(p);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Guardados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al guardar los datos");
        }
        return mensaje;
    }
    
    
    public String editarDoctor(
            
            Integer id,
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String codigoPostal,
            String nif,
            String numeroSeguridaSocial,
            String numeroDeColegiado,
            String tipoDeDoctor
    ){
        
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            p.setIdDoctors(id);
            p.setNombre(nombre);
            p.setDireccion(direccion);
            p.setTelefono(telefono);
            p.setPoblacion(poblacion);
            p.setProvincia(provincia);
            p.setCodigoPostal(codigoPostal);
            p.setNif(nif);
            p.setNumeroSeguridadSocial(numeroSeguridaSocial);
            p.setNumeroDeColegiado(numeroDeColegiado);
            p.setTipoDeDoctor(tipoDeDoctor);
        
            // asignamo el objeto a el metodo create
            crudUser.edit(p);
            
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
    
    public void buscarDoctor(JTable tabla) {
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        String [] titulo = {"ID","NOMBRE","DIRECCION","TELEFONO","POBLACION","PROVINCIA","CODIGO POSTAL","NIF","NUMERO DE SEGURIDAD SOCIAL","NUMERO DE COLEGIADO","TIPO DE DOCTOR"};
        model = new DefaultTableModel(null, titulo);
        
        List<Doctors_1> listaUsuario = crudUser.findDoctors_1Entities();       
        String [] datosUsuarios = new String[11];
        for (Doctors_1 crudUsers_1 : listaUsuario) {
            
            try {
                datosUsuarios[0] = crudUsers_1.getIdDoctors()+"";
                datosUsuarios[1] = crudUsers_1.getNombre()+"";
                datosUsuarios[2] = crudUsers_1.getDireccion()+"";
                datosUsuarios[3] = crudUsers_1.getTelefono()+"";
                datosUsuarios[4] = crudUsers_1.getPoblacion()+"";
                datosUsuarios[5] = crudUsers_1.getProvincia()+"";
                datosUsuarios[6] = crudUsers_1.getCodigoPostal()+"";
                datosUsuarios[7] = crudUsers_1.getNif()+"";
                datosUsuarios[8] = crudUsers_1.getNumeroSeguridadSocial()+"";
                datosUsuarios[9] = crudUsers_1.getNumeroDeColegiado()+"";
                datosUsuarios[10] = crudUsers_1.getTipoDeDoctor()+"";
                
                model.addRow(datosUsuarios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jFrame, "Error al mostrar los usuarios");   
            }
        }
        tabla.setModel(model);
        
    }
    
}
