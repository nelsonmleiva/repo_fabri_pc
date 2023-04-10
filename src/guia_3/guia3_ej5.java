/*
 Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion
solicite numeros al usuario hasta que la suma de los números introducidos supere
el limite inicial.
 */
package guia_3;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_ej5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        


       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor límite positivo:");
        int limite = sc.nextInt();

        int suma = 0;
        int numero;
        int contador = 0;

        while (suma <= limite) {
            System.out.println("Ingresa un número:");
            numero = sc.nextInt();
            suma += numero;
            contador++;
        }

        System.out.println("Se han introducido " + contador + " números.");
        System.out.println("La suma total es: " + suma);
    }
}

        
        
     

