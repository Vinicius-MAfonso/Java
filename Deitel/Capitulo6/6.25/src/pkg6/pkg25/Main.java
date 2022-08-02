package pkg6.pkg25;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
//        System.out.print("Digite o número: ");
//        int num = input.nextInt();
//        System.out.println(isCousin(num)? "O número é primo":"O número não é primo");
          for(int i = 1;i < 10000;i++){
              if(isCousin(i)){
                  System.out.println(isCousin(i));
              }
          }
    }
    private static boolean isCousin(int number){
        int divisores = 0;
        for(int i = 2;i < number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}


