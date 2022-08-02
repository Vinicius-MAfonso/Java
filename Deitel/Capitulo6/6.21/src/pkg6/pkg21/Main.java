package pkg6.pkg21;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
//        System.out.print("Digite o primeiro número: ");
//        int number1 = input.nextInt();
//        System.out.print("Digite o segundo número: ");
//        int number2 = input.nextInt();
          displayDigits(5468);
    }
    private static int calculo1(int a, int b){
        return (int) a/b;
    }
    private static int calculo2(int a, int b){
        return (int) a%b;
    }
    private static void displayDigits(int number){
        String cadeia = Integer.toString(number);
        String[] partes = cadeia.split(""); 
        
        System.out.println(String.join("  ", partes));
    }
}
