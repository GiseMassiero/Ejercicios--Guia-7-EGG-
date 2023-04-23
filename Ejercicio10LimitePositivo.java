/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Maxi Tapia
 */
public class Ejercicio10LimitePositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner scanner = new Scanner (System.in);
       System.out.println("Ingrese un valor límite: ");
      int limite = scanner.nextInt(); 
      int suma = 0;
      int contador = 0;
      while (suma <= limite ){
          contador ++;
       System.out.println("Ingrese un número" + contador + ":"  );
       int num = scanner.nextInt();
       suma += num;
      }
 System.out.println("La suma de los numeros ingresados es: " + suma + " y superó el límite de "  + limite );
      
    }
    
}
