import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double valorTotal = 0;
        int meses = 0;
        double depositoMensal = 0;
        double valorDesejado = 0;
        try{
            System.out.print("Digite o valor do depósito mensal: R$");
            depositoMensal = input.nextDouble();
            System.out.print("Digite o valor desejado: R$");
            valorDesejado = input.nextDouble();
        }catch (InputMismatchException inputMismatchException){
            System.err.println(inputMismatchException);
            System.exit(1);
        }

        while(valorTotal < valorDesejado){
            valorTotal += depositoMensal;
            valorTotal += valorTotal*0.05;
            meses++;
        }
        System.out.printf("Com o depósito mensal de R$%.2f e o juros de 5 por cento será necessário %d meses%n",depositoMensal,meses);
    }
}