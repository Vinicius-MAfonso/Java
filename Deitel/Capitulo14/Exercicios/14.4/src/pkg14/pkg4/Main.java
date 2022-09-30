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
        if(s1.regionMatches(true,0, s2, 0, 4))
            System.out.println("A região 1 a 5 da String s1 é igual s2");
       
    }
    
}
