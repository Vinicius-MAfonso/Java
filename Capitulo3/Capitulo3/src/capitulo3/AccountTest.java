package capitulo3;
import java.util.Scanner; //Importa o Scanner


public class AccountTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Instancia o objeto para leitura
        
        System.out.print("Por favor digite o nome da conta: ");
        String theName = input.nextLine(); //Aceita a entrada de uma string na l
        Account myAccount1 = new Account(theName,200); //Instancia o objeto myAccount

        System.out.printf("O primeiro nome da conta é %s%n",myAccount1.getName()); //Chama o método getName para retornar o nome do objeto
        System.out.printf("O nome da conta é %s%n",myAccount1.getName()); //Retorna o nome do objeto após o set
        System.out.printf("O saldo da conta é R$%.2f%n",myAccount1.getSaldo());
        
        myAccount1.deposit(200);
        System.out.println(myAccount1.getSaldo());
        
    }    
}
