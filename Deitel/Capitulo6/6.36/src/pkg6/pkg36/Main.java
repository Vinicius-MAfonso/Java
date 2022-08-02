package pkg6.pkg36;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Teste de multiplicação!");
        int x,y,answer;      
        answer = -1;
        
        while(true){
            x = RANDOM.nextInt(10);
            y = RANDOM.nextInt(10);
            while(!(isCorrect(x,y,answer))){
                System.out.printf("%d X %d%n",x,y);
                System.out.print("Digite o resultado da multiplicação: ");
                answer = INPUT.nextInt();
                if(isCorrect(x,y,answer)){
                    System.out.println(choosePhrase(isCorrect(x, y, answer)));
                }else{
                    System.out.println(choosePhrase(isCorrect(x, y, answer)));
                }    
            
            }
        }
    }
    public static boolean isCorrect(int x, int y, int result){
        return x*y == result;
    }
    public static String choosePhrase(boolean correto){
        int escolha =1 + RANDOM.nextInt(3);
        if(correto){
            switch(escolha){
                case 1 ->{
                    return "Muito bom!";
                }
                case 2 ->{
                    return "Excelente!";
                }
                case 3 ->{
                    return "Bom trabalho!";
                }
                case 4 ->{
                    return "Mantenha um bom trabalho!";
                }
            }    
        }
        
        if(correto == false){
            switch(escolha){
                case 1 ->{
                    return "Tente mais uma vez!";
                }
                case 2 ->{
                    return "Errado, tente mais uma vez!";
                }
                case 3 ->{
                    return "Não desista!";
                }
                case 4 ->{
                    return "Continue tentando!";
                }
            }    
        }
        return null;
        
    }
}