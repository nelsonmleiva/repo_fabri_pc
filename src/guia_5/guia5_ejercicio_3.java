/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package guia_5;

import java.util.Scanner;


public class guia5_ejercicio_3 {

    public static void main(String[] args) {
        
      
      Scanner input = new Scanner(System.in);
      int n;
      
      System.out.print("Ingrese el tamaño del vector: ");
      n = input.nextInt();
      int[] vector = new int[n];
      
      // Llenar el vector con valores ingresados por el usuario
      for (int i = 0; i < n; i++) {
         System.out.print("Ingrese un número entero: ");
         vector[i] = input.nextInt();
      }
      
      // Inicializar las variables contadoras
      int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
      
      // Contar cuántos números tienen cada longitud
      for (int i = 0; i < n; i++) {
         int digitos = contarDigitos(vector[i]);
         switch (digitos) {
            case 1:
               d1++;
               break;
            case 2:
               d2++;
               break;
            case 3:
               d3++;
               break;
            case 4:
               d4++;
               break;
            case 5:
               d5++;
               break;
            default:
               break;
         }
      }
      
      // Mostrar los resultados del conteo
      System.out.println("Números de 1 dígito: " + d1);
      System.out.println("Números de 2 dígitos: " + d2);
      System.out.println("Números de 3 dígitos: " + d3);
      System.out.println("Números de 4 dígitos: " + d4);
      System.out.println("Números de 5 dígitos: " + d5);
   }
   
   // Función auxiliar para contar los dígitos de un número entero
   public static int contarDigitos(int numero) {
      if (numero == 0) {
         return 1;
      }
      int contador = 0;
      while (numero != 0) {
         numero /= 10;
         contador++;
      }
      return contador;
   

   
        
    }
    
}
