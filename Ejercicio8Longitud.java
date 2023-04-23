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
public class Ejercicio8Longitud 
{ 
public static void main (String[] args) {   


Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase o palabra de 8 caracteres: ");
        String entrada = scanner.nextLine();
        if (entrada.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        
        }
}
}

   
 

