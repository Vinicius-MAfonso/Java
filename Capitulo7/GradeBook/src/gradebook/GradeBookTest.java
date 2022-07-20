package gradebook;

public class GradeBookTest {
    
    public static void main(String[] args) {
        int[] gradesArray ={100, 90, 50, 80, 40, 80, 50, 60, 40, 70};
        GradeBook myGradeBook = new GradeBook("Introdução ao Java", gradesArray);
        
        System.out.println("Bem vindo as notas do curso "+myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
    
}
