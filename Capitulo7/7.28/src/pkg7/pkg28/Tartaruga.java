package pkg7.pkg28;

import java.security.SecureRandom;

public class Tartaruga {
    private static final SecureRandom random = new SecureRandom();
    public int posicao = 0;
    
    public int moveTartaruga(){
        int randomNumber = 1 + random.nextInt(10);
        int novaPosicao = 0;
        if(randomNumber <= 5){//Caminhada rápida
            novaPosicao = posicao + 3;
        }else if(randomNumber >= 6 && randomNumber <= 7){//Escorregão
            novaPosicao = posicao - 6;
        }else if(randomNumber >=8 && randomNumber <= 10){//Caminhada lenta
            novaPosicao = posicao + 1;
        }
        
        if(novaPosicao < 1){
            novaPosicao = 1;
        }else if(novaPosicao > 70){
            novaPosicao = 70;
        }
        
        return posicao = novaPosicao;
    }
}
