package Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee vinicius = new Employee("Vinicius", "Mariano", 1200);
        Employee carlos = new Employee("Carlos", "Afonso", 3000);
        System.out.printf("O empregado %s recebe R$%.2f anual%n",vinicius.getNome(),vinicius.getSalarioAnual());
        System.out.printf("O empregado %s recebe R$%.2f anual%n",carlos.getNome(),carlos.getSalarioAnual());
        vinicius.reajuste(10);
        carlos.reajuste(10);
        System.out.printf("O empregado %s recebe R$%.2f anual depois do reajuste%n",vinicius.getNome(),vinicius.getSalarioAnual());
        System.out.printf("O empregado %s recebe R$%.2f anual depois do reajuste%n",carlos.getNome(),carlos.getSalarioAnual());
    }
    
}
