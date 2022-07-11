package pkg6.pkg10;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double x;
        
        System.out.print("Digite o valor para ser aproximado: ");
        x = input.nextDouble();
           
        System.out.printf("O valor aproximado de %.2f em inteiro é %f%n",x,roundToInteger(x));
        System.out.printf("O valor aproximado de %.2f em decimais é %f%n",x,roundToTenths(x));
        System.out.printf("O valor aproximado de %.2f em centésimos? é %f%n",x,roundToHundredths(x));
        System.out.printf("O valor aproximado de %.2f em milésimos? é %f%n",x,roundToThousandths(x));
    }
    public static double roundToInteger(double x){
        double y = x;
        return y;
    }
    public static double roundToTenths(double x){
        double y =  Math.floor(x * 10+0.5)/10;
        return y;
    }
    public static double roundToHundredths(double x){
        double y = Math.floor(x * 100+0.5)/10;
        return y;
    }
    public static double roundToThousandths(double x){
        double y = Math.floor(x * 1000+0.5)/1000;
        return y;
    }
    
}
