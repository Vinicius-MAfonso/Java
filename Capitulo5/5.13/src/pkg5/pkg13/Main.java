package pkg5.pkg13;


public class Main {

    
    public static void main(String[] args) {
        long fatorial = 1;
        for (int j = 1; j <= 20;j++){
            for (int i = 1; i <= j; i++) {
                fatorial *= i;
            }
            System.out.printf("%d! = %d%n",j,fatorial);
            fatorial = 1;
       }
    }
    
}
