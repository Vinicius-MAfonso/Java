package maximumfinder;
import java.util.Scanner;

public class MaximumFinder {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com 3 números separados por espaço: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        System.out.println("O maior valor entre os 3 "
                + "é o "+ maior(number1, number2, number3));
    }
    public static double maior(double x, double y, double z){
        return Math.max(x, Math.max(y,z));//O max interno vai determinar o maior de y e z
        //depois o externo vai determinar o maior entre o x e o resultado do interno
    }
}
