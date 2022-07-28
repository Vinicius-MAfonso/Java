package pkg7.pkg39;
import java.util.Scanner;


public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Seja bem vindo ao sistema de gravação de notas");
        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = input.nextInt();
        System.out.print("Digite a quantidade de notas: ");
        int qtdNotas = input.nextInt();
        
        GradeBook gradeBook = new GradeBook("Java para iniciantes", qtdAlunos, qtdNotas);
        
        
        
        
    }
    
}
