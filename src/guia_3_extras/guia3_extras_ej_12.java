/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
que muestre los números del 0-0-0 al 9-9-9, con la particularidad 
que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package guia_3_extras;

/**
 *
 * @author fabri
 */
public class guia3_extras_ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    for (int i = 0; i < 1000; i++) {
      // Convertir el número a un String para poder buscar el dígito 3
      String numero = Integer.toString(i);
      // Sustituir el dígito 3 por una E si se encuentra en el número
      if (numero.contains("3")) {
        numero = numero.replace("3", "E");
      }
      // Asegurar que el número tenga 3 dígitos rellenando con ceros a la izquierda si es necesario
      while (numero.length() < 3) {
        numero = "0" + numero;
      }
      // Mostrar el número en el formato X-X-X
      System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2));
    }

    }
    
}
