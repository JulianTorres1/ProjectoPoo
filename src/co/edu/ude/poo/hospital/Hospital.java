/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.ude.poo.hospital;

import co.edu.ude.poo.hospital.servicios.infoColector;
import co.edu.ude.poo.hospital.servicios.showinfo;
import co.edu.udec.poo.hospital.util.GestionDeAlmacenamiento;
import java.util.Scanner;








/**
 *
 * @author nicolas
 */
public class Hospital {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Boolean Estado = true;
        int opt = 0;
        
        while(Estado){
            
            System.out.println("""
                               Que desea hacer ahora:
                               1. Ingresar Un Tipo De Usuario
                               2. Mostrar un grupo de usuarios
                               3. Editar un Usuario
                               4. Eliminar Un Usuario
                               5. Salir Del Programa
                               """);
            
            opt = sc.nextInt();
            
            if(opt == 1){
                // Metodo Que se encarga de recolectar la informacion
                infoColector.recolect();

            
            
            }
            if(opt == 2){
                // Metodo que se Encarga del funcionamiento del CRUD
                GestionDeAlmacenamiento.ListarBD();
            }
            
            if (opt == 3) {
                
                System.out.println("Ingrese la ID del Usuario a Editar: \n"
                        + "  ");
                
                int idE = sc.nextInt();
                
                GestionDeAlmacenamiento.EditarUsuario(idE);
                
                
            }
            if (opt == 4) {
                
                System.out.println("Ingrese la ID del usuario a eliminar:");
                int idD = sc.nextInt();
                
                GestionDeAlmacenamiento.Destruir(idD);
                
                
            }
            
            if (opt == 5) {
                
                System.out.println("Gracias por su visita! :D");
                
                Estado = false;
                
            }
            
            
            
            
        
        }
        
        
        
        
        
        
        
    }
    
}
