package Employee;

public class Date {
    private int month;//1-12
    private int day;//1-31
    private int year;//qualquer
    private int DAYSPERMONTH;
    public Date(int month,int day, int year){
        this.DAYSPERMONTH = switch(month){
            case 1,3,5,7,8,10,12 ->{
                yield 31;
            }case 4,6,9,11 ->{
                yield 30;
            }default ->{
                yield 28;
            }
        };
        
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("Month must be in the range(1-12)");
        }
        if(day < 1 || day > DAYSPERMONTH){
            throw new IllegalArgumentException(String.format("Day must be in range 1 - %d", DAYSPERMONTH));
        }
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.printf("Date object constructor for date %s%n",this);        
    }
    
    public void nextDay(){
        if(DAYSPERMONTH < day++){
            day = 1;
            month++;
        }else{
            day++;
        }
    }
    @Override
    public String toString(){
      return String.format("%d/%d/%d", day,month,year);
    }
}
