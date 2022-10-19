package pkg14.pkg15;
import java.util.Arrays;
import java.util.Scanner;
/*
Elabore um aplicativo que insere um código de inteiros para um caractere e exibe o caractere
correspondente. Modifique esse aplicativo de modo que ele gere todos os possíveis 
códigos de três dígitos no intervalo de 000 a 255 e tente imprimir os caracteres correspondentes
*/
public class Main {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Insira um inteiro: ");
        int number = input.nextInt();
        System.out.printf("To character %s%n",Arrays.toString(Character.toChars(number)));
        System.out.println("Gerando todos os Characters no intervalo de 000 até 255: ");
        for (int i = 0; i <= 255; i++) {
            System.out.printf("Número %d: %s%n",i,Arrays.toString(Character.toChars(i)));
        }
    }
    
}
