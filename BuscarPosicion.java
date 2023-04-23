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
public class BuscarPosicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Introduce el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        // Rellenar el vector con valores aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100); // Valores aleatorios entre 0 y 99
        }
        
        System.out.println("Vector generado: " + Arrays.toString(vector));
        
        System.out.print("Introduce un número para buscar en el vector: ");
        int num = leer.nextInt();
        
        boolean encontrado = false;
        int primeraPosicion = 0;
        int ultimaPosicion = -1;
        
        // Buscar el número en el vector y registrar su posición
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                if (!encontrado) {
                    primeraPosicion = i;
                    encontrado = true;
                }
                ultimaPosicion = i;
            }
        }
        
        if (encontrado) {
            System.out.println("El número " + num + " se encuentra en el vector.");
            System.out.println("Posición(es): " + primeraPosicion + " - " + ultimaPosicion);
            if (primeraPosicion != ultimaPosicion) {
                System.out.println("El número está repetido.");
            }
        } else {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
}