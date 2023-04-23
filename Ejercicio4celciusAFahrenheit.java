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
public class Ejercicio4celciusAFahrenheit {

    public static void main(String[] args) {


        try (Scanner input = new Scanner(System.in)) {
            float c,f;
            System.out.println("Ingresa los grados celsius");
            c = input.nextFloat();
            f = (c * 9/5) + 32;
            System.out.println(c+ " grados celsius convertidos a grados fahrenheit es: " + f);
        }

    }

}   

