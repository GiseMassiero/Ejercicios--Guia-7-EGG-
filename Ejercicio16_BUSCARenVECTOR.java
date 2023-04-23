/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfinales6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maxi Tapia
 */
public class Ejercicio16_BUSCARenVECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        
        // Rellenar el vector con valores aleatorios entre 0 y 99999
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100000);
        }
        
        System.out.println("Vector generado: " + Arrays.toString(vector));
        
        int[] digitos = new int[6]; // Índice 0 no se utiliza, índices 1-5 son para 1-5 dígitos
        
        for (int num : vector) {
            int contadorDigitos = 0;
            while (num != 0) {
                contadorDigitos++;
                num /= 10;
            }
            digitos[contadorDigitos]++;
        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número de elementos con " + i + " dígito(s): " + digitos[i]);
        }
    }
}