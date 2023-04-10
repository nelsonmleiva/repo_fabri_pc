/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;


public class guia3_ej6 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int num1, num2;
        do {
            System.out.println("Ingrese dos números enteros positivos:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("La división es: " + ((float) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    sc.nextLine();
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa...");
                        return;
                    } else {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);
    }
}

        
        
    
    

