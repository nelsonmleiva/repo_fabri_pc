/*
 Elaborar un algoritmo en el cuál se ingrese un número
entre 1 y 10 y se muestre su equivalente en romano.
 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
        // Pedir al usuario que ingrese un número entre 1 y 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = scanner.nextInt();

        // Mostrar el equivalente en romano del número ingresado
        switch (numero) {
            case 1:
                System.out.println("El número " + numero + " en romano es I.");
                break;
            case 2:
                System.out.println("El número " + numero + " en romano es II.");
                break;
            case 3:
                System.out.println("El número " + numero + " en romano es III.");
                break;
            case 4:
                System.out.println("El número " + numero + " en romano es IV.");
                break;
            case 5:
                System.out.println("El número " + numero + " en romano es V.");
                break;
            case 6:
                System.out.println("El número " + numero + " en romano es VI.");
                break;
            case 7:
                System.out.println("El número " + numero + " en romano es VII.");
                break;
            case 8:
                System.out.println("El número " + numero + " en romano es VIII.");
                break;
            case 9:
                System.out.println("El número " + numero + " en romano es IX.");
                break;
            case 10:
                System.out.println("El número " + numero + " en romano es X.");
                break;
            default:
                System.out.println("El número ingresado no está dentro del rango de 1 a 10.");
        }
    }
}

    
    

