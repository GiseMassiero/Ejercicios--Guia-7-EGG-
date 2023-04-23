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
public class Ejercicio17_ContarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

              Scanner sc = new Scanner(System.in);
        int n, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;

        System.out.print("Introduce el tamaño del vector: ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        // Rellenar el vector con valores aleatorios entre 1 y 99999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 99999) + 1;
        }

        // Contar el número de dígitos de cada número en el vector
        for (int i = 0; i < numeros.length; i++) {
            int digitos = 0;
            int numero = numeros[i];

            while (numero != 0) {
                numero /= 10;
                digitos++;
            }

            switch (digitos) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
            }
        }

        // Mostrar los resultados de la contabilización
        System.out.printf("Números de 1 dígito: %d%n", contador1);
        System.out.printf("Números de 2 dígitos: %d%n", contador2);
        System.out.printf("Números de 3 dígitos: %d%n", contador3);
        System.out.printf("Números de 4 dígitos: %d%n", contador4);
        System.out.printf("Números de 5 dígitos: %d%n", contador5);
    }
}

    

    

