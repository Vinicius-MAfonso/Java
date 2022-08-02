package pkg5.pkg18;


public class Main {

   
    public static void main(String[] args) {
      int amount = 1000;
      int cents = 0;
      int principal = 1000;
      int rate = 5;
      
      System.out.printf("%s%21s%n", "Year","Amount");
      for(int year = 1; year <= 10; year++){
          amount = principal * Math.pow(1 + rate, year);
          System.out.printf("%4d %d,%d %n",year,amount,cents);
        }

    }
    
}
