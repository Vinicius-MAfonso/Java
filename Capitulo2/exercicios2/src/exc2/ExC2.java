package exc2;
import java.util.Scanner;

public class ExC2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //
        int c = 4;
        int thisIsAVariable;
        int q7654;
        int number = 6;
        //
        System.out.print("Digite um número inteiro: ");
        int value = input.nextInt();
        //
        System.out.println("This is a Java Program");
        //
        System.out.printf("%s%n%s","This is a Java","Program");
        //
        if(number != 7){
            System.out.println("The variable number is not equal to 7");
        }
        //
        if(c < 7){
            System.out.println("C is less than 7");
        }else if(c >= 7){
            System.out.println("C is equal or greater than 7");
        }
        //
        int a = 5; 
        int b = 5;
        int d = 5;
        
        int e = a * b * d;
        
        int x, y, z, result;
        System.out.print("Digite o valor de x: ");
        x = input.nextInt();
        System.out.print("Digite o valor de y: ");
        y = input.nextInt();
        System.out.print("Digite o valor de z: ");
        z = input.nextInt();
        
        result = x * y * z;
        System.out.printf("O resultado é %d", result);
        //
    }
    
}
