/*
 Crear un programa que pida una frase y si esa 
frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package guia_3;

import java.util.Scanner;


public class guia3_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("ingrese una frase: ");
        String frase = sc.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")){
                     
        
                       
            System.out.println("correcto");
            
        }else {
            System.out.println("incorrecto");
        }
        
        
        
        
        
                
       
       
       
        
        
        
        
    }
    
}
