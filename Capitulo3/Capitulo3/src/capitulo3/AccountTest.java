package capitulo3;
import java.util.Scanner; //Importa o Scanner


public class AccountTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Instancia o objeto para leitura
        Account myAccount = new Account(); //Instancia o objeto myAccount
        
        System.out.printf("O primeiro nome da conta é %s%n",myAccount.getName()); //Chama o método getName para retornar o nome do objeto
        
        System.out.print("Por favor digite o nome da conta: ");
        String theName = input.nextLine(); //Aceita a entrada de uma string na linha
        
        myAccount.setName(theName); //Insere o theName no objeto myAccount
        System.out.printf("O nome da conta é %s%n",myAccount.getName()); //Retorna o nome do objeto após o set
        
    }    
}
