package pkg7.pkg11;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        int[] counts = new int[10];
        int[] bonus = new int[15];
        int[] bestScores = {15,20,48,50,41,25,35};
        Arrays.fill(counts, 0);
        showArray(counts);
        Arrays.fill(bonus, 0);
        for(int i = 0;i < bonus.length;i++){
            if(i%2 == 0){
                bonus[i] = 1;
            }
        }
        showArray(bonus);
        sortReverse(bestScores);
        for(int i = 0;i < bestScores.length;i++){
            System.out.printf("%d.%10d%n",i+1,bestScores[i]);
        }
        
        
    }
    private static void showArray(int[] array){
        for(int value : array){
            System.out.printf("%d\t",value);
        }
        System.out.println();
    }
    private static void sortReverse(int[] array){
        //bubble sort
        for(int i = 1; i < array.length;i++){
            for(int j = 0; j < i; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
}
