package folhasalarial;

public class FolhaSalarial {

    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[4];
        
        payableObjects[0] = new Invoice("01234","seat",2,375.00);
        payableObjects[1] = new Invoice("01234","tire",4,79.99);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "444-44-444", 250, new Date(25, 12, 2000));
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "555-55-555", 200, new Date(25, 10, 2002));
        for(Payable currentPayable : payableObjects){
            System.out.println(currentPayable.toString());
            System.out.println("");
        }
        
    }
    public static void sleep(int secs){
        try { Thread.sleep (secs*1000); } catch (InterruptedException ex) {}
    }
    
}
