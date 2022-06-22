package pkg4.pkg23;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int numeroMaior = 0;
        int numeroMaior2 = 0;
        
        for(int i = 1;i <= 10;i++){
            System.out.printf("Digite o %dº número inteiro: ", i);
            int numero = input.nextInt();
            if(i == 1){
                numeroMaior2 = numero;
                numeroMaior = numero;
            }else{
                if(numeroMaior < numero){
                    numeroMaior2 = numeroMaior;
                    numeroMaior = numero;
                }
            }
        }
        
        System.out.printf("O maior número é o %d,"
                + " e o segundo maior número é o %d%n",numeroMaior,numeroMaior2);
    
    }
    
}
