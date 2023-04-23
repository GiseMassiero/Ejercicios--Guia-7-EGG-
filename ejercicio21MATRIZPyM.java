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
public class ejercicio21MATRIZPyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        boolean encontrada = false;
        
        //Solicitar los valores para cada elemento de la matriz M
        System.out.println("Ingrese los valores para cada elemento de la matriz M (10x10):");
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matrizM[i][j] = leer.nextInt();
            }
        }
        
        //Solicitar los valores para cada elemento de la matriz P
        System.out.println("Ingrese los valores para cada elemento de la matriz P (3x3):");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matrizP[i][j] = leer.nextInt();
            }
        }
        
        //Comprobar si la matriz P está contenida dentro de la matriz M
        for(int i=0; i<8; i++) { //Recorrer las filas de la matriz M
            for(int j=0; j<8; j++) { //Recorrer las columnas de la matriz M
                boolean coinciden = true;
                for(int k=0; k<3; k++) { //Recorrer las filas de la matriz P
                    for(int l=0; l<3; l++) { //Recorrer las columnas de la matriz P
                        if(matrizM[i+k][j+l] != matrizP[k][l]) { //Comprobar si los elementos coinciden
                            coinciden = false;
                            break;
                        }
                    }
                    if(!coinciden) {
                        break;
                    }
                }
                if(coinciden) { //Si todos los elementos coinciden, se ha encontrado la matriz P
                    encontrada = true;
                    System.out.println("La matriz P está contenida dentro de la matriz M en la fila " + i + " y la columna " + j + ".");
                    break;
                }
            }
            if(encontrada) {
                break;
            }
        }
        
        if(!encontrada) {
            System.out.println("La matriz P no está contenida dentro de la matriz M.");
        }
        
    }
}


