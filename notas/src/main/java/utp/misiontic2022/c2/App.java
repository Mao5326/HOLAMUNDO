package utp.misiontic2022.c2;

import java.util.function.DoubleBinaryOperator;

public class App 
{
public static void main( String[] args)
    {
        Double auxnota=Double.parseDouble(args[1]);
        Double promedio = auxnota;
        
        for(int i=2; i<args.length; i++){
            promedio += Double.parseDouble(args[i]);
            if(Double.parseDouble(args[i]) < auxnota){
                auxnota = Double.parseDouble(args[i]);
            }   
         }
        promedio -= auxnota;
        promedio /= args.length -2;
        promedio *= 0.05;
System.out.printf( "el promedio del estudiante ID %s\t es: %.2f", args[0], promedio);
        
    }
        
}

