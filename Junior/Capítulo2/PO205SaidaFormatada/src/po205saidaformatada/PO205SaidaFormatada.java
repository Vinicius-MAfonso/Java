package po205saidaformatada;
import java.util.Scanner;

public class PO205SaidaFormatada {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("No final?");
        int limite = input.nextInt();
        int soma = 0;
        for (int i = 1; i <= limite; i++) {
            System.out.printf("%3da soma parcial = %6d%n", i, soma);
            soma += i;
        }
        System.out.printf("Soma total[0..%3d] = %6d%n", limite,soma);
        input.close();
    }
    
}
