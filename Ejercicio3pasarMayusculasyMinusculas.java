/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfinales6;

/**
 *
 * @author Maxi Tapia
 */
public class Ejercicio3pasarMayusculasyMinusculas {
	public static void main(String[] args) {
		String cadenaOriginal = "Hola mundo, cadena de Java desde parzibyte.me";
		System.out.println("Original es: " + cadenaOriginal);
		// Para convertir a minúscula, usa toLowerCase
		String minuscula = cadenaOriginal.toLowerCase();
		System.out.println("Minúscula es: " + minuscula);
		// Para convertir a mayúscula, usa toUpperCase
		String mayuscula = cadenaOriginal.toUpperCase();
		System.out.println("Mayúscula es: " + mayuscula);
	}
}   

