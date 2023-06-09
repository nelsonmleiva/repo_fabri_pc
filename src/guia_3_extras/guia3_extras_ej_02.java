/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: 
B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.


 */
package guia_3_extras;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declarar y asignar valores iniciales a las variables
        int A = 10, B = 20, C = 30, D = 40;

        // Imprimir los valores iniciales de cada variable
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // Utilizar una variable auxiliar para intercambiar los valores
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        // Imprimir los valores finales de cada variable
        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
    
}
