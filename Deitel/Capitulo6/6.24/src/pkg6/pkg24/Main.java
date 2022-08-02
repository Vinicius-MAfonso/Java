package pkg6.pkg24;
import java.util.Scanner;
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num = input.nextInt();
        System.out.println(isPerfect(num)? "O número é perfeito":"O número não é perfeito");
    }
    private static boolean isPerfect(int number){
        int sum = 0;
        for(int i = 0;i < number;i++){
            if(i%number == 0){
                sum += number;
            }
        }
        return sum == number;
    }
}
