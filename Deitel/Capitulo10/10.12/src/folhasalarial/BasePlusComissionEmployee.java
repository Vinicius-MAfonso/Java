package folhasalarial;

public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;
    
    public BasePlusComissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double comissionRate, double baseSalary, Date birthDate){
        super(firstName, lastName, socialSecurityNumber,
                grossSales, comissionRate, birthDate);
        
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Salário base deve ser maior que ou 0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Salário base deve ser maior que ou 0");
        this.baseSalary = baseSalary;
    }
    @Override
    public double getPaymentAmount(){
        return super.getPaymentAmount() + getBaseSalary();
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "%nSalário base: R$%,.2f", getBaseSalary());
        
    }    
}
