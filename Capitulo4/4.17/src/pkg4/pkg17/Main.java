package pkg4.pkg17;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sent = 0;
        int kmRodadosTotal = 0;
        int litrosDeGasolinaTotal = 0;
        
        while(true){
            System.out.print("Digite a quantidade de quilometros(-1 para sair): ");
            int kmRodados = input.nextInt();
            sent = (int) kmRodados;
            if(sent ==-1){
                break;
            }
            System.out.print("Digite a quantidade de gasolina: ");
            int litrosDeGasolina = input.nextInt();
            System.out.printf("Essa viagem gastou uma relação quilometro/combustivel de %.2f%n", (double) kmRodados/litrosDeGasolina);
            
            kmRodadosTotal =+ kmRodados;
            litrosDeGasolinaTotal =+ litrosDeGasolina;
        }
        
        System.out.printf("O total de quilometros rodados foi de %dkm%ne o total de litros gastos foi de %d%n",kmRodadosTotal,litrosDeGasolinaTotal);
        
        
    }
    
}
