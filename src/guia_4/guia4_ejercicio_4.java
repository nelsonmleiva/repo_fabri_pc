/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo,
debe devolver true si es primo, sino false.

 */
package guia_4;

import java.util.Scanner;

public class guia4_ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
