package comissionemployeetest;

public class BasePlusComissionEmployee {
    private double baseSalary;
    private ComissionEmployee comissionEmployee;
    
    public BasePlusComissionEmployee(double baseSalary,
            ComissionEmployee comissionEmployee){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Salário base deve ser maior"
                    + "ou igual a 0");
        }
        this.baseSalary = baseSalary;
        this.comissionEmployee = comissionEmployee;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double earnings(){
        return getBaseSalary() + comissionEmployee.earnings();
    }
    @Override
    public String toString(){
       return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f %n%s: %.2f",
                "Empregado",comissionEmployee.getFirstName(),comissionEmployee.getLastName(),
                "Número de segurança social",comissionEmployee.getSocialSecurityNumber(),
                "Ganho bruto",comissionEmployee.getGrossSales(),
                "Taxa de comissio",comissionEmployee.getComissionRate(),
                "Salário:",earnings());
    }
}
