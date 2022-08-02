package pkg5.pkg24;


public class Main {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 10;i=i+2) {
            for (int k = 9; k >= i ; k=k-2) {
                    System.out.printf("%1s"," ");
                }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        
        for (int i = 11; i >= 1;i=i-2) {
            
            for (int k = 9; k >= i ; k=k-2) {
                    System.out.printf("%1s"," ");
                }
            
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    
}
