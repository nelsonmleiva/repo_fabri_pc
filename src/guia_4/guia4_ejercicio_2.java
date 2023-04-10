/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia_4;
import java.util.Scanner;

public class guia4_ejercicio_2 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese la cantidad de personas: ");
        n = sc.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre de la persona #" + (i+1) + ": ");
            nombres[i] = sc.next();

            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();

            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " es mayor de edad");
            } else {
                System.out.println(nombres[i] + " es menor de edad");
            }

            System.out.print("¿Desea ingresar los datos de otra persona? (Sí/No): ");
            String respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }

        System.out.println("Programa finalizado.");
    }
}
 
    
    

