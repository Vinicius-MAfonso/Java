package pkg6.pkg17;
import java.util.Scanner;

public class Main {
private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int number;
        System.out.print("Digite o número para verificar: ");
        number = input.nextInt();
        if(isEven(number)){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }   
    }
    private static boolean isEven(int number){
        return number%2 == 0;
    }
}
