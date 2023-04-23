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
public class ejercicio20CuboMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int suma = 0;
        boolean magico = true;
        
        //Solicitar los valores para cada elemento del cuadrado mágico
        System.out.println("Ingrese los valores para cada elemento del cuadrado mágico 3x3:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                cuadrado[i][j] = entrada.nextInt();
                //Comprobar que los números ingresados son válidos (entre 1 y 9)
                if(cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: el número ingresado debe estar entre 1 y 9.");
                    return;
                }
            }
        }
        
        //Calcular la suma de la primera fila
        for(int j=0; j<3; j++) {
            suma += cuadrado[0][j];
             boolean[][] Cuadrado = null;
             int i = 0;
            System.out.print(Cuadrado[i][j]);
        } 
              
        //Comprobar si las filas tienen la misma suma
        for(int i=1; i<3; i++) {
            int sumaFila = 0;
            for(int j=0; j<3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if(sumaFila != suma) {
                magico = false;
                break;
            }
        }
        
        //Comprobar si las columnas tienen la misma suma
        if(magico) {
            for(int j=0; j<3; j++) {
                int sumaColumna = 0;
                for(int i=0; i<3; i++) {
                    sumaColumna += cuadrado[i][j];
                }
                if(sumaColumna != suma) {
                    magico = false;
                    break;
                }
            }
        }
        
        //Comprobar si las diagonales tienen la misma suma
        if(magico) {
            int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
            int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
            if(sumaDiagonal1 != suma || sumaDiagonal2 != suma) {
                magico = false;
            }
        }
        
        //Mostrar el resultado
        if(magico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
        
    }

}
