package pkg8.pkg17;

public class Main {

    public static void main(String[] args) {
        TicTacToe game1 = new TicTacToe();
        //Verifica se o jogo acabou
        while(true){
            //Mostra o tabuleiro e pede para o jogador 1 colocar o X
            game1.getGameTable();
            game1.getAndSetPositionX();
            if(game1.whoIsWinner() == TicTacToe.status.WINNERX){//Se o ganhador for o X o jogo acaba
                game1.getGameTable();
                System.out.println("O Jogador X venceu!");
                break;
            }
            if(game1.whoIsWinner() == TicTacToe.status.DRAW){
                game1.getGameTable();
                System.out.println("Empate");
                break;
            }
            //Mostra o tabuleiro e pede para o jogador 2 colocar o O
            game1.getGameTable();
            game1.getAndSetPositionO();
            if(game1.whoIsWinner() == TicTacToe.status.WINNERO){//Se o ganhador for o X o jogo acaba
                game1.getGameTable();
                System.out.println("O Jogador O venceu!");
                break;
            }
            if(game1.whoIsWinner() == TicTacToe.status.DRAW){
                game1.getGameTable();
                System.out.println("Empate");
                break;
            }
        }
        System.out.println("Acabou o jogo!");
    }
    
}
