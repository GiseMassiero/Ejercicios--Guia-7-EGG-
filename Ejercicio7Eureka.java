/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfinales6;

import java.util.Scanner;

/**
 *
 * @author Maxi Tapia
 */
public class Ejercicio7Eureka {
 
   
public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        
        String frase = scanner.nextLine();
        
        if (frase.equals("eureka")) {
            
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto");
        }
    }
}

