package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) 
    {     
        System.out.println("Estructura if");
        System.out.println( "ingrese un numero: " );
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero == 47)
        {  
            System.out.print("Estamos en el grupo 47.");

        } else if (numero == 77)
        {   
            System.out.print("Estamos en el grupo 77.");

        }else if (numero == 17)  
        {  
             System.out.print("Estamos en el grpo 17.");

        } else 
        {   
            System.out.printf("Estamos en el grupo %d\n", numero);
        }
            System.out.println("ciclo while (switch)");

        boolean band = true;
        int contador = 0;
         
        while (band)
         {
            if (contador == 5)
            {
                band = false;
            } 
                contador += 1;    
        }
        System.out.printf("\ningrese un numro: ");
        numero = input.nextInt();

        switch (numero)
        {
            case 47:
                System.out.println("Estamos en grupo 47.");
                break;
            case 77:
                System.out.println("Estamos en grupo 77.");
                break;
            case 17:
                System.out.println("Estamos en grupo 17.");
                break;
            default:
                System.out.printf("\nEstamos en el grupo %d", numero);
                break;        
        }
                System.out.println("\nciclo do while");

        do {
            if (contador == 5)
        {
            band = false;
        }
        contador += 1;
            
        System.out.println("ingrese un numero: ");
        numero = input.nextInt();
        switch (numero)
        {
            case 47:
                System.out.println("Estamos en grupo 47.");
                break;
                    
            case 77:
                System.out.println("Estamos en grupo 77.");
                break;

            case 17:
                System.out.println("Estamos en grupo 17.");
                break;

            default:
                System.out.printf("Estamos en el grupo %d", numero);
                break;        
            }          
        } while (band);

            System.out.printf("\nCiclo for");

        for (int i = 0; i<6; i++)
            {
            System.out.println("\ningrese un numero: ");

            numero = input.nextInt();

            if (numero == 47)
            {  
                System.out.print("Estamos en el grupo 47.");

            } else if (numero == 77)
            {   
            System.out.print("Estamos en el grupo 77.");

            } else if (numero == 17)  
            {  
                System.out.print("Estamos en el grpo 17.");

            } else 
            {   
                System.out.printf("Estamos en el grupo %d\n", numero);
            }
            
        }

        input.close();
    } 
        
}
