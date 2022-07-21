package pkg7.pkg3;

import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        double[] fractions = new double[ARRAY_SIZE];
        Arrays.fill(fractions,0);
        System.out.println(fractions[4]);
        fractions[9] = 1.667;
        fractions[6] = 3.333;
        double soma = 0;
        for(int x = 0;x < fractions.length;x++){
            soma += fractions[x];
        }
        System.out.printf("A soma de todos os elementos do array é %.2f%n",soma);
    }
    
}
