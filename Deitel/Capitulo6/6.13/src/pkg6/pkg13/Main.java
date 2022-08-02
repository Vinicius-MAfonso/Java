package pkg6.pkg13;
import java.security.SecureRandom;

public class Main {
    private static final SecureRandom randomNumber = new SecureRandom();
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++){
        System.out.println("O número sortido é: "+genNumber());
        }
    }
    public static int genNumber(){
//        int x = 1;
//        while(x%2 != 0){
//          x =  2 +randomNumber.nextInt(10);
//        }
//        int x = 0;
//        while(x%2 == 0){
//          x =  2 +randomNumber.nextInt(11);
//        }
//        return x;

        int x = 1;
        while(x%2 != 0){
          x =  4 +randomNumber.nextInt(22);
        }
        return x;

    }
        
}
