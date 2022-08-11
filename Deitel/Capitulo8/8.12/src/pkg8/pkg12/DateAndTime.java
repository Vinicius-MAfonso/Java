package pkg8.pkg12;

public class DateAndTime {
    private final Date date;
    private final Time time;
    public DateAndTime(Date date, Time time){
        this.date = date;
        this.time = time;
    }
    public static void incrementHour(DateAndTime dateAndTime){
        dateAndTime.time.incrementHour();
        if(dateAndTime.time.getHour() >= 24){
            dateAndTime.date.nextDay();
        }
    }
    @Override
    public String toString(){
        return String.format("Dia %s%nHora %s%n",date,time);
    }
}
