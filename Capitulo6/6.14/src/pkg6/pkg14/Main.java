package pkg6.pkg14;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static int base;
    private static int expoent;
    
    public static void main(String[] args) {
        System.out.print("Digite o valor da base: ");
        base = input.nextInt();
        System.out.print("Digite o valor do expoente: ");
        expoent = input.nextInt();
        System.out.printf("O resultado da exponenciação "
                + "com base %d e expoente %d é %d",base,expoent,integerPower(base, expoent));
    }
    public static int integerPower(int base, int expoent){
        int result = 1;
        for(int i = 1;i <= expoent;i++){
            result *= base;
        }
        return result;
    }
}
