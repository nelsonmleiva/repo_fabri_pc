/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia_3;
import java.util.Scanner;

public class guia3_ej8 {

    
    public static void main(String[] args) {
       
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    if (i > 1 && i < num) {
                        if (j == 2 || j == num-1) {
                            System.out.print("  ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

    
    

