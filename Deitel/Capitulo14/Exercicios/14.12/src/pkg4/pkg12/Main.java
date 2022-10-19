package pkg4.pkg12;
import java.util.List;
import java.util.Scanner;
/*
(Pesquisando Strings) Elabore um aplicativo baseado no aplicativo da Questão 14.11 
que insere uma linha de texto e utiliza o método String indexOf para determinar 
o número total de ocorrências de cada letra do alfabeto no texto. As letras minúsculas e maiúsculas
devem ser contadas juntas. Armazene os totais para cada letra em um array e 
imprima os valores em formato tabular depois que os totais foram determinados.
*/
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma String: ");
        String phrase = input.nextLine();
        
        LettersVerify phraseVerified = new LettersVerify(phrase);
        List<StringBuilder> array = phraseVerified.getFrequency();
        
        for(StringBuilder currentString : array){
            System.out.println(currentString);
        }
            
    }
}
