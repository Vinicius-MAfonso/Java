package pkg5.pkg17;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int nProduto;
      int quantVendida;
      double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
      while(true){
          System.out.print("Digite o número do produto[0 - Sair]: ");
          nProduto = input.nextInt();
          if(nProduto == 0)break;
          
          System.out.print("Digite a quantidade desse produto que foi vendido "
                  + "desse produto: ");
          quantVendida = input.nextInt();
          
          switch(nProduto){
              case 1 -> {
                  p1+=nProduto;
                  p1*=2.98;
              }
              case 2 -> {
                  p2+=nProduto;
                  p2*=4.50;
              }
              case 3 -> {
                  p3+=nProduto;
                  p3*=9.98;
              }
              case 4 -> {
                  p4+=nProduto;
                  p4*=4.49;
              }
              case 5 -> {
                  p5+=nProduto;
                  p5*=6.87;
              }
              default -> System.out.println("Produto não cadastrado!");
          }
          
      }
      System.out.println("Imprimindo dados:");
          System.out.printf("Produto 1: R$%.2f%n",p1);
          System.out.printf("Produto 2: R$%.2f%n",p2);
          System.out.printf("Produto 3: R$%.2f%n",p3);
          System.out.printf("Produto 4: R$%.2f%n",p4);
          System.out.printf("Produto 5: R$%.2f%n",p5);
    }
    
}
