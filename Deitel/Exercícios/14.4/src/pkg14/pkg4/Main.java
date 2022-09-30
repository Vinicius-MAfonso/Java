package pkg14.pkg4;

/*Elabore um aplicativo que utiliza o método String
regionMatches para comparar duas entradas de strings pelo usuário. O aplicativo 
deve inserir o número de caracteres que será comparado e o índice inicial da comparação.
O aplicativo deve declarar se as strings são iguais. 
Ignore a distinção entre maiúsculas e minúsculas dos caracteres ao realizar a comparação.
 */
import java.util.Scanner;


public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite a primeira String: ");
        String s1 = input.nextLine();
        System.out.print("Digite a segunda String: ");
        String s2 = input.nextLine();
        int nComparacao = 4;
    }
    
}
