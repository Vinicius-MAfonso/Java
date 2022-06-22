package pkg4.pkg18;


public class Main {

    
    public static void main(String[] args) {
            Cliente antonio = new Cliente(1234, 1250.00, 1000, 1300, 1300);
            System.out.printf("Novo saldo é de R$ %.2f",antonio.getNovoSaldo());
            if(antonio.getNovoSaldo()>antonio.getLimiteAuto()){
                System.out.printf("O limite de crédito foi excedido.\n");
            }
                
            
            
    }
    
}
