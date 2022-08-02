package pkg5.pkg25;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam;
        while(true){
            System.out.print("Digite o tamanho do losango(1-19 e impar): ");
            tam = input.nextInt();
            if(tam%2 == 0 || (tam < 1 || tam > 19)){
                System.out.println("Tamanho inválido, "
                        + "tamanho correto é entre 1 e 19, e impar");
                continue;
            }
            break;
        }
        for (int i = 1; i < tam;i=i+2) {
            for (int k = 18; k >= i ; k=k-2) {
                    System.out.printf("%1s"," ");
                }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        
        for (int i = tam; i >= 1;i=i-2) {
            
            for (int k = 18; k >= i ; k=k-2) {
                    System.out.printf("%1s"," ");
                }
            
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    
}
