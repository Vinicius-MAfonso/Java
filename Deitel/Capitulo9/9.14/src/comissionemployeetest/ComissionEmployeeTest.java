package comissionemployeetest;

public class ComissionEmployeeTest {
 
    public static void main(String[] args) {
        ComissionEmployee comissionEmployee = 
                new ComissionEmployee("Vinicius", "Mariano", 123456789, 5000, 0.5);
        System.out.println(comissionEmployee);
        System.out.println("");
        BasePlusComissionEmployee basePlusComissionEmployee = 
                new BasePlusComissionEmployee(3000, comissionEmployee);
        System.out.println(basePlusComissionEmployee);
        
    }
}
