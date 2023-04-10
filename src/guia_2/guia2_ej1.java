package guia_2;


import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. El programa deberá 
después mostrar el resultado de la suma */





public class guia2_ej1 {

    
    public static void main(String[] args) {
        
      Scanner obj = new Scanner(System.in);
      
      int num1;
              
      int num2;
              
      int resultado;
      
        System.out.println("ingrese dos numeros y le diremos el resultado de la suma");
        
      num1 = obj.nextInt();
      
      num2 = obj.nextInt();
      
      resultado = num1 + num2;
      
        System.out.println("el resultado de la suma es:" + resultado);
        
        
      
      
              
      
            
              
                      
      
    }
    
}
