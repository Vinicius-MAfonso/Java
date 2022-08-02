package pkg7.pkg19;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Voo {
    private final Scanner input = new Scanner(System.in);
    //Cria um ArrayList da classe Assento
    private final ArrayList<Assento> assentos;
    private final String nome;
    
    public Voo(String nome){
        //Estipula que essa coleção terá 10 objetos
        this.assentos = new ArrayList(10);
        //Instancia e define quais serão de primeira classe e classe economica
        for(int i = 0; i < 10; i++){
            if(i <= 4){
                assentos.add(new Assento(Assento.classe.PRIMEIRA));
                
            }else if(i >= 5){
                assentos.add(new Assento(Assento.classe.ECONOMICA));
            }
        }
        this.nome = nome;
    }
    //Método de apresentação e entrada de qual classe será feita a reserva
    public void showIntro(){
        int classe;
        System.out.println("Bem vindo ao aeroporto!");
        System.out.println("Voo:" + nome);
        showAvailablePlaces();    
        System.out.print("Digite a classe desejada: ");
        classe = input.nextInt(); 
        reserva(classe);
    }
    //Método que verifica se há assentos disponíveis no vôo
    public boolean isDisponivel(){
        for(Assento assento : assentos){
            if(assento.isDisponibilidade()){
                return true;
            }
        }
        return false;
    }
    //Método que faz a reserva e mostra o cartão de embarque    
    private void reserva(int classe){
        int nReserva;
        if(classe == 1){
            for(int i = 0;i < 5; i++){
                if(assentos.get(i).isDisponibilidade()){
                    assentos.get(i).setDisponibilidade(false);
                    nReserva = i + 1;
                    System.out.printf("Reserva feita com sucesso%n"
                            + "Seu cartão de embarque:%n"
                            + "Número de reserva:%d%n"
                            + "Tipo: Primeira classe%n%n",nReserva);
                }else{
                    if(i == 4){
                        JOptionPane.showMessageDialog(null, "Não há mais vagas "
                                + "para essa classe");
                    }
                    continue;
                }
                break;
            }
        }else if(classe == 2){
            for(int i = 5;i < 10; i++){
                if(assentos.get(i).isDisponibilidade()){
                    assentos.get(i).setDisponibilidade(false);
                    nReserva = i + 1;
                    System.out.printf("Reserva feita com sucesso%n"
                            + "Seu cartão de embarque:%n"
                            + "Número de reserva:%d%n"
                            + "Tipo: Classe ecônomica%n%n",nReserva);
                }else{
                    if(i == 9){
                        JOptionPane.showMessageDialog(null, "Não há mais vagas "
                                + "para essa classe");
                    }
                    continue;
                }
                break;
            }
            
        }
    }
    //Método que apresenta os lugares disponíveis no vôo
    private void showAvailablePlaces(){
        System.out.println("Lugares disponíveis no vôo");
        System.out.println("Primeira classe: ");
        for(int i = 0;i < 5; i++){
            
            if(assentos.get(i).isDisponibilidade()){
                System.out.printf("%d",i+1);
            }else{
                System.out.printf("X");
            }
            i++;
            if(i == 5){
                System.out.println();
                break;
            }
            if(assentos.get(i).isDisponibilidade()){
                System.out.printf("%10d",i+1);
            }else{
                System.out.printf("%10s","X");
            }
            System.out.println();
        }
        System.out.println("Classe ecônomica:");
        for(int i = 5;i < 10; i++){
            if(assentos.get(i).isDisponibilidade()){
                System.out.printf("%d",i+1);
            }else{
                System.out.printf("X");
            }
            i++;
            if(i == 10){
                System.out.println();
                break;
            }
            if(assentos.get(i).isDisponibilidade()){
                System.out.printf("%10d",i+1);
            }else{
                System.out.printf("%10s","X");
            }
            System.out.println();
        }
    }
}
