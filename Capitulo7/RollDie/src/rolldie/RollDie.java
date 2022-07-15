package rolldie;
import java.security.SecureRandom;

public class RollDie {
    public static SecureRandom randomNumber = new SecureRandom();
    
    public static void main(String[] args) {
        int[] frequency = new int[7];//Contador de frequencia
        
        for(int roll = 1;roll <= 6000000;roll++){
            ++frequency[1+randomNumber.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "Face","Frequency");
        
        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%4d%10d%n", i,frequency[i]);
            
        }
    }
    
}
