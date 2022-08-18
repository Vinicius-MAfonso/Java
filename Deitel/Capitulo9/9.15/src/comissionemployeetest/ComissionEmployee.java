package comissionemployeetest;

public class ComissionEmployee extends Employee{
    private double grossSales;//Vendas Brutas
    private double comissionRate;
    //Construtor
    public ComissionEmployee(String firstName, String lastName, 
            int socialSecurityNumber,double grossSales,double comissionRate){
        super(firstName, lastName, socialSecurityNumber);
        if(grossSales < 0.0){
            throw new IllegalArgumentException("As vendas brutas devem ser"
                    + "maior ou igual a 0");
        }
        if(comissionRate <= 0.0 || comissionRate >= 1.0){
            throw new IllegalArgumentException("A taxa de comissão deve estar"
                    + "entre 0.0 e 1.0");
        }
        
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("As vendas brutas devem ser"
                    + "maior ou igual a 0");
        }
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        if(comissionRate <= 0.0 || comissionRate >= 1.0){
            throw new IllegalArgumentException("A taxa de comissão deve estar"
                    + "entre 0.0 e 1.0");
        }
        this.comissionRate = comissionRate;
    }
    public double earnings(){
        return getComissionRate() * getGrossSales();
    }
    @Override//Indica que esse método substitui um método da superclasse
    public String toString(){
        return String.format(super.toString()+"%n%s: %.2f%n%s: %.2f",
                "Ganhos brutos: ",getGrossSales(),
                "Ganhos: ",earnings());
    }
   
    
    
}
