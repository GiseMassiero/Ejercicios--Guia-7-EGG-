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
public class cambiarCaracteres {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase terminada en punto:");
        String frase = scanner.nextLine();

        String fraseCodificada = codificarVocales(frase);

        System.out.println("La frase codificada es:");
        System.out.println(fraseCodificada);
    }

    public static String codificarVocales(String frase) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            switch (c) {
                case 'a':
                    System.out.print('@');
                    break;
                case 'e':
                    System.out.print('#');
                    break;
                case 'i':
                   System.out.print('$');
                    break;
                case 'o':
                    System.out.print('%');
                    break;
                case 'u':
                    System.out.print('*');
                    break;
                case 'A':
                   System.out.print('@');
                    break;
                case 'E':
                    System.out.print('#');
                    break;
                case 'I':
                   System.out.print('$');
                    break;
                case 'O':
                    System.out.print('%');
                    break;
                case 'U':
                   System.out.print('*');
                    break;
                default:
                    System.out.print(c);
                    break;
            }
        }

        return sb.toString();
    }
} 
//switch para reemplazar las vocales por los caracteres correspondientes, 
//y mantener el resto de los caracteres sin cambios. 
//La codificación se va acumulando en un objeto de la clase StringBuilder. 
//Finalmente, se devuelve la codificación en forma de cadena de caracteres, 
//utilizando el método toString de la clase StringBuilder.
