/*
 * Crea una aplicación que le pida dos números al usuario
y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main. 

 */
package guia_4;

import java.util.Scanner;

public class guia4_ejercicio_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        System.out.println("Seleccione la operación que desea realizar: ");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                int suma = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + suma);
                break;

            case 2:
                int resta = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resta);
                break;

            case 3:
                int multiplicacion = multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                break;

            case 4:
                double division = dividir(num1, num2);
                System.out.println("El resultado de la división es: " + division);
                break;

            default:
                System.out.println("La opción ingresada no es válida.");
                break;
        }

    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(int num1, int num2) {
        return (double) num1 / num2;

    }
}
