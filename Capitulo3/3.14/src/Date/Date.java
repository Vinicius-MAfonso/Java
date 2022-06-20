package Date;


public class Date {
    int dia;
    int mes;
    int ano;
    
    public Date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        System.out.println("Instanciando...");
    }
    public void displayDate(){
        System.out.printf("%d/%d/%d%n",dia,mes,ano);
    }

}
