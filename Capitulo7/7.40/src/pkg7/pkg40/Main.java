package pkg7.pkg40;
import java.util.Scanner;


public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static final int CANDIDATOS = 5;
    public static final int TOPICOS = 5;
   
    public static void main(String[] args) {
        int media;
        String[] topics = {
          "Educação insuficiente:",  
          "Desemprego:", 
          "Violência e criminalidade:",
          "Escassez de moradia:",  
          "Saúde precária:"  
        };
        
        int[][] responses = new int[CANDIDATOS][TOPICOS];
        int candidato = 0;
        while(isDisponivel(responses)){
            System.out.printf("Candidato %d%n",candidato+1);
            System.out.println("Topicos debatidos");
            System.out.println("Digite de 1 a 10 de acordo com a importância do tópico");
            for(int i = 0;i < TOPICOS;i++){
                System.out.print(topics[i]);
                responses[candidato][i] = input.nextInt();
            }
            candidato++;
        }
        showData(responses);
        
    }
    private static boolean isDisponivel(int[][] array){
        for(int[] linha : array){
            for(int coluna = 0;coluna < linha.length;coluna++){
                if(linha[coluna] == 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    private static void showData(int[][] array){
        System.out.println("Apresentando dados...");
        System.out.print("              ");
        for(int i = 0;i < TOPICOS;i++){
            System.out.printf("%s %d   ","Tópico",i+1);
        }
        for(int i = 0;i < CANDIDATOS;i++){
            System.out.printf("%nCandidato %d",i+1);
            for(int j = 0;j < TOPICOS;j++){
                System.out.printf("%5d       ",array[i][j]);
            }
            System.out.println();
        }
    }
}
