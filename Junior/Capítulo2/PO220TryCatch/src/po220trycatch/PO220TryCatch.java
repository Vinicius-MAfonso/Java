package po220trycatch;

import java.util.Scanner;

public class PO220TryCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        int j = 5;
        try{
            j = Integer.parseInt(args[0]);
        }catch(Exception e){
            System.out.println("Argumento inválido ou ausente, usando default...");
        }finally{
            for(int i = 0;i < j;i++){
                System.out.println(i);
            }
        }
        
    }
    
}
