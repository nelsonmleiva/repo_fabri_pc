package guia_2;


import java.util.Scanner;

/*
 Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */


public class guia2_ej4 {

   
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese los grados centigrados");
        
       int celsius = leer.nextInt();
       
       int fahrenheit = 32 + (9 * celsius / 5);
       
        System.out.println("el valor de celsius en fahrenheit es: " + fahrenheit);
        
        
        
        
        
       
               
       
       
    }
    
}
