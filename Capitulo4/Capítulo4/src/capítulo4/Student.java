package capítulo4;


public class Student {
    private String name;
    private int average;
    public Student(String name, int average){
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

    public void setAverage(int average) {
        this.average = average;
    }
    public char getLetterGrade(){
        return switch (average) {
            case 10 -> 'A';
            case 9 -> 'B';
            case 8 -> 'C';
            case 7 -> 'D';
            case 6 -> 'E';
            default -> 'F';
        };
    }
    
}
