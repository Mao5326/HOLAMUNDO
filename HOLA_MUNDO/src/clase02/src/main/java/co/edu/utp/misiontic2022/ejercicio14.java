package co.edu.utp.misiontic2022;
import java.util.Scanner;


public class ejercicio14 {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de numeros fibonacci que desea obtener" );
        Integer N = input.nextInt();
        input.close();
        Integer f1=0; 
        Integer f2=1;
    
            if (N == 1) {
                 System.out.println(f1);
            }
            else if (N == 2) {
                System.out.printf("%d %d", f1, f2);
            }
            else {
             Integer contador = 0;
            System.out.printf("%d ", f1);

            while (contador <= N) {
                f1 = f1+f2;
                f2 = f1-f2;
                System.out.printf("%d ", f1);
                ++contador;
            }
         }
    }
}
    