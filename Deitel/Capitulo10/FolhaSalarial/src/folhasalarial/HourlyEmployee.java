package folhasalarial;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName,
            String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
       
    }

    public double getWage() {
        return wage;
    }

    private void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Salário por hora menor que 0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    private void setHours(double hours) {
        if((hours < 0) || (hours > 168.0)){
            throw new IllegalArgumentException("Horas menor que 0 ou maior que 168");
        }
        this.hours = hours;
    }
    @Override
    public double earnings(){
        if(getHours() <= 40)
            return getHours()*getWage();
        else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    @Override
    public String toString(){
        return String.format(super.toString() + 
                "%nSalário por hora: R$%.2f%nHoras: %.1f", getWage(),getHours());
    }
}
