package pkg14.pkg10;
import java.util.Scanner;
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma string: ");
        String phrase = input.nextLine();
        System.out.println("String em maiusculo "+phrase.toUpperCase());
        System.out.println("String em minusculo "+phrase.toLowerCase());
    }
    
}
