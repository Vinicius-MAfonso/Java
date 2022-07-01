package pkg5.pkg32;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor = 0;
        System.out.println("FairTax verifier");
        System.out.println("""
                           Digite o valor das suas despesas:
                           1-Moradia
                           2-Alimentação
                           3-Vestuário
                           4-Transporte
                           5-Educação
                           6-Assistência médica
                           7-Férias
                           """);
        
        for (int i = 1; i <= 7; i++) {
            System.out.printf("%d - Digite o valor[0 - Sair]:R$",i);
            valor += input.nextInt()*0.3;
        }
        System.out.printf("Com os valores entrados "
                + "o FairTax é de R$%,.2f%n",valor);


    }
    
}
