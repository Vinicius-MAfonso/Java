package pkg4.pkg19;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double comissao = 0;
        while(true){
            System.out.print("Digite o valor da venda(-1 para sair): R$");
            double valorVenda = input.nextDouble();
            if(valorVenda == -1){
                break;
            }
            comissao += valorVenda*0.09;
        }
        comissao += 200;
        System.out.printf("Com suas vendas você recebeu R$%.2f de comissão na semana%n",comissao);
 
    }
    
}
