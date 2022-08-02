package Employee;


public class Employee {
    private String nome;
    private String sobrenome;
    private double salarioMes;
    
    public Employee(String nome, String sobrenome, double salarioMes){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salarioMes >= 0){
            this.salarioMes = salarioMes;
        }
        System.out.println("Instanciando...");
    }
    
    public void reajuste(double reajustePer){
         salarioMes+=salarioMes*reajustePer/100;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }
    public double getSalarioAnual(){
         return this.salarioMes*12;
    }
    
}
