/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.servicios;

import co.edu.ude.poo.hospital.modelo.entidades.Doctors;
import co.edu.ude.poo.hospital.modelo.entidades.Users;
import co.edu.ude.poo.hospital.modelo.entidades.empleados;
import co.edu.ude.poo.hospital.modelo.entidades.pacientes;
import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class showinfo {
    
    
    public static void showclass(){
        Scanner sc = new Scanner(System.in);
        
        Users user = new Users();
        
        
        // combrobamos el valor de class pointer que se extiende de la clase
        // infoColector.tipoDeUsuario para saber que datos hay que mostrar
        
        
            // Mostramos la informacion de los Usuarios
        
        if(infoColector.tipoDeUsuario == 0){
            
            System.out.println("Los datos ingresados del Usuario son: \n"
                    + "Nombre: " + Users.nombre + "\n"
                            + "Direccion: " + Users.direccion + " \n"
                                    + "Telefono: " + Users.telefono + "\n"
                                            + "Poblacion: " + Users.poblacion + "\n"
                                                    + "Provincia: " + Users.provincia + "\n"
                                                            + "Codigo Postal: " + Users.codigoPostal + "\n"
                                                                    + "NIF: " + Users.nif + "\n"
                                                                            + "Numero De Seguridad Social: " + Users.numeroSeguridadSocial + "\n");
            
            
            
        
        }
            // mostramos la informacion de los Doctores
        if(infoColector.tipoDeUsuario == 1){
            System.out.println("Los datos ingresados del Doctor son: \n"
                    + "Nombre: " + Doctors.nombre + "\n"
                            + "Direccion: " + Doctors.direccion + " \n"
                                    + "Telefono: " + Doctors.telefono + "\n"
                                            + "Poblacion: " + Doctors.poblacion + "\n"
                                                    + "Provincia: " + Doctors.provincia + "\n"
                                                            + "Codigo Postal: " + Doctors.codigoPostal + "\n"
                                                                    + "NIF: " + Doctors.nif + "\n"
                                                                            + "Numero De Seguridad Social: " + Doctors.numeroSeguridadSocial + "\n"
                                                                                    + "Numero De Colegiado: " + Doctors.numeroDeColegiado + " \n"
                                                                                            + "Tipo de Doctor: " + Doctors.tipoDoctor + " \n");
                  
        
        
        }          
        
        
            //Mostramos la informacion del los pacientes
        if(infoColector.tipoDeUsuario == 2){
            
            System.out.println("Los datos ingresados del paciente son: \n"
                    + "Nombre: " + pacientes.nombre + "\n"
                            + "Direccion: " + pacientes.direccion + " \n"
                                    + "Telefono: " + pacientes.telefono + "\n"
                                            + "Poblacion: " + pacientes.poblacion + "\n"
                                                    + "Provincia: " + pacientes.provincia + "\n"
                                                            + "Codigo Postal: " + pacientes.codigoPostal + "\n"
                                                                    + "NIF: " + pacientes.nif + "\n"
                                                                            + "Numero De Seguridad Social: " + pacientes.numeroSeguridadSocial + "\n"
                                                                                    + "Medico correspondiente: " + pacientes.medicoCorrespondiente + " \n"
                                                                                            + "Historial Medico " + pacientes.historialMedico + " \n");
        
        } 
        
            // Mostramos los datos de los empleados
        if(infoColector.tipoDeUsuario == 3){
            System.out.println("Los datos ingresados del Empleado son: \n"
                    + "Nombre: " + empleados.nombre + "\n"
                            + "Direccion: " + empleados.direccion + " \n"
                                    + "Telefono: " + empleados.telefono + "\n"
                                            + "Poblacion: " + empleados.poblacion + "\n"
                                                    + "Provincia: " + empleados.provincia + "\n"
                                                            + "Codigo Postal: " + empleados.codigoPostal + "\n"
                                                                    + "NIF: " + empleados.nif + "\n"
                                                                            + "Numero De Seguridad Social: " + empleados.numeroSeguridadSocial + "\n"
                                                                                    + "ATS: " + empleados.tipoDeEmpleado + " \n");
        
        }
        
            
            
        
        
    
    
    
    }
    
    
    
}
