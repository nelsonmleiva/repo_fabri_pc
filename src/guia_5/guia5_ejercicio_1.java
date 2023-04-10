/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 */
package guia_5;

import java.util.Arrays;

/**
 *
 * @author fabri
 */
public class guia5_ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

      int[] vector = new int[100];
      for (int i = 0; i < 100; i++) {
         vector[i] = i + 1;
      }
      
      Arrays.sort(vector);
      for (int i = vector.length - 1; i >= 0; i--) {
         System.out.print(vector[i] + " ");
      }
   }
}

    
    

