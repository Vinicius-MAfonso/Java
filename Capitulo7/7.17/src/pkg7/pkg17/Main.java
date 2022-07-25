package pkg7.pkg17;

public class Main {
    public static void main(String[] args) {
        int[] freq = new int[13];
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        for(int i = 0;i <= 36000000;i++){
            dado1.roll();
            System.out.println("O dado 1 tirou " + dado1.getFace());
            dado2.roll();
            System.out.println("O dado 2 tirou " + dado2.getFace());
            freq[dado1.getFace()+dado2.getFace()]++;
        }
        
        for(int i = 2;i < freq.length;i++){
            System.out.printf("A soma dos lados %d deu %d vezes %n",i,freq[i]);
        }
        
    }
    
}
