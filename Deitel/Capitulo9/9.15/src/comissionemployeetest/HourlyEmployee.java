package comissionemployeetest;

public class HourlyEmployee extends Employee{
    private final int hours;
    private final double wage;
    
    public HourlyEmployee(String firstName,String lastName,int socialSecurityNumber,int hours,double wage){
        super(firstName, lastName, socialSecurityNumber);
        if(hours < 0){
            throw new IllegalArgumentException("Horas negativas");
        }
        if(wage < 0){
            throw new IllegalArgumentException("Salário por hora negativa");
        }
        this.hours = hours;
        this.wage = wage;
    }
    public int getHours(){
        return hours;
    }
    public double getWage(){
        return wage;
    }
    public double earning(){
        return hours*wage;
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%n%s: %.2f%n%s: %.2f",
                "Ganhos por hora: ",getWage(),
                "Ganhos totais: ",earning());
    }
}