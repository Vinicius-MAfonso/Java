package capitulo5;


public class Capitulo5 {

    
  public static void main(String[] args) {
        int counter = 0   ;
        //Repetição controlada usando While
        while(++counter <= 10){
            System.out.printf("%d\t", counter);
        }
        System.out.println("");
        
        for(int i = 1;i<=10;i++){
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        
        for(int i = 1;i<=100;i++){
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        for(int i = 100;i > 1;i--){
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        for(int i = 7;i <= 77;i+=7){
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        for(int i = 20;i >= 2;i-=2){
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        for(int i = 2;i <= 20;i+=3){
            System.out.printf("%d\t",i);
        }
        System.out.println("");
        for(int i = 99;i >= 0;i-=11){
            System.out.printf("%d\t",i);
        }
        
        
        
    }
    
}
