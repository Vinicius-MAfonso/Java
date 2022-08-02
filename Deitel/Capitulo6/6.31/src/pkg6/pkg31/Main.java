package pkg6.pkg31;

import java.util.Scanner;
import java.security.SecureRandom;
public class Main {
    public static final Scanner INPUT = new Scanner(System.in);
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final int SORTIDO = 1 + RANDOM.nextInt(999);
    public static int tentativas;
    
    public static void main(String[] args){
        System.out.println("Adivinhe o número entre 1 e 1000!");
        boolean correto = false;
        
        while(!correto){
            System.out.print("Digite aqui: ");
            int numero = INPUT.nextInt();   
            correto = isCorrect(numero);
        }
        if(tentativas <= 10){
            System.out.println("Você sabe o segredo, ou tem muita sorte");
        }
        if(tentativas == 10){
            System.out.println("Você sabe o segredo!");
        }
        if(tentativas > 10){
            System.out.println("Você deve ser capaz de fazer melhor!");
        }
    }
    public static boolean isCorrect(int answer){
        if(answer < SORTIDO){
            System.out.println("Resposta incorreta, muito baixo");
            tentativas++;
            return false;
        }else if(answer > SORTIDO){
            System.out.println("Resposta incorreta, muito alto");
            tentativas++;
            return false;
        }else{
            System.out.println("Resposta correta!, parabéns");
            return true;
        }
    }
    
}
