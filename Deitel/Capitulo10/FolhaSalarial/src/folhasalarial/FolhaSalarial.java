package folhasalarial;

public class FolhaSalarial {

    public static void main(String[] args) {
        //Cria um objeto com a classe empregado salariado
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-111",800.00);
        //Cria um objeto com a classe empregado por horas
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("Karen", "Price", "222-22-222", 16.75, 40);
        //Cria um objeto com a classe emprego por comissão
        ComissionEmployee comissionEmployee = 
                new ComissionEmployee("Sua", "Jones", "333-33-333", 1000, .6);
        //Cria um objeto com a classe salário comissionado, com a base salarial
        BasePlusComissionEmployee basePlusComissionEmployee = 
                new BasePlusComissionEmployee("Bob", "Lewis", "444-44-444", 5000, .04, 300);
        
        System.out.println("Empregados processados individualmente: ");
        //Impressão dos dados de ganhos dos empregados
        System.out.printf("%n%s%n%s: R$%,.2f%n%n",salariedEmployee, 
                "Ganhos", salariedEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: R$%,.2f%n%n",hourlyEmployee, 
                "Ganhos", hourlyEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: R$%,.2f%n%n",comissionEmployee, 
                "Ganhos", comissionEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: R$%,.2f%n%n",basePlusComissionEmployee, 
                "Ganhos", basePlusComissionEmployee.getPaymentAmount());
        //Vetor que guarda todos os empregados instanciados
        Employee[] employees = new Employee[4];
        //Coloca um empregado em cada posição do vetor empregados
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;
        System.out.printf("Empregados processados polimorficamente:%n%n");
        //Roda todos os empregados do vetor
        for(Employee currentEmployee : employees){
            //Retorna a representação String do empregado da posição do vetor
            System.out.println(currentEmployee);
            
            //Se o empregado for da classe BasePlusComissionEmployee, 
            //primeiro cria uma referência do objeto, e esse empregado recebe 10%
            //de aumento
            if(currentEmployee instanceof BasePlusComissionEmployee employee){//DownCast
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                
                System.out.printf("Nova base salarial com 10%% de aumento é: R$%,.2f%n",
                        employee.getBaseSalary());
            }
            System.out.printf("Ganho $%,.2f%n%n", currentEmployee.getPaymentAmount());
        }
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Empregado %d é um %s%n",
                    j,employees[j].getClass().getName());
        //Teste Interface payable
        Payable[] payableObjects = new Payable[4];
        payableObjects[0] = new Invoice(01234, "Seat", 5, 375.00);
        payableObjects[1] = new Invoice(01234, "Seat", 5, 375.00);
        payableObjects[2] = new SalariedEmployee("John", "Travolta", "123456", 200.f);
        payableObjects[3] = new SalariedEmployee("Suse", "Seat", "987654", 375.f);
        System.out.println("Contas e empregados processados polimorficamente");
        for(Payable currentPayable : payableObjects)
        {
            System.out.printf("%n%s %n%s: R$%,.2f%n",currentPayable.toString(),
                    "Pagamento", currentPayable.getPaymentAmount());
        }
    }
    
}
