package pkg6.pkg37;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final Scanner INPUT = new Scanner(System.in);
    public enum Status{
        ACERTO, ERRO;
    }
    public static Status status = Status.ERRO;
    
    public static void main(String[] args) {
        int x,y,answer,score;
        while(true){
            System.out.println("Teste de multiplicação!");
            score = 0;
            for(int i = 0;i <= 10; i++){
                while(true){
                    x = RANDOM.nextInt(10);
                    y = RANDOM.nextInt(10);
                    while(status == Status.ERRO){
                        System.out.printf("%d X %d%n",x,y);
                        System.out.print("Digite o resultado da multiplicação: ");
                        answer = INPUT.nextInt();
                        isCorrect(x,y,answer);
                        if(status == Status.ACERTO){
                            System.out.println(choosePhrase());
                            score++;
                            break;
                        }else if(status == Status.ERRO){
                            System.out.println(choosePhrase());
                        }    

                    }
                }
            }
        }
        
    }
    public static void isCorrect(int x, int y, int result){
        if(x*y == result){
            status = Status.ACERTO;
        }else{
            status = Status.ERRO;
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