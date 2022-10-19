package pkg14.pkg14;
/*
(Tokenizando e comparando Strings) Elabore um aplicativo que lê uma linha de texto, 
tokeniza essa linha utilizando caracteres de espaço em branco como delimitadores e 
gera a saída apenas daquelas palavras que terminem com as letras “ED”.
*/
import java.util.Scanner;
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma String: ");
        String string = input.nextLine();
        String[] stringArray = string.split(" ");
        System.out.println("Apresentando String que terminam com ED:");
        for(String currentString : stringArray){
            if(currentString.toUpperCase().endsWith("ED")){
                System.out.println(currentString);
            }
        }
    }
    
}
