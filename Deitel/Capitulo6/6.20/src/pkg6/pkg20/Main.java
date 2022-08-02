package pkg6.pkg20;
import java.util.Scanner;

public class Main {
public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o raio do circulo: ");
        double raio = input.nextDouble();
        System.out.printf("A área do circulo é %.2f cm",tamCircle(raio));
    }
    private static double tamCircle(double r){
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
    
}
