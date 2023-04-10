/*
 Crear un programa que dibuje una escalera de números, 
donde cada línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123

 */
package guia_3_extras;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la altura de la escalera: ");
        int altura = input.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
