package pkg7.pkg20;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
private static final Scanner input = new Scanner(System.in);
private static final int TAM_LINHA = 5;
private static final int TAM_COLUNA = 4;
    public static void main(String[] args) {
        int sales[][] = new int[TAM_LINHA][TAM_COLUNA];
        int nVendedor;
        int nProduto;
        
        System.out.println("Sistema de vendas");
        
        while(isAvailable(sales)){
            System.out.print("Digite o número de vendedor[1 - 4]: ");
            nVendedor = input.nextInt()-1;
            System.out.print("Digite o número do produto[1 - 5]: ");
            nProduto = input.nextInt()-1;
            System.out.print("Digite o valor total vendido desse produto:R$ ");
            sales[nProduto][nVendedor] = input.nextInt();
            
            sales[TAM_LINHA-1][nProduto] += sales[nProduto][nVendedor];
            sales[nVendedor][TAM_COLUNA-1] += sales[nProduto][nVendedor];
            sales[TAM_LINHA-1][TAM_COLUNA-1] += sales[nProduto][nVendedor];
        }
        showData(sales); 
    }
    
    private static boolean isAvailable(int[][] array){
        for(int linha = 0;linha < TAM_LINHA-1;linha++){
            for(int coluna = 0;coluna < TAM_COLUNA-1;coluna++){
                if(array[linha][coluna] == 0){
                    return true;
                }
            }
        }
        return false;  
    }
    
    private static void showData(int[][] array){
        System.out.println("Apresentando dados...");
        System.out.print("         ");
        
        //Linha de vendedor
        for(int i = 1;i <= TAM_COLUNA;i++){
            if(i < TAM_COLUNA){
                System.out.printf("%10s %d ","Vendedor",i);
            }else{
                System.out.println("Lucro produto");
            }
        }
        
        for(int linha = 0;linha < TAM_LINHA;linha++){
            if(linha == TAM_LINHA-1){
                System.out.print("Lucro vendedor");
            }else{
                System.out.printf("%s %d ","Produto",linha+1);
            }
            for(int coluna = 0;coluna < TAM_COLUNA;coluna++){
                System.out.printf("%10d",array[linha][coluna]);
            }
            System.out.println("");
        }
    }
    
}
