package pkg6.pkg23;
import java.util.Scanner;
public class Main {
    public static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();
        System.out.print("Digite o primeiro número: ");
        int n3 = input.nextInt();
        System.out.println("O menor dos 3 números é o "+minimum3(n1, n2, n3));
    }
    private static int minimum3(int a,int b, int c){
        return Math.min(a, Math.min(b, c));
    }
}
