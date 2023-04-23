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
public class Conversordemoneda {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner sc = new Scanner(System.in);
        double cantidad, resultado;
        String moneda;

        System.out.print("Introduce la cantidad de euros que quieres convertir: ");
        cantidad = sc.nextDouble();

        System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
        moneda = sc.next();

        if (moneda.equalsIgnoreCase("libras")) {
            resultado = cantidad * 0.86;
            System.out.printf("%.2f € son %.2f libras.", cantidad, resultado);
        } else if (moneda.equalsIgnoreCase("dolares")) {
            resultado = cantidad * 1.28611;
            System.out.printf("%.2f € son %.2f dolares.", cantidad, resultado);
        } else if (moneda.equalsIgnoreCase("yenes")) {
            resultado = cantidad * 129.852;
            System.out.printf("%.2f € son %.2f yenes.", cantidad, resultado);
        } else {
            System.out.println("Moneda no válida.");
        }
    }
}
//En este código, utilizamos la clase Scanner para obtener los valores introducidos por el usuario por teclado.
//A continuación, utilizamos una estructura condicional if-else para determinar a qué moneda convertir la cantidad
//de euros introducida. En cada caso, multiplicamos la cantidad de euros por el tipo de cambio correspondiente 
//y mostramos el resultado en pantalla utilizando el método printf() para formatear el texto.
