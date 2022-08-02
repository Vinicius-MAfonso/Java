package pkg6.pkg12;
import java.security.SecureRandom;

public class Main {
    private static final SecureRandom randomNumber = new SecureRandom();
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++){
        System.out.println("O número sortido é: "+genNumber());
        }
    }
    public static int genNumber(){
//        return 1 + randomNumber.nextInt(2);
//        return 1 + randomNumber.nextInt(100);
//        return randomNumber.nextInt(10);
//        return 1000 + randomNumber.nextInt(112);
//        return randomNumber.nextInt(3) - 1;
        return randomNumber.nextInt(15) - 3;
        
    }
}
