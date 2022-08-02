package juroscompostos;


public class JurosCompostos {


    public static void main(String[] args) {
      double amount = 1000;
      double principal = 1000;
      double rate = 0.05;
      
      System.out.printf("%s%21s%n", "Year","Amount");
      for(int year = 1; year <= 10; year++){
          amount = principal * Math.pow(1 + rate, year);
          System.out.printf("%4d %,20.2f %n",year,amount);
      }
     
    }
    
}
