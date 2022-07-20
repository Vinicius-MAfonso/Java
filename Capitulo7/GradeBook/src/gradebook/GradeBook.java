package gradebook;

public class GradeBook {
    private String courseName; //Nome do curso
    private int[] grades; //array das notas
    
    
    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    
    //Retorna os nomes do curso
    public String getCourseName() {
        return courseName;
    }
    //Configura o nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //Retorna as notas
    public int[] getGrades() {
        return grades;
    }
    //Configura as notas
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    //Realiza operações nos dados
    public void processGrades(){
        //Apresenta as notas
        outputGrades();
        //Apresenta a média
        System.out.printf("Média da classe é %.2f%n",getAverage());
        //Apresenta o máximo
        System.out.printf("A maior nota da sala é %d%n",getMaximum());
        //Apresenta o mínimo
        System.out.printf("A menor nota da sala é %d%n",getMinimum());
        //Apresenta o gráfico em simbolos
        outputBarChart();
    }
    public int getMinimum(){
        int lowGrade = grades[0];
        for(int grade : grades){
            if(grade < lowGrade){
                lowGrade = grade;
            }
        }
        return lowGrade;
    }
    public int getMaximum(){
        int maxGrade = grades[0];
        for(int grade : grades){
            if(grade > maxGrade){
                maxGrade = grade;
            }
        }
        return maxGrade;
    }
    public double getAverage(){
        double soma = 0;
        for(int grade : grades){
            soma += grade;
        }
        return soma/grades.length;
    }
    public void outputBarChart(){
        System.out.println("Distribuição das notas: ");
        int[] frequency = new int[11];
        for(int grade : grades){
            try{
                ++frequency[grade/10];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Nota errada: "+ grade);
            }
        }
        for(int count = 0;count < frequency.length; count++){
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
        System.out.printf("As notas são: %n%n");
        for(int student = 0; student < grades.length;student++){
            System.out.printf("Estudante %2d: %3d%n",student++,grades[student]);
        }
    }
  
    
    
}
