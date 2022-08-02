package myaddition;
import java.util.Scanner;

public class MyAddition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        boolean condicao = num1 == num2;
        if(condicao){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números são diferentes");
        }
        System.out.printf("A soma dos números %d e %d é %d",num1,num2,(num1 + num2));
    }
    
}
