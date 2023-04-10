/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando
sus filas por columnas (o viceversa)


          1  0  4                         1  0  6
matriz A  0  5  0    -->>>      matriz B  0  5  0
          6  0 -9                         4  0 -9



 */
package guia_5;

import java.util.Random;


public class guia5_ejercicio_4 {

    
    public static void main(String[] args) {
        
        
      int[][] matriz = new int[4][4];
      
      // Llenar la matriz con valores aleatorios
      Random rand = new Random();
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            matriz[i][j] = rand.nextInt(100);
         }
      }
      
      // Mostrar la matriz original
      System.out.println("Matriz original:");
      mostrarMatriz(matriz);
      
      // Crear la matriz traspuesta
      int[][] traspuesta = new int[4][4];
      for (int j = 0; j < 4; j++) {
         for (int i = 0; i < 4; i++) {
            traspuesta[j][i] = matriz[i][j];
         }
      }
      
      // Mostrar la matriz traspuesta
      System.out.println("Matriz traspuesta:");
      mostrarMatriz(traspuesta);
   }
   
   // Función auxiliar para mostrar una matriz
   public static void mostrarMatriz(int[][] matriz) {
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            System.out.print(matriz[i][j] + " ");
         }
         System.out.println();
      }
   }
}
   
        
    
    
