package utp.misiontic2022.c2;

public class App 
{
public static void main( String[] args )
    {
        Double auxnota=Double.parseDouble(args[0]);

        Double promedio = 0.0;
        Integer indnota=1;
        
        for(int i=1; i < args.length; i++){
            if(Double.parseDouble(args[i]) < auxnota){
                auxnota = Double.parseDouble(args[i]);
            }
        }
        args[indnota] = "0";
        for(int i=2; i<args.length; i++){
            promedio += Double.parseDouble(args[i]);
                
         }
        promedio /= args.length -2;

System.out.printf("el promedio del estudiante ID %s es: %.2f", args[0], promedio);
        
    }
        
}

