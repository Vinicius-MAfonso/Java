package sombreamento;

public class Sombreamento {
    private static int x = 1;
    public static void main(String[] args) {
       int x = 5;
       System.out.printf("local x no main é %d%n",x);
       
       useLocalVar();//Tem uma var com o mesmo nome no escopo, por isso ele não altera o campo
       useField(); //Não tem uma var com o mesmo nome no escopo, por isso ele altera o campo
       useLocalVar();
       useField();
       
       System.out.printf("local x no main é %d%n",x);
        
    }
    public static void useLocalVar(){
        int x = 25;
        System.out.printf("local x no método useLocalVar é %d%n",x);
        ++x;
        System.out.printf("local x antes de sair do método useLocalVar é %d%n",x);
    }
    public static void useField(){
        System.out.printf("campo x antes de entrar do método useField é %d%n",x);
        x *= 10;
        System.out.printf("campo x antes de sair do método useField é %d%n",x);
    }
}
