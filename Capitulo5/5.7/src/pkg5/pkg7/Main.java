package pkg5.pkg7;


public class Main {

   
    public static void main(String[] args) {
        AutoPolicy obj1 = new AutoPolicy(1234, "BMW I9", "NJ");
        AutoPolicy obj2 = new AutoPolicy(4321, "Audi B5", "MA");
        
        policyInNoFaultState(obj1);
        policyInNoFaultState(obj2);
    }
    public static void policyInNoFaultState(AutoPolicy obj){
        System.out.println("Auto Policy:");
        System.out.printf("%s%15s%15s%n","Conta","Carro","Estado");
        System.out.printf("%d%18s%11s%n",obj.getAccountNumber(),obj.getMakeAndModel(),obj.isNotFaultState());
    }
}
