package Employee;
import static java.lang.Math.PI;
public class EmployeeTest {

    public static void main(String[] args) {
        Date birth = new Date(31,1,1949);
        Date hire = new Date(31,12,1988);
        hire.nextDay();
        birth.nextDay();
        Employee employee1 = new Employee("Bob", "Blue", birth, hire);
        Employee employee2 = new Employee("Carlos", "Eduardo", birth, hire);
        
        System.out.println(employee1);
        System.out.println("Trabalhadores depois da criação: ");
        System.out.printf("via employee1.getCount(): %d%n",employee1.getCount());
        System.out.printf("via employee2.getCount(): %d%n",employee2.getCount());
        System.out.printf("via Employee.getCount(): %d%n",Employee.getCount());
        System.out.println(PI);
    }
    
}
