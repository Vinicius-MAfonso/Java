package comissionemployeetest;

public class ComissionEmployee extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;//Vendas Brutas
    private double comissionRate;
    //Construtor
    public ComissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber,double grossSales,double comissionRate){
        //Chamada implícita ao Object
        if(grossSales < 0.0){
            throw new IllegalArgumentException("As vendas brutas devem ser"
                    + "maior ou igual a 0");
        }
        if(comissionRate <= 0.0 || comissionRate >= 1.0){
            throw new IllegalArgumentException("A taxa de comissão deve estar"
                    + "entre 0.0 e 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
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
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Empregado",getFirstName(),getLastName(),
                "Número de segurança social",getSocialSecurityNumber(),
                "Ganho bruto",getGrossSales(),
                "Taxa de comissio",getComissionRate());
    }
   
    
    
}
