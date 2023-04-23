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

public class asteriscosynumeros {
    

  public static void main(String [] args) { 
      
  
    Scanner leer = new Scanner(System.in); 

   int n;
   int n2;
   int n3;
   int n4;
   
     System.out.print ("Ingrese 4 numeros ");
     
    n = leer.nextInt();
    n2 = leer.nextInt();
    n3 = leer.nextInt();
    n4 = leer.nextInt();
  
 
    if (n<=20) {
         System.out.print(n);
        for (int i = 0; i < 4 ; i++) 
            System.out.print("*");
    } else {
    System.out.print("El numero ingresado en invalido");
 

   System.out.println(" ");
    if (n2<=20) {
        System.out.print(n2);
        for (int i = 0; i < n2; i++) 
            System.out.print("*");
        
        } else {
        System.out.print("El numero ingresado en invalido");
 
    
    System.out.println(" ");
    }
    if (n3<=20) {
        System.out.print(n3);
        for (int i = 0; i < n3; i++) 
            System.out.print("*");

    
    }else {
        System.out.print("El numero ingresado en invalido");}
 
     System.out.println(" "); 
     
    if (n4<=20) {
      System.out.print(n4);
        for (int i = 0; i < n4; i++);
            System.out.print("*");
 
        }else {
        System.out.print("El numero ingresado es invalido");
    }
    }
  }
}


    
   
   

   

