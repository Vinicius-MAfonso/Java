package pkg6.pkg35;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final Scanner INPUT = new Scanner(System.in);
    public enum Status{
        CORRECT,WRONG;
    }
    public static void main(String[] args) {
        System.out.println("Teste de multiplicação!");
        int x,y,answer = -1;.
        
        while(true){
            x = RANDOM.nextInt(10);
            y = RANDOM.nextInt(10);
            while(isCorrect(x,y,answer)){
                System.out.printf("%d X %d%n",x,y);
                System.out.print("Digite o resultado da multiplicação: ");
                answer = INPUT.nextInt();
                if(isCorrect(x,y,answer)){
                    System.out.println("Muito bem, resposta correta");
                }else{
                    System.out.println("Resposta incorreta, tente novamente ");
                }    
            
            }
            
            
        }
    }
    public static boolean isCorrect(int x, int y, int result){
        return x*y == result;
    }
}
