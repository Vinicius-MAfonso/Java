package pkg4.pkg12;

import java.util.List;
import java.util.Scanner;

public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite uma String: ");
        String phrase = input.nextLine();
        
        StringVerify phraseVerified = new StringVerify(phrase);
        List<StringBuilder> arrayFrequencyLetters = phraseVerified.getFrequencyLetters();
        System.out.println("Frequency Letters:");
        for(StringBuilder currentStringBuilder : arrayFrequencyLetters){
            System.out.println(currentStringBuilder);
        }
        
        List<String> arrayFrequencyNumberLetters = 
                phraseVerified.getNumberOfLettersPerString();
        System.out.println("Frequency number letters:");
        for(String currentString : arrayFrequencyNumberLetters){
            System.out.println(currentString);
        }
        
        List<String> repeatedWords = 
                phraseVerified.getRepeatedWords();
        System.out.println("Frequency of repeated words:");
        for(String currentString : repeatedWords){
            System.out.println(currentString);
        }
            
    }
}
