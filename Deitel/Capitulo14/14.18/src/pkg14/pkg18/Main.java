package pkg14.pkg18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter: ");
        String sentence = input.nextLine();
        
        String[] tokens = sentence.split(" ");
        System.out.printf("Numer of elements: %d%nThe tokens are %n",tokens.length);
        for(String token : tokens)
            System.out.println(token);
        
    }
    
}
