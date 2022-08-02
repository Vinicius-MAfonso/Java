package gradebook;

public class GradeBookTest {
    
    public static void main(String[] args) {
        int[][] gradesArray ={{87,90,32},
                              {78,86,45},
                              {65,84,78},
                              {100,86,90},
                              {23,32,100},
                              {12,21,43},
                              {60,76,55},
                              {32,43,80},
                              {21,21,32},
                              {45,67,78}};
        
        GradeBook myGradeBook = new GradeBook("Introdução ao Java", gradesArray);
        
        System.out.println("Bem vindo as notas do curso "+myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
    
}
