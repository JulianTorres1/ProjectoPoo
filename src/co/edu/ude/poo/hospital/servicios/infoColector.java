/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.servicios;


import co.edu.ude.poo.hospital.modelo.entidades.Doctors_1;
import co.edu.ude.poo.hospital.modelo.entidades.Empleados_1;
import co.edu.ude.poo.hospital.modelo.entidades.Pacientes_1;

import co.edu.ude.poo.hospital.modelo.entidades.Users_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        
        Users_1 u = new Users_1();
        
        // ---------------------------------------------------------------------
        
        if (tipoDeUsuario == 0){ 
           // guardamos el nombre ingresado en el objeto Users 
           System.out.println("Ingrese el nombre del nuevo usuario " );
           u.setNombre(sc.next());
           System.out.println("Dato Ingresado: "+ u.getNombre());
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del usuario");
           u.setDireccion(sc.next());
           System.out.println("Dato Ingresado: "+ u.getDireccion());


           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del usuario");
           u.setTelefono(sc.next());
           System.out.println("Dato Ingresado: "+ u.getTelefono());
           
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del usuario");
           u.setPoblacion(sc.next());
           System.out.println("Dato Ingresado: "+ u.getPoblacion());
           
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el usuario");
           u.setProvincia(sc.next());
           System.out.println("Dato Ingresado: "+ u.getProvincia());
           
           
           // guardamos el codigo postal
           System.out.println("Ingrese el codigo postal del usuario");
           u.setCodigoPostal(sc.next());
           System.out.println("Dato Ingresado: "+ u.getCodigoPostal());
           
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del usuario");
           u.setNif(sc.next());
           System.out.println("Dato Ingresado: "+ u.getNif());
           
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del usuario");
           u.setNumeroSeguridadSocial(sc.next());
           System.out.println("Dato Ingresado: "+ u.getNumeroSeguridadSocial());
           
           // cargamos los datos a la base de datos
           
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Users_1JpaController crudUser = new Users_1JpaController(conexionBD);
           try{
               crudUser.create(u);
               int t = crudUser.getUsers_1Count();
               System.out.println("""
                                  Datos Almacenados! 
                                    """);
               System.out.println(" Total: "+t);
           }catch(Exception e){
               System.out.println("ERROR = "+e);
           }
           
           
           
        }
        
        // ----------------------------------------------------------------------
        
        Doctors_1 d = new Doctors_1();
        
        if (tipoDeUsuario == 1){ 
           // guardamos el nombre ingresado en el objeto doctor
           System.out.println("Ingrese el nombre del nuevo Doctor " );
           d.setNombre(sc.next());
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del doctor");
           d.setDireccion(sc.next());
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del doctor");
           d.setTelefono(sc.next());
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del doctor");
           d.setPoblacion(sc.next());
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el doctor");
           d.setProvincia(sc.next());
           
           // guardamos el codigo postal
           System.out.println("Ingrese el codigo postal del doctor");
           d.setCodigoPostal(sc.next());
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del Doctor");
           d.setNif(sc.next());
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del doctor");
           d.setNumeroSeguridadSocial(sc.next());
           //guardamos el numero de colegiado del doctor
           System.out.println("Ingrese el numero de colegiado del doctor");
           d.setNumeroDeColegiado(sc.next());
           
           //guardamos el tipo de doctor
           
           
           
           System.out.println("""
                              Seleccione el tipo de doctor
                              1. Medico Titular
                              2. Medico Interino
                              3. Medico Sustituto
                               
                              """);
           
           int optDoc = sc.nextInt();
            
           if(optDoc == 1)
               d.setTipoDeDoctor("Medico Titular");
           if(optDoc == 2)
               d.setTipoDeDoctor("Medico Interino");
           if(optDoc == 3)
               d.setTipoDeDoctor("Medico Sustituto");
           
           // cargamos los datos a la base de datos
           
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Doctors_1JpaController crudUser = new Doctors_1JpaController(conexionBD);
           try{
               crudUser.create(d);
               int t = crudUser.getDoctors_1Count();
               System.out.println("""
                                  Datos Almacenados! 
                                    """);
               System.out.println(" Total: "+t);
           }catch(Exception e){
               System.out.println("ERROR = "+e);
           }
            
           
           
        }
        
        // ---------------------------------------------------------------------
        
        Pacientes_1 p = new Pacientes_1();
        
        if (tipoDeUsuario == 2){ 
           // guardamos el nombre ingresado en el objeto paciente
           System.out.println("Ingrese el nombre del nuevo paciente " );
           p.setNombre(sc.next());
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del paciente");
           p.setDireccion(sc.next());
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del paciente");
           p.setTelefono(sc.next());
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del paciente");
           p.setPoblacion(sc.next()); 
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el paciente");
           p.setProvincia(sc.next());
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del paciente");
           p.setNif(sc.next());
           
           //guardamos el medico correspondiente
           System.out.println("Ingrese el medico correspondiente");
           p.setMedicoCorrespondiente(sc.next());
           
           
           // cargamos los datos a la base de datos
           
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Pacientes_1JpaController crudUser = new Pacientes_1JpaController(conexionBD);
           try{
               crudUser.create(p);
               int t = crudUser.getPacientes_1Count();
               System.out.println("""
                                  Datos Almacenados! 
                                    """);
               System.out.println(" Total: "+t);
           }catch(Exception e){
               System.out.println("ERROR = "+e);
           }
           
           
        }
        
        // ---------------------------------------------------------------------
        
        Empleados_1 e = new Empleados_1();
        
        if (tipoDeUsuario == 3){ 
           // guardamos el nombre ingresado en el objeto empleado 
           System.out.println("Ingrese el nombre del nuevo empleado " );
           e.setNombre(sc.next());
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del empleado");
           e.setDireccion(sc.next());
           
           //guardamos el telefono en el objeto
           System.out.println("ingrese el numero de telefono del empleado");
           e.setTelefono(sc.next());
           
           //guardamos el tipo de poblacion
           System.out.println("Ingrese el tipo de poblacion del empleado");
           e.setPoblacion(sc.next());
           
           //guardamos el dato provincia en el objeto
           System.out.println("Ingrese la provincia donde reside el empleado");
           e.setProvincia(sc.next());
           
           //guardamos el NIF
           System.out.println("Ingrese el nif del empleado");
           e.setNif(sc.next());
           
           //guardamos el numero de seguridad social
           System.out.println("Ingrese el numero de seguridad social del empleado");
           e.setNumeroSeguridadSocial(sc.next());
           
           
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
                e.setTipoDeEmpleado("ATS");
            if(optempleados == 2)
                e.setTipoDeEmpleado("ATS de Zona");
            if(optempleados == 3)
                e.setTipoDeEmpleado("Auxiliar de enfermeria");
            if(optempleados == 4){
                e.setTipoDeEmpleado("administrador");
            }
            if(optempleados == 5){
                e.setTipoDeEmpleado("Celador");
            };
            
            
            // cargamos los datos a la base de datos
           
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Empleados_1JpaController crudUser = new Empleados_1JpaController(conexionBD);
           try{
               crudUser.create(e);
               int t = crudUser.getEmpleados_1Count();
               System.out.println("""
                                  Datos Almacenados! 
                                    """);
               System.out.println(" Total: "+t);
           }catch(Exception e2){
               System.out.println("ERROR = "+e2);
           }
          
           
        
        }
        
        // ---------------------------------------------------------------------
        
       
        
        
            
        
        
        
    
    }
    
}
