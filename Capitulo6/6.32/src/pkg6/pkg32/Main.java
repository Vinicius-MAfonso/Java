package pkg6.pkg32;
import java.util.Scanner;
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o valor x1:");
        double x1 = input.nextInt();
        System.out.print("Digite o valor y1:");
        double y1 = input.nextInt();
        System.out.print("Digite o valor x2:");
        double x2 = input.nextInt();
        System.out.print("Digite o valor y2:");
        double y2 = input.nextInt();
        distance(x1, y1, x2, y2);
    }

    public static void distance(double x1,double y1,double x2,double y2){
        double x3 = Math.abs(x1-x2);
        double y3 = Math.abs(y1-y2);
        System.out.printf("A distância entre os pontos é x = %.2f e y = %.2f",x3,y3);
    }
}
