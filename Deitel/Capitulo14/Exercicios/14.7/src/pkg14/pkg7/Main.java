package pkg14.pkg7;
import java.util.Scanner;
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma palavra: ");
        String word = input.nextLine();
        System.out.println(toLatinWord(word));
    }
    private static String toLatinWord(String word){
        String wordEnd = word.substring(0, 1).toLowerCase() + "ay";
        word = word.substring(1, word.length()) + wordEnd;
        word = word.substring(0,1).toUpperCase() + word.substring(1);
        return word;
    }
    
}
