package pkg14.pkg8;

public class Main {
 
    public static void main(String[] args) {
        String telefone = "(555) 555-5555";
        String[] token = telefone.split("-| ");
        System.out.printf("Código de área: %s%n",token[0]);
        System.out.printf("Telefone: %s-%s%n",token[1],token[2]);
    }
    
}
