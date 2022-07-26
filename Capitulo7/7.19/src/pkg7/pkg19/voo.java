package pkg7.pkg19;
import java.util.Scanner;
/*Sistema para atribuir assentos em cada voo da companhia aérea
Máximo de 10 assentos

Entrada:
Por favor digite 1 para a primeira classe[assentos de 1 a 5]
Por favor digite 2 para a classe economica[assentos 6 a 10]

Após isso deve exibir um cartão de embarque indicando o número da poltrona
e a classe dela

array do tipo bool para representar o gráfico de assentos do avião
false - desocupadas
true - ocupadas

O sistema não deve atribuir uma poltrona que já foi reservada
Se uma das classses estiver cheia somente a outra deve ser exibida como disponivel
Se não tiver nenhuma poltrona, o aplicativo deve exibir:
O próximo voo parte em 3 horas.
*/
public class voo {
    private final Scanner input = new Scanner(System.in);
    private boolean[] assentos;
    private final String nome;
    public voo(String nome){
        assentos = new boolean[11];
        this.nome = nome;
    }
    public void inputAssento(){
        System.out.println("Bem vindo ao aeroporto!");
        
        System.out.println("1 - Primeira classe%n2 - Classe ecônomica%n");
        System.out.print("Digite 1 ou 2 para reservar o assento:");
        
    }
    private void showLugares(){
       System.out.println(nome);
       for(int i = 1;i < assentos.length;i++){
           if(i <= 5 && assentos[i] == false){
               System.out.println("Assentos da primeira classe disponíveis: ");
               System.out.println(i);
           }else if(i >= 6){
               System.out.println("Assentos da classe ecônomica disponíveis: ");
               System.out.println(i);
           }
           
       }
    } 
}
