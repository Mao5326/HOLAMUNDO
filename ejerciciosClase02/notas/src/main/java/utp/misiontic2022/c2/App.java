package utp.misiontic2022.c2;
import java.util.function.DoubleBinaryOperator;

public class App 
{
    public static void main( String[] args )
    {
        double auxnota=Double.parseDouble(args[0]);
        for(int i=1; i<args.length; i++){
            if(Double.parseDouble(args[i]) < auxnota){
                auxnota = Double.parseDouble(args[i]);
            }
        }
        System.out.println(auxnota);
    }
}
