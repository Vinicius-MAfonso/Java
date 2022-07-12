package pkg6.pkg19;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o caractere para o desenho: ");
        char caractere = input.next().charAt(0);
        squareOfAsterisks(10,caractere);
    }
    public static void squareOfAsterisks(int tam, char fillCharacter){
        for(int i = 0;i < tam; i++){
            for(int j = 0;j <= 4;j++){
                System.out.print(fillCharacter);
            }
            System.out.println("");
        }
    }
}
