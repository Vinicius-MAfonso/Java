package comissionemployeetest;

public class ComissionEmployeeTest {
 
    public static void main(String[] args) {
       ComissionEmployee comissionEmployee = new ComissionEmployee("Sue", "Blue", 
               "123456789",1000.0,0.6);
       BasePlusComissionEmployee employee2 = new BasePlusComissionEmployee("Sue", "Blue", 
               "123456789",1000.0,0.6,5000);
        System.out.println("Informações do empregado pelos métodos");
        System.out.printf("%n%s %s%n","Primeiro nome é",comissionEmployee.getFirstName());
        System.out.printf("%s %s%n","Ultimo nome é",comissionEmployee.getLastName());
        System.out.printf("%s %s%n","Número de segurança social",comissionEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Ganho bruto de",comissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n","Taxa de comissão é",comissionEmployee.getComissionRate());
       
        comissionEmployee.setGrossSales(5000);
        comissionEmployee.setGrossSales(.1);
        
        System.out.printf("%n%s: %n%n%s%n","Informações obtidas pelo método toString, empregado1",
                comissionEmployee);
        System.out.printf("%n%s: %n%n%s%n","Informações obtidas pelo método toString, empregado2",
                employee2);
    }
}
