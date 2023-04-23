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
public class Ejercicio9PrimeraA {
   public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase o palabra: ");
        String entrada = scanner.nextLine();
        if (entrada.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
