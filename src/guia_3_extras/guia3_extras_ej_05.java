/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio,
y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.
 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Pedir al usuario que ingrese la clase del socio y el costo del tratamiento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char clase = scanner.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        double costo = scanner.nextDouble();

        // Calcular el importe a pagar por el socio en función de su clase y del costo del tratamiento
        double importe;
        switch (clase) {
            case 'A':
                importe = costo / 2;
                break;
            case 'B':
                importe = costo * 0.65;
                break;
            case 'C':
                importe = costo;
                break;
            default:
                System.out.println("La clase ingresada es incorrecta.");
                return;
        }

        // Mostrar el importe a pagar por el socio
        System.out.println("El importe a pagar por el socio de clase " + clase + " es $" + importe + ".");
    }
    
}
