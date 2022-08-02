package pkg6.pkg16;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        int number1;
        int number2;
        while(true){
            System.out.print("Digite o primeiro número:[0-Sair]");
            number1 = input.nextInt();
            if(number1 == 0){
                break;
            }
            System.out.print("Digite o segundo número:");
            number2 = input.nextInt();
            if(isMutiple(number1, number2)){
                System.out.printf("O número %d é multiplo de %d%n",number1, number2);
            }else{
                System.out.printf("O número %d não é multiplo de %d%n",number1, number2);
            }
        }
        
    }
    private static boolean isMutiple(int x, int y){
        return x%y == 0;
    }
}
