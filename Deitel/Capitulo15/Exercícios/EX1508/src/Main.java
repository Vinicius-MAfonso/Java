import java.util.Formatter;
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Main {

    private static MenuOption[] menuOptions = MenuOption.values();
    public static Scanner inputConsole = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sistema de geração de frequência");
        MenuOption choice;
        do{
            choice = menuChoice();
            switch (choice){
                case GRAVAR -> {
                    System.out.println("Gerar números");
                    gravarNumeros();
                }
                case GERAR_RELATORIO -> {
                    gerarFrequencia();
                    System.out.println("Gerar relatório");

                }
                case SAIR -> {
                    System.out.println("Volte sempre!");
                    File numberFile = new File("number.txt");
                    numberFile.deleteOnExit();
                    System.exit(0);
                }
            }
        }while (choice != MenuOption.SAIR);

    }
    //Gera a opção do usuário
    private static MenuOption menuChoice(){
        System.out.println("""
                1 - Gravar números
                2 - Ler e gerar relatório
                3 - Sair""");
        System.out.print("?");
        int option = inputConsole.nextInt();
        return  menuOptions[option-1];
    }
    //Grava os números no arquivo
    private static void gravarNumeros(){
        try(Formatter numberFormatter = new Formatter("number.txt")){
            do{
                System.out.println("Digite um número entre 1 e 10");
                System.out.print(":");
                int number = inputConsole.nextInt();
                if(number < 1 || number > 10){
                    System.out.println("Você digitou um número menor que 1 ou maior que 10, Saindo...");
                    break;
                }
                numberFormatter.format("%d ",number);
            }while(true);
            }catch (IOException ioException){
                System.err.println(ioException);
                System.exit(1);
            }
    }
    private static void gerarFrequencia(){
        try(Formatter frequencyFormatter = new Formatter("frequency.txt");
            Scanner numberInput = new Scanner(Paths.get("number.txt"))){
            int[] frequencia = new int[11];
            frequencyFormatter.format("-=-=Tabela de frequência=-=-");
            while(numberInput.hasNext()){
                frequencia[numberInput.nextInt()]++;
            }
            for(int i = 1;i <= 10;i++){
                frequencyFormatter.format("%n    %d - %d vezes inserido",i,frequencia[i]);
            }
        }catch (IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
    }
}