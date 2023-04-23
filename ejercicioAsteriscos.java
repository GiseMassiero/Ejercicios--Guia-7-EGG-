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
public class ejercicioAsteriscos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int i, k;
        int num = 0;
        
        for (i = 0; i < 4; i++) {
            
            do {
                System.out.print("Ingrese un número(1-20): ");
                num = leer.nextInt();
            } while (num<0 && num>20);
            
            if (num<21 && num>0){
                System.out.print(num + " ");
            
                for (k = 0; k < num; k++) {
                System.out.print("*");
                }
                System.out.println(" ");    
            }
            else {
                i--;
            }
        
        }    

    }
}
