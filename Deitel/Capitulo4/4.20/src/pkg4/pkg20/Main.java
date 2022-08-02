package pkg4.pkg20;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double salarioBruto;
    while(true){
        System.out.print("Digite a quantidade de horas trabalhadas(-1 para sair): ");
        int horasTrabalhadas = input.nextInt();
        if(horasTrabalhadas == -1){
            break;
        }
        System.out.print("Digite o salario por hora do funcionario: ");
        double salarioHora = input.nextDouble();
        salarioBruto = horasTrabalhadas*salarioHora;
        if(horasTrabalhadas <= 40){
            System.out.printf("O seu salário bruto é de R$%.2f",salarioBruto);
        }else{
            System.out.printf("O seu salário bruto"
                    + " é de R$%.2f%n",(salarioBruto+(salarioBruto*0.5)));
            }
        }
    }
}
