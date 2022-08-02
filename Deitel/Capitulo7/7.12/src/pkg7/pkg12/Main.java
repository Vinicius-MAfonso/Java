package pkg7.pkg12;

import java.util.Scanner; 

public class Main {
public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i = 0;i < array.length;i++){
            System.out.print("Digite o número: ");
            array[i] = input.nextInt();
            if(i > 0){
                while(existence(array[i], array)){
                    System.out.print("Valor duplicado, digite outro valor:");
                    array[i] = input.nextInt();
                }    
            }
        }
        for(int values : array){
            System.out.println(values);
        }
        
    }
    private static boolean existence(int a, int[] array){
        for(int valor : array){
            return a == valor;
        }
    return false;
    }
    
}
