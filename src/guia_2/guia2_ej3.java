package guia_2;


import java.util.Scanner;

/*
 Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y después toda en minúsculas.

Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */



public class guia2_ej3 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("ingrese una frase:");
        
        String frase = leer.nextLine();
        
        System.out.println( frase.toLowerCase() );
        
        System.out.println( frase.toUpperCase() );
                      
                
    }
    
}
