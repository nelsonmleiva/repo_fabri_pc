/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.


 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        // Pedir al usuario que ingrese el número de personas y las alturas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();

        double totalEstaturas = 0.0; // Acumulador para la suma de todas las estaturas
        double totalEstaturasBajas = 0.0; // Acumulador para la suma de las estaturas por debajo de 1.60 m
        int numEstaturasBajas = 0; // Contador para el número de estaturas por debajo de 1.60 m

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la altura de la persona " + i + " en metros: ");
            double altura = scanner.nextDouble();
            totalEstaturas += altura; // Agregar la altura a la suma total de estaturas

            if (altura < 1.60) {
                totalEstaturasBajas += altura; // Agregar la altura a la suma total de estaturas por debajo de 1.60 m
                numEstaturasBajas++; // Incrementar el contador de estaturas por debajo de 1.60 m
            }
        }

        // Calcular los promedios de estaturas en general y por debajo de 1.60 m
        double promedioEstaturas = totalEstaturas / n;
        double promedioEstaturasBajas = numEstaturasBajas > 0 ? totalEstaturasBajas / numEstaturasBajas : 0.0;

        // Mostrar los resultados
        System.out.println("El promedio de estaturas en general es de " + promedioEstaturas + " metros.");
        System.out.println("El promedio de estaturas por debajo de 1.60 m es de " + promedioEstaturasBajas + " metros.");
    }
}

        
    
    

