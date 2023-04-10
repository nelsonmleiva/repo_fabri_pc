/*
 Dado un tiempo en minutos, 
calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Pedir al usuario que ingrese el tiempo en minutos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = scanner.nextInt();

        // Calcular el número de días, horas y minutos equivalentes
        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;
        int minutosRestantes = minutos % 60;

        // Imprimir el resultado en pantalla
        System.out.println(minutos + " minutos equivalen a " + dias + " día(s), " + horas + " hora(s) y " + minutosRestantes + " minuto(s).");
        
    }
    
}
