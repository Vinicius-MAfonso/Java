package pkg6.pkg8;
import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int horas = 0;
        
        System.out.println("Estacionamento Java!");
        while(true){
            System.out.print("Digite o tempo em horas que ficou estacionado[0-sair]: ");
            horas = input.nextInt();
            if(horas == 0)break;
            
            System.out.printf("O valor que deve ser pago é de R$%.2f%n",calculateCharges(horas));
        }
    }
    
    private static double calculateCharges(double horas){
        double charges;
        if(horas > 3.0){
            charges = 2+(horas*0.5);
            if(charges > 10.0){
                charges = 10.0;
            }
        }else{
            charges = 2.0;
        }
        return charges;
    }
    
}
