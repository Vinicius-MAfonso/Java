package pkg7.pkg39;

public class GradeBook {
    private String courseName; //Nome do curso
    private final int[][] grades; //array bidimensional das notas dos alunos
    
    
    public GradeBook(String courseName, int alunos,int exames){
        this.courseName = courseName;
        this.grades = new int[alunos][exames];
    }
    
    //Retorna os nomes do curso
    public String getCourseName() {
        return courseName;
    }
    //Configura o nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //Realiza operações nos dados
    public void processGrades(){
        //Apresenta as notas
        outputGrades();
        //Apresenta o máximo
        System.out.printf("A maior nota da sala é %d%n",getMaximum());
        //Apresenta o mínimo
        System.out.printf("A menor nota da sala é %d%n",getMinimum());
        //Apresenta o gráfico em simbolos
        outputBarChart();
    }
    public int getMinimum(){
        int lowGrade = grades[0][0];
        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }
    public int getMaximum(){
        int highGrade = grades[0][0];
        //Faz um loop pelas linha do array de notas(cada aluno)
        for(int[] studentGrades : grades){
            //Faz um loop pelas colunas da linha atual(Cada nota)
            for(int grade : studentGrades)
                if(grade > highGrade){
                    highGrade = grade;
                }
        }
        return highGrade;
    }
    //Faz a média de cada aluno separadamente
    public double getAverage(int[] setOfGrades){
        double soma = 0;
        for(int grade : setOfGrades){
            soma += grade;
        }
        return soma/setOfGrades.length;
    }
    public void outputBarChart(){
        System.out.println("Distribuição das notas: ");
        int[] frequency = new int[11];
        
        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                try{
                    ++frequency[grade/10];
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                    System.out.println("Nota errada: "+ grade);
                }
            }
        }
        
        for(int count = 0;count < frequency.length ; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d - %02d: ",count*10,count*10+9);
            }
            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void outputGrades(){
        System.out.printf("As notas são:%n%n");
        System.out.print("                  "); // alinha títulos de coluna

        // cria um título de coluna para cada um dos testes
        for (int test = 0; test < grades[0].length; test++){
            System.out.printf("%5s%d ","Teste", test + 1);
        }

        System.out.println("Média"); // título da coluna de média do aluno

        // cria linhas/colunas de texto que representam notas de array
        for (int student = 0; student < grades.length; student++)
        {
            System.out.printf("Estudante %2d", student + 1);

            for (int test : grades[student]){ // gera saída de notas do aluno
                System.out.printf("%8d", test);
            }    

            // chama método getAverage para calcular a média do aluno;
            // passa linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }   
}
