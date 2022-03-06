/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.hospital.util;


import co.edu.ude.poo.hospital.modelo.entidades.Doctors_1;
import co.edu.ude.poo.hospital.modelo.entidades.Empleados_1;
import co.edu.ude.poo.hospital.modelo.entidades.Pacientes_1;
import co.edu.ude.poo.hospital.modelo.entidades.Users_1;
import co.edu.ude.poo.hospital.servicios.Doctors_1JpaController;
import co.edu.ude.poo.hospital.servicios.Empleados_1JpaController;
import co.edu.ude.poo.hospital.servicios.Pacientes_1JpaController;
import co.edu.ude.poo.hospital.servicios.Users_1JpaController;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author nicolas
 */
public class GestionDeAlmacenamiento {
    
    public static void ListarBD(){
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        
        System.out.println("""
                               Seleccione Que Tipo de Usuario desea ver:
                                    1 - Usuario
                                    2 - Doctor
                                    3 - Paciente
                                    4 - Empleado
                               
                               """);
        
        opt = sc.nextInt();
                
                
        if(opt == 1){
           
           //recorremos y mostramos los datos de los usuarios 
            
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Users_1JpaController crudUser = new Users_1JpaController(conexionBD);
           System.out.println("Coneccion Realizada!");
           try{
               List<Users_1> listaUsuario = crudUser.findUsers_1Entities();
               System.out.println("           Nombre | Direccion | Telefono | Poblacion | Provincia | Codigo Postal | NIF | Numero de seguridad Social");
               for (int i = 0; i < listaUsuario.size(); i++) {
                   System.out.println("Usuario: "+ listaUsuario.get(i).getNombre()+"  |  "+listaUsuario.get(i).getDireccion() + "  |  "+ listaUsuario.get(i).getTelefono()+ "  |  "+listaUsuario.get(i).getPoblacion()
                   + "  |  "+ listaUsuario.get(i).getProvincia()+ "  |  "+listaUsuario.get(i).getCodigoPostal()+ "  |  "+listaUsuario.get(i).getNif()+ "  |  "+listaUsuario.get(i).getNumeroSeguridadSocial()
                   );
                   
                   
               }
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           }
           
           
        
        
        }
        if(opt == 2){ 
            
            //Recorremos y mostramos los datos de los Doctores
            
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Doctors_1JpaController crudUser = new Doctors_1JpaController(conexionBD);
           System.out.println("Coneccion Realizada!");
           try{
               
               Object  o[]= null;
               List<Doctors_1> listaUsuario = crudUser.findDoctors_1Entities();
               System.out.println("           Nombre | Direccion | Telefono | Poblacion | Provincia | Codigo Postal | NIF | Numero de seguridad Social | Numero De colegiado | Tipo De Doctor");
               for (int i = 0; i < listaUsuario.size(); i++) {
                   System.out.println("Usuario: "+ listaUsuario.get(i).getNombre()+"  |  "+listaUsuario.get(i).getDireccion() + "  |  "+ listaUsuario.get(i).getTelefono()+ "  |  "+listaUsuario.get(i).getPoblacion()
                   + "  |  "+ listaUsuario.get(i).getProvincia()+ "  |  "+listaUsuario.get(i).getCodigoPostal()+ "  |  "+listaUsuario.get(i).getNif()+ "  |  "+listaUsuario.get(i).getNumeroSeguridadSocial()+ "  |  "+
                           listaUsuario.get(i).getNumeroDeColegiado()+ "  |  "+listaUsuario.get(i).getTipoDeDoctor()
                   );
                   
                   
               }
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           }
        
        }
        if(opt == 3){
            
            //recoremos y mostramos los datos de los pacientes
            
            EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Pacientes_1JpaController crudUser = new Pacientes_1JpaController(conexionBD);
           System.out.println("Coneccion Realizada!");
           try{
               
               Object  o[]= null;
               List<Pacientes_1> listaUsuario = crudUser.findPacientes_1Entities();
               System.out.println("           Nombre | Direccion | Telefono | Poblacion | Provincia | NIF | Medico Correspondiente | Historial Medico");
               for (int i = 0; i < listaUsuario.size(); i++) {
                   System.out.println("Usuario: "+ listaUsuario.get(i).getNombre()+"  |  "+listaUsuario.get(i).getDireccion() + "  |  "+ listaUsuario.get(i).getTelefono()+ "  |  "+listaUsuario.get(i).getPoblacion()
                   + "  |  "+ listaUsuario.get(i).getProvincia()+ "  |  "+ "  |  "+listaUsuario.get(i).getNif()+ "  |  "+listaUsuario.get(i).getMedicoCorrespondiente()+ "  |  "+listaUsuario.get(i).getHistorialMedico()
                   );
                   
                   
               }
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           }
        
        
        }
        if(opt == 4){
            //recoremos y mostramos los datos de los Empleados
            
            EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Empleados_1JpaController crudUser = new Empleados_1JpaController(conexionBD);
           System.out.println("Coneccion Realizada!");
           try{
               
               Object  o[]= null;
               List<Empleados_1> listaUsuario = crudUser.findEmpleados_1Entities();
               System.out.println("           Nombre | Direccion | Telefono | Poblacion | Provincia | NIF | Medico Correspondiente | Historial Medico");
               for (int i = 0; i < listaUsuario.size(); i++) {
                   System.out.println("Usuario: "+ listaUsuario.get(i).getNombre()+"  |  "+listaUsuario.get(i).getDireccion() + "  |  "+ listaUsuario.get(i).getTelefono()+ "  |  "+listaUsuario.get(i).getPoblacion()
                   + "  |  "+ listaUsuario.get(i).getProvincia()+ "  |  "+ "  |  "+listaUsuario.get(i).getNif()+ "  |  "+listaUsuario.get(i).getTipoDeEmpleado()
                   );
                   
                   
               }
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           }
        
        }
    }
    
    
    public static String Destruir(int id){
       Scanner sc = new Scanner(System.in);
       //metodo para la destruccion de un objeto
       
       String mensaje = "Eliminado Con exito";
       
       
       int optD = 0;
        System.out.println("""
                           Seleccione el tipo de objeto que desea borrar
                           
                           1 - Usuario
                           2 - Doctor
                           3 - Paciente
                           4 - Empleado
                           
                           """);
        
        optD = sc.nextInt();
        
        if (optD == 1) {
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Users_1JpaController crudUser = new Users_1JpaController(conexionBD);
           
           try{
               
               crudUser.destroy(id);
               System.out.println(mensaje);
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           }   
        }
        
        if (optD == 2) {
            EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Doctors_1JpaController crudUser = new Doctors_1JpaController(conexionBD);
           
           try{
               
               crudUser.destroy(id);
               System.out.println(mensaje);
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           } 
        }
        
        if (optD == 3) {
            EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Pacientes_1JpaController crudUser = new Pacientes_1JpaController(conexionBD);
           
           try{
               
               crudUser.destroy(id);
               System.out.println(mensaje);
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           } 
        }
        
        if (optD == 4) {
           EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
           Empleados_1JpaController crudUser = new Empleados_1JpaController(conexionBD);
           
           try{
               
               crudUser.destroy(id);
               System.out.println(mensaje);
           }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
           }
        }
        
        return mensaje;
        
    }
    
    
    public static String EditarUsuario(int id){
        
        EntityManagerFactory conexionBD = Persistence.createEntityManagerFactory("HospitalPU");
        
        
        Scanner sc = new Scanner(System.in);
        String estado = "No Exitoso";
        
        System.out.println("""
                           Ingrese el tipo de Usuario Que Quiere editar:
                           
                           1 - Usuario
                           2 - Doctor
                           3 - Paciente
                           4 - Empleado
                           
                           """);
        
        int optE = sc.nextInt();
        
        // ---------------------------------------------------------------------
        // Ingreso Y Edicion Del nuevo Dato a editar
        // ---------------------------------------------------------------------
        if (optE == 1) {
            
            System.out.println("""
                               Seleccione el dato que quiere editar del Usuario:
                                1.Nombre
                                2.Direccion 
                                3.Telefono 
                                4.Poblacion  
                                5.Provincia  
                                6.Codigo Postal  
                                7.NIF 
                                8.Numero de seguridad Social
                               
                               """);
            
            
            int datoE = sc.nextInt();
            
            Users_1 u = new Users_1();
            
            String DatoEdit;
            Users_1JpaController crudUser = new Users_1JpaController(conexionBD);
            
            if (datoE == 1) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                
                
                System.out.println(id);
                
                try{
                    u.setIdUsers(id);
                    u.setNombre(DatoEdit);
                    System.out.println(u);
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
                
                
            }
            if (datoE == 2) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setDireccion(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 3) {
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setTelefono(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 4) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setPoblacion(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 5) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setProvincia(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 6) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setCodigoPostal(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 7) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setNif(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 8) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                u.setIdUsers(id);
                u.setNumeroSeguridadSocial(DatoEdit);
                
                try{
                    crudUser.edit(u);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            
        }
        // ---------------------------------------------------------------------
        // Segundo Tipo De dato
        // ---------------------------------------------------------------------
        if (optE == 2) {
            
            System.out.println("""
                               Seleccione el dato que quiere editar del Doctor:
                                1.Nombre
                                2.Direccion 
                                3.Telefono 
                                4.Poblacion  
                                5.Provincia  
                                6.Codigo Postal  
                                7.NIF 
                                8.Numero de seguridad Social
                                9.Numero de colegiado
                                10. Tipo De doctor
                               
                               """);
            
            
            int datoE = sc.nextInt();
            
            
            
            String DatoEdit;
            
            Doctors_1JpaController crudUser = new Doctors_1JpaController(conexionBD);
            Doctors_1 d = new Doctors_1();
            if (datoE == 1) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setNombre(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
                
                
            }
            if (datoE == 2) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setDireccion(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 3) {
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setTelefono(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 4) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setPoblacion(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 5) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setProvincia(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 6) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setCodigoPostal(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 7) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setNif(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            if (datoE == 8) {
                
                System.out.println("Ingrese el nuevo Dato: ");
                DatoEdit = sc.next();
                d.setIdDoctors(id);
                d.setNumeroSeguridadSocial(DatoEdit);
                
                try{
                    crudUser.edit(d);
                }catch(Exception e){
               System.out.println("ERROR = "+e.getMessage());
                }
                
            }
            
        }
        if (optE == 3) {
            
            
            
        }
        if (optE == 4) {
            
            
            
        }
        
        
        return estado;
    }
    
    
    
        
        
    
    
}

