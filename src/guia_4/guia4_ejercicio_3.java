/*
 Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá
como parámetros, la cantidad de euros y la moneda a convertir
que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia_4;

import java.util.Scanner;

public class guia4_ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros a convertir: ");
        double euros = sc.nextDouble();
        sc.nextLine(); // limpiar buffer del scanner

        System.out.print("Introduce la moneda a la que quieres convertir (USD, JPY o GBP): ");
        String moneda = sc.nextLine();

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double tasaCambio = 0.0;

        switch (moneda.toUpperCase()) {
            case "USD":
                tasaCambio = 1.28611;
                break;
            case "JPY":
                tasaCambio = 129.852;
                break;
            case "GBP":
                tasaCambio = 0.86;
                break;
            default:
                System.out.println("Moneda no válida.");
                return;
        }

        double resultado = euros * tasaCambio;

        System.out.println(euros + " euros son " + resultado + " " + moneda.toUpperCase());

    }

}
