package pkg4.pkg21;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroMaior = 0;
        int numeroMenor = 0;
        
        for(int i = 1;i <= 10;i++){
            System.out.printf("Digite o %dº número inteiro: ", i);
            int numero = input.nextInt();
            if(i == 0){
                numeroMaior = numero;
                numeroMenor = numero;
            }else{
                if(numeroMaior < numero){
                    numeroMaior = numero;
                }else if(numeroMenor > numero){
                    numeroMenor = numero;
                }
            }
        }
        
        System.out.printf("O maior número é o %d,"
                + " e o menor número é o %d%n",numeroMaior,numeroMenor);
    }
    
}
