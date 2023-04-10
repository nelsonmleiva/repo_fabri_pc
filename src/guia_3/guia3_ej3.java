/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 

Nota: investigar la función Lenght() en Java.
 */
package guia_3;

import java.util.Scanner;


public class guia3_ej3 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una palabra de ocho letras: ");
        
        String palabra = leer.nextLine();
        
        
        if (palabra.length() == 8) {            
                    
        System.out.println("la palabra contiene 8 letras");
        
        }else { 
            System.out.println("palabra incorrecta");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
