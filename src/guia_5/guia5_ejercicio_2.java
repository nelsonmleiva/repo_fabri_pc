/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package guia_5;

import java.util.Random;
import java.util.Scanner;


public class guia5_ejercicio_2 {

    
    public static void main(String[] args) {
        
        
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int n, x;
      
      System.out.print("Ingrese el tamaño del vector: ");
      n = input.nextInt();
      int[] vector = new int[n];
      
      // Llenar el vector con valores aleatorios
      for (int i = 0; i < n; i++) {
         vector[i] = random.nextInt(100) + 1;
      }
      
      System.out.print("Ingrese el número a buscar: ");
      x = input.nextInt();
      boolean encontrado = false;
      int posicion = 0, contador = 0;
      
      // Buscar el número en el vector
      for (int i = 0; i < n; i++) {
         if (vector[i] == x) {
            encontrado = true;
            contador++;
            posicion = i;
         }
      }
      
      // Mostrar los resultados de la búsqueda
      if (encontrado) {
         System.out.println("El número " + x + " se encontró en la posición " + posicion + " del vector.");
         if (contador > 1) {
            System.out.println("El número " + x + " aparece " + contador + " veces en el vector.");
         }
      } else {
         System.out.println("El número " + x + " no se encontró en el vector.");
      }
   }

    }
    

