/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.ude.poo.hospital;

import co.edu.ude.poo.hospital.servicios.infoColector;
import co.edu.ude.poo.hospital.servicios.showinfo;
import co.edu.udec.poo.hospital.util.GestionDeAlmacenamiento;







/**
 *
 * @author nicolas
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        GestionDeAlmacenamiento.dbExists("3306","BDPOO","");
        
        infoColector.recolect();
        
        
        System.out.println(infoColector.tipoDeUsuario);
        
        showinfo.showclass();
        
        
        
        
        
        
        
    }
    
}
