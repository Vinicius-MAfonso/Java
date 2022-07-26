package pkg7.pkg19;
import java.util.ArrayList;
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
public class Voo {
    private final Scanner input = new Scanner(System.in);
    private final ArrayList<Assento> assentos;
    private final String nome;
    
    public Voo(String nome){
        this.assentos = new ArrayList(10);
        
        for(int i = 0; i < 10; i++){
            if(i <= 4){
                assentos.add(new Assento(Assento.classe.PRIMEIRA));
                
            }else if(i >= 5){
                assentos.add(new Assento(Assento.classe.ECONOMICA));
            }
        }
        this.nome = nome;
    }
    
    public void showIntro(){
        int classe;
        while(isDisponivel()){
            System.out.println("Bem vindo ao aeroporto!");
            System.out.println("Voo:" + nome);
            System.out.print("Digite a classe desejada: ");
            classe = input.nextInt(); 
            reserva(classe);
        }
    }
    public boolean isDisponivel(){
        for(Assento assento : assentos){
            return assento.isDisponibilidade();
        }
        return false;
    }
        
    private void reserva(int classe){
        int nReserva = 0;
        if(classe == 1){
            for(int i = 0;i < 5; i++){
                if(assentos.get(i).isDisponibilidade()){
                    assentos.get(i).setDisponibilidade(false);
                    nReserva = i;
                    System.out.printf("Reserva feita com sucesso%n"
                            + "Seu cartão de embarque:%n"
                            + "Número de reserva:%d%n"
                            + "Tipo: Primeira classe%n%n",nReserva+1);
                }else{
                    System.out.println("Não há lugares disponíveis");
                }
                break;
            }
        }else if(classe == 2){
            for(int i = 5;i < 10; i++){
                if(assentos.get(i).isDisponibilidade()){
                    assentos.get(i).setDisponibilidade(false);
                    nReserva = i;
                    System.out.printf("Reserva feita com sucesso%n"
                            + "Seu cartão de embarque:%n"
                            + "Número de reserva:%d%n"
                            + "Tipo: Classe ecônomica%n%n",nReserva+1);
                }else{
                    System.out.println("Não há lugares disponíveis");
                }
                break;
            }
            
        }
    } 
}
