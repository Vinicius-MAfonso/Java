package pkg14.pkg9;
import java.util.Scanner;
/*
Exibindo uma frase com as palavras invertidas) 
Elabore um aplicativo que insere uma linha de texto, tokeniza a linha com o método
String split e gera os tokens na ordem inversa. 
Utilize caracteres de espaço em branco como delimitadores.
*/
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma String:");
        String phrase = input.nextLine();
        System.out.printf("String: %s%n",phrase);
        String[] array = phrase.split(" ");
        String[] arrayInver = new String[array.length];
        System.out.println("Array original:");
        for(String currentIndex : array){
            System.out.println(currentIndex);
        }
        int j = 0;
        for(int i = array.length-1;i >= 0;i--){
            arrayInver[j] = array[i];
            j++;
        }
        System.out.println("Array inverso:");
        for(String currentIndex : arrayInver){
            System.out.println(currentIndex);
        }
    }
    
}
