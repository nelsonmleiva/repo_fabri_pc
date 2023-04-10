/*
 Realice un programa que calcule y visualice el valor máximo, 
el valor mínimo y el promedio de n números (n>0).
El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando 
el bucle “while” y otra con el bucle “do - while”.

 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = leer.nextInt();

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        int contador = 0;

        while (contador < n) {
            System.out.print("Ingrese un número: ");
            double num = leer.nextDouble();

            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);

            contador++;
        }

        double promedio = sum / n;

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
}

  