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
public class numeroMaximoySumas {
 public static void main(String[] args) {    


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor límite positivo: ");
        int limite = scanner.nextInt();
        int suma = 0;
        int contador = 0;
        while (suma <= limite) {
            contador++;
            System.out.print("Introduce el número " + contador + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("La suma de los números introducidos es " + suma + " y superó el límite de " + limite);
    }
}
