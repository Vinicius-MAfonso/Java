package pkg14.pkg5;
import java.util.Random;
public class Main {
private static final Random randNumbers = new Random();
    public static void main(String[] args) {
       String[] article = {"the","a","one","some","any"}; 
       String[] noun = {"boy","girl","dog","town","car"}; 
       String[] verb = {"drove","jumped","ran","walked","skipped"}; 
       String[] preposition = {"to","from","over","under","on"}; 
       StringBuilder[] phrases = new StringBuilder[20];
       for(int i = 0;i < 20;i++){
           phrases[i] = new StringBuilder(21);
           String firstLetterToUpper = article[randNumbers.nextInt(0,5)];
           firstLetterToUpper = 
                   firstLetterToUpper.substring(0,1).toUpperCase() + firstLetterToUpper.substring(1);
           phrases[i].append(firstLetterToUpper).append(" ");
           phrases[i].append(noun[randNumbers.nextInt(0,5)]).append(" ");
           phrases[i].append(verb[randNumbers.nextInt(0,5)]).append(" ");
           phrases[i].append(preposition[randNumbers.nextInt(0,5)]).append(".");
           
       }
       for(StringBuilder phrase : phrases)
           System.out.println(phrase);
      
       
    }
    
}
