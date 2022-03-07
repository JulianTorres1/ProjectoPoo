/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.vistas.gui;

import co.edu.ude.poo.hospital.modelo.entidades.Doctors_1;
import co.edu.ude.poo.hospital.modelo.entidades.Pacientes_1;
import co.edu.ude.poo.hospital.servicios.Doctors_1JpaController;
import co.edu.ude.poo.hospital.servicios.Pacientes_1JpaController;
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
    Pacientes_1JpaController crudUser = new Pacientes_1JpaController(conexionBD);
    
    //objetos de la clase Usuario_1
    private Pacientes_1 p = new Pacientes_1();
    private JFrame jFrame = new JFrame();
    
   
    
    public String InsertarPaciente(
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String codigoPostal,
            String nif,
            String medicoCorrespondiente,
            String historialMedico
    ){
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            p.setNombre(nombre);
            p.setDireccion(direccion);
            p.setTelefono(telefono);
            p.setPoblacion(poblacion);
            p.setProvincia(provincia);
            p.setNif(nif);
            p.setMedicoCorrespondiente(medicoCorrespondiente);
            p.setHistorialMedico(historialMedico);
            
            
        
            // asignamo el objeto a el metodo create
            crudUser.create(p);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Guardados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al guardar los datos");
        }
        return mensaje;
    }
    
    
    public String editarPaciente(
            
            Integer id,
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String nif,
            String medicoCorrespondiente,
            String historialMedico
            
    ){
        
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            p.setIdpacientes(id);
            p.setNombre(nombre);
            p.setDireccion(direccion);
            p.setTelefono(telefono);
            p.setPoblacion(poblacion);
            p.setProvincia(provincia);
            p.setNif(nif);
            p.getMedicoCorrespondiente();
            p.setHistorialMedico(historialMedico);
            
        
            // asignamo el objeto a el metodo create
            crudUser.edit(p);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Editados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al editar los datos");
        }
        
        
        
        
        
    
        return mensaje;
    }
    
    public String borrarPaciente(int id) {
    
        String mensaje = "";
    
        try{
               
               crudUser.destroy(id);
               JOptionPane.showMessageDialog(jFrame, "Eliminado Con Exito");
           }catch(Exception e){
               JOptionPane.showMessageDialog(jFrame, "Error al Eliminar el Usuario");
           }
        return mensaje;
    }
    
    public void buscarPacientes(JTable tabla) {
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        String [] titulo = {"ID","NOMBRE","DIRECCION","TELEFONO","POBLACION","PROVINCIA","NIF","MEDICO CORRESPONFDIENTE","HISTORIAL MEDICO"};
        model = new DefaultTableModel(null, titulo);
        
        List<Pacientes_1> listaUsuario = crudUser.findPacientes_1Entities();       
        String [] datosUsuarios = new String[10];
        for (Pacientes_1 crudUsers_1 : listaUsuario) {
            
            try {
                datosUsuarios[0] = crudUsers_1.getIdpacientes()+"";
                datosUsuarios[1] = crudUsers_1.getNombre()+"";
                datosUsuarios[2] = crudUsers_1.getDireccion()+"";
                datosUsuarios[3] = crudUsers_1.getTelefono()+"";
                datosUsuarios[4] = crudUsers_1.getPoblacion()+"";
                datosUsuarios[5] = crudUsers_1.getProvincia()+"";
                datosUsuarios[6] = crudUsers_1.getNif()+"";
                datosUsuarios[7] = crudUsers_1.getMedicoCorrespondiente()+"";
                datosUsuarios[8] = crudUsers_1.getHistorialMedico()+"";
                
                
                model.addRow(datosUsuarios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jFrame, "Error al mostrar los usuarios");   
            }
        }
        tabla.setModel(model);
        
    }
    
}
