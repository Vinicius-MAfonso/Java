package po204entradasaida;
import java.util.Scanner;
public class PO204EntradaSaida {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Olá!");
        System.out.print("Digite um número inteiro: ");
        int valor = input.nextInt();
        System.out.println("Valor: "+ valor);
        
        System.out.print("Digite uma palavra: ");
        String palavra = input.next();
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        frase = input.nextLine();
        System.out.printf("Java guia do programador 4%n");
        System.out.printf("Valor inteido %d%n",20);
        input.close();
    }
    
}
