package locadoraproject;
import java.util.Scanner;
import java.util.ArrayList;

public class LocadoraProject {
    public static final Scanner input = new Scanner(System.in);//Criando objeto para entrada do usuario
    public static ArrayList<Veiculo> veiculos = new ArrayList(); //Array que armazena os veículos   
    public static void main(String[] args){
        menu();
    }
    //Menu que gerencia a entrada e a saída
    private static void menu(){
        System.out.println("Bem vindo a locação Ferreira");
        System.out.println("""
                        1 - Alugar veículo
                        2 - Cadastrar veículo(somente adm)
                        3 - Sair
                        """);
        System.out.print("Digite uma opção: ");
        int opcao = input.nextInt();//Entrada da opcao
        switch (opcao) {
            case 1 -> {
                limparTela();
                
                for(int i = 0; i < veiculos.size();i++){
                    System.out.printf("%d - %s(%s)%n",i,veiculos.get(i),
                            veiculos.get(i).isAlugado()? "Alugado" : "Disponível");
                }   System.out.print("Selecione o carro: ");
                int opcaoVeiculo = input.nextInt();
                try{
                    Veiculo veiculoSelecionado = veiculos.get(opcaoVeiculo);
                }catch(IndexOutOfBoundsException e){
                    System.out.println("Carro não existe, voltando ao menu...");
                    sleep(2);
                    limparTela();
                    menu();
                    break;
                }   
                
                Veiculo veiculoSelecionado = veiculos.get(opcaoVeiculo);
                if(veiculoSelecionado.isAlugado()){
                    System.out.println("Carro alugado!, voltando ao menu");
                    sleep(3);
                    limparTela();
                    menu();
                    break;
                }
                System.out.print("Digite seu nome: ");
                String nome = input.next();
                
                System.out.print("Digite seu cpf: ");
                String cpf = input.next();
                
                System.out.print("Digite sua idade: ");
                int idade = input.nextInt();
                if(idade < 18){
                    limparTela();
                    System.out.println("Idade não permitida");
                    menu();
                    break;
                } 
                
                Cliente clienteAtual = new Cliente(nome, cpf, idade);
                
                System.out.print("Qual será o tempo de contrato(meses): ");
                int meses = input.nextInt();
                
                limparTela();
                Contrato contrato = new Contrato(veiculoSelecionado, clienteAtual, meses);
                veiculoSelecionado.setAlugado(true);
                System.out.println("Veiculo alocado!");
                System.out.println(contrato);
                sleep(5);
                limparTela();
                menu();
            }
            case 2 -> {
                limparTela();
                
                System.out.println("Cadastro de veículo");
                System.out.print("Digite o tipo de veiculo: ");
                String tipoVeiculo = input.next().toUpperCase();
                
                System.out.print("Digite a marca do veículo: ");
                String marca = input.next().toUpperCase();
                
                System.out.print("Digite o modelo do veículo: ");
                String modelo = input.next().toUpperCase();
                
                System.out.print("Digite o emplacamento do veículo: ");
                String emplacamento = input.next().toUpperCase();
                
                System.out.print("Digite o valor padrão do carro:R$ ");
                double valorVeiculo = input.nextDouble();
                Veiculo veiculoNovo = new Veiculo(tipoVeiculo, marca, modelo, emplacamento, valorVeiculo);
                veiculos.add(veiculoNovo);
                System.out.println("Veiculo adicionado...");
                sleep(3);
                limparTela();
                menu();
            }
            default -> System.out.println("Saindo...");
        }
        
    }
    //Gambiarra que limpa a tela
    public static void limparTela(){
        for(int i = 0;i < 50;i++)
         System.out.print("\r\n");
    }
    public static void sleep(int secs){
        try { Thread.sleep (secs*1000); } catch (InterruptedException ex) {}
    }
}
