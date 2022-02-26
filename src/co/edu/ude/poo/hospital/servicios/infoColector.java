/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.servicios;

import co.edu.ude.poo.hospital.modelo.entidades.Doctors;
import co.edu.ude.poo.hospital.modelo.entidades.Users;
import co.edu.ude.poo.hospital.modelo.entidades.empleados;
import co.edu.ude.poo.hospital.modelo.entidades.pacientes;
import java.util.ArrayList;
import java.util.Scanner;

// importamos el conector para mysql


/**
 *
 * @author nicolas
 */
public class infoColector{
    
    public static int tipoDeUsuario;
    
    
    static Scanner sc = new Scanner(System.in);
    
    public static void recolect(){
        System.out.println("""
                           ingrese el tipo de usuario:
                                0. Usuario
                                1. Doctor 
                                2. Paciente 
                                3. Empleado 
                           """);
        
        tipoDeUsuario = sc.nextInt();
        
        
        System.out.println(tipoDeUsuario);
        
        // ---------------------------------------------------------------------
        
        if (tipoDeUsuario == 0){ 
           // guardamos el nombre ingresado en el objeto Users 
           System.out.println("Ingrese el nombre del nuevo usuario " );
           Users.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del usuario");
           Users.direccion = sc.next(); 
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del usuario");
           Users.telefono = sc.nextInt();
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del usuario");
           Users.poblacion = sc.next(); 
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el usuario");
           Users.provincia = sc.next();



           // guardamos el codigo postal
           System.out.println("Ingrese el codigo postal del usuario");
           Users.codigoPostal = sc.nextInt();
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del usuario");
           Users.nif = sc.nextInt();
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del usuario");
           Users.numeroSeguridadSocial = sc.nextInt();
              
        }
        
        // ---------------------------------------------------------------------
        
        if (tipoDeUsuario == 1){ 
           // guardamos el nombre ingresado en el objeto doctor
           System.out.println("Ingrese el nombre del nuevo Doctor " );
           Doctors.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del doctor");
           Doctors.direccion = sc.next(); 
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del doctor");
           Doctors.telefono = sc.nextInt();
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del doctor");
           Doctors.poblacion = sc.next();
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el doctor");
           Doctors.provincia = sc.next();
           
           // guardamos el codigo postal
           System.out.println("Ingrese el codigo postal del doctor");
           Doctors.codigoPostal = sc.nextInt();
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del Doctor");
           Doctors.nif = sc.nextInt();
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del doctor");
           Doctors.numeroSeguridadSocial = sc.nextInt();
           
           //guardamos el numero de colegiado del doctor
           System.out.println("Ingrese el numero de colegiado del doctor");
           Doctors.numeroDeColegiado = sc.nextInt();
           
           //guardamos el tipo de doctor
           
           
           
           System.out.println("""
                              Seleccione el tipo de doctor
                              1. Medico Titular
                              2. Medico Interino
                              3. Medico Sustituto
                               
                              """);
           
           int optDoc = sc.nextInt();
            
           if(optDoc == 1)
               Doctors.tipoDoctor = "Medico Titular";
           if(optDoc == 2)
               Doctors.tipoDoctor = "Medico Interino";
           if(optDoc == 3)
               Doctors.tipoDoctor = "Medico Sustituto";
            
           
           
        }
        
        // ---------------------------------------------------------------------
        
        if (tipoDeUsuario == 2){ 
           // guardamos el nombre ingresado en el objeto paciente
           System.out.println("Ingrese el nombre del nuevo paciente " );
           pacientes.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del paciente");
           pacientes.direccion = sc.next();
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del paciente");
           pacientes.telefono = sc.nextInt();
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del paciente");
           pacientes.poblacion = sc.next(); 
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el paciente");
           pacientes.provincia = sc.next();
           
           // guardamos el codigo postal
           System.out.println("Ingrese el codigo postal del paciente");
           pacientes.codigoPostal = sc.nextInt();
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del paciente");
           pacientes.nif = sc.nextInt();
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del paciente");
           pacientes.numeroSeguridadSocial = sc.nextInt();
           
           //guardamos el medico correspondiente
           System.out.println("Ingrese el medico correspondiente");
           pacientes.medicoCorrespondiente = sc.next();
           
           // guardamos el historial medico
           // creamos un arreglo donde vamos guardando los medicos a los que se
           // sometido el paciente
           ArrayList historialMedico = new ArrayList();
           
           historialMedico.add(pacientes.medicoCorrespondiente);
           
        }
        
        // ---------------------------------------------------------------------
        
        if (tipoDeUsuario == 3){ 
           // guardamos el nombre ingresado en el objeto empleado 
           System.out.println("Ingrese el nombre del nuevo empleado " );
           empleados.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del empleado");
           empleados.direccion = sc.next();
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del empleado");
           empleados.telefono = sc.nextInt();
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del empleado");
           empleados.poblacion = sc.next(); 
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el empleado");
           empleados.provincia = sc.next();
           
           // guardamos el codigo postal
           System.out.println("Ingrese el codigo postal del empleado");
           empleados.codigoPostal = sc.nextInt();
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del empleado");
           empleados.nif = sc.nextInt();
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del empleado");
           empleados.numeroSeguridadSocial = sc.nextInt();
           
           
           //guardamos el tipo de empleado
           System.out.println(" Ingrese el tipo de empleado");
           
           int optempleados = 0;
           
            System.out.println("""
                               Seleccione el tipo de empleado
                               1. ATS
                               2. ATS de Zona
                               3. Auxiliaint opt = tipoDeUsuario;r de enfermeria
                               4. administrador
                               5. Celador
                               
                               """);
            
            optempleados = sc.nextInt();
            
            if(optempleados == 1)
                empleados.tipoDeEmpleado = "ATS";
            if(optempleados == 2)
                empleados.tipoDeEmpleado = "ATS de Zona";
            if(optempleados == 3)
                empleados.tipoDeEmpleado = "Auxiliar de enfermeria";
            if(optempleados == 4){
                empleados.tipoDeEmpleado = " administrador";
            }
            if(optempleados == 5){
                empleados.tipoDeEmpleado = "Celador";
            };
            
            
          
           
        
        }
        
        // ---------------------------------------------------------------------
        
       
        
        
            
        
        
        
    
    }
    
}
