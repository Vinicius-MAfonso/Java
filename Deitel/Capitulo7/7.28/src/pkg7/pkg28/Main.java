package pkg7.pkg28;

import java.util.Arrays;

public class Main { 
    
    public static void main(String[] args) {
        String[] pista = new String[71];
        Arrays.fill(pista, "=");
        
        Tartaruga t = new Tartaruga();
        Coelho c = new Coelho();
        System.out.println("Corrida Coelho x Tartaruga");
        try{
            for(int i = 1;i <= 3;i++){
                System.out.printf("%d%n",i);
                Thread.sleep(1500);
            }
            System.out.println("JA!");
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        try{
            do{
                t.moveTartaruga();
                c.moveCoelho();
                if(t.posicao == 70){
                    displayPista(pista);
                    System.out.println("A tartaruga GANHOU!");
                    break;
                }else if(c.posicao == 70){
                    displayPista(pista);
                    System.out.println("O coelho GANHOU!");
                    break;
                }
                
                if(t.posicao == c.posicao){
                  pista[t.posicao] = "AI";
                  pista[c.posicao] = "UI";  
                }
                pista[t.posicao] = "T";
                pista[c.posicao] = "C";
                displayPista(pista);
                pista[t.posicao] = "=";
                pista[c.posicao] = "=";
                
                Thread.sleep(1000);
                
            }while(true);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
    }
    public static void displayPista(String[] pista){
        System.out.printf("%n|");
        for(String indexPista : pista){
            System.out.printf("%s",indexPista);
        }
        System.out.printf("|%n");
    }
    
}
