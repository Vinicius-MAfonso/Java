package pkg6.pkg28;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Digite a nota: ");
        int nota = input.nextInt();
        
        System.out.println("Sua nota: "+ qualityPoints(nota));
    }
    public static int qualityPoints(int nota){
        if(nota == 100){
            return 4;
        }
        nota /= 10;
        switch(nota){
            case  9 -> {
                return 4;
            }
            case 8 ->{
                return 3;
            }
            case 7 ->{
                return 2;
            }
            case 6 ->{
                return 1;
            }
            default ->{
                return 1;
            }
        }
    }
}
