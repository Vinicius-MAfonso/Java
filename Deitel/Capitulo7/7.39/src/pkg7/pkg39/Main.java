package pkg7.pkg39;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import jdk.jfr.FlightRecorder;
/*Modifique a classe GradeBook da Figura 7.18 
para que o construtor aceite como parâmetros o número de alunos e o 
número de exames e, então, 
construa um array bidimensional de tamanho adequado, 
em vez de receber um array bidimensional pré-inicializado como ele faz agora. 
Defina cada elemento do novo array bidimensional como -1 
para indicar que nenhuma nota foi
inserida para esse elemento. Adicione um método setGrade que defina uma nota 
para um aluno específico em um exame particular.
Modifique a classe GradeBookTest da Figura 7.19 para inserir o 
número de alunos e o número de exames para GradeBook e para
permitir que o instrutor insira uma nota de cada vez.*/

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Seja bem vindo ao sistema de gravação de notas");
        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = input.nextInt();
        System.out.print("Digite a quantidade de notas: ");
        int qtdNotas = input.nextInt();
        
        GradeBook gradeBook = new GradeBook("Java para iniciantes", qtdAlunos, qtdNotas);
        
        while(gradeBook.isAvailable()){
            System.out.print("Digite o número do aluno: ");
            int nAluno = input.nextInt()-1;
            System.out.print("Digite a nota do aluno: ");
            int nota = input.nextInt()-1;
            gradeBook.setGrade(nAluno, nota);
        }
        gradeBook.processGrades();
        
        
        
    }
    
}
