package randomgenapp;
import java.security.SecureRandom;

public class RandomGenApp {
    
    public static void main(String[] args) {
        int freq1 = 0;
        int freq2 = 0;
        int freq3 = 0;
        int freq4 = 0;
        int freq5 = 0;
        int freq6 = 0;
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Jogando o dado...");
        for (int i = 1; i <= 20; i++) {
            int face = 1+randomNumbers.nextInt(6);
            System.out.printf("%d ",face);
            if(i % 5==0){    
                System.out.println();
            }
            switch(face){
                case 1 -> {
                    ++freq1;
                }
                case 2 ->{
                    ++freq2;
                }
                case 3 ->{
                    ++freq3;
                }
                case 4 ->{
                    ++freq4;
                }
                case 5 ->{
                    ++freq5;
                }
                case 6 ->{
                    ++freq6;
                }
            }
        }
        System.out.printf("%d vezes caiu o número 1%n",freq1);
        System.out.printf("%d vezes caiu o número 2%n",freq2);
        System.out.printf("%d vezes caiu o número 3%n",freq3);
        System.out.printf("%d vezes caiu o número 4%n",freq4);
        System.out.printf("%d vezes caiu o número 5%n",freq5);
        System.out.printf("%d vezes caiu o número 6%n",freq6);
    }
    
}
