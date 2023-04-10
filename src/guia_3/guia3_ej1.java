/*
Crear un programa que dado un número determine si es par o impar.
 */
package guia_3;

import java.util.Scanner;


public class guia3_ej1 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        
        int num;
        
        num = leer.nextInt();
        
        if (num % 2 == 0){
        
          System.out.println("el numero es par");
        
        }else {
          
          System.out.println("el numero es impar");
            
        }
        
        
        
                

    

    }
}