package pkg7.pkg29;
import java.util.Scanner;

public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("digite o tamanho da série de fibonacci que deseja ver:");
       int n = input.nextInt();
       System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
