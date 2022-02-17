/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.hospital.servicios;

import co.edu.ude.poo.hospital.modelo.entidades.Users;
import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class showinfo {
    
    
    public static void showclass(int ClassPointer){
        Scanner sc = new Scanner(System.in);
        
        Users user = new Users();

        if(ClassPointer == 1){
            
            System.out.println(user.nombre);
            System.out.println(user.direccion);
            System.out.println(user.telefono);
            
        
        }
        
    
    
    
    }
    
    
    
}
