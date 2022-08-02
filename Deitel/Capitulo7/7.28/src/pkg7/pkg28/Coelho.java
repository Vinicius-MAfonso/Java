package pkg7.pkg28;

import java.security.SecureRandom;

public class Coelho {
    private static final SecureRandom random = new SecureRandom();
    public int posicao = 0;
    
    public int moveCoelho(){
        int randomNumber = 1 + random.nextInt(10);
        int novaPosicao = 0;
        if(randomNumber <= 3){//Salto pequeno
            novaPosicao = posicao + 1;
        }else if(randomNumber >= 4 && randomNumber <= 5){//Escorregão pequeno
            novaPosicao = posicao - 2;
        }else if(randomNumber >=6 && randomNumber <= 7){//Salto grande
            novaPosicao = posicao + 9;
        }else if(randomNumber >=8 && randomNumber <= 9){//Dormir
            novaPosicao = posicao;
        }else{//Escorregão grande
            novaPosicao = posicao - 12;
        }
        
        if(novaPosicao < 1){
            novaPosicao = 1;
        }else if(novaPosicao > 70){
            novaPosicao = 70;
        }
        
        return posicao = novaPosicao;
    }
    
}
