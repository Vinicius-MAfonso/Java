package pkg14.pkg3;
import java.util.Scanner;
//Elabore um aplicativo que utiliza o método String compareTo para comparar 
//duas entradas de strings pelo usuário. 
//Crie uma saída informando se a primeira string é menor que, igual a ou maior que a segunda.;;
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite uma String: ");
        String s1 = input.nextLine();
        System.out.println("Digite outra String: ");
        String s2 = input.nextLine();
    
        if(s1.compareTo(s2) < 0)
            System.out.println("s1 é menor que s2");
        else if(s1.compareTo(s2) == 0)
            System.out.println("s1 e s2 possuem tamanhos iguais");
        else if(s1.compareTo(s2) > 0)
            System.out.println("s1 é maior que s2");
        
        
        
        
    }
    
}
