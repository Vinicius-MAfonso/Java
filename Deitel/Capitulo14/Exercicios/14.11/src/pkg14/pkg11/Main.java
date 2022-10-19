package pkg14.pkg11;
import java.util.Scanner;
/*
Elabore um aplicativo que insere uma linha de texto e um 
caractere de pesquisa e utiliza o método String 
indexOf para determinar o número de ocorrências do caractere no texto.
*/

public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma string: ");
        String phrase = input.nextLine();
        System.out.printf("O caracter \"a\" aparece na posição %d%n da String",phrase.indexOf("a"));
    }
    
}
