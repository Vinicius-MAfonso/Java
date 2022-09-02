package folhasalarial;

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
            throw new IllegalArgumentException(String.format("Day must be in range 1 - %d", getDaysPerMonth()));
        }
        this.day = day;
        this.year = year;       
    }
    
    public void nextDay(){
        setDay(getDay() + 1);
        if(getDay() > getDaysPerMonth()){
            setMonth(getMonth() + 1);
            setDay(1);
            setDaysPerMonth();
        }
        if(getMonth() > 12){
            setYear(getYear() + 1);
            setMonth(1);
            setDaysPerMonth();
        }
    }
    private void setDaysPerMonth(){
        setDaysPerMonth(switch (getMonth()) {
            case 1,3,5,7,8,10,12 ->{
                yield 31;
            }
            case 4,6,9,11 ->{
                yield 30;
            }
            default ->{
                yield 28;
            }
        });
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDaysPerMonth() {
        return daysPerMonth;
    }

    public void setDaysPerMonth(int daysPerMonth) {
        this.daysPerMonth = daysPerMonth;
    }
    
    @Override
    public final String toString(){
      return String.format("%d/%d/%d", getDay(), getMonth(), getYear());
    }
}
