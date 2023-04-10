/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no. El programa deberá comprobar
que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guia_5;

import java.util.Scanner;

public class guia5_ejercicio_6 {

    public static void main(String[] args) {

        int[][] cuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // Pedir los números del cuadrado por teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el número para la posición [" + i + "][" + j + "]: ");
                int numero = sc.nextInt();
                if (numero < 1 || numero > 9) {
                    System.out.println("El número introducido no es válido. Introduce un número del 1 al 9.");
                    j--; // repetir el número en la misma posición
                } else {
                    cuadrado[i][j] = numero;
                }
            }
        }

        // Calcular la suma de la primera fila y comprobar que todas las filas tienen la misma suma
        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        boolean filasIguales = true;
        for (int i = 1; i < 3; i++) {
            int sumaFila = cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2];
            if (sumaFila != sumaFila1) {
                filasIguales = false;
                break;
            }
        }

        // Calcular la suma de la primera columna y comprobar que todas las columnas tienen la misma suma
        int sumaColumna1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        boolean columnasIguales = true;
        for (int j = 1; j < 3; j++) {
            int sumaColumna = cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j];
            if (sumaColumna != sumaColumna1) {
                columnasIguales = false;
                break;
            }
        }

        // Calcular la suma de la diagonal principal y comprobar que las diagonales tienen la misma suma
        int sumaDiagonalPrincipal = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        boolean diagonalesIguales = sumaDiagonalPrincipal == (cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0]);

        // Comprobar si el cuadrado es mágico
        if (filasIguales && columnasIguales && diagonalesIguales) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }
}
