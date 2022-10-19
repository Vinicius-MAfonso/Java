import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o valor R: ");
        double R = input.nextDouble();
        System.out.print("Digite o valor S: ");
        double S = input.nextDouble();
        System.out.print("Digite o valor T: ");
        double T = input.nextDouble();

        double[] numbers = {R,S,T};
        double maior = numbers[0];
        for(double currentNumber : numbers){
            if(maior < currentNumber)
                maior = currentNumber;
        }
        System.out.println("O maior número é o "+maior);
    }
}