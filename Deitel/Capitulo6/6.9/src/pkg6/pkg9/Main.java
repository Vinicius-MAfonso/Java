package pkg6.pkg9;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
        
    public static void main(String[] args) {
       double y = 0,x = 0;
        while(true){
           System.out.print("Digite o valor para ser aproximado: ");
           x = input.nextDouble();
           y = Math.floor(x + 0.5);
           System.out.printf("O valor aproximado de %.2f é %.2f%n",x,y);
           
        } 
        
        
    }
}
