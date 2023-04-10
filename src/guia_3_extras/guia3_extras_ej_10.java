/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
    Scanner sc = new Scanner(System.in);
    
    int num1 = (int) (Math.random() * 11);
    int num2 = (int) (Math.random() * 11);
    int resultado = num1 * num2;
    
    System.out.printf("Adivina el resultado de %d x %d: ", num1, num2);
    int respuesta = sc.nextInt();
    
    while (respuesta != resultado) {
      System.out.println("Respuesta incorrecta, intenta nuevamente.");
      System.out.printf("Adivina el resultado de %d x %d: ", num1, num2);
      respuesta = sc.nextInt();
    }
    
    System.out.println("¡Felicidades! Tu respuesta es correcta.");
  }
}
 
        
