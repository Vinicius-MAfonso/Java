package pkg11.pkg2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static int quotient(int numerator, int denominator)throws ArithmeticException
    {
        return numerator/denominator; //Possível divisão por 0, ou seja possível excessão
    }
    
    public static void main(String[] args) {
        boolean continueLoop = true; //Determina se mais entradas são necessárias
        do{
            try{
                System.out.print("Por favor digite um numerador inteiro: ");
                int numerator = input.nextInt();
                System.out.print("Por favor digite um denominador inteiro: ");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResultado: %d/%d = %d%n",numerator,denominator,result);
                continueLoop = false;
            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("%nException %s%n",inputMismatchException);
                input.nextLine();//Limpa a entrada do usuário de numerador ou denominador
                System.out.printf("Voce deve entrar com números inteiros, tente novamente %n%n");
            }
            catch(ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("O número 0 é um denominador inválido, tente novamente %n%n");
            } 
        }while(continueLoop);
    }
    
}
