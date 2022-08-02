    package capitulo6;
import java.util.Scanner;

public class Capitulo6 {
    private static int x = 10;
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(Math.sqrt(900.00));
    
    
    String frase = "Hello";
    frase += " World!";
    System.out.println(frase);
    
    System.out.println(Math.sqrt(5));
    
    sum();
    System.out.println(x);
    }
    private static int sum(){
        return x+=1;
    }   
}