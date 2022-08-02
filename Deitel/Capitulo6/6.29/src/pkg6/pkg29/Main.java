package pkg6.pkg29;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static SecureRandom randomNumber = new SecureRandom();
    public enum Moeda{
        CARA, COROA;
    }

    public static void main(String[] args) {
        Moeda flip;
        int cara = 0, coroa = 0;
        
        while(true){
            System.out.printf("Caras = %d%nCoroas = %d%n",cara,coroa);
            System.out.print("Deseja jogar a moeda?[S/N]");
            char menu = input.next().toUpperCase().charAt(0);
            
            if(menu == 'S'){
                flip = jogarMoeda();
                System.out.println("Você tirou " + flip);
                if(flip == Moeda.CARA){
                    cara++;
                }else{
                    coroa++;
                }
            }
            else{
                break;
            }
        }
    }
    
    public static Moeda jogarMoeda(){
        Moeda moeda = null;
        int randomChoice = 1 + randomNumber.nextInt(2);
        switch(randomChoice){
            case 1 ->{
               moeda = Moeda.CARA; 
            }
            case 2 ->{
               moeda = Moeda.COROA;
            }
        }
        return moeda;
        
    }
}
