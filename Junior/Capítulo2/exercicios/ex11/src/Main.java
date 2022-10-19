import java.util.Locale;
import java.util.Scanner;

public class Main{
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double indice = 0;

        for(int i = 1;i <= 31;i++){
             System.out.printf("Digite o índice pluviometrico do %dº dia: ",i);
             indice += input.nextDouble();
        }

        System.out.printf("A média do indice pluviométrico no mês foi de %.2f",indice/31);
    }
}