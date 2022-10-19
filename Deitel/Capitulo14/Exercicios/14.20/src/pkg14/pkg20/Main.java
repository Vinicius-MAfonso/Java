package pkg14.pkg20;
import java.util.Scanner;
public class Main {
    
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o valor do cheque: R$");
        double entrada = input.nextDouble();
        try{
           Cheque chequeObj = new Cheque(entrada); 
           System.out.printf("O valor do cheque é de R$%s%n",chequeObj);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        
    }
    
}
