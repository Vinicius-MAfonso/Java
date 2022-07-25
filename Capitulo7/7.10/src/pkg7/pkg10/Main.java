package pkg7.pkg10;
import java.util.Scanner;
public class Main {
public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double[] vendas = new double[11];
        int[] freq = new int[11];
        for(int i = 1;i < vendas.length;i++){
            System.out.printf("Digite a venda bruta do funcionário %d: ",i);
            vendas[i] = 200 + (input.nextInt() * 0.09);
            switch((int) vendas[i]/100){
                case 2 -> freq[2]++;
                case 3 -> freq[3]++;
                case 4 -> freq[4]++;
                case 5 -> freq[5]++;
                case 6 -> freq[6]++;
                case 7 -> freq[7]++;
                case 8 -> freq[8]++;
                case 9 -> freq[9]++;
                case 10 -> freq[10]++;
            }
        }
        for(int i = 2;i < freq.length;i++){
            if(i < 10){
                System.out.printf("%d00 - %d99:%d%n",i,i,freq[i]);
                
            }else{
                System.out.printf("1.000 e acima:%d%n",freq[i]);
            }
        }
    }
    
}
