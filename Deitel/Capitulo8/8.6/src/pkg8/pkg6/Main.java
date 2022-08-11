package pkg8.pkg6;

public class Main {

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        SavingAccount.setAnnualInterestRate(5);
        System.out.println("A taxa dos próximos meses:");
        System.out.println("Saver 1 = R$"+saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 = R$"+saver2.calculateMonthlyInterest());
        
        System.out.println("Saldo próximo mês: ");
        System.out.printf("Saver 1 = R$%.2f%n", 
                (saver1.getSavingsBalance() + saver1.calculateMonthlyInterest()));
        System.out.printf("Saver 2 = R$%.2f%n", 
                saver2.getSavingsBalance() + saver2.calculateMonthlyInterest());
        
        System.out.println("Saldo total: ");
        System.out.printf("Saver 1 = R$%.2f%n", 
                (saver1.getSavingsBalance() + saver1.calculateMonthlyInterest()*12));
        System.out.printf("Saver 2 = R$%.2f%n", 
                saver2.getSavingsBalance() + saver2.calculateMonthlyInterest()*12);
        
        
    }
    
}
