package HeartRates;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = input.nextLine();
        
        System.out.print("Digite o dia do seu aniversário: ");
        int diaAni = input.nextInt();
        
        System.out.print("Digite o mês do seu aniversário: ");
        int mesAni = input.nextInt();
        
        System.out.print("Digite o ano do seu aniversário: ");
        int anoAni = input.nextInt();
        
        System.out.print("Digite o seu peso em KG: ");
        double peso = input.nextDouble();
        
        System.out.print("Digite a sua altura em M: ");
        double altura = input.nextDouble();
        
        HealthProfile pessoa = new  HealthProfile(nome, sobrenome, diaAni, mesAni, anoAni, altura, peso);
        System.out.printf("O(A) %s tem %d anos de idade%n"
                + "O batimento cardiaco máximo é de: %.0f%n"
                + "O batimento cardiaco alvo é %s%n"
                + "O IMC é: %s%n",pessoa.getNomeInteiro(),pessoa.getIdade(),pessoa.frqMax(),pessoa.frqAlvo(),pessoa.imc());
        
    }
    
}
