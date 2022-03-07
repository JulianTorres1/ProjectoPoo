/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.vistas.gui;

import co.edu.ude.poo.hospital.modelo.entidades.Empleados_1;
import co.edu.ude.poo.hospital.modelo.entidades.Users_1;
import co.edu.ude.poo.hospital.servicios.Empleados_1JpaController;
import co.edu.ude.poo.hospital.servicios.Users_1JpaController;
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
public class VentanaCrudEmpleados {
    
    //objetos de la clase Usuario_1
    private Empleados_1 em = new Empleados_1();
    private JFrame jFrame = new JFrame();
    
    EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
    Empleados_1JpaController crudUser = new Empleados_1JpaController(conexionBD);
    
    public String Insertarempleado(
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String codigoPostal,
            String nif,
            String numeroSeguridaSocial,
            String tipoDeEmpleado
    ){
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            em.setNombre(nombre);
            em.setDireccion(direccion);
            em.setTelefono(telefono);
            em.setPoblacion(poblacion);
            em.setProvincia(provincia);
            em.setNif(nif);
            em.setNumeroSeguridadSocial(numeroSeguridaSocial);
            em.setTipoDeEmpleado(tipoDeEmpleado);
            
        
            // asignamo el objeto a el metodo create
            crudUser.create(em);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Guardados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al guardar los datos");
        }
        return mensaje;
    }
    
    
    public String editarEmpleado(
            
            Integer id,
            String nombre,
            String direccion,
            String telefono,
            String poblacion,
            String provincia,
            String nif,
            String numeroSeguridaSocial,
            String tipoDeEmpleado
    ){
        
        String mensaje = "";
        
        //asignamos los datos al objeto
        
        try {
            em.setIdempleados(id);
            em.setNombre(nombre);
            em.setDireccion(direccion);
            em.setTelefono(telefono);
            em.setPoblacion(poblacion);
            em.setProvincia(provincia);
            em.setNif(nif);
            em.setNumeroSeguridadSocial(numeroSeguridaSocial);
            em.setTipoDeEmpleado(tipoDeEmpleado);
        
            // asignamo el objeto a el metodo create
            crudUser.edit(em);
            
            JOptionPane.showMessageDialog(jFrame, "Datos Editados Correctamente!");
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            JOptionPane.showMessageDialog(jFrame, "Error al editar los datos");
        }
        
        
        
        
        
    
        return mensaje;
    }
    
    public String borrarEmpleado(int id) {
    
        String mensaje = "";
    
        try{
               
               crudUser.destroy(id);
               JOptionPane.showMessageDialog(jFrame, "Eliminado Con Exito");
           }catch(Exception e){
               JOptionPane.showMessageDialog(jFrame, "Error al Eliminar el Usuario");
           }
        return mensaje;
    }
    
    public void buscarEmpleados(JTable tabla) {
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        String [] titulo = {"ID","NOMBRE","DIRECCION","TELEFONO","POBLACION","PROVINCIA","NIF","NUMERO DE SEGURIDAD SOCIAL","TIPO DE EMPLEADO"};
        model = new DefaultTableModel(null, titulo);
        
        List<Empleados_1> listaUsuario = crudUser.findEmpleados_1Entities();        String [] datosUsuarios = new String[9];
        for (Empleados_1 crudUsers_1 : listaUsuario) {
            
            try {
                datosUsuarios[0] = crudUsers_1.getIdempleados()+"";
                datosUsuarios[1] = crudUsers_1.getNombre()+"";
                datosUsuarios[2] = crudUsers_1.getDireccion()+"";
                datosUsuarios[3] = crudUsers_1.getTelefono()+"";
                datosUsuarios[4] = crudUsers_1.getPoblacion()+"";
                datosUsuarios[5] = crudUsers_1.getProvincia()+"";
                datosUsuarios[6] = crudUsers_1.getNif()+"";
                datosUsuarios[7] = crudUsers_1.getNumeroSeguridadSocial()+"";
                datosUsuarios[8] = crudUsers_1.getTipoDeEmpleado()+"";
                
                model.addRow(datosUsuarios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jFrame, "Error al mostrar los usuarios");   
            }
        }
        tabla.setModel(model);
        
    }
    
    
}
