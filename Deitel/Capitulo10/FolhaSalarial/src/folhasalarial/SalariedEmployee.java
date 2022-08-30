package folhasalarial;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }
    private void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0){
            throw new IllegalArgumentException("Salário semanal não "
                    + "pode ser menor que 0");
        }
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%nSalário semanal:R$%.2f",getWeeklySalary());
    }
}
