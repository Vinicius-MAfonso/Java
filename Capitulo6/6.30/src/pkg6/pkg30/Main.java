package pkg6.pkg30;
import java.util.Scanner;
import java.security.SecureRandom;
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static final SecureRandom random = new SecureRandom();
    public static final int sortido = 1 + random.nextInt(999);
    
    public static void main(String[] args) {
        System.out.println("Adivinhe o número entre 1 e 1000!");
        boolean correto = false;
        
        while(!correto){
            System.out.print("Digite aqui: ");
            int numero = input.nextInt();   
            correto = isCorrect(numero);
        }
    }
    public static boolean isCorrect(int answer){
        if(answer < sortido){
            System.out.println("Resposta incorreta, muito baixo");
            return false;
        }else if(answer > sortido){
            System.out.println("Resposta incorreta, muito alto");
            return false;
        }else{
            System.out.println("Resposta correta!, parabéns");
            return true;
        }
    }
    
}
