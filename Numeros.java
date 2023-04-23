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
public class Numeros {

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi Tapia
     * @param args
 */
public static void main(String [] args) {
    
Scanner leer = new Scanner(System.in);

    
     int valor; 
     
System.out.print("Ingrese el valor: ");
      
 valor = leer.nextInt () ;
 

if (valor>0 && valor<11) {
    System.out.print("Esta en el rango del 0 al 10");
}
       
else if(valor>10 && valor<21) {
   System.out.print("Esta en el rango del 11 al 20");
}       
else if (valor>20 && valor<31){
System.out.print("Esta en el rango del 21 al 30");
}
else {
    System.out.print("El numero no esta en ningun rango") ;
}
}
}






