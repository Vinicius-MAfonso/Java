package pkg5.pkg11;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lastNumber = 1;
        int i = 1;
        int menorN = 0;
        while(true){
            System.out.printf("Digite um número[0 - Sair]: ");
            lastNumber = input.nextInt();
            if(lastNumber == 0)break;
            
            
            if(i <= 1){
                menorN = lastNumber;
            }else{
                if(menorN >= lastNumber){
                    menorN = lastNumber;
                }
            }
        }
        System.out.printf("%nO menor número é o %d", menorN);
        
    }
    
}
