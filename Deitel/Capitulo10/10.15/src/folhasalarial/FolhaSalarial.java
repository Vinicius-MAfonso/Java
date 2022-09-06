package folhasalarial;

public class FolhaSalarial {

    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[6];
        
        payableObjects[0] = new Invoice("01234","seat",2,375.00);
        payableObjects[1] = new Invoice("43210","chain",2,150.00);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "444-44-444", 250, new Date(25, 12, 2000));
        payableObjects[3] = new BasePlusComissionEmployee("Jorge", "Film", "222-22-222", 255, 0.50, 2000, new Date(23, 10, 2002));
        payableObjects[4] = new ComissionEmployee("Vina", "Victor", "555-55-555", 250, .50, new Date(16, 5, 1998));
        payableObjects[5] = new HourlyEmployee("Pietro", "Pedro", "777-77-777", 0.80,  30, new Date(15, 12, 1995));
       
        for(Payable currentPayable : payableObjects){
            System.out.println(currentPayable);
            if(currentPayable instanceof BasePlusComissionEmployee basePlusComissionEmployee){
                basePlusComissionEmployee.incrementPaymentAmount(currentPayable.getPaymentAmount()*0.10);
            }
            System.out.println("Pagamento: "+currentPayable.getPaymentAmount());
        }
        
    }
    public static void sleep(int secs){
        try { Thread.sleep (secs*1000); } catch (InterruptedException ex) {}
    }
    
}
