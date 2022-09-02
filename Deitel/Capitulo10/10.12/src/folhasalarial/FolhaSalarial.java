package folhasalarial;

public class FolhaSalarial {

    public static void main(String[] args) {
        Date currentDate = new Date(1, 1, 2022);
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-111",800.00, new Date(23, 10, 2002));
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("Karen", "Price", "222-22-222", 16.75, 40, new Date(10, 12, 2000));
        ComissionEmployee comissionEmployee = 
                new ComissionEmployee("Sua", "Jones", "333-33-333", 1000, .6, new Date(15, 1, 1998));
        BasePlusComissionEmployee basePlusComissionEmployee = 
                new BasePlusComissionEmployee("Bob", "Lewis", "444-44-444", 5000, .04, 300, new Date(2, 2, 1990));
        
        Employee[] employees = new Employee[4];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;
        
        System.out.printf("Empregados processados polimorficamente:%n%n");
        while(currentDate.getYear() <= 2023)
        {
            for(Employee currentEmployee : employees){
                if(currentEmployee.getBirthDate().getMonth() == currentDate.getMonth()
                        && currentDate.getDay() == 1){
                    System.out.printf("O funcionário %s %s faz aniversário esse mês"
                            + "incremento de 100 reais no salário%n",
                            currentEmployee.getFirstName(), currentEmployee.getLastName());
                    System.out.printf("Salário novo: R$%,.2f%n",currentEmployee.incrementPaymentAmount(100.00));
                }
            }
            currentDate.nextDay();
            System.out.println("Data atual:" + currentDate);
            sleep(1);
        }
        System.out.println("Feliz ano novo!");
    }
    public static void sleep(int secs){
        try { Thread.sleep (secs*1000); } catch (InterruptedException ex) {}
    }
    
}
