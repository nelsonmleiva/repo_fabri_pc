/*
 Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar
la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse.

Nota: recordar el uso de la sentencia break.


 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        int num, cont = 0, contPar = 0, contImpar = 0;
        
        while (true) {
            System.out.print("Ingresa un número entero: ");
            num = input.nextInt();
            
            if (num < 0) {
                continue;
            }
            
            cont++;
            
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            
            if (num % 5 == 0) {
                System.out.println("El número ingresado es múltiplo de cinco.");
                break;
            }
        }
        
        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + contPar);
        System.out.println("Cantidad de números impares: " + contImpar);
    


    }
    
}
