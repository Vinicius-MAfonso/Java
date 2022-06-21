package capítulo4;


public class Student {
    private String name;
    private double average;
    public Student(String name, double average){
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    public char getLetterGrade(){
        if(average >= 90){
            return 'A';
        }else if(average >= 80){
            return 'B';
        }else if(average >= 70){
            return 'C';
        }else if(average >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
    
}
