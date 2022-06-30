package pkg5.pkg16;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int lastN;
        
        for(int i = 1;i <= 5;i++){
            System.out.printf("%d - Digite o número: ",i);
            lastN = input.nextInt();
            numeros.add(lastN);
        }
        
        System.out.println("Apresentando Gráficos");
        for(int i = 0; i < numeros.size(); i++){
            System.out.printf("%d - ",i+1);
            for(int j = 0; j < numeros.get(i); j++){
                System.out.printf("*");
            }
            
            System.out.println();
        }
        
        
        
    }
    
}
