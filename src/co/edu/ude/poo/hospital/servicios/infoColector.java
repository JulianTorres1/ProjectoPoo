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
public class infoColector extends Users {
    
    
    static Scanner sc = new Scanner(System.in);
    
    public static void recolect(){
        System.out.println("""
                           ingrese el tipo de usuario:
                                0. Usuario
                                1. Doctor 
                                2. Paciente 
                                3. Empleado 
                           """);
        
        int ClassType = sc.nextInt();
        
        // ---------------------------------------------------------------------
        
        if (ClassType == 0){ 
           // guardamos el nombre ingresado en el objeto Users 
           System.out.println("Ingrese el nombre del nuevo usuario " );
           Users.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del usuario");
           Users.direccion = sc.next(); 
        
        }
        
        // ---------------------------------------------------------------------
        
        if (ClassType == 1){ 
           // guardamos el nombre ingresado en el objeto doctor
           System.out.println("Ingrese el nombre del nuevo Doctor " );
           Doctors.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del doctor");
           Doctors.direccion = sc.next(); 
        
        }
        
        // ---------------------------------------------------------------------
        
        if (ClassType == 2){ 
           // guardamos el nombre ingresado en el objeto paciente
           System.out.println("Ingrese el nombre del nuevo usuario " );
           pacientes.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del doctor");
           pacientes.direccion = sc.next();
        
        }
        
        // ---------------------------------------------------------------------
        
        if (ClassType == 3){ 
           // guardamos el nombre ingresado en el objeto empleado 
           System.out.println("Ingrese el nombre del nuevo empleado " );
           empleados.nombre = sc.next();
           
           // guardamos la direccion en el objeto
           System.out.println("ingrese la direccion del doctor");
           empleados.direccion = sc.next();
           
           
        
        }
        
        // ---------------------------------------------------------------------
        
       
        
        
            
        
        
        
    
    }
    
}
