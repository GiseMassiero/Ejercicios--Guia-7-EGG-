/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfinales6;


import java.util.Scanner;

public class Ejercicio11Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmacion;

        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            num1 = input.nextInt();
        } while (num1 < 0);

        do {
            System.out.print("Ingrese el segundo número entero positivo: ");
            num2 = input.nextInt();
        } while (num2 < 0);

        do {
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("\nElija una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        System.out.println("La división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("\n¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = input.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

    }

}