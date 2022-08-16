package comissionemployeetest;

public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;
    
    public BasePlusComissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, double comissionRate,
            double baseSalary){
        //Chamada explícita para o construtor de ComissionEmployee
        super(firstName,lastName,socialSecurityNumber,grossSales,comissionRate);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Salário base deve ser maior"
                    + "ou igual a 0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f","Salário base",super.toString(),
                "Salário base", getBaseSalary());
    }
}
