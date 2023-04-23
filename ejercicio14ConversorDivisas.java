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
public class ejercicio14ConversorDivisas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double euros = input.nextDouble();
        
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Libras");
        System.out.println("2. Dólares");
        System.out.println("3. Yenes");
        System.out.print("Opción: ");
        int opcion = input.nextInt();
        
        switch (opcion) {
            case 1:
                convertirDivisa(euros, "libras");
                break;
            case 2:
                convertirDivisa(euros, "dólares");
                break;
            case 3:
                convertirDivisa(euros, "yenes");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
            }
            
    }
    public static void convertirDivisa(double euros, String moneda) {
        double cambio = 0;
        switch (moneda) {
            case "libras":
                cambio = 0.86;
                break;
            case "dólares":
                cambio = 1.28611;
                break;
            case "yenes":
                cambio = 129.852;
                break;
        }
        double cantidad = euros * cambio;
        System.out.println(euros + " euros son " + cantidad + " " + moneda);
    }

}

