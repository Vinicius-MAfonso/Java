package pkg7.pkg27;
        
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean[] array = new boolean[1000];
        Arrays.fill(array, true);
        for(int i = 1;i < array.length;i++){
            array[i] = isPrime(i);
        }
        displayArray(array);
        
    }
    public static void displayArray(boolean[] array){
        for(int i = 0;i < array.length;i++){
            System.out.printf("%d - %b%n",i,array[i]);
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1)
            return false;
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
