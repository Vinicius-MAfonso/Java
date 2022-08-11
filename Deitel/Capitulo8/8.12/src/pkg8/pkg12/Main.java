package pkg8.pkg12;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(23, 10, 2002);
        Time time = new Time(23, 30, 30);
        DateAndTime dateAndTime = new DateAndTime(date,time);
        
        DateAndTime.incrementHour(dateAndTime);
        DateAndTime.incrementHour(dateAndTime);
        System.out.println(dateAndTime);
    }
    
}
