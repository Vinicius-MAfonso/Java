package pkg8.pkg17;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public enum symbol{
        X, O, EMPTY
    }
    public enum status{
        WINNERX, WINNERO, DRAW, CONTINUE
    }
    
    private final Scanner input = new Scanner(System.in);
    private final int COLUNA = 3;
    private final int LINHA = 3;
    private symbol[][] gameTable = new symbol[LINHA][COLUNA];
    
    
    public TicTacToe(){
        for(symbol[] linha : gameTable){
            Arrays.fill(linha, symbol.EMPTY);
        }
        System.out.println("Novo jogo!");
        
    }
    public void getGameTable() {
        System.out.println("Tabuleiro:");
        for(int col = 0;col < COLUNA;col++){
            System.out.printf("%3d",col);
        }
        System.out.println();
        for(int linha = 0; linha < LINHA;linha++){
            for(int coluna = 0; coluna < COLUNA;coluna++) {
                switch(gameTable[linha][coluna]){
                    case EMPTY -> {
                        System.out.printf("%3s"," ");
                    }
                    case X ->{
                        System.out.printf("%3s","X");
                    }
                    case O -> {
                        System.out.printf("%3s","O");
                    }
                }
            }
            System.out.printf("%3s",linha);
            System.out.println("");
        }
    }
    public void getAndSetPositionX(){
        System.out.println("Sua vez jogador X");
        System.out.print("Digite o número da linha: ");
        int linha = input.nextInt();
        System.out.print("Digite o número da coluna: ");
        int coluna = input.nextInt();
        while(gameTable[linha][coluna] != symbol.EMPTY){
            System.out.println("Posição ocupada");
            System.out.print("Digite o número da linha: ");
            linha = input.nextInt();
            System.out.print("Digite o número da coluna");
            coluna = input.nextInt();
        }
        gameTable[linha][coluna] = symbol.X;
    }
    public void getAndSetPositionO(){
        System.out.println("Sua vez jogador O");
        System.out.print("Digite o número da linha: ");
        int linha = input.nextInt();
        System.out.print("Digite o número da coluna");
        int coluna = input.nextInt();
        while(gameTable[linha][coluna] != symbol.EMPTY){
            System.out.println("Posição ocupada");
            System.out.print("Digite o número da linha: ");
            linha = input.nextInt();
            System.out.print("Digite o número da coluna");
            coluna = input.nextInt();
        }
        gameTable[linha][coluna] = symbol.O;
    }
    
    public status whoIsWinner() {
        //Verifica o ganhador das diagonais
        if(((gameTable[0][0] == gameTable[1][1] && gameTable[1][1] == gameTable[2][2]) || 
        (gameTable[0][2] == gameTable[1][1] && gameTable[1][1] == gameTable[2][0]))
                && (gameTable[1][1] == symbol.X || gameTable[1][1] == symbol.O)){
            System.out.println("Vitória por diagonal");
            if(gameTable[1][1] == symbol.X){
                return status.WINNERX;
            }else if(gameTable[1][1] == symbol.O){
                return status.WINNERO;
            }
        }
        //Verifica o ganhador vertical e horizontal
        for(int i = 0;i < 3; i++){
            if((gameTable[i][0] == gameTable[i][1]) && (gameTable[i][1] == gameTable[i][2])
                    && (gameTable[i][1] == symbol.X || gameTable[i][1] == symbol.O)){
                System.out.printf("Vitória por coluna(%d)",i);
                if(gameTable[1][1] == symbol.X){
                    return status.WINNERX;
                }else if(gameTable[1][1] == symbol.O){
                    return status.WINNERO;
                }
            }
            if((gameTable[0][i] == gameTable[1][i]) && (gameTable[1][i] == gameTable[2][i])
                    && (gameTable[1][i] == symbol.X || gameTable[1][i] == symbol.O)){
                System.out.println("Vitória por linha");
                if(gameTable[1][1] == symbol.X){
                    return status.WINNERX;
                }else if(gameTable[1][1] == symbol.O){
                    return status.WINNERO;
                }
            }
        }
        for(symbol[] linha : gameTable){
            for(symbol coluna : linha){
                if(coluna == symbol.EMPTY){
                    return status.CONTINUE;
                } 
            }
        }
        return status.DRAW;
    }
    
}
