package capitulo3;
import java.util.Scanner; //Importa o Scanner


public class AccountTest {
    public static void displayAccount(Account accountToDisplay){
       System.out.printf("A conta %s tem R$ %.2f%n",accountToDisplay.getName(), accountToDisplay.getSaldo());
    } //Função no Java
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Instancia o objeto para leitura
        
        System.out.print("Por favor digite o nome da conta: ");
        String theName = input.nextLine(); //Aceita a entrada de uma string na l
        Account myAccount1 = new Account(theName,200); //Instancia o objeto myAccount
        
        displayAccount(myAccount1);
    }    
}
