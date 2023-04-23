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
public class ejercicio20_MatrizMágica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int M = 0;
        
        while (M<3){
            System.out.println("Ingrese el tamaño de la matriz apartir del 3:");
            M = leer.nextInt();
        }
        
        int constante = (M*(M*M+1))/2;

        int[][] matriz = new int[M][M];
        int[] sumaFilas = new int[M];
        int[] sumaColumnas = new int[M];
        
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese en la matriz numeros del 1 al "+M*M+".");
        
        for (int i=0;i<M;i++){
            for(int k=0;k<M;k++){
                System.out.println("En la posición ("+(i+1)+","+(k+1)+"), estara el numero que ingrese:");
                int num = leer.nextInt();
                
                while (num<1 || num>M*M){
                    System.out.println("Ingrese nuevamente un número entre 1 y "+M*M+", para la posición ("+(i+1)+", "+(k+1)+"):");
                    num = leer.nextInt();
                }
                matriz[i][k] = num;
            }
        }
        
        System.out.println("");
        System.out.println("-------------IMPRIMIENDO-MATRIZ-------------");

        for (int i=0;i<M;i++){
            for(int k=0;k<M;k++){
                System.out.print("["+matriz[i][k]+"] ");
            }
            System.out.println("");
        }
        
        int sumaF = 0;
        int sumaD1 = 0;
        
        for (int i=0;i<M;i++){
            for(int k=0;k<M;k++){
                sumaF = sumaF + matriz[i][k];
                if (i==k){
                    sumaD1 = sumaD1 + matriz[i][k];
                }
            }
            sumaFilas[i] = sumaF;
            sumaF = 0;
        }
        
        int sumaC = 0;
        
        for (int k=0;k<M;k++){
            for(int i=0;i<M;i++){
                sumaC = sumaC + matriz[i][k];
            }
            sumaColumnas[k] = sumaC;
            sumaC = 0;
        }
        
        int c = M-1;
        int sumaD2 = 0;
        
        for (int i=0;i<M;i++){
            sumaD2 = sumaD2 + matriz[i][c];
            c--;
        }
        
        System.out.println("");
        System.out.println("-------------ANALIZANDO-MATRIZ-------------");
        
        System.out.println("Filas:");
        
        for (int i=0;i<M;i++){
            System.out.println("En la "+(i+1)+"º fila la suma de los numeros es "+sumaFilas[i]+".");
        }
        
        System.out.println("");
        System.out.println("Filas:");
        
        for (int k=0;k<M;k++){
            System.out.println("En la "+(k+1)+"º columna la suma de los numeros es "+sumaColumnas[k]+".");
        }
        
        System.out.println("");
        System.out.println("Diagonales:");
        System.out.println("En la diagonal principal la suma es "+sumaD1);
        System.out.println("En la diagonal secundaria la suma es "+sumaD2);
        
        int cont = 0;
        
        for (int i=0;i<M;i++){
            if (sumaFilas[i]==constante && sumaColumnas[i]==constante && sumaD1==constante && sumaD2==constante){
                cont++;
            }
        }
        
        System.out.println("");
        System.out.println("-----------------RESULTADO-----------------");
        
        if (cont==M){
            System.out.println("La matriz SI es un matriz magica");
        }
        else {
            System.out.println("La matriz NO es un matriz magica");
        }
        System.out.println("");
    }
    
}
