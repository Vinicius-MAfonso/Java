package pkg6.pkg37;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final Scanner INPUT = new Scanner(System.in);
    public enum Status{
        ACERTO, ERRO;
    }
    public enum Level{
        FACIL, MEDIO, DIFICIL;
    }
    public static Status status = Status.ERRO;
    public static Level level;
    public static int score;
    
    public static void main(String[] args) {
        int x = 0,y = 0,answer,dificulty;
        
        while(true){
            System.out.println("Teste de multiplicação!");
            System.out.printf("1-FÁCIL%n2-MÉDIO%n3-DIFÍCIL%n");
            System.out.print("Selecione o nível de dificuldade: ");
            dificulty = INPUT.nextInt();
            switch(dificulty) {
                case 1 -> level = Level.FACIL;
                case 2 -> level = Level.MEDIO;
                case 3 -> level = Level.DIFICIL;
            }
            score = 0;
            for(int i = 0;i <= 10; i++){
                if(null != level)switch (level) {
                    case FACIL -> {
                        x = 1+RANDOM.nextInt(9);
                        y = 1+RANDOM.nextInt(9);
                    }
                    case MEDIO -> {
                        x = 1+RANDOM.nextInt(99);
                        y = 1+RANDOM.nextInt(99);
                    }
                    case DIFICIL -> {
                        x = 1+RANDOM.nextInt(999);
                        y = 1+RANDOM.nextInt(999);
                    }
                }
                status = Status.ERRO;
                while(status == Status.ERRO){
                    System.out.printf("%d X %d%n",x,y);
                    System.out.print("Digite o resultado da multiplicação: ");
                    answer = INPUT.nextInt();
                    isCorrect(x,y,answer);
                    if(status == Status.ACERTO){
                        System.out.println(choosePhrase());
                        score+=10;
                    }else if(status == Status.ERRO){
                        System.out.println(choosePhrase());
                        score-=5;
                    }    
                } 
            }
            displayResult(score);
        }  
    }
    
    
    public static void isCorrect(int x, int y, int result){
        if(x*y == result){
            status = Status.ACERTO;
        }else{
            status = Status.ERRO;
        }
    }
    
    public static void displayResult(int grade){
        System.out.println("Exibindo resultado...");
        if(grade < 60){
            System.out.println("Peça ajuda extra ao seu professor!");
        }else{
            System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
        }
    }
    
    public static String choosePhrase(){
        int escolha =1 + RANDOM.nextInt(3);
        if(status == Status.ACERTO){
            switch(escolha){
                case 1 ->{
                    return "Muito bom!";
                }
                case 2 ->{
                    return "Excelente!";
                }
                case 3 ->{
                    return "Bom trabalho!";
                }
                case 4 ->{
                    return "Mantenha um bom trabalho!";
                }
            }    
        }
        if(status == Status.ERRO){
            switch(escolha){
                case 1 ->{
                    return "Tente mais uma vez!";
                }
                case 2 ->{
                    return "Errado, tente mais uma vez!";
                }
                case 3 ->{
                    return "Não desista!";
                }
                case 4 ->{
                    return "Continue tentando!";
                }
            }    
        }
        return null;
    }
}