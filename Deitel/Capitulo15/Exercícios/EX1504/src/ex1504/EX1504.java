package ex1504;
import java.util.Scanner;
import java.util.Formatter;
import java.io.IOException;

public class EX1504 {
    
private static final MenuOptions[] menuOptions = MenuOptions.values();

    public static void main(String[] args) {
        MenuOptions choice = null;
        do{
            choice = showMenu();
            openFileAndAddRecord(choice);
        }while(!choice.equals(MenuOptions.END));
    }
    private static MenuOptions showMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        System.out.printf("%s%n%s%n%s%n",
                "1-Transaction record","2-Account","3-Terminar");
        System.out.print("?");
        return menuOptions[input.nextInt()-1];
    }
    private static void openFileAndAddRecord(MenuOptions choice){
        Scanner input = new Scanner(System.in);
        switch(choice){
            case TRANSACTION_RECORD ->{
              try(Formatter transactionFile = new Formatter("trans.txt")){
                  while(input.hasNext()){
                    System.out.print("Digite o número da conta: ");
                    transactionFile.format("%d ",input.nextInt());
                    System.out.print("Digite o valor: R$");
                    transactionFile.format("%.2f",input.nextDouble());
                  }
              }catch(IOException ioe){
                  System.err.println(ioe);
              }
            }
            case ACCOUNT_RECORD -> {
                try(Formatter oldmastFile = new Formatter("oldmast.txt")){
                  while(input.hasNext()){
                    System.out.print("Digite o número da conta: ");
                    oldmastFile.format("%d ",input.nextInt());
                    System.out.print("Digite o nome: ");
                    oldmastFile.format("%s ",input.nextLine());
                    System.out.print("Digite o saldo: ");
                    oldmastFile.format("%.2f",input.nextDouble());
                  }
                }catch(IOException ioe){
                    System.err.println(ioe);
                }
            }
        }
    }
    
}
