package guia_2;


import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */


public class guia2_ej5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        
        int numero = leer.nextInt();
        
        int numeroDoble = numero * 2;
        
        int numeroTriple = numero * 3;
        
        double RaizCuadrada = Math.sqrt(numero);
        
        System.out.println("el doble de su ingreso es: " + numeroDoble);
        
        System.out.println("el triple del valor ingresado es: " + numeroTriple);
        
        System.out.println("la raiz cuadrada del ingreso es: " + RaizCuadrada);
        
        
        
                
        
        
    }
    
}
