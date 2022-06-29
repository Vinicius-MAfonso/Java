package pkg5.pkg12;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int prd = 1;
       
       for(int i = 1;i <= 15;i++){
           if(i%2 == 0){
               continue;
           }
           prd *= i;
           
       }
       System.out.printf("O produto dos número impares de 1 a 15 é %d%n", prd);
        
    }
    
}
