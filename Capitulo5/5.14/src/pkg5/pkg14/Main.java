package pkg5.pkg14;


public class Main {

    
    public static void main(String[] args) {
      double amount = 1000;
      double rate;
      double principal = 1000;
      
      for(int i = 5; i <= 10;i++){
        System.out.printf("%8d%% de juros%n",i);
        System.out.printf("%s%21s%n", "Year","Amount");
        rate = (double) i/100;
        
        for(int year = 1; year <= 10; year++){
            amount = principal * Math.pow(1 + rate, year);
            System.out.printf("%4d %,20.2f %n",year,amount);
        }
        
      }
     
    }
    
}
