/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es 
igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y 
se obtiene cambiando sus filas por columnas (o viceversa).


           0 -2  4                         0  2 -4
matriz A   2  0  2               matriz B -2  0 -2
          -4 -2  0                         4  2  0 



 */
package guia_5;

import java.util.Random;


public class guia5_ejercicio_5 {

    
    public static void main(String[] args) {
        
         
      int[][] matriz = new int[3][3];
      
      // Llenar la matriz con valores aleatorios
      Random rand = new Random();
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            matriz[i][j] = rand.nextInt(100);
         }
      }
      
      // Mostrar la matriz original
      System.out.println("Matriz original:");
      mostrarMatriz(matriz);
      
      // Comprobar si la matriz es antisimétrica
      boolean antisimetrica = true;
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            if (matriz[i][j] != -matriz[j][i]) {
               antisimetrica = false;
               break;
            }
         }
      }
      
      // Mostrar el resultado
      if (antisimetrica) {
         System.out.println("La matriz es antisimétrica.");
      } else {
         System.out.println("La matriz no es antisimétrica.");
      }
   }
   
   // Función auxiliar para mostrar una matriz
   public static void mostrarMatriz(int[][] matriz) {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + " ");
         }
         System.out.println();
      }
   
  
    }
    
}
