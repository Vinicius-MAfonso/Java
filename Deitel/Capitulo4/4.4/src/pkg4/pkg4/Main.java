package pkg4.pkg4;


public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = x + y;
        x++;
        
        int count = 0;
        while(count <= 10){
            if(count >= 10){
                System.out.println("O contador é 10");
            }
            count++;
        }
        x--;
    }
    
}
