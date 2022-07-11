package pkg6.pkg15;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o tamanho do primeiro lado: ");
        double side1 = input.nextDouble();
        System.out.print("Digite o tamanho do segundo lado: ");
        double side2 = input.nextDouble();
        
        System.out.printf("A hipotenusa do triângulo com os lados %.2f e %.2f "
                + "é %.2f%n",side1,side2,hypotenuse(side1, side2));
    }
    private static double hypotenuse(double side1, double side2){
        double result = Math.pow(side1, 2)+Math.pow(side2, 2);
        return result;
    }
}
