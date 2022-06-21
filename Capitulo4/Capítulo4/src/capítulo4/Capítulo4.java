package capítulo4;
import java.util.Scanner;

public class Capítulo4 {

    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
      int count = 0;
      int total = 0;
      int ultimaNota = 0;
      while(count <=10){
          System.out.printf("Digite a %dª nota: ",count);
          ultimaNota = input.nextInt();
          total += ultimaNota;
          count++;
      }
      
      double media = total/count;
      Student estudante = new Student("Vinicius",media);
      System.out.printf("A nota em forma de letra do aluno %s é '%c'%n", estudante.getName(), estudante.getLetterGrade());
//    count++ / count--;
//    System.out.println(studentGrade>=60 ? "Passou":"Falhou"); //Expressão ternária
    
    }
    
}
