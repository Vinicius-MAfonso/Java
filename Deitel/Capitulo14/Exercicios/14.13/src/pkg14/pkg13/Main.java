package pkg14.pkg13;
import java.util.Scanner;
/*(Tokenizando e comparando Strings) Elabore um aplicativo que lê uma linha de texto, 
tokeniza essa linha utilizando caracteres de espaço em branco como delimitadores 
e gera a saída apenas daquelas palavras que iniciam com a letra “b”.
*/
public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma String: ");
        String string = input.nextLine();
        
        String[] arrayString = string.split(" ");
        
        System.out.println("Gerando saída das palavras que começam com \"B\":");
        for(String currentString : arrayString){
            if(currentString.toUpperCase().startsWith("B"))
                System.out.println(currentString);
        }
    }
}
