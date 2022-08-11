package pkg8.pkg12;

public class Date {
    private int month;//1-12
    private int day;//1-31
    private int year;//qualquer
    private int daysPerMonth;
    public Date(int day,int month, int year){
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("Month must be in the range(1-12)");
        }
        this.month = month;
        setDaysPerMonth();
        if(day < 1 || day > daysPerMonth){
            throw new IllegalArgumentException(String.format("Day must be in range 1 - %d", daysPerMonth));
        }
        this.day = day;
        this.year = year;      
    }
    
    public void nextDay(){
        day++;
        if(day > daysPerMonth){
            month++;
            day = 1;
            setDaysPerMonth();
        }
        if(month > 12){
            year++;
            month = 1;
            setDaysPerMonth();
        }
    }
    private void setDaysPerMonth(){
        daysPerMonth = switch(month){
            case 1,3,5,7,8,10,12 ->{
                yield 31;
            }case 4,6,9,11 ->{
                yield 30;
            }default ->{
                yield 28;
            }
        };
    }
    
    @Override
    public final String toString(){
      return String.format("%d/%d/%d", day,month,year);
    }
}
