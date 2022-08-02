package pkg6.pkg6;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite aqui o raio em cm para calcular o volume: ");
        double radius = input.nextDouble();
        System.out.printf("O volume da esfera com o raio %.2f cm é %.2f cm%n",radius,sphereVolume(radius));
    }
    private static double sphereVolume(double radius){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        
        return volume;
    }
}
