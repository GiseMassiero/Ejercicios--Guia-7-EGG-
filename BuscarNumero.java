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
public class BuscarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        int num, numeroBuscado, contador = 0;
        boolean encontrado = false;

        System.out.print("Introduce el tamaño del vector: ");
        num = sc.nextInt();

        int[] numeros = new int[num];

        // Rellenar el vector con valores aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        // Mostrar el vector generado
        System.out.print("Vector generado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Pedir al usuario el número a buscar
        System.out.print("Introduce el número a buscar: ");
        numeroBuscado = sc.nextInt();

        // Buscar el número en el vector y mostrar su posición y si se encuentra repetido
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                contador++;
                System.out.printf("El número %d se encuentra en la posición %d.%n", numeroBuscado, i);
            }
        }

        if (!encontrado) {
            System.out.printf("El número %d no se encuentra en el vector.%n", numeroBuscado);
        } else if (contador > 1) {
            System.out.printf("El número %d se encuentra repetido %d veces en el vector.%n", numeroBuscado, contador);
        }
    }
}
    
